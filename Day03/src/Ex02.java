import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		s1 = sc.next();
		s2 = "";
		
		for(int i = s1.length()-1;i>=0;i--) {
			//s2 = s2.concat(String.valueOf(s1.charAt(i)));
			char ch = s1.charAt(i);
			s2 += ch;
		}
		System.out.println(s2);
	}
}
