package bai3;

public class Car {
    String model;
    double price;


    public static void main(String[] args) {
        // Tạo đối tượng car1
        Car car1 = new Car();
        car1.model = "VinFast VF8";
        car1.price = 1_000_000_000;

        // Tạo đối tượng car2
        Car car2 = new Car();
        car2.model = "Toyota Vios";
        car2.price = 500_000_000;

        // Câu lệnh gây nhiễu
        car1 = car2;

        car1.model = "Mazda 3";

        System.out.println("Model car 2 là : " + car2.model);

        /**
         * Tại sao khi in car2.model lại ra kết quả là "Mazda 3"
         * => - Tại vì bản chất car1 và car2 là các biến tham chiếu trỏ tới object Car trên Heap
         *    - Khi car1 = car2 thì car1 sao chép giá trị tham chiếu của car2 => cả 2 cùng trỏ đến cùng 1 object trên Heap
         *    - KHi car1.model = "Mazda 3" => thuộc tính model của object chung bị thay đổ nên car2.model = "Mazda 3"
         */


        /**
         * Vẽ sơ đồ tư duy (hoặc mô tả bằng lời) sự thay đổi trong vùng nhớ Stack và Heap khi lệnh car1 = car2 được thực thi.
         *  - Trước khi thực hiện car1 = car2:
         *  + Tại stack có các biến tham chiếu car1, car 2
         *  + Tại Heap có Object A được car1 tham chiếu, Object B được car2 tham chiếu
         *      Stack                               HEAP
         *                                          |Object A               |
         *      car1 ------------------------>      | model = "VinFast VF8" |
         *                                          | price = 1 tỷ          |
         *
         *                                          |Object B               |
         *      car2 ------------------------>      | model = "Toyota Vios" |
         *                                          | price = 500 triệu     |
         *
         *  - Khi car1 = car2
         *  + car1 copy giá trị tham chiếu của car2
         *  + Không tạo một object mới trên HEAP, không copy object
         *
         *  - Sau khi car1 = car2
         *  + Tại Stack có các biến car1, car2
         *  + Tại Heap có Object A không còn biến nào tham chiếu trên Stack, Object B được tham chiếu bởi 2 biến
         *  car1 và car2
         *      Stack                               HEAP
         *                                         |Object A               |
         *                                         | model = "VinFast VF8" |  => Không có biến nào tại Stack tham chiếu
         *                                         | price = 1 tỷ          |
         *
         *      car1 -----------------\            |Object B               |
         *                              ------>    | model = "Toyota Vios" |
         *      car2 -----------------/            | price = 500 triệu     |
         */

        /**
         * Chuyện gì đã xảy ra với đối tượng "VinFast VF8" ban đầu ở vùng nhớ Heap
         * - Sau khi thực hiện lệnh car1 = car2, đối tượng "VinFast VF8" ban đầu không còn biến tham chiếu nào trên
         * Stack trỏ tới => đối tượng "VinFast VF8" trở thành object rác
         * => Bộ dọn rác của Java sẽ giải phóng đối tượng này khỏi HEAP
         */
    }
}
