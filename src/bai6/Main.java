package bai6;

public class Main {
    public static void main(String[] args) {
        String sentence = "Học viện công nghệ thông tin T3H";

        // Tìm vị trí của "T3H"
        int index = sentence.indexOf("T3H");
        System.out.println("Vị trí của 'T3H' là: " + index);

        // Cắt chuỗi lấy "T3H"
        String result = sentence.substring(index, index + 3);
        System.out.println("Chuỗi cắt được là: " + result);

        // Lấy ký tự tại vị trí index 5
        char character = sentence.charAt(5);
        System.out.println("Ký tự tại vị trí index 5 là: " + character);
    }
}
