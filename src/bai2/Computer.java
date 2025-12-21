package bai2;

public class Computer {
    String name;

    // Biến static đếm số đối tượng được tạo
    public static int totalComputersCreated = 0;

    // Constructor
    public Computer(String name) {
        this.name = name;
        totalComputersCreated++;
    }

    // Phương thức thay đổi tên thiết bị
    public static void changeDeviceName(Computer computer, String newName) {
        computer.name = newName;
    }

    public static void main(String[] args) {

        // Tạo các đối tượng Computer

        // Object Computer("Laptop Dellq") được tạo trên Heap
        // Biến c1 (nằm trên Stack) giữ địa chỉ (tham chiếu) của object Computer("Laptop Dell")
        Computer c1 = new Computer("Laptop Dell");

        // Object Computer("PC Asus") được tạo trên Heap
        // Biến c2 (nằm trên Stack) giữ địa chỉ (tham chiếu) của object Computer("PC Asus")
        Computer c2 = new Computer("PC Asus");

        // Computer 1
        System.out.println("Tên ban đầu của c1: " + c1.name);

        // Gọi phương thức thay đổi tên
        // Truyền c1 vào method → truyền tham chiếu đến object
        changeDeviceName(c1, "Laptop HP");

        // Sau khi gọi hàm, tên của đối tượng gốc thay đổi
        // vì computer trong method trỏ đến cùng vùng nhớ với c1
        System.out.println("Tên của c1 sau khi gọi hàm: " + c1.name);

        // Computer 2
        System.out.println("Tên ban đầu của c2: " + c2.name);

        // Gọi phương thức thay đổi tên
        // Truyền c2 vào method → truyền tham chiếu đến object
        changeDeviceName(c2, "PC SAMSUNG");

        // Sau khi gọi hàm, tên của đối tượng gốc thay đổi
        // vì computer trong method trỏ đến cùng vùng nhớ với c2
        System.out.println("Tên của c2 sau khi gọi hàm: " + c2.name);


        /**
         * Biến computer trong method và biến c1 trong hàm main cùng trỏ đến một đối tượng trên Heap,
         * nên khi thay đổi thuộc tính của object trong method thì object gốc cũng bị thay đổi.
         */

        // In tổng số đối tượng đã được tạo
        System.out.println("Tổng số Computer đã tạo: " + Computer.totalComputersCreated);
    }
}
