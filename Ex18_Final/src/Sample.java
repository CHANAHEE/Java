
public class Sample extends Test{
	
	int max;
	// 11_ 일반메소드 오버라이드 가능
	public Sample() {
		System.out.println("hello");
	}
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("aaa 메소드 기능 개선!!");
		System.out.println(max);
	}

	// 12_ final 메소드는 오버라이드 금지!
//	void show() {
//		// TODO Auto-generated method stub
//
//	} error! 
	
	public static Sample makeObj() {
		return new Sample();
	}
}
