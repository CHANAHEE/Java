import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		String[] star = new String[10];
		Arrays.fill(star, "");

		for (int i = 0; i < 10; i++) {
			System.out.print("input" + (i + 1) + " : ");
			num[i] = sc.nextInt();
			int index = (num[i] - 1) / 10;
			star[index] += "*";
		}

		for (int i = 0; i < 10; i++) {
			int start = (10 * i + 1);
			int end = (10 * i + 10);
			System.out.println(start + " - " + end + " : " + star[i]);
		}
	}
}
