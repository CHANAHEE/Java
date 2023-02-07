
public class Calculator {
	// 31_ 계산기능 4개를 만들어보자
	// 사칙연산 기능들 : 메소드
	// 더하기 기능
	int sum(int x, int y) {
		return x + y;
	}

	// 뺄셈 기능
	int subtract(int x, int y) {
		return x - y;
	}

	// 곱셈 기능
	int multiply(int x, int y) {
		return x * y;
	}

	// 나눗셈 기능
	int divide(int x, int y) {
		return x / y;
	}

	// 34_ 위 4개의 기능은 모두 정수형만 처리하니 실수형 사칙연산 기능이 별도로 필요.
	// 35_ 별도의 덧셈기능이라며 함수 이름을 다르게 하면 사용자 쪽에서 불편을 초래.
	// 함수(기능) 의 이름을 똑같이 하고 파라미터를 다르게 적용하는 문법.
	// 메소드 오버로딩(Overloading)
	double sum(double x, double y) {
		return x + y;
	}

	double subtract(double x, double y) {
		return x - y;
	}

	double multiply(double x, double y) {
		return x * y;
	}

	double divide(double x, double y) {
		return x / y;
	}

	// 38_ 숫자모양의 문자열 데이터들의 산술 덧셈 결과 리턴해주는 기능 메소드
	// 덧셈기능 sum 메소드의 오버로딩
	int sum(String x, String y) {
		// 39_ 문자열을 정수로 변환해주는 기능을 이용
		return Integer.parseInt(x) + Integer.parseInt(y);
	}
	
	// 42_ 전달받은 값의 누적된 덧셈결과를 계산하는 기능을 만들고싶다!
	// 파라미터의 개수가 몇개인지 모를 때 사용하는 특별한 매개변수 연산자 ... -> 가변인자
	
	void add(int... ns) {
		// 43_ns는 사실 배열객체가 됨.
		System.out.println("전달받은 데이터 개수 : " + ns.length);
		for(int t: ns) {
			System.out.print(t + " ");
			
		}
		System.out.println();
	}
}
