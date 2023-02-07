import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			String num = scan.nextLine();
			
			boolean isCard , isId;
			
			Classification cf = new Classification();
			
			
			isCard = cf.isCNumber(num);
			isId = cf.isPNumber(num);
			
			
			if(!isCard && !isId) {
				System.out.println("개인정보가 아닙니다.");
			}else if(isId) {
				System.out.println("주민번호가 맞습니다.");
			}else {
				System.out.println("카드번호가 맞습니다.");
			}
		}
	}
}

class Classification {
	
	public boolean isCardDelimeter(String num) {

		for(int i = 0; i < num.length() ; i++) {
			if(num.charAt(i) == '-') {
				if(i % 5 == 4) {
					
				}else {
					return false;
				}
			}
		}
		return true;
	}
	public boolean isPersonDelimeter(String num) {
		int idx = -1;
		idx = num.indexOf('-');
		if(idx == -1 || idx == 6) return true;
		return false;
	}

	public String converTo(String num) {
		num = num.replaceAll("-", "");
		num = num.replaceAll(" ", "");
		return num;
	}
	
	public boolean checkPNum(String num) {
		int sum = 0, result = 0;
		
		for(int i=0;i<8;i++) {
			sum += (num.charAt(i)-48) * (i+2);
			
		}
		for(int i=0;i<4;i++) {
			sum += (num.charAt(i+8)-48) * (i+2);
			
		}
		result = (11 - (sum % 11)) % 10;
		if(result == num.charAt(num.length()-1) - 48) {
			return true;
		}
		return false;
		
	}

	public boolean isPNumber(String num) {
		
		boolean correct = true;
		String cNum = converTo(num);
		
		if(cNum.length() == 13) {
			for(int i=0;i<cNum.length();i++) {
				char ch = cNum.charAt(i);
				correct = correct && (ch >= 48 && ch <= 57);
			}
			if(correct) {
				// 구분자 예외 충족하니?
				return (checkPNum(cNum) && isPersonDelimeter(num));
			}
		}
		return false;
	}
	
	public boolean isCNumber(String num) {
		
		boolean correct = true;
		String cNum = converTo(num);
		
		if(cNum.length() == 16) {
			for(int i=0;i<cNum.length();i++) {
				char ch = cNum.charAt(i);
				correct = correct && (ch >= 48 && ch <= 57);
			}
			if(correct) {
				// 구분자 예외 충족하니?
				return isCardDelimeter(num);
			}
					
		}
		return false;
	}
}
