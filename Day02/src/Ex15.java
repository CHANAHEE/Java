import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println(sum);
				break;
			}
			sum += num;
			
		}
	}
}
