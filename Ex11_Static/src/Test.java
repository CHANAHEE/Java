
public class Test {
	public int a; // 44_ 일반적인 멤버변수 -- 객체마다 변수가 존재 -> 인스턴스 변수라고도 부름
	public static int b; // 45_ static(정적) 멤버변수 -- Test 클래스에 1개만 존재 -> 클래스 변수라고도 부름
	
	// 46_ 생성자
	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 56_ 일반 메소드 - instance method
	void aaa() {
		System.out.println("일반 메소드");
		// 61_ 일반메소드에서는 일반변수, static 변수 모두 사용가능!
		System.out.println("a : " + this.a);
		System.out.println("b : " + this.b);
	}
	
	// 57_ static 메소드 - class method : 객체 생성과 상관없이 호출가능한 메소드
	static void bbb() {
		System.out.println("static method");
		// 62_ static 메소드에서는 일반변수는 사용불가!
		// System.out.println("a : " + a); error!
		System.out.println("b : " + b);
		
		// 63_ 즉, static 메소드 안에서는 static 멤버변수만 사용가능!
		
		// 65_ 다른 static 메소드를 호출할 수도 있음.
		ccc();
		
		// 67_ 다른 일반 메소드는 호출할 수 없음.
		// ddd(); error!
		// 68_ 객체를 안만들어도 쓸수 있는 영역에서 객체를 만들어야만 쓸 수 있는 메소드를 호출하는것은 이상하다. 
		First f = new First();
		f.aaa();
	}
	
	// 64_ 또 다른 static method 를 만들어보자
	static void ccc() {
		System.out.println("ccc static method");
	}
	
	// 66_ 또 다른 일반 메소드를 만들어보자
	void ddd() {
		System.out.println("ddd method");
	}
}
