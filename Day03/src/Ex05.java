import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "", str2 = "", str3 = "";
		int index = 0;
		while (true) {

			switch (index) {
			case 0:
				System.out.println("첫번째 자리 입력(3자리) : ");
				str1 = sc.nextLine();
				int i = 0;
				for (i = 0; i < str1.length(); i++) {
					char ch = str1.charAt(i);
					if(ch > '9' || ch < '0') {
						break;
					}
				}

				if (i == 3) {
					index++;
					continue;
				}
				System.out.println("잘못 입력하셨습니다. 3자리의 숫자만 입력가능합니다.\n");
				continue;

			case 1:
				
				System.out.println("두번째 자리 입력(3~4자리) : ");
				str2 = sc.nextLine();
				int j =0 ;
				for (j = 0; j < str2.length(); j++) {
					char ch = str2.charAt(j);
					if(ch > '9' || ch < '0') {
						break;
					}
				}

				if (j == 2 || j == 3) {
					index++;
					continue;
				}
				System.out.println("잘못 입력하셨습니다. 3~4자리의 숫자만 입력가능합니다.\n");
				continue;

			case 2:
				
				System.out.println("세번째 자리 입력(4자리) : ");
				str3 = sc.nextLine();
				int k=0;
				for (k = 0; k < str3.length(); k++) {
					char ch =str3.charAt(k);
					if(ch > '9' && ch < '0') {
						break;
					}
				}

				if (k == 3) {
					index++;
					continue;
				}
				System.out.println("잘못 입력하셨습니다. 4자리의 숫자만 입력가능합니다.\n");
				continue;

			}
			break;
		}
		System.out.println("입력된 전화번호는 " + "[" + str1 + "-" + str2 + "-" + str3 + "]");
	}
}
