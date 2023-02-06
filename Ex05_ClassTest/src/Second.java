
// 사용자 정의 클래스 
// 하나의 java 파일에는 파일의 이름과 동일한 class 가 하나 존재해야한다.
// 그러한 클래스에는 class 예약어 앞쪽에 public 을 명시해주어야 한다.

public class Second {
	// 클래스는 기본적으로 멤버변수(필드)와 멤버함수(메소드)로 구성되어 있음.

	// 멤버변수
	int a;

	// 멤버함수
	void aaa() {
		System.out.println("Second aaa method...");
		// 함수 안에 다른 class 를 설계
		// 지역 class 라고 부름.
		class Nice {
			int a;
			void show() {
				System.out.println("Nice show method...");
			}
		}
	}

	// 다른 클래스 설계하기
	// inner class 라고 부른다.
	class Hello {
		int a;

		void show() {
			System.out.println("Hello show method...");
		}
	}

}// Second class ...

// 또 다른 class 를 선언할 수 있음.
class Third {
	int a;

	void show() {
		System.out.println("Third show method...");
	}
}
