import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap so thu nhat : ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Nhap so thu hai : ");
		double num2 = scanner.nextDouble();
		
		double tong = num1 + num2 ;
		double hieu = num1 - num2 ;
		double tich = num1 * num2 ;
		double thuong =(num1/num2);
		
		System.out.println("Tong la : " + tong);
		System.out.println("Hieu la : " + hieu);
		System.out.println("Tich la : " + tich);
		System.out.println("Thuong la : " + thuong);
	}
}