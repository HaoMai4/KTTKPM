const CircuitBreaker = require('opossum');
const retry = require('async-retry');
const timeout = require('async-timeout');

// Hàm gốc xử lý thanh toán
async function process(orderId, amount) {
  console.log(`Processing payment for Order #${orderId}, Amount: $${amount}`);

  // Mô phỏng độ trễ và lỗi ngẫu nhiên
  await new Promise((res) => setTimeout(res, 1000));
  if (Math.random() < 0.3) throw new Error("💥 Payment gateway error!");

  return { status: 'paid', orderId, amount };
}

// Retry wrapper
async function processWithRetry(orderId, amount) {
  return retry(async (bail, attempt) => {
    console.log(`Retry attempt ${attempt}...`);
    try {
      return await process(orderId, amount);
    } catch (err) {
      if (err.message.includes('fatal')) bail(err);
      throw err;
    }
  }, {
    retries: 3,
    minTimeout: 1000,
  });
}

// Circuit Breaker
const breaker = new CircuitBreaker(({ orderId, amount }) => processWithRetry(orderId, amount), {
  timeout: 4000,
  errorThresholdPercentage: 50,
  resetTimeout: 5000,
});

// Fallback có đầy đủ thông tin
breaker.fallback((orderId, amount) => {
  return {
    status: 'failed',
    orderId,
    amount,
    reason: 'Circuit open or too many failures',
  };
});

breaker.on('open', () => console.warn('Circuit is OPEN'));
breaker.on('close', () => console.log('Circuit is CLOSED again'));

// Time Limiter wrapper
async function processWithTimeout(orderId, amount) {
  try {
    const result = await timeout(async () => {
      return await breaker.fire(orderId, amount); // Đảm bảo gọi và đợi kết quả của fire
    }, 5000);

    console.log(' [paymentService] result:', result); // Log kết quả trả về từ fire
    return result;
  } catch (err) {
    if (err.code === 'ETIME') {
      return {
        status: 'failed',
        orderId,
        amount,
        reason: 'Payment processing timeout',
      };
    }
    throw err;
  }
}

async function processPayment(orderId, amount) {
  const result = await processWithTimeout(orderId, amount);
  return result;
}

module.exports = {
  processPayment
};
