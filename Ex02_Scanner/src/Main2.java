

public class Main2 {
	public static void main(String[] args) {
		
		// 연산자 - C언어와 동일함.
		// 새로 추가된 연산자 [비트연산자 : >>> - 부호 비트까지 밀어버림] 
		System.out.println(-8 >>> 1); // 부호가 바뀜! 숫자도 바뀜..
		System.out.println(3.1 % 2);
		// 주소나 메모리 사이즈 보는 연산자 없음.
		int n;
		// System.out.println( &n ); // error - 주소연산자 없음
		// System.out.println( sizeof(n) ); // error - 메모리를 보는 기능이 없음.
		
		// 제어문 - C언어와 동일함.
		// 조건문 : if else, switch - case
		// 다른점 : switch 문에 문자열 변수 사용이 가능함! 즉, 문자열, char 형, int 형 변수만 가능! 
		
		// 문자열의 비교에 대한 의미파악 - 아주 중요!!!
		
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2); // false : 주소끼리 비교
		System.out.println(s1.equals(s2)); // true : 값끼리 비교
		
		switch(s1) {
		case "Hello":
			System.out.println("Hello");
			break;
		case "World":
			System.out.println("World");
			break;
		}
		
		// 반복문 : for, while, do-while
		// 무한반복
		// while(1) -> error
		while(true) {
			//OK!
		}
	}
}
