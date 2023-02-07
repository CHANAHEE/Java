import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 정수 개수 : ");
		int count = sc.nextInt();
		int num, sum = 0;
		for (int i = 0; i < count; i++) {
			System.out.print("input " + (i + 1) + ": ");
			num = sc.nextInt();
			sum += num;
		}
		System.out.println("평균 : " + ((double)sum / count));
	}
}
