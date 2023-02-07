import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		
		System.out.print("input1 : ");
		num1 = sc.nextInt();

		System.out.print("input2 : ");
		num2 = sc.nextInt();
		
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	}
}
