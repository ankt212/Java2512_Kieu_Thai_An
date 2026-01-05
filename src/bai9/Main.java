package bai9;

public class Main {
    public static void checkName(String name) {
        /*
         * if (name.equals("T3H")) { ... }
         * Nếu name == null thì sẽ gây lỗi NullPointerException
         *
         */

        /*
         * "T3H" là String literal => luôn tồn tại trong String Pool => không null
         * Nếu name == null thì "T3H".equals(null) chỉ trả về false => không gây lỗi
         *
         */
        if ("T3H".equals(name)) {
            System.out.println("Tên hợp lệ: T3H");
        } else {
            System.out.println("Tên không hợp lệ");
        }
    }

    public static void main(String[] args) {
        checkName("T3H");
        checkName("ABC");
        checkName(null);
    }
}
