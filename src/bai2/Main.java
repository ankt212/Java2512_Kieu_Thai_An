package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        // Độ dài chuỗi ban đầu
        System.out.println("Độ dài chuỗi ban đầu: " + input.length());

        // Chuyển sang chữ hoa
        System.out.println("Chuỗi chữ HOA: " + input.toUpperCase());

        // Chuyển sang chữ thường
        System.out.println("Chuỗi chữ thường: " + input.toLowerCase());

        // Loại bỏ khoảng trắng hai đầu
        String trimmed = input.trim();
        System.out.println("Chuỗi sau khi trim: [" + trimmed + "]");
        System.out.println("Độ dài chuỗi sau khi trim: " + trimmed.length());

        sc.close();
    }
}
