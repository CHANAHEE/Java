
public class Second extends First{
	
	private int b;
	
	// 51_ 멤버값을 출력하는 기능메소드 [ 상속받은 a변수도 출력할 의무 있음 ] 
	// 상속받은 출력기능 show 는 a 변수만 출력하니 이를 개선하자!!
	// Override!!
	
	public void show() {
		// 52_ System.out.println(a); // error! 부모의 private 멤버 사용불가!
		// First 에게 출력을 요청해야한다! 
		// show(); // 53_ 부모의 show() 메소드 호출이 아니라 재귀호출이 됨.
		// 54_ 오버라이딩을 해도 부모의 메소드가 살아있음을 보여주는 코드!
		super.show();
		System.out.println("b : " + b);
	}
	
}
