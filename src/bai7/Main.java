package bai7;

public class Main {
    public static void main(String[] args) {
        String s1 = "t3h";
        String s2 = new String("t3h");

        // So sánh bằng ==
        if (s1 == s2) {
            System.out.println("s1 == s2 => TRUE");
        } else {
            System.out.println("s1 == s2 => FALSE");
        }

        /**
         * == so sánh địa chỉ bộ nhớ (reference)
         * Không so sánh chuỗi
         *  => trả về fasle
         */

        // So sánh bằng equals()
        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2) => TRUE");
        } else {
            System.out.println("s1.equals(s2) =? FALSE");
        }

        /**
         * .equals() so sánh NỘI DUNG chuỗi (value)
         * "t3h" và "t3h" giống nhau về nội dung
         * => trả về true
         */

        // So sánh không phân biệt hoa thường
        String str1 = "JAVA";
        String str2 = "java";

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("JAVA equalsIgnoreCase java => TRUE");
        } else {
            System.out.println("JAVA equalsIgnoreCase java => FALSE");
        }

    }
}
