
public class Main {

	// 지역변수는 초기화하지 않으면 쓰레기값, 멤버변수는 초기화하지 않으면 0 또는 null, 매개변수 
	public static void main(String[] args) {
		// 1_ 사용자정보[이름, 나이] 데이터를 설계한 Person 클래스를 객체로 생성해보자
		Person p = new Person();
		// 5_ 멤버변수에 값을 대입해보기 - 메소드 호출
		p.setMembers("sam", 20);
		
		// 3_ Person 객체의 멤버변수값들을 출력해주는 기능을 사용해야함(private) 
		p.show();
		
		// 7_ 2번째 사용자 정보 객체 생성
		Person p2 = new Person();
		p2.setMembers("robin", 25);
		p2.show();
		
		// 8_ 이런식으로 객체를 만들면 항상 이어서 멤버값을 대입해주는 기능호출문이 있어야함.
		// 그러니 항상 2줄의 코딩이 필요함. 은근 짜증~
		// 변수도 만들면서 초기화할 수 있듯, 객체를 생성하면서 멤버값을 전달하여 초기화가 가능!
		// 이때 사용되는 아주 특별한 메소드 : 생성자 Constructor
		
		// 9_ Person 클래스에 적용하기 전에 먼저 생성자의 문법연습
		First f = new First();
		
		// 11_ 생성자 메소드는 객체를 생성할 때 마다 발동함
		First f2 = new First();
		
		// 12_ 생성자 메소드에, 파라미터로 값 전달해보기
		First f3 = new First(10);
		System.out.println();
		
		// 14_ Person 클래스에 생성자 메소드 만들기
		// 16_ 객체 생성해보기
		Person p3 = new Person();
		p3.show();
		
		// 18_ Person 객체를 생성하면서 멤버값들을 전달해보자!
		// 즉, 생성자 메소드에 파라미터로 값을 전달해보기!
		
		Person p4 = new Person("hong",30);
		p4.show();
		
		// 21_ 객체를 생성하면서 이름만 전달해보기
		Person p5 = new Person("park");
		Person p11 = new Person();
		p5.show();
		
		// 22_ 객체를 생성하면서 나이만 전달해보기
		Person p6 = new Person(23);
		p6.show();
		
		// 23_ 주의! 생성자도 클래스의 멤버함수 이기에 접근제한의 영향을 받는다!!
		// default 접근제한의 생성자 메소드로 인해 객체생성이 불가한 상황도 있을 수 있음!!
		// 25_ aaa 패키지의 Test 클래스를 객체로 생성
		// aaa.Test t = new aaa.Test(); -> 생성자가 default 접근제한자 이기 때문!
		// t.a=10; // 26_ public 멤버는 접근 가능
		// t.b = 20; // 27_ default 멤버는 다른 패키지에서 접근 불가
		
		
		// 29_ this() 생성자 호출문법 - 멤버변수가 많을 때, 값대입을 매번하기가 번거로워서 사용하는 문법
		Second s = new Second(10,20);
		
		// 32_
		Second s2 = new Second();
		Second s3 = new Second(100);
		
		// 37_ 멤버변수 초기화 4단계 - 단계별로 실행! 구문순서와는 상관없음! 
		// 1. 기본값 초기화
		// 2. 명시적 초기화
		// 3. 초기화 블럭
		// 3-1 static 초기화 블럭 / 3-2 인스턴스 초기화 블럭 
		// 4. 생성자
		// 2,3 을 알아보기 위해 클래스 하나 생성하자!
		
		// 42_ 초기화 확인
		InitialTest obj = new InitialTest();
		System.out.println(obj.a);
	}

}
