import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(),num=0;
		
		do {
			num += 3;
			System.out.print(num+" ");
		}while(--count>0);
	}
}
