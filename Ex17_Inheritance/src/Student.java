
// 6_ 학생 회원 클래스 만들기! Person 을 상속시킴 , 멤버변수 major 생성!
public class Student extends Person{
	// 이미, name, age 를 보유한 상태
	
	private String major; 
	
	// 7_ 생성자 만들기 & 오버라이드!!
	public Student() {
		super();
		this.major = " ";
	}
	public Student(String name,int age,String major) {
		super(name,age);
		this.major = major;
	}
	
	// 8_ 상속받은 기능 show() 는 name, age 만 출력함.
	// 그래서 기능을 개선하자! -> 오버라이드!!
	
	public void show() {
		super.show();
		System.out.println("major : " + major);
	}
}
