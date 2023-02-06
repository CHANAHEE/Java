
public class Print {
	public static void main(String[] args) {
		// 출력기능(자바에서는 함수를 메소드라고 부른다)을 가진 객체에게 출력을 요청!

		System.out.println("Hello");
		System.out.print("Nice\n");

		System.out.print(10);
		System.out.print("\n");
		System.out.print(10.11234564353451346134613451345345);
		System.out.print("\n");
		System.out.print('A');
		System.out.print("\nA\n");

		System.out.print(true);
		System.out.print("\n");
		System.out.print(false);
		System.out.print("\n");
		// 줄바꿈이 짜쯩난다 , 자동줄바꿈 출력기능
		System.out.println(10 + 3);
		System.out.println("10+3");

		// 서식문자를 이용하여 출력모양을 만들수도 있음.
		System.out.printf("%d + %d = %d\n", 10, 3, 10 + 3);

		// 덧셈연산에 대한 특이점
		System.out.println(5 + 3);// + : 산술연산자
		System.out.println(10 + 3.14);// int + double -> 바이트가 큰 쪽으로 자동형변환이 일어난다.
		System.out.println('G' + 1);// 한문자 + 1 -> 결과 72

		// 문자열 데이터의 덧셈 연산 -> 문자열 붙이기 기능!
		System.out.println("Hello " + "World");// + : 결합연산자

		// 문자열 + 다른 자료형
		String str = "";
		System.out.println("aaa" + 10);
		System.out.println(str + 3.14 + 3);
	    str.concat("3.14");
		// String 과 다른 자료형을 결합연산자로 묶을때는, 무조건 String 이 이긴다.
		// 내부적으로 concat 이라는 기능이 있는데, 이때 데이터가 문자열로 변환되어 처리된다. 
		
		// Java 는 출력형식을 만들때 printf 보다는 문자열의 + 결합연산으로 처리
		System.out.println(5 + "+" + 3 + "=" + 5 + 3);
		System.out.println(5 + "+" + 3 + "=" + (5 + 3));

		// 자료형(Data Type) 과 변수(Variable)
		// 자료형의 2가지 종류
		// Premitive(원시) 자료형 : boolean, byte, char, short, int, long, float, double
		// Reference(참조) 자료형 : String, Scanner, Random . . . 등 [Class 로 만든 자료형]

		// 변수를 만드는 문법 : 자료형 변수명;
		int a = 10;
		// 출력기능을 가진 객체에게 출력을 요청! -> 이게 객체지향! 출력은 출력하는 객체가 출력하는거임!
		System.out.println(a);

		// C언어와 다르게 값을 대입할 때 주의점.
		int b;
		// b = 3.14;//error : 자료형이 큰것을 작은 변수에 대입할 수 없습니다.
		double c;
		c = 'A';
		System.out.println(c);

		// 자료형 별로 담을 수 있는 값의 크기가 제한됨.
		byte d = 127; // -128 ~ 127
		// d = 128 // error : 범위를 넘어가면 에러!
		System.out.println(d);

		short e = 32767; // 양수,음수 : 각 32768 개씩 가능
		System.out.println(e);

		int f = 2100000000; // 양수,음수 : 각 21억 까지 가능
		System.out.println(f);

		long g; // 양수,음수 : 각 900경 까지 가능
		// g = 8100000000000000000; // error : 리터럴 상수 중 정수는 int 형,실수는 double 형으로 인식! 각각
		// 4바이트,8바이트의 메모리를 갖는다.
		g = 8100000000000000000L; // 정수형 상수를 Long 으로 만드는 L 키워드가 필요!
		System.out.println(g);

		float h;
		// h = 3.14; // error : 실수형 상수는 기본으로 double 형으로 인식!
		h = 3.14f; // 실수형 상수를 float 으로 만드는 f 키워드가 필요!

		double i = 3.14;
		System.out.println(i);

		char j = 'G';
		System.out.println(j);
		j = 65;
		System.out.println(j);

		char u;
		u = '한'; // 자바는 유니코드 기반이기 때문에 한글자로 한글도 들어가진다.
		
		boolean k = true;
		System.out.println(k);
		k = 5 < 3;
		System.out.println(k);

		// 작은 값은 큰 변수에 대입이 가능함. -> 자동형변환
		double l = 10;
		System.out.println(l);

		// long m = 3.14f;// error : 무조건 실수가 정수보다 큰 자료형!
		// long + float 연산하면... long 을 float으로 변환하여 연산!
		System.out.println(100L + 3.14f);

		// byte,short 은 별도의 접미사 없이 int 형 상수값을 대입 가능하다!
		byte n = 10;
		short r = 100;

		// byte 나 short 변수끼리 연산은 자동 int 로 변환되어 계산됨.
		short x = 10;
		short y = 50;
		short t;
		//t = x + y; // error 
		t = (short) (x + y);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		// 자바의 상수 - 2가지 종류
		// 1. 리터럴 상수(literal) - 값 자체를 의미 : 10, 3.14, 'G', "aaa", true 등등
		// 2. final 상수 - 상수화된 변수 
		
		final int MAX_HEIGHT = 10;//final 상수라고 이야기함. 상수의 이름은 대문자로만.. 스네이크 표기법 권장.
		//z=20; // error - 상수는 값 변경 불가 
		
		// 참조형 맛보기
		String s;
		s = new String("Hello"); // 진짜 표현 
		System.out.println(s.toString()); // 
		System.out.println(s); // 원래는 주소가 나와야하는데 자동 toString()
		s = "Android"; // 워낙 자주 쓰니까 자동 new String("Android")을 해줌.
		
		
	}
}
