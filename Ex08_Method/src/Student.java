//7_ 클래스는 설계도! -> 클래스가 있다고 바로 사용할수는 없음! 
public class Student {
	// 6_ 연관있는 데이터들을 저장할 변수들을 정의
	// Field(필드, 멤버변수, 속성)
	String name;
	int kor;
	int eng;
	double aver;

	// 14_ 기능을 설계할 수도 있음!
	// 멤버변수(필드) 들의 값을 출력하는 기능(함수)를 만들자! : Method
	void show() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("평균 : " + aver);
		System.out.println();
	}

	// 18_ 평균을 계산하는 기능을 만들자!
	void calAver() {
		aver = (double) (kor + eng) / 2;
	}

	// 22_ 멤버변수안에 값을 입력을 해주는 기능을 만들자!
	// 메소드의 파라미터(매개변수)로 값을 전달받을수 있음!
	void setMembers(String name, int kor, int eng) {
		// 23_ 멤버변수와 매개변수는 서로 다른 변수!
		// 매개변수로 받은 데이터들을 멤버변수에 전달해 줘야 함.
		// name = name; -> 멤버변수와 구별 불가!
		// 이 클래스의 멤버변수를 지칭하는 아주 특별한 키워드를 사용! -> this
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
}
