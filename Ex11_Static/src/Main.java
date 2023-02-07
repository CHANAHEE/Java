
public class Main {

	public static void main(String[] args) {
		
		// 43_ 지역변수에는 static 키워드를 사용할 수 없다!
		// static int a; error!!
		Test t1 = new Test(10,20);
		Test t2 = new Test(30,40);
		Test t3 = new Test(50,60);

		// 47_ 멤버변수 a값 출력
		t1.a = 100; // 49_ 출력값이 t1만 바뀜
		System.out.println(t1.a);
		System.out.println(t2.a);
		System.out.println(t3.a);
		
		
		
		// 48_ static 변수 b 값 출력 
		t1.b = 200; // 49_ 출력값이 t1,t2,t3 상관없이 모두 바뀜
		System.out.println(t1.b);
		System.out.println(t2.b);
		System.out.println(t3.b);
		
		// 50_ 그래서 b라는 변수가 객체마다 존재하지 않고 오직 1개만 존재하는 모습 
		// static 변수라는것은 객체에 있지 않고 클래스에 오직 1개만 있는 형태여서 
		// 객체참조변수명.b 라고 쓰는것이 조금 어색하다
		// 그래서 static 멤버변수를 사용할 때는 클래스에 1개만 있는 변수이므로,
		// 클래스명.b 라고 쓰는것이 조금 더 합리적으로 보인다.
		System.out.println();
		Test.b = 1000;
		System.out.println(Test.b);
		
		// 51_ static 멤버변수는 객체안에 있는 것이 아니기에...
		// 객체생성과 상관없이 존재하는 변수가 됨. [바로 이 특징이 static 변수를 이용하는 이유!!]
		// 즉, 객체생성 없이 사용하고 싶은 변수가 있을 때 필요한 문법!!
		
		// 52_ 활용 예) 객체가 몇마리 인지 카운팅하고 싶을때도 사용이 가능하다! 
		new First();
		new First();
		new First();
		new First();
		System.out.println();
		
		// 55_ 메소드에 static 키워드를 적용해보자! 
		// 58_ 일반 메소드는 객체를 생성하지 않으면 사용불가!
		// Test.aaa(); error!
		Test tt = new Test(10,20);
		tt.aaa();
		
		// 59_ static method 는 객체 생성 없이 클래스 명으로 호출하는 기능
		Test.bbb();
		
		// 60_ 대표적인 활용모습 - 문자열을 정수로 변환하는 기능사용
		int n = Integer.parseInt("498");// parstInt 와 valueOf 차이점 ??
		System.out.println(n);
		
		
		// 68_ static 초기화 블럭
		// 71_ Second 클래스가 처음 사용될 때 한 번 사용함.
		new Second();
		new Second();
		new Second();
		new Second();
		
		
	}

}
