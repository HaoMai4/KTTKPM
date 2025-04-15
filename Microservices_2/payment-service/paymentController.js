const paymentService = require('./paymentService');

const handlePayment = async (req, res) => {
  const { orderId, amount } = req.body;
  try {
    const result = await paymentService.processPayment(orderId, amount); // Đảm bảo gọi async và chờ kết quả
    console.log(' Final payment result:', result); // Log kết quả thực tế
    res.status(200).json({ success: true, result });
  } catch (err) {
    console.error('Error processing payment:', err); // Log lỗi nếu có
    res.status(500).json({ success: false, message: err.message });
  }
};

module.exports = { handlePayment };
