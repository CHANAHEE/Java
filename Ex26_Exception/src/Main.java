import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 1_ 우리가 만날 수 있는 잘못된 상황들
		// 1. Error(오류) : 실행불가!
		// 2. Exception(예외): 실행 중(RunTime) 문제 발생! [ 앱 사용 중에 다운되는 상황 ]

		// 2_ Exception 의 대표적인 예
		// 1. 사용자가 잘못된 데이터를 입력하는 경우 : 숫자입력 상황에 문자를 입력하는 상황
		// 2. 개발자가 개발 로직이나 계산을 잘못한 경우 : 배열의 인덱스번호 오류 or 0 으로 나눗셈
		// 3. 네트워크나 하드웨어 오류 : 하드디스크의 파일 제어 오류, 특정 사이트(서버) 접속 오류(URL 실수, 서버 불량 등)

		// 3_ 예외처리에 대한 실습 - 예외는 발생하지만, 앱이 다운되지 않도록 하는 문법.
		System.out.println("예외처리에 대해 알아봅시다.");

		// 4_ 예외상황
		// System.out.println( 10 / 0 ); // 이곳에서 예외가 발생하며 이 순간 프로그램이 다운되버림. 즉, 아래 코드들이 실행되지 않음.
		// 예외처리는 이런 앱이 실행중에 멈춰버리는 문제를 미연에 방지해서 아래 코드들이 정상적으로 실행되도록 하는 기법.
		// 즉, 예외는 없도록 하는것이 아니라 예외가 발생해도 다운되지 않도록 하는것임. 예외는 발생한다! 다만 그 처리에 관한 기법이다!
		// if 문법으로 예외 상황을 방지하는 것도 방법이다! 다만, 모든 상황을 대처하지는 못함.
		// 또한 경우에 따라서 일단 실행해 봐야 예외인지 아닌지를 파악할 수 있는 경우도 있음. [ 예) 네트워크 접속 ]
		// 이럴때 사용하는 문법 - 예외처리

		// 5_
		// 1. 0으로 나눗셈
		int a = 0;
		try {
			System.out.println(10 / a);	// 5_1 예외발생 가능성이 있는 코드
		}catch(ArithmeticException e){
			// 5_2 예외가 발생할 때 실행되는 영역
			System.out.println("예외가 발생했어요!");
			System.out.println("예외 메시지 : " + e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		// 즉, 예외처리 [ try - catch ] 는 앱이 다운되지 않도록 하는 기법
		
		// 2. 배열의 인덱스 번호 사용 오류..
		int[] aaa = new int[5];
		
		try {
			for(int i = 0; i < 6 ; i++) {
				System.out.println(aaa[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생했어요!");
			
		}
		
		// 3. null 참조변수로 객체의 메소드를 사용 [ 가장 빈번함 ]
		String s= null;
		try {
			System.out.println(s.length());
		} catch(NullPointerException e) {
			System.out.println("객체가 읎써~~");
		}
		
		// 4. 잘못된 데이터를 입력!
		Scanner scan = new Scanner(System.in);
		int n;
		try {
			//n = scan.nextInt();
			//System.out.println("n : " + n);
		} catch(InputMismatchException e) {
			System.out.println("정수만 입력해~~");
		}
		System.out.println("\n프로그램 종료\n");

		// 5. 숫자로 바꿀 수 없는 데이터를 숫자로 바꾸려할때
		//String ss = scan.next();
		// 문자열을 int 형으로 변환
		try {
			//int num = Integer.parseInt(ss);
		} catch(NumberFormatException e) {
			System.out.println("숫자만 입력해~~");
		}
		
		// 6_ 즉, 예외처리는 예외가 발생해도 프로그램이 종료되지 않도록 하는 기술!
		// 예외가 여러가지 발생하는 경우도 있음!
		// 예) 두 수를 입력받아 나눗셈을 하자.
		int c,d;
		
		try {
//			c = scan.nextInt();
//			d = scan.nextInt();
			
			// 7_ 중첩으로 다시 예외처리하자!
//			try {
//				System.out.println( c / d ); // d 변수의 값이 0일 수 있음!	
//			}catch(ArithmeticException e) {
//				System.out.println("0으로 나누지 마세요");
//			}
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력가능");
		} 
		
		
		// 8_ 중첩으로 예외처리하면 지저분해~
		// 그래서 등장한 다중 catch 문
		
		try {
//			c = scan.nextInt();
//			d = scan.nextInt();
//			
//			System.out.println( c / d);
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력해라~");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누지 마라~");
		} catch(Exception e) {
			
		} // 10_ 보통 마지막 catch 로 Exception 참조변수 사용!
		
		
		// 9_ 다중 catch 문도 개수가 많아지면 짜증~ 그리고 예외 클래스 이름을
		// 정확히 알고 사용해야 함. 그러니 조금 어렵다.
		// 모든 예외 클래스들의 부모 클래스인 Exception 참조변수로 받으면 어떤 종류든
		// 모두 받을 수 있음.
		try {
//			c = scan.nextInt();
//			d = scan.nextInt();
//			
//			System.out.println( c / d );
		} catch(Exception e) {
			System.out.println("예외 발생!");
		}
		
		
		// 11_ 예외발생 여부와 관계없이 무조건 실행되어야 하는 코드가 있을때,
		// 사용하는 영역 finally
		// 문법적으로는 finally 실행문이 밖에 있어도 동일하게 실행된다. 
		// 다만 개발자들이 의미 전달을 위해 사용한다. 여기 실행문은 try catch 문과 관련된것이다~~
		int x = 5;
		try {
			System.out.println( 10 / x );
			System.out.println("계산성공");
		} catch(ArithmeticException e) {
			System.out.println("계산실패");
		} finally {
			System.out.println("예외여부와 상관없이 무조건 실행");
		}
		// finally 의 또다른 역할. catch 문 생략가능!
		x = 0;
		try {
			System.out.println(10/x);
		} finally {
			System.out.println("안녕~");
		}
		
		
		System.out.println("=====================");
		// 12_ Exception 은 크게 2종류로 나뉜다.
		// 1. CheckedException : 예외처리를 하지 않으면 에러가 발생하는 예외들
		// 2. UnCheckedException : 예외처리를 해도 되고, 안해도 되는 예외들. 지금까지 봤던 모든 예외들.
		
		// 13_ Checked Exception 의 대표적인 종류들
		// 네트워크 연결을 해주는 해임달 객체생성!
		
		try {
			URL url = new URL("http://www.naver.com");
			url = new URL("www.naver.com"); // 주소오류 : http:// 이 없어서
		} catch(MalformedURLException e) {
			System.out.println("서버주소 이상");
		}
		// 파일 입출력
		File file = new File("D:\\aaa.txt");
		
		// 파일 입출력 연결하는 무지개 로드 -  위험해서 반드시 예외처리.
		try {
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
