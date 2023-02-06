import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("횟수 입력 : ");
		int count = sc.nextInt();
		
		do {
			System.out.println("Hello World");
		}while(--count > 0);
	}
}

