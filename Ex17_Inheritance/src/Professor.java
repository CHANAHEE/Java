
// 10_ Professor 클래스 생성!
public class Professor extends Person {
	
	private String subject = "";
	
	// 11_ 생성자 만들기!
	public Professor() {
		
	}
	public Professor(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}
	
	// 12_ show 메서드 오버라이드! - 컨트롤 스페이스~ 오버라이드 자동생성~
	@Override // 12_1_ Annotation : 그냥 주석으로는 오류처리가 안된다! 예를들어 메소드 이름이 바뀌거나 했을때,어노테이션을 활용하면 오류를 띄워준다! 좀 강한 주석같은 느낌!
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("subject : " + subject);
	}
	
	
}
