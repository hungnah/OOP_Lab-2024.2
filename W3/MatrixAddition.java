import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu nhập số hàng và số cột của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        // Khởi tạo 2 ma trận đầu vào và 1 ma trận kết quả
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        // Nhập ma trận thứ nhất
        System.out.println("\nNhập các phần tử của ma trận thứ nhất:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Nhập ma trận thứ hai
        System.out.println("\nNhập các phần tử của ma trận thứ hai:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Tính tổng 2 ma trận: sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j]
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Hiển thị ma trận kết quả
        System.out.println("\nMa trận tổng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
