import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		final double MILT_TO_KILO = 1.609;
		Scanner sc = new Scanner(System.in);
		int mile;
		
		System.out.print("마일을 입력하시오 : ");
		mile = sc.nextInt();
		System.out.print(mile+"마일은 "+(mile * MILT_TO_KILO) + "킬로미터 입니다.");
	}
}
