package bai3;

public class Computer {
    int ram;
    boolean hasSSD;

    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.computerPerformance(16, true);
    }

    public void computerPerformance(int ram, boolean hasSSD) {
        this.ram = ram;
        this.hasSSD = hasSSD;
        String rating;

        if (ram >= 16 && hasSSD) {
            rating = "VIP";
        } else if ((ram >= 8 && ram < 16) && hasSSD) {
            rating = "Khá";
        } else if (ram >= 8 && !hasSSD) {
            rating = "Trung bình";
        } else {
            rating = "Yếu";
        }

        System.out.println("Máy tính được đánh giá hiệu suất là loại " + rating);
    }
}
