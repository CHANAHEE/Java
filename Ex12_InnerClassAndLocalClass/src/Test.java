
// 75_ inner class 를 가진 클래스를 outer class 라고 부름
public class Test {
	// 73_ 멤버변수와 멤버함수 생성 
	int a = 10;
	
	static void abc() {
		System.out.println("hello");
	}
	public Test() {
		
		System.out.println("outer");
	}
	void show() {
		System.out.println("show : " + a);
	}
	
	// 76_3 이너 클래스를 객체로 생성하여 리턴해주는 기능 메소드
	Nice makeInnerClassObject() {
		Nice nice = new Nice();
		return nice;
	}
	// 74_ 클래스 안에 또 다른 클래스를 설계!
	// inner class 라고 부른다!
	
	// 76_ 이너 클래스의 특징
	// 1. 외부(다른 클래스)에서 아우터 클래스명 없이는 인식이 불가능! 
	// 2. 외부에서 아우터클래스명을 이용하여 인식 하더라도 직접 객체생성은 불가능! 
	// 3. 이너 클래스는 아우터 클래스 안에서만 객체 생성이 가능한 클래스!
	// 4. 이너 클래스 안에서 아우터클래스의 멤버를 내것인양 마음대로 사용이 가능하다!!!!!!!!! -> 이너가 존재한다는 것은 아우터 객체가 무조건 존재한다는것! 확신한다는것! 그래서 이러한 문법적인 허용이 가능해졌다.
	// 5. 아우터 클래스 안에서는 이너의 멤버를 맘대로 사용할수 없음! -> 아우터가 존재한다고 해서 이너의 객체가 반드시 존재하는것은 아니기 떄문!
	
	// 77_ 이너 클래스는 객체를 안전하게 만들기 위해서 사용하는 기법! 
	// 즉, 외부에서 아우터 객체 없이 마음대로 생성하지 못하도록 문법적으로 막는 기법.
	class Nice {
		int k = 100;
		
		public Nice() {
			new Test();
			System.out.println("inner");
		}
		
		void show() {
			
		}
		void aaa() {
			a = 100;
			System.out.println("Nice . . . . .");
			//76_4_ 아우터의 멤버변수를 내것인양
			a=50;
			System.out.println("아우터의 a : " + a);
			//76_4_ 아우터의 멤버메소드를 내것인양
			show();
		}
	}
}
