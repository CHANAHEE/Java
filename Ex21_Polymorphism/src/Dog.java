// 50_1 클래스 생성
public class Dog extends Animal{
	
	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("멍멍!");
	}
	
	// 54_1 고유기능
	void guardHouse() {
		System.out.println("잘지켜!");
	}
}
