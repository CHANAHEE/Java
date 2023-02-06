import java.util.Random;

public class Main3 {
	public static void main(String[] args) {
		// 랜덤한 값을 만들어내는 능력을 가진 class : Random
		Random rand = new Random();

		// 랜덤한 정수값 얻어오기
		int a;
		a = rand.nextInt();
		System.out.println(a);

		// 0 ~ 9 까지 10개의 숫자 중에 하나가 랜덤하게 나오도록 하고싶다!
		int b;
		b = rand.nextInt(10);
		System.out.println(b);

		// 5 ~ 15
		int c = rand.nextInt(11) + 5;
		System.out.println(c);

		// -5 ~ 5
		int d = rand.nextInt(11) - 5;
		System.out.println(d);

		// 랜덤한 실수값 얻어오기
		double e = rand.nextDouble();
		System.out.println(e);

		// 0.0 ~ 9.9999
		double f = rand.nextDouble() * 10;
		System.out.println(f);

		// 논리값 랜덤
		boolean g = rand.nextBoolean();
		System.out.println(g);

	}
}
