import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isAlpha,isNum,isSign;
		String pass = "";
		String originPass = "";
		while (true) {
			System.out.print("비밀번호를 입력하세요 : ");
			originPass = sc.next();
			 
			pass = originPass.toUpperCase();

			isAlpha = false;
			isNum = false;
			isSign = false;

			
			for (int i = 0; i < pass.length(); i++) {
				if (pass.charAt(i) > 64 && pass.charAt(i) < 97) {
					isAlpha = true;
				}
				else if (pass.charAt(i) > 47 && pass.charAt(i) < 58) {
					isNum = true;
				}
				else  {
					isSign = true;
				}
			}
			if (pass.length() < 8) {
				System.out.println("8자리 이상으로 입력해주세요.");
				continue;
			}else if(!isAlpha) {
				System.out.println("영문자는 포함되어야 합니다!");
				continue;
			}else if(!isNum) {
				System.out.println("숫자는 포함되어야 합니다!");
				continue;
			}else if(!isSign) {
				if(pass.length() >= 10) {
					break;
				}else {
					System.out.println("영문자,숫자만 사용할 경우 10자리 이상으로 지정해야 합니다.");
					continue;	
				}
			}else if((!isAlpha && !isNum) || (!isAlpha && !isSign) || (!isSign && !isNum)) {
				System.out.println("영문자, 숫자, 특수문자 각각 단독으로 사용할 수는 없습니다!");
				continue;
			}else {
				break;
			}
		}
		System.out.println(originPass);
	}
}
