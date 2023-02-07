
public class Main {

	public static void main(String[] args) {
		// 27_ 메소드가 왜 필요한지에 대해 알아보았음.
		// 클래스의 메소드를 정의하는 4가지의 문법적 모습 [리턴타입 O / X , 파라미터 O / X]

		// 29_ 테스트해보자!
		Test t = new Test();

		t.aaa(); // 1)
		t.bbb(10); // 2)
		double dou = t.ccc(); // 3)
		int n = t.ddd(10, 30); // 4)

		// 30_ 사칙연산을 해주는 계산기 객체 생성(기능만 있는 클래스)
		Calculator cal = new Calculator();
		int a = 10, b = 5;
		

		// 32_ 기능을 사용해보자!!
		int sum = cal.sum(a, b);
		int sub = cal.subtract(a, b);
		int mul = cal.multiply(a, b);
		int div = cal.divide(a, b);

		// 33_ 실수형 숫자들의 사칙연산을 해야하는 상황..!! 두둥탁
		double c = 3.5;
		double d = 4.6;

		double sum2 = cal.sum(c, d);
		double sub2 = cal.subtract(c, d);
		double mul2 = cal.multiply(c, d);
		double div2 = cal.divide(c, d);

		// 36_ 이런식으로 같은 기능인데, 자료형이 다를때 활용하는 문법 - 오버로딩

		// 37_ 좀 더 확장하면 GUI 환경에서는 모든 데이터가 문자열 타입!
		// 문자열로 숫자 데이터가 입력되어도, 산술덧셈된 결과가 나오도록 하고싶다!
		System.out.println(cal.sum("245", "567"));
		// 40_ 어떠한 기능을 가지고 있는 클래스 혹은 메소드 등이 왜 만들어졌고,
		// 그러한 기능들이 어떠한 장점을 가지고있는지 등등을 파악하자!!!

		// 41_ 가변인자 ... 연산자
		// 메소드를 호출할 때 파라미터의 개수가 가변적으로 사용되는 경우.
		// 가변인자는 내부적으로 배열을 생성한다! 
		// 그렇다고 가변인자가 배열인것은 아님!.
		// 파라미터로 , 를 이용해서 데이터 값을 넘겨받아서
		// 내부적으로 배열에 저장하는 형식이다! 
		cal.add();
		cal.add(5);
		cal.add(5, 3);
		cal.add(5, 3, 6);
		cal.add(5, 3, 8, 7);
		
		

	}
	void arrM(int[] arr) {
		System.out.print(arr[0]);
	}
	

}
