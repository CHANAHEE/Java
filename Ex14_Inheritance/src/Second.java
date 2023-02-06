
public class Second extends First {

	// 23_ Second private 멤버변수와 show() 생성 
	private int b;
	
//	//QQ 맞다 참조변수! 객체의 주솟값을 담는다! 근데 return 할때 super는 return 되지 않는다! 
//	// 굳이 바깥쪽에서 안쪽에 들어있는 부모의 주솟값을 건드리면 좋지 않기 떄문! 
//	// 나중에 안드로이드 할 때 많이 보게될 케이스 
//	
//	public First kkk() {
//		return this;
//	}
	
	public void show() {
		// System.out.println(a); error!
		// 부모의 private 멤버 사용불가! 
		showFirst(); 
		System.out.println("b: " + b);
	}
	
	// 24_ 생성자 메소드
	public Second() {
		// 29_ 자동으로 부모객체를 생성하면서 생성자 메소드 호출! 
		// 부모생성자를 호출하는 호출문이 숨겨져있다! 
		// 다른 생성자를 부르는 this() 생성자 호출문이 있듯,
		// 부모 생성자를 호출하는 호출문 문법이 존재한다!
		// super(); 가 숨겨져있음!
		System.out.println("Second 객체를 생성했습니다! ");
		
	}
	// 27_1_ 생성자 오버로딩
	public Second(int a, int b) {
		// super.a = a; // error! -> 부모의 멤버가 private!
		super(a); // 27_2_ 부모의 생성자 호출 
		this.b = b;
		System.out.println("Second 객체를 생성했습니다! int, int");
		// 28_ 매개변수의 값을 멤버변수에 대입! 
		
	}
}
