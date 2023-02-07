import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("input1 : ");
		num1 = sc.nextInt();
		System.out.print("input2 : ");
		num2 = sc.nextInt();

		int result = (num1 - num2 > 0) ? num1 - num2 : num2 - num1;
		System.out.println("결과 : " + result);
	}
}
