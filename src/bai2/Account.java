package bai2;

import java.util.Scanner;

public class Account {
    String name;
    String accountNumber;
    long balance = 0;

    public Account() {
        System.out.println("==================Nhập thông tin tài khoản=================");
    }

    public void nhapThongTinTaiKhoan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên chủ tài khoản:");
        this.name = sc.nextLine();

        System.out.println("Nhập số tài khoản:");
        this.accountNumber = sc.nextLine();

        do {
            System.out.print("Nhập số dư: ");
            this.balance = sc.nextInt();

            if (this.balance < 0) {
                System.out.println("Số dư không được âm. Vui lòng nhập lại!");
            }
        } while (this.balance < 0);

    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Nạp thành công. Số dư mới: " + balance);

    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Số dư không đủ");
        } else {
            balance -= amount;
            System.out.println("Rút thành công. Số dư mới: " + balance);

        }
    }

    public void displayInfo() {
        System.out.println("Tên chủ tài khoản: " + name);
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Số dư: " + balance + "VND");
    }
}
