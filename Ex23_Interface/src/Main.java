
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 83_ interface 는 규격만 정하는 용도이기 때문에 기능구현이 되어있지 않은 설계도이다!
		// 그렇기에 곧바로 객체생성은 불가하다!
		Test t0; // 참조변수는 생성가능!
		// t = new Test(); ERROR! 객체생성은 불가!
		
		// 84_ 인터페이스를 사용하려면 이 규격을 구현한 별도의 클래스를 설계하고, 객체를 생성해서 사용!
		
		// 87_ Test 인터페이스를 구현한 First 클래스 객체 생성!
		First f = new First();
		f.aaa();
		
		// 88_ Test 인터페이스를 구현한 Second 클래스 객체 생성!
		// Second 객체는 무조건 aaa() 기능이 구현되어 있을것을 확신한다! -> Second 는 아직 만들지도 않았음.
		
		// 90_ Second 객체 생성
		Second s = new Second();
		s.aaa();
		System.out.println();
		
		// 91_ 인터페이스도 클래스의 일종이기에 참조변수는 만들 수 있음!
		Test t;
		
		t = new First();
		t.aaa();
		t.bbb();
		
		t = new Second();
		t.aaa();
		t.bbb();
		
		t = new Third();
		t.aaa();
		t.bbb();
	}

}
