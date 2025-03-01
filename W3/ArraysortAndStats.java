import java.util.Scanner;
import java.util.Arrays;

public class ArraysortAndStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Tạo mảng với n phần tử
        int[] arr = new int[n];

        // Nhập các phần tử của mảng từ bàn phím
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(arr);

        // Tính tổng các phần tử trong mảng
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        // Tính trung bình
        double average = (double) sum / n;

        // Hiển thị kết quả
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
        System.out.println("Tổng các phần tử: " + sum);
        System.out.println("Trung bình cộng: " + average);
        
        scanner.close();
    }
}
