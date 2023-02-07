
// 4_ Box 클래스를 객체로 생성할 때 <> 안에 작성한 자료형으로 설계도가 완성됨.
public class Box<T> {
	// 3_ 멤버변수의 자료형을 아직 정하지 않고 설계
	T a;
	
	// 19_ 메소드의 파라미터나 리턴타입에도 제네릭 자료형 사용가능 
	
	// 15_ 멤버변수의 값을 대입해주는 기능메소드 - setter method
	void setA(T a) {
		this.a = a;
	}
	
	// 16_ 멤버변수의 값을 리턴해주는 기능메소드 - getter method
	T getA() {
		return this.a;
	}
}
