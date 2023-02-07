// 2_ Second 클래스 생성 후 First 상속
public class Second extends First{
	// 4_ 아무것도 없어 보이지만 First 를 상속했기에 이미 First 의 멤버를 가지고있음.
	// 또한 본인만의 멤버변수를 추가할 수 있음.
	int b;
	
	// 8_ 본인의 멤버변수를 출력하는 기능메소드
	void showSecond() {
		System.out.println("b : " + b);
	}
	
	// 10_ 상속받은 멤버 a와 본인 멤버 b 모두를 출력하는 기능메소드
	void show() {
		
		//System.out.println("a : " + a);
		// 11_ 객체지향은 객체의 멤버제어는 객체 스스로 하도록 권장!
		// 즉, a 변수를 가진 First 객체가 스스로 출력하도록 요청!!
		// 부모객체의 멤버를 내것인양 사용할 수 있기에 부모의 메소드도 그냥 호출 가능.
		showFirst();
		System.out.println("b : " + b);
		System.out.println();
	}
	
	// 12_1_ 멤버변수에 값을 대입해주는 기능메소드
	void setMembers(int a, int b) {
		// 13_ 매개변수의 값을 멤버변수에 대입
		// this.a = a;
		// this. 은 Second 를 의미하므로 First 의 멤버인 a를 사용하기에는
		// 적합하지 않아보임. -문법오류는 아니나, 논리적으로 부적합
		// 14_ 부모객체를 지칭하는 특별한 키워드 : super
		// super.a = a; -> 좋은 코드는 아님!
		// 객체지향은 니껀 니가.. 그래서 super 멤버값 입력은 First 가 직접입력하도록 요청!
		setA(a);
		this.b = b;
	}
}
