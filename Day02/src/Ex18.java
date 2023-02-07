import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0,flag = 0;
		while(true) {
			int num = sc.nextInt();
			if(num < 1) {
				System.out.println("입력할 정수는 1 이상이어야 합니다.");
				continue;
			}else {
				sum += num;	
				flag++;
			}
			if(flag == 5) break;
		}
		System.out.println("합계 : " + sum);
	}
}
