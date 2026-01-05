package bai8;

import java.util.Scanner;

public class Main {
    // Nhập ma trận
    public static void inputMatrix(int[][] matrix, Scanner sc) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("Nhập phần tử [" + row + "][" + col + "]: ");
                matrix[row][col] = sc.nextInt();
            }
        }
    }

    // Tính tổng ma trận
    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }
        return sum;
    }

    // Method in ma trận
    public static void printMatrix(int[][] matrix) {
        System.out.println("\nMa trận vừa nhập:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai báo ma trận 3x3
        int[][] matrix = new int[3][3];

        // Nhập dữ liệu
        inputMatrix(matrix, sc);

        // In ma trận
        printMatrix(matrix);

        // Tính và in tổng
        int total = sumMatrix(matrix);
        System.out.println("Tổng các phần tử trong ma trận = " + total);

        sc.close();
    }
}
