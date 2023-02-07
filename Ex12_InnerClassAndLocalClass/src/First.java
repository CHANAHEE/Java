

// 80_ 이너클래스에 static 적용할 클래스 First
public class First {

	int a = 10;
	static int b = 20;
	
	// 81_ 아우터객체 없이 생성가능한 이너 클래스
	public static class Hello{
		void show() {
			System.out.println("Hello show");
		}
	}
}
