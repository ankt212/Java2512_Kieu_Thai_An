package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Nhập mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Tìm max và min
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Giá trị lớn nhất (Max): " + max);
        System.out.println("Giá trị nhỏ nhất (Min): " + min);

        // Sắp xếp mảng tăng dần
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // In mảng sau khi sắp xếp
        System.out.print("Mảng sau khi sắp xếp tăng dần: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
