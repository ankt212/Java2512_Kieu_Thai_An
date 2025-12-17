package bai1;

import java.util.Scanner;

public class Student {
    String studentId;
    String studentName;
    float mathScore;
    float literatureScore;

    public Student() {
        System.out.println("Nhập thông tin sinh viên");

    }

    public void hienThiThongTin() {
        System.out.println("-------------Thông tin sinh viên " + studentName + "------------:");
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Điểm toán:" + mathScore);
        System.out.println("Điểm văn: " + literatureScore);
        System.out.println("Điểm trung bình: " + tinhDiemTrungBinh());
        xepLoai();

    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        // Nhập mã sinh viên
        System.out.println("Nhập mã sinh viên:");
        this.studentId = sc.nextLine();

        // Nhập tên sinh viên
        System.out.println("Nhập tên sinh viên:");
        this.studentName = sc.nextLine();

        // Nhập điểm toán
        System.out.println("Nhập điểm toán");
        this.mathScore = sc.nextFloat();

        // Nhập điểm văn
        System.out.println("Nhập điểm văn");
        this.literatureScore = sc.nextFloat();

    }

    public float tinhDiemTrungBinh() {
        return (mathScore + literatureScore) / 2;

    }

    public void xepLoai() {
        float averageScore = tinhDiemTrungBinh();
        if (averageScore >= 8.0) {
            System.out.println("Sinh viên đạt loại Giỏi");
        } else if (averageScore >= 6.5) {
            System.out.println("Sinh viên đạt loại Khá");
        } else {
            System.out.println("Sinh viên đạt loại Trung Bình");
        }

    }
}
