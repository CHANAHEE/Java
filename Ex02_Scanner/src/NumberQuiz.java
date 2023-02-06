import java.util.*;

public class NumberQuiz {
	public static void main(String[] args) {
		start();
	}

	public static void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===================");
		System.out.println("숫자 맞히기 프로그램");
		System.out.println("===================");
		System.out.println("1 . 시작하기");
		System.out.println("2 . 프로그램 종료");
		System.out.println("===================");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			run();
			break;
		case 2:
			System.out.println("안녕~");
			break;
		}
	}

	public static void run() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int answerNum = rand.nextInt(900) + 1;
		int user; // 사용자가 입력한 숫자를 저장할 변수
		System.out.println("1 ~ 900 사이의 숫자를 입력하세요");
		while (true) {
			System.out.print("숫자 입력 : ");
			user = sc.nextInt();
			if (user == answerNum) {
				System.out.println("정답!");
				break;
			} else if (user > answerNum) {
				System.out.println("오답! 정답은 " + user + "보다 작습니다!");
			} else if (user < answerNum) {
				System.out.println("오답! 정답은 " + user + "보다 큽니다!");
			}
		}
	}
}
