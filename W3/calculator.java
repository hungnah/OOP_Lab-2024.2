import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        String strNum1 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);

        System.out.print("Nhập số thứ hai: ");
        String strNum2 = scanner.nextLine();
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Thương: " + quotient);
        } else {
            System.out.println("Không thể chia cho 0!");
        }

        scanner.close();
    }
}
