
public class Main {
	public static void main(String[] args) {
		// 객체지향 프로그래밍 (OOP) - 객체 위주로 프로그래밍 한다
		// 객체란? : 고유한 기능과 값을 가진 녀석(변수+함수)
		// class : 객체의 종류 
		
		// OOP는 이런 객체들을 필요할 때 만들고, 그 기능을 사용해 프로그래밍 하는 방식
		// 자바에서는 자주 사용될 기능들을 만들어 설계해 놓았음.
		// 이런 설계도 파일들을 class 라고 부름. 약 2000여개 정도 존재함.
		// 이런 class 들을 Java System Library API 라고 부른다.
		
		// 아무리 2000여개의 클래스가 있더라도 내가 원하는 모든 기능을 미리 가지고 있을수 없음.
		// 그래서 개발자가 기능을 만들어야 하는 경우도 있음.
		// 이를 사용자 정의 class 라고 부름.
		
		// 클래스를 왜 써야하는데요? 이건 좀 나중에..
		// 오늘은 클래스를 만드는 방법에 대해 알아보자.
		
		// 클래스를 만드는 방법 - 4가지 위치
		// 1. 별도의 .java 문서에 만드는 방법	
		// 2. 하나의 .java 문서 안에 여러개의 클래스를 설계하는 방법
		// 3. 클래스안에 또 다른 클래스를 선언하는 방법
		// 4. 메소드 안에 클래스를 설계하는 방법
		
		// 개발자가 정의한 class 를 이용하여 객체 생성
		Second s = new Second();
		s.a = 10;	// 멤버변수 사용
		s.aaa();	// 멤버함수 사용
		
		Third t = new Third();
		t.a = 100;
		t.show();
		
		
		// Second 클래스 안에 설계한 Hello inner 클래스
		// Second.Hello h = new Second.Hello();// 이너클래스는 객체 생성을 못함.
		// 클래스안에 다른 클래스를 설계할 수 있으나, 사용 방법은 조금 다르다!
		// Q.왜 Second 로 접근할까? 참조변수를 통해서 하면 안되나?
		
		
	}
}