package bai1;

public class Main {
    public static void main(String[] args) {
        Student studentA = new Student();
        studentA.nhapThongTin();
        float averageStudentA = studentA.tinhDiemTrungBinh();

        Student studentB = new Student();
        studentB.nhapThongTin();
        float averageStudentB = studentB.tinhDiemTrungBinh();

        if (averageStudentA > averageStudentB) {
            studentA.hienThiThongTin();
        } else if (averageStudentB > averageStudentA) {
            studentB.hienThiThongTin();
        } else {
            studentA.hienThiThongTin();
            studentB.hienThiThongTin();
        }
    }
}
