package bai1;

public class Product {

    // Khai báo biến instance
    String productName;
    double price;
    int quantity;

    public static void main(String[] args) {

        // Tạo đối tượng Product
        Product p1 = new Product();
        p1.productName = "Máy tính";
        p1.price = 6_000_000;
        p1.quantity = 10;

        double discount;
        double total;

        discount = (p1.quantity > 10) ? 0.1 : 0.05;
        total = (p1.price * p1.quantity) * (1 - discount);

        System.out.println("Sản phẩm " + p1.productName + " - Tổng tiền: " + total);

    }

}
