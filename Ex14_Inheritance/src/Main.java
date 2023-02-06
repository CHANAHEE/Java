
public class Main {

	public static void main(String[] args) {
		// 22_ First 객체 생성!
		First f = new First();
		f.showFirst();
		System.out.println();
		
		// 25_ Second 객체생성함! 동시에 First 객체도 생성됨!!->상속받았기 때문! 
		Second s = new Second();
		s.show();
		
		// 26_ 값을 대입해보고 싶다! 
		// 객체를 생성하면서 값을 전달해보자!
		Second s2 = new Second(10,20); 
		// 27_ 오버로딩이 안된상황에서는 상황에서는 위 코드가 오류! 그래서 생성자 오버로딩이 필요!
		s2.show();
		System.out.println();
		
		// 31_ 상속의 상속도 가능! [ 조부모 - 부모 - 자식 ]
		// Second 를 상속한 Third 를 만들어보자!
		Third t = new Third();
		System.out.println();
		// 34_ 상속해준 클래스를 다른 클래스가 다시 상속하는것도 가능하다!
		// First 를 상속한 Test 를 만들어보자! 
		new Test();
		
		// 35_ 여러 클래스를 동시에 상속받는 다중상속은 자바에서는 안됨!!!
		// 즉, Second 와 Test 를 다중상속하려는 Nice 클래스 설계해보자! -> 안되는걸 보이기 위함.
		
		// 37_ 상속은 부모클래스의 기능, 변수들을 편하게 사용할 수 있어서
		// 아주 편한 문법!
		// 다만, 상속을 받아 기능을 사용한다면.. 살짝 원하는 기능과 
		// 다른 상황이 있을 수 있음. 꽃무늬 장판이랑은 못살아~ 
		// 상속 받은 기능( 메소드 ) 를 원하는 동작으로 수정하고 싶을때 사용하는 기술.
		// 메소드 오버라이드!!
		// 다음프로젝트로!!
//		f.kkkF();
	}

}
