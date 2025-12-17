package bai2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Account account1 = new Account();
        account1.nhapThongTinTaiKhoan();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===============Menu==============");
            System.out.println("1. Nạp tiền.");
            System.out.println("2. Rút tiền.");
            System.out.println("3. Xem thông tin.");
            System.out.println("4. Thoát.");
            System.out.println("===============End Menu==============");
            System.out.print("\nChọn: ");

            choice = sc.nextInt();
            sc.nextLine();
            int amount;

            switch (choice) {
                case 1:
                    System.out.println("Nhập số tiền nạp:");
                    amount = sc.nextInt();
                    account1.deposit(amount);
                    break;
                case 2:
                    System.out.println("Nhập số tiền rút:");
                    amount = sc.nextInt();
                    account1.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Xem thông tin tài khoản");
                    account1.displayInfo();
                    break;
                case 4:
                    System.out.println("Thoát.");
                    break;
            }
        } while(choice != 4);

        sc.close();

    }
}
