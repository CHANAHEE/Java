
public class First {
	// 19_ 접근제한자 적용
	private int a;
	
//	public First kkkF(First this) {
//		return this;
//	}
	
	
	// 20_ 멤버값 출력하는 기능
	public void showFirst() {
		System.out.println("a : " + a);
	}
	
	// 21_ 객체 생성(new)할 때 자동으로 발동하는 특별한 메소드 : 생성자 메소드
	public First(int a) {
		this.a = a;
		System.out.println("First 객체가 생성되었습니다. int");
	}
	
	// 30_ 생성자 오버로딩 
	public First() {
		System.out.println("First 객체가 생성되었습니다.");
	}
}
