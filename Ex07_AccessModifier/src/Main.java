import aaa.Second;

public class Main {
	public static void main(String[] args) {
		// 객체지향 OOP 는 객체의 멤버들을 외부에서 마음대로 사용하는것을 제한한다.
		// 그래서 존재하는 개념이 접근제한자.
		
		// 이 접근제한자는 4가지 종류로 구분됨. [ 강 --> 약 ] 순으로 적었음.
		// 1. private		: 본인 클래스 안에서 접근을 가능하게 해주는 제한자.
		// 2. default		: 같은 패키지 안에서 . 연산자로 접근을 가능하게 해주는 제한자.
		// 3. protected		: 같은 패키지 안에서 . 연산자로 접근을 가능하게 해주는 제한자. 단, 상속관계라면 다른 패키지라도 접근 가능!
		// 4. public		: 어디서든 .연산자만 있으면 접근을 가능하게 해주는 제한자.
		
		// 같은 패키지에 클래스를 객체로 생성해보자.
		First f = new First();
		// f.a = 10; //error! -> private 멤버는 사용불가!
		f.b = 20;
		f.c = 30;
		f.d = 40;
		f.aaa();
		
		// 다른 패키지에 클래스를 객체로 생성해보자.
		Second s = new Second();
		// s.a = 10; // error
		// s.b = 20; // error
		// s.c = 30; // error
		s.d = 40; // public 만 사용가능 
		
		// 멤버함수 호출 - 함수도 멤버에 대한 접근제한자를 사용가능하다.
		// s.show(); error! - default 접근제한자를 가졌기 때문! 
		s.output();
		
		
		// 자 패키지도 만들었고, 접근제한자들도 배웠고, 클래스들도 배웠다.
		// 그럼 이런것들을 왜 써야하는가??
		
	}
}