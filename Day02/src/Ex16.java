import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();

		for (int i = 9; i >= 1; i--) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
}
