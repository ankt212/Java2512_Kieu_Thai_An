package bai13;

public class Main {
    public static int findSecondMax(int[] arr) {
        // Nếu mảng null hoặc có ít hơn 2 phần tử thì không hợp lệ
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // Nếu tìm được số lớn hơn max hiện tại
            if (arr[i] > max) {
                // Đẩy max cũ xuống
                secondMax = max;
                // Cập nhật max mới
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondMax) { // Nếu arr[i] nhỏ hơn max nhưng lớn hơn secondMax
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 7, 9};

        int result = findSecondMax(arr);

        if (result == Integer.MIN_VALUE) {
            System.out.println("Không tồn tại số lớn thứ hai!");
        } else {
            System.out.println("Số lớn thứ hai là: " + result);
        }
    }
}
