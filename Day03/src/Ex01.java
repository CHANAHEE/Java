import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0;i<str.length();i++) {
			char ch = (char) (str.charAt(i)+1);
			System.out.println(ch);
		}
		
		
	}
}
