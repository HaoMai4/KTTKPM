# Sử dụng Node.js làm base image
FROM node:18

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Copy package.json và cài đặt dependencies
COPY package.json .
RUN npm install

# Copy toàn bộ mã nguồn vào container
COPY . .

# Expose cổng 3000
EXPOSE 3000

# Lệnh chạy ứng dụng
CMD ["node", "index.js"]
