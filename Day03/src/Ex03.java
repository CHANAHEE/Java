import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//int max = 0;
		char max = 0;
		for(int i=0;i<str.length();i++) {
			if(max < str.charAt(i)) {
				max = str.charAt(i);
			}
		}
		System.out.println(max);
		/*
		 * for(int i=0;i<str.length();i++) { max = max < str.charAt(i) ? str.charAt(i) :
		 * max; } System.out.println((char)max);
		 */
		
	}
}
