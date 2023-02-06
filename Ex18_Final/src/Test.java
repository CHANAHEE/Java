
public class Test {
	final int USER_NUM = 10; // 4_ 클래스 안에 그리고 메소드영역 밖에 있으니 멤버변수~ 그리고 final이 붙어있으니 final 멤버변수~
	// 6_ 상수를 쓰는 표기법은 모두 대문자로!!, 두 단어 이상은 _ 로 연결
	static String str;
	// 8_ static 변수에 final!
	public static final int COUNT = 10;
	
	void aaa() {
		//USER_NUM = 200; // 5_ 값 변경시 error!! - final 변수는 변경불가~
		bbb(10);
	}
	
	void bbb(final int n) { // 7_ 매개변수도 final 가능!!
		//n=20; //error !
		System.out.println(n);
	}
	
	// 10_ 메소드에도 final 키워드 적용가능하다!
	// 이 메소드의 기능이 마지막!! -> 즉, 개선하지마라 -> 오버라이드 하지마라!!!
	final void show() {
		System.out.println("TEST");
	}
}
