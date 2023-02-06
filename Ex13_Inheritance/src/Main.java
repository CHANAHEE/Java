
// 상속이 무엇인지!!! 

public class Main {

	public static void main(String[] args) {
		
		// 5_ 상속에 대한 이해
		// 상속은 부모의 멤버만 가져오는것이 아니라, 부모 객체도 같이 생성하는 개념!!
		// 즉, 객체 안에 객체가 있는 모습.그림으로 확인! 
		Second s = new Second();
		s.a = 10; // 3_ 상속 받은 클래스의 멤버를 내 것인양 사용할수 있음!
		s.b = 20;
		System.out.println("a : " + s.a);
		System.out.println("b : " + s.b);
		System.out.println();
		
		// 6_ 객체지향은 멤버변수의 제어를 직접 . 연산자로 하는것을 권장하지 않는다. 
		// 멤버값을 출력하는 기능을 만들어서 사용하는 것을 권장! 
		s.showFirst();
		System.out.println("b : " + s.b);
		System.out.println();
		// 7_ 이런식이면.. Second도 본인의 멤버변수를 출력하는 기능이 있어야 함.
		s.showFirst();
		s.showSecond();
		System.out.println();
		
		// 9_ 가만보니, Second 객체는 a와 b 모두를 사용하려고 만든 
		// 객체이니, 출력기능도 a,b 모두 출력해주는 기능이 있는것이
		// 더 합리적으로 보인다!! - show 를 First와 Second 로 나누지 말고 한꺼번에 출력하자!
		
		// 12_ 이런식이면 값을 대입하는 기능도 있으면 좋겠다! 
		
		// 16_ setMember 기능 사용
		s.setMembers(50, 60);
		s.show();
		
		// 17_ 2번째 객체 생성 및 값 대입과 출력
		Second s2 = new Second();
		s2.setMembers(100, 200);
		s2.show();
		
		// 18_ setMembers 쓰기 귀찮다! 객체도 생성하면서 값을 전달할수있으면 좋겠다! -> 생성자 활용!
		// 다음 프로젝트로 연습해보자!
	}

}
