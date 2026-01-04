package bai1;

public class Main {
    public static void main(String[] args) {
        // Khai báo và khởi tạo một mảng số nguyên gồm 10 phần
        int[] myArray = new int[10];

        // Gán giá trị cho các phần tử từ 1 đến 10.
        for (int index = 0; index < 10; index++) {
            myArray[index] = index + 1;
        }

        // Sử dụng vòng lặp để in các giá trị trong mảng ra màn hình.
        System.out.println("Cac phan tu trong mang la: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + " ");
        }

        // Sử dụng thuộc tính length để in ra tổng số phần tử của mảng đó.
        System.out.println("Tong so phan tu trong mang: " + myArray.length);
    }
}
