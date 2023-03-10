
public class Main {

	public static void main(String[] args) {
		// 1_ First 와 Second 클래스 생성!
		// 2_ 제대로 된 캐스팅 
		First f = new First();
		Second s = new Second();
		
		// 3_ 다른 클래스의 객체를 참조하면 에러!
		// 4_ 단, 상속관계의 클래스라면... 
		f = new Second(); // 5_ 부모참조변수로 자식객체를 참조할 수 있음!! -> 7_ 이럴 때 업캐스팅[ Up casting ] 라고 부름.
		
		// 6_ 부모참조변수로 자식객체를 참조하여 제어가능!
		f.a = 10;
		f.showFirst();
		
		// 8_ 참조는 할 수 있지만... 자식객체의 고유한 기능은 사용불가능!!
		// f.b = 20; // Error!!
		// f.showSecond(); // Error!
		
		// 9_ 그럼 실제로 자식객체의 고유기능을 사용하고 싶다면..??
		// 자식객체를 참조하는 참조변수가 필요할 수 밖에 없음.
		Second s1 = new Second();
		
		// 10_ 새로운 자식 참조변수를 만들고 Second 객체를 참조하던 First 참조변수 f의
		// 참조값(주소)를 대입해주기 - 객체공유!
		Second s2;
		// s2 = f; // Error! 왜???
		// 11_ 자식(Second) 가 부모(First) 를 참조한다고 오해함.
		// 12_ 그래서 f가 참조하는것이 Second 객체라고 알려주면 대입이 가능하다!( 형변환 )
		s2 = (Second)f; // 13_ Down Cating 이라고 부름!
		s2.b = 20;
		s2.showSecond();
		
		// 14_ 업캐스팅이 되어 있지 않은 상태에서 다운캐스팅만 시도하면 에러
		First f2 = new First(); // 15_ 제대로 된 casting
		// Second s3 = (Second)f2; // 16_ 다운캐스팅을 시도해보았다...
		// s3.showFirst();
		// s3.showSecond();
		
		// 17_ 이런 업, 다운 캐스팅을 왜 하지??
		// 18_ 이걸 알려면 오버라이드 된 메소드 일 때 살펴보자! 
		First ff = new Second(); // 업캐스팅
		ff.show(); // 19_ 실제 참조하고 있는 객체의 오버라이드 된 show() 가 발동함.
		
		// 20_ 업 캐스팅이 되어도 자식객체의 기능메소드를 사용할 수 있는 경우가 있음.
		// 이 기술을 이용하여 다양하게 활용할 수 있음.
		
		// 21_ 실제 활용형태 .. 실습
		// 부모 참조변수 1개로 자식객체 모두를 제어할 수 있음.
		First obj; // 참조변수
		obj = new First();
		obj.show();
		
		obj = new Second();
		obj.show();
		
		obj = new Test();
		obj.show();
		
		System.out.println();
		// 23_ 조부모 참조변수로 손주객체 참조가능
		// First - Second - Third
		obj = new Third();
		obj.show();
		
		// 25_ 이렇게 obj.show() 라는 글씨는 같은데,
		// 결과가 다르게 다온다고 하여 "다형성" 이라고 부름
		
		// 다형성은 어떨 때 사용하는지...? 다음프로젝트에서! 
	}

}
