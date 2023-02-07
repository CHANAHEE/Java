import java.util.*;

public class NumberBaseball {

	public static void main(String[] args) {
		start();
	}

	public static void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========== 숫자 야구 ===========");
		System.out.println("=          1.게임시작           =");
		System.out.println("=        2.프로그램 종료         =");
		System.out.println("===============================");

		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			run();
			break;
		case 2:
			System.out.println("프로그램 종료.");
			break;
		}
	}

	public static void run() {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("게임시작!");

		int answer100 = rand.nextInt(10);
		int answer10 = rand.nextInt(10);
		int answer1 = rand.nextInt(10);
		int answer;

		while (true) {
			if (answer100 == 0 &&(answer100 == answer10 || answer10 == answer1 || answer1 == answer100 )) {
				answer100 = rand.nextInt(10);
				answer10 = rand.nextInt(10);
				answer1 = rand.nextInt(10);
				continue;
			}
			answer = answer100 * 100 + answer10 * 10 + answer1;
			break;
		}

		int count = 1, userNum;

		while (true) {
			int strike = 0, ball = 0, out = 0;
			System.out.println("[" + count++ + "회]");
			System.out.print("중복되지 않는 3자리 숫자 입력 : ");
			userNum = sc.nextInt();
			int userNum100 = userNum / 100;
			int userNum10 = userNum / 10 % 10;
			int userNum1 = userNum % 10;

			if (userNum100 == answer100) {
				strike++;

			} else if (userNum100 == answer10 || userNum100 == answer1) {
				ball++;

			} 
			if (userNum10 == answer10) {
				strike++;

			} else if (userNum10 == answer100 || userNum10 == answer1) {
				ball++;

			} 
			if (userNum1 == answer1) {
				strike++;

			} else if (userNum1 == answer10 || userNum1 == answer100) {
				ball++;

			} 
			
			if(strike == 0 && ball == 0) {
				out++;

			} 
			if(strike == 3) {
				System.out.println("정답입니다!");
				break;
			}else {
				System.out.println("[" + strike + "] strike,  " + "["+ball+"] ball,  " + "[" + out +"] out");
				System.out.println();
			}

		}

	}

}
