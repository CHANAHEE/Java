import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		final double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		
		System.out.print("원의 넓이 : " + (radius * radius * PI));
	}
}
