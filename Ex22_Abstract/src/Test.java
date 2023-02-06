
// 69_ 추상클래스 : 곧바로 객체생성을 할 수 없는 클래스. 즉 상속용으로만 존재하는 클래스
public abstract class Test {
	
	// 71_ 아래와 같이 일반 클래스 처럼 멤버변수, 생성자 , 일반메소드도 만들 수 있다!
	int a;			// 인스턴스 변수
	static int b;	// static 변수 
	
	// 생성자 메소드도 존재할 수 있음. - 객체를 생성(new) 할 때 자동발동하는 특별한 메소드, 
	public Test() {
		System.out.println("Test 생성자");
	}
	// 일반 메소드
	public void show( ) {
		System.out.println("Test show 입니다.");
	}
	
	// 72_ 추상 메소드를 가질수있음! - 이름만 있고 기능은 없는 메소드!
	// 추상메소드를 보유한 클래스는 추상 클래스로 선언되어야만! 한다!!
	abstract void aaa();
	
}
