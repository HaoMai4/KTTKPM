package composite.main;

import composite.entity.*;

public class Main {
    public static void main(String[] args) {
        // Tạo các sản phẩm
        Product cafe = new Product("Cà phê", 20000);
        Product traDa = new Product("Trà đá", 10000);
        Product banhMi = new Product("Bánh mì", 15000);

        // Tạo bàn và thêm sản phẩm vào bàn
        Table table1 = new Table(1);
        table1.add(cafe);
        table1.add(traDa);
        table1.add(banhMi);

        // Tính tổng giá của bàn
        System.out.println("Tổng giá của bàn 1 là: " + table1.getPrice() + " VND");

        // Tạo thêm một bàn khác
        Table table2 = new Table(2);
        table2.add(cafe);
        table2.add(traDa);

        // Tính tổng giá của bàn 2
        System.out.println("Tổng giá của bàn 2 là: " + table2.getPrice() + " VND");

        // Tính tổng doanh thu của quán cà phê
        double totalRevenue = table1.getPrice() + table2.getPrice();
        System.out.println("Tổng doanh thu của quán cà phê: " + totalRevenue + " VND");
    }
}