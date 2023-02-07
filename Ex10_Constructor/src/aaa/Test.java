package aaa;

public class Test {
	public int a;
	int b; // 24_ default 접근제한 - 같은 패키지에서만 접근 가능
	
	// 28_ default 접근제한의 생성자 메소드 만들자->같은 패키지에서만 호출가능
	Test(){
		System.out.println("Test 객체가 생성!");
	}
	
}
