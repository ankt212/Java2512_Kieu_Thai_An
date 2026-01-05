package bai11;

import java.util.Scanner;

public class Main {
    public static void reverseArray(int[] arr) {

        // Con trỏ trái (đầu mảng)
        int left = 0;

        // Con trỏ phải (cuối mảng)
        int right = arr.length - 1;

        // Lặp cho đến khi hai con trỏ gặp nhau (tới giữa mảng)
        while (left < right) {
            // Lưu tạm phần tử bên trái
            int temp = arr[left];

            // Gán phần tử phải sang trái
            arr[left] = arr[right];

            // Gán lại phần tử trái sang phải
            arr[right] = temp;

            // Di chuyển con trỏ vào trong
            left++;
            right--;
        }
    }

    // Hàm in mảng ra màn hình
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Nhập mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // In mảng ban đầu
        System.out.print("Mảng ban đầu: ");
        printArray(arr);

        // Đảo ngược mảng
        reverseArray(arr);

        // In mảng sau khi đảo
        System.out.print("Mảng sau khi đảo ngược: ");
        printArray(arr);
    }
}
