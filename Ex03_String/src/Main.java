import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// java 에서는 문자열(String) 을 객체로 관리함.
		// 즉, java 에서 문자열은 객체임!
		// java 의 String 객체는 글씨변경이 불가능함 -> immutable 성질
		// https://readystory.tistory.com/139

		String str = new String("Hello");
		// 단 , String 은 워낙 많이 사용되기에 축약표현 문법을 제공함.
		str = "Hello"; // 자동 new String();

		// 객체는 기능(함수->메소드) 들을 보유하고 있음.
		// String class 의 유용한 메소드들

		// 1. 문자열 데이터의 길이(글자수) 를 리턴해주는 기능(method)
		int len = str.length();
		System.out.println("글자수 : " + len);

		// 2. 문자열의 값 비교 기능
		String str2 = "Nice";
		System.out.println(str2 == "Nice"); // true : 주소비교. 자동 new 연산자는 기존의 동일한 문자열의 주솟값을 가져온다.
		String str2_1 = new String("Nice");
		System.out.println(str2_1 == "Nice"); // false : new 연산자를 통해 heap 영역에 새로운 메모리 공간을 만듬.

		System.out.println(str2.equals(str2_1)); // true : 값비교이기 때문에 true.
		System.out.println(str2.equals(new String("Nice"))); // true : 값비교이기 때문에 true.

		// 2-1. 대소문자 비교
		System.out.println(str.equals("hello")); // false
		System.out.println(str.equalsIgnoreCase("hello")); // true

		// 3. 문자열에서 특정 char 얻어오기
		//str = str.toUpperCase();
		System.out.println(str.charAt(0) + 1);
		System.out.println(str.charAt(0) + 'A');

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		// 3-1. Scanner 객체를 이용하여 char 한문자 입력받아보기
		Scanner scan = new Scanner(System.in);
		/*
		 * String s1 = scan.next(); // 문자열 입력받기 char c = s1.charAt(0);
		 * System.out.println("c : " + c);
		 */

		// 4. 문자열 안에 특정한 문자열이 포함되어 있는지 여부
		String s2 = new String("Hello world! Hello android! nice world!");
		boolean bool = s2.contains("!");
		System.out.println(bool);

		// 5. 문자열안에 특정 문자가 몇번째 위치에 있는지 알려주는 기능
		String s3 = new String("Hello World!");
		int index = s3.indexOf('W');
		System.out.println(index); // 해당 글자가 여러개라면 맨 앞에 글자의 인덱스를 가져옴.
		System.out.println(s3.lastIndexOf('!')); // 인덱스를 찾는데, 뒤에서 부터 찾을수도 있음. 인덱스의 개념을 헷갈리지 말것. 뒤부터 시작하는게 아니라, 인덱스를 찾는
													// 과정을 뒤부터 시작하는것.

		// 5-1. 특정문자열의 시작위치도 검색가능
		System.out.println(s3.lastIndexOf("Hello"));

		// 5-2. 특정 위치부터 검색 요청도 가능함
		System.out.println(s3.indexOf("Hello", 5)); // 5번 인덱스 위치부터 검색 시작!

		// 6. 문자열 결합 기능
		// String 은 immutable 속성이 있기 때문에 절대!! 원본은 변하지 않는다!!
		s3 = s3.concat("nice android!");
		
		System.out.println(s3);

		// 사실 .concat() 은 잘 사용안함. why? + 결합연산자의 제공때문이다!!
		// 이 연산자 concat() 기능을 대신 호출해줌.
		String s4 = s3 + "nice ios";
		System.out.println(s4);

		// 7. 문자열이 특정한 문자열로 시작되는지 여부
		System.out.println(s3.startsWith("H")); // true
		System.out.println(s3.startsWith("h")); // false

		// 7-1. 특정 문자열로 종료되는지 여부 // 도메인 주소같은거 비교할때 쓴다
		System.out.println(s3.endsWith("!")); // true
		System.out.println(s3.endsWith("d")); // false

		// 8. 대소문자 변환
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase()); // 원본은 변경 X.

		s3 = s3.toUpperCase();
		System.out.println(s3); // 원본을 변경하고 싶다면, 원본 참조변수에 새로운 문자열 객체를 대입.

		// 9. 문자열의 앞 뒤 공백을 제거 - 거의 필수!
		s3 = "  Hel           lo                                   ";
		System.out.println("[" + s3 + "]");
		System.out.println("[" + s3.trim() + "]");

		// 10. 특정 문자 바꿔치기
		s3 = "Hello World! Hello Android! Nice World!";
		System.out.println(s3.replace('H', '♥')); // 원본은 불변! 해당하는 글자는 모두 바뀐다!
		System.out.println(s3.replace(' ', '♥')); // 원본은 불변! trim() 으로 지워지지 않는 중간공백도 지워지게 할 수 있다!

		// 10-1. 특정 문자열 바꿔치기
		System.out.println(s3.replace("Hello", "Shit"));
		System.out.println(s3.replace(" ", "")); // 빈 문자열도 있다! 어쩃든 객체. length가 0 인 객체! 다만, ''처럼 한문자가 비어있는것은 오류.

		// 11. 문자열 잘라내기
		System.out.println(s3.substring(1)); // index 부터 쭉 출력. index 앞부분은 출력되지 않는다.
		System.out.println(s3.substring(13, 18)); // 13~17 까지

		// 12. 문자열값의 대소비교 [문자열 정렬할 때 사용됨]
		int a = 10, b = 15;
		System.out.println(a > b);

		char ch1 = 'a', ch2 = 'b';
		System.out.println(ch1 > ch2);

		String s5 = "aaa";
		String s6 = "bbb";
		// System.out.println(s5 < s6);//error! -> 주소를 대소비교 한것이기 때문! 자바에서는 주소 대소비교가 불가!
		System.out.println(s5.compareTo("aaazfzz"));
		// 그런데 .compareTo 는 잘 안쓴다! 배열이나 리스트에 이미 sort 기능이 있기 때문!

		// 13. 문자열을 특정문자를 기준으로 분리해서 여러개의 문자열 배열로 리턴해줌.
		String s7 = "android,ios,web";
		String[] arr = s7.split(",");
		System.out.println(arr[2]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// String class의 static method 들...
		// static 메소드 : 객체생성 없이 바로 사용할 수 있는 기능메소드[클래스명.메소드명()]

		// 1. .format() : 특정 포맷(모양/형식)의 문자열을 '생성'( != 출력)하고 싶을때 사용하는 기능메소드
		int hour = 13; // 시
		int min = 5; // 분
		int sec = 4; // 초
		System.out.println(hour + ":" + min + ":" + sec);
		System.out.printf("%02d:%02d:%02d\n", hour, min, sec); // 출력형태를 무조건 CLI 환경의 console 에만 출력함.

		// 실무환경에서는 GUI 환경으로 데이터를 표시하며 이 표시는 반드시 문자열로 처리된다.
		String ss = String.format("%02d:%02d:%02d", hour, min, sec);
		System.out.println("현재시간  " + ss);

		// 2. .valueOf() : 기본형 자료형(premitive)을 String 객체로 변환하는 메소드
		int num = 100;
		String s10 = String.valueOf(num);
		System.out.println(s10.length());

		String s11 = String.valueOf(num);
		System.out.println(s11.length());

		String s12 = String.valueOf(num);
		System.out.println(s12.length());
		// GUI 환경에서 기본형을 문자열로 변환하는 코드는 아주 빈번함.
		// 하지만 자주 사용되지 않음 -> 결합연산자를 이용하면 더 간결!
		String s13 = 1000 + "";
		String s14 = 5.22 + "";
		String s15 = true + "";
		
		// 반대로, 문자열을 기본형으로 변환하고 싶다면??
		// 이 기능은 String 클래스에 없음
		// 이 기능을 가진 클래스들이 있음. 이 클래스들의 static 메소드를 사용
		// 이런 클래스들을 Wrapper 클래스(8개)라고 부름.
		// -> Boolean, Byte, Character, Short, Integer, Long, Double
		//
		
	}
}
