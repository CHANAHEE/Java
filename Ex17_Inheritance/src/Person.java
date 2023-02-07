
//1_ Person 클래스 생성! 멤버변수 만들기!
public class Person {

	private String name;
	private int age;
	
	// 2_ 생성자 메소드 만들기!
	// 사용자가 객체생성시 매개변수를 전달하지 않을수도 있으니까..!
	public Person() {
		this.name = "no name";
		this.age = 0;
	}
	// 3_ 생성자 오버로딩
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	// 4_ show 메서드 생성
	public void show() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
}
