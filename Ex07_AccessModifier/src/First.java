
public class First {
	// 4가지 유형의 접근제한자를 적용해보자!
	private int a;
	int b; // 아무 명시가 없을 때 default
	protected int c;
	public int d;

	// 멤버함수
	void aaa() {
		// 같은 클래스 안에 있는 멤버변수들은 접근제한자와 상관없이 그냥 사용이 가능하다!
		a = 10;
		b = 20;
		c = 30;
		d = 40;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
