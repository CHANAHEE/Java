//1_ First 클래스 생성
public class First {
	
	int a;
	
	//1_1_ 멤버변수를 제어하는 기능 메소드 
	void showFirst() {
		System.out.println("a : " + a);
	}
	
	// 15_ a는 내꺼니까 내가 입력~ a 값을 입력하는 기능메소드가 있어야 함. 
	void setA(int a) {
		this.a = a;
	}
}
