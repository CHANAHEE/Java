
// 53_ First 클래스 생성!
public class First {

	static int count = 0; // 54_ First 클래스에 딱 1개 존재하는 변수
	
	public First() {
		System.out.println("First 객체 생성 : " + ++count);
	}
	
	void aaa() {
		System.out.println("Hello");
	}
}
