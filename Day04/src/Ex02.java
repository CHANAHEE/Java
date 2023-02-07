import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오 : ");
		int num = sc.nextInt();

		int[] score = new int[num];
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.print("학생" + (i + 1) + "의 성적을 입력하세요 : ");
			score[i] = sc.nextInt();
			if (score[i] <= 100 && score[i] >= 0) {
				sum += score[i];
				continue;
			}
			System.out.println("잘못된 성적입니다. 다시 입력하세요");
			i--;
		}
		double avg = (double)(sum / num);
		System.out.println(String.format("성적 평균은 %.1f 입니다.", avg));

	}
}
