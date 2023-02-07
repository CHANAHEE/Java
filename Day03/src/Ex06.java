import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("메일 주소 입력(@포함) : ");
			String mail = sc.nextLine();
			int index = mail.indexOf('@');
			
			if(!(mail.contains("@"))) {
				System.out.println("잘못입력하셨습니다. @포함 메일서버 주소까지 모두 입력하셔야 합니다.");
				continue;
			}
			System.out.println("입력된 메일주소명 : " + mail.substring(0, index));
			System.out.println("메일서버 이름 : " + mail.substring(index+1, mail.length()));
			break;
		}
	}
}
