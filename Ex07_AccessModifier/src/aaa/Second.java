package aaa;

public class Second {
	// 접근제한자가 부여된 4개의 멤버변수
	private int a;
	int b;
	protected int c;
	public int d;

	// default 접근제한자를 가진 멤버함수
	void show() {
		a = 100;
		b = 200;
		c = 300;
		d = 400;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
	// public 접근제한자를 가진 멤버함수 
	public void output() {
		a = 100;
		b = 200;
		c = 300;
		d = 400;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
}
