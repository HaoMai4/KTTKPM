require('dotenv').config();
const express = require('express');
const rateLimit = require('express-rate-limit');  // Import express-rate-limit
const app = express();
const paymentController = require('./paymentController');

// Cấu hình rate limiter (giới hạn 5 requests mỗi phút)
const paymentLimiter = rateLimit({
  windowMs: 1 * 60 * 1000, // 1 phút
  max: 5,  // Tối đa 5 request mỗi phút
  message: {
    success: false,
    error: ' Rate limit exceeded. Please try again later.',
  },
  standardHeaders: true,
  legacyHeaders: false,
});

app.use(express.json());

// Áp dụng rateLimiter cho route /payment
app.post('/payment', paymentLimiter, paymentController.handlePayment);

const PORT = process.env.PORT || 3001;
app.listen(PORT, () => {
  console.log(`Payment service running on port ${PORT}`);
});
