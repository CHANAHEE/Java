
public class Person {

	// 2_ 멤버변수 가급적 private 접근제한을 권장
	private String name;
	private int age;

	// 6_ 멤버변수에 값을 대입해주는 기능 메소드
	public void setMembers(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 4_ 멤버함수는 public 접근제한을 권장
	// 멤버변수값을 출력하는 기능 메소드
	public void show() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println();
	}

	// 15_ 생성자 메소드를 만들어보자! 가급적 public 접근제한자를 활용!
	public Person() {
		System.out.println("Person 객체 생성 ! ");

		// 17_ 멤버변수에 전달할 값이 없을때에 초기값을 설정.
		name = "익명";
		age = 0;
	}

	// 19_ 생성자 오버로딩, 생성자의 목적은 멤버값의 초기화가 목적! -> 전달받은 값들을
	// 멤버변수에 대입해주어야 함.
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person 객체 생성!! String, int");
	}

	// 20_ 오버로딩은 갯수제한이 없기 때문에 몇개라도 추가로 만들 수 있음.
	public Person(String name) {
		this.name = name;
		this.age = 0;
		System.out.println("Person 객체 생성!!! String");
	}
	public Person(int age) {
		this.name = "익명";
		this.age = age;
		System.out.println("Person 객체 생성!!!! int ");
	}

}
