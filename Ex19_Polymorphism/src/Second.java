
public class Second extends First{
	int b;
	
	public Second() {
		System.out.println("Second 생성자");
	}
	void showSecond() {
		System.out.println("showSecond 입니다.");
	}
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Second 클래스의 show Method.");
	}
}
