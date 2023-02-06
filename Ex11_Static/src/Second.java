
public class Second {
	// 67_ 
	int a;
	static int b;
	
	// 70_ static 초기화 블럭
	static
	{
		System.out.println("static 초기화 블럭");
		//a = 10; // error! -> 인스턴스 변수 초기화 불가!
		b = 20;
	}
	// 69_ 초기화 블럭 - instance 초기화 블럭
	{
		System.out.println("초기화 블럭");
		a=10;
		//b = 20; -> 권장하지 않음
	}
}
