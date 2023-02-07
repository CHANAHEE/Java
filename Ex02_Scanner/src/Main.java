import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 아스키값을 받아 자료형으로 반환하는 코드를 직접 작성하는것은 매우 번거로운 일.
		// 이 작업을 편히 하기위해 만들어진 class 가 Scanner 클래스
		// 이 Scanner 클래스를 사용하려면 객체로 생성하여 사용해야 함. -> 객체와 class 는 다른말! 변수와 자료형을 생각해보자.
		// Java 언어는 모든 객체를 반드시 Heap 메모리 영역에 만들어야만 함.
		// Heap 메모리에 객체를 생성하는 키워드를 사용 : new !!!
		Scanner sc = new Scanner(System.in); // 생성자 함수 호출. 호출하지 않으면 에러!
		// 자료형이 Scanner 인 참조변수 sc 를 통해 Scanner 객체의 주소값을 받아올 수 있다.

		// 정수형 숫자 입력
		int a;
		System.out.print("정수입력 : ");
		a = sc.nextInt();
		System.out.println("a : " + a);
		
		// 실수형 숫자 입력
		double b;
		System.out.print("실수입력 : ");
		b = sc.nextDouble();
		System.out.println("b : " + b);
		
		// 논리값 입력
		System.out.print("논리값 입력 : ");
		boolean c;
		c = sc.nextBoolean();
		System.out.println("c : " + c);
		
		// 문자열 입력
		System.out.print("문자열 입력 : ");
		String str;
		str = sc.next(); // 띄어쓰기 없는 문자열 입력 -> 단어 입력가능
		System.out.println("str : " + str);
		
		str = sc.nextLine(); // 엔터키 값 받는 용도.
		str = sc.nextLine(); // 띄어쓰기 있는 문자열 입력 -> 문장 입력가능 - 이전 입력에 의한 엔터키를 입력으로 받아들여 버림. -> 한번 더 입력을 받는다.
		System.out.println("str : " + str);
		
	}
}
