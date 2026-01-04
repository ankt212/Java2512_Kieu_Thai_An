package bai5;

public class Main {
    public static void main(String[] args) {
        String data = "Java,Python,C++,PHP,JavaScript";

        // Tách chuỗi
        String[] languages = data.split(",");

        // Kiểm tra chuỗi bắt đầu bằng "Java"
        for (int i = 0; i < languages.length; i++) {
            if (languages[i].startsWith("Java")) {
                System.out.println(languages[i] + " bắt đầu bằng 'Java'");
            }
        }

        // Tìm vị trí xuất hiện đầu tiên của 'P'
        int index = data.indexOf('P');
        System.out.println("Vị trí xuất hiện đầu tiên của 'P' là: " + index);
    }
}
