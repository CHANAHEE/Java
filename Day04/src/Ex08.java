import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] str = new String[num];
		
		for (int i = 0; i < str.length; i++) {
			String input = sc.next();
			str[i] = new String(input);
		}
		
		for(String s : str){
			System.out.print(s + " ");
		}
	}
}
