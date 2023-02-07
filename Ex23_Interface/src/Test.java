
// 79_ interface : 추상메소드만 가지는 추상클래스임.
// 즉, interface == abstract class
public interface Test {
	// 80_ 인터페이스는 오로지 추상메소드만 가지는 클래스임.
	abstract void aaa(); // 82_ 기능의 이름만! 정함.
	
	// 92_ 인터페이스 안에서는 모든 메소드가 abstract 이므로 자동 적용됨. 
	// 새로 bbb 라는 규격이 생겼으니, 이 인터페이스를 상속받는 모든 클래스에서 기능을 구현해야함. 
	void bbb();
	
	// 81_ 일반메소드는 정의 불가능
	// void show() { } ERROR!
}
