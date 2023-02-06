import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;

		System.out.print("input1 : ");
		num1 = sc.nextInt();
		System.out.print("input2 : ");
		num2 = sc.nextInt();
		System.out.print("input3 : ");
		num3 = sc.nextInt();

		System.out.println("(" + num1 + " - " + num2 + ")" + " * " + "(" + num2 + " + " + num3 + ")" + " * " + "(" + num3
				+ " - " + num1 + ")" + " = " + ((num1 - num2) * (num2 + num3) * (num3 - num1)));
	}
}
