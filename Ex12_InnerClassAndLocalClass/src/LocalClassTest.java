
public class LocalClassTest {
	int g = 10;
	
	void aaa() {
		int a = 50; // 83_ 지역변수 - 다른지역에서는 인식불가!
		
		// 84_ 메소드 영역 안에 클래스 설계!
		// Local class [지역클래스, 내장클래스, 내부클래스]
		// 85_ 설계된 지역 안에서만 인식가능한 설계도 (클래스) 
		class Good{
			int n = 10;
			void show() {
				System.out.println("Good show");
			}
		}
		
		Good good = new Good();
		good.show();
		
		// 86_ 로컬클래스를 사용하는 이유!!
		// 1. 그 메소드가 실행중일때만 잠시 1회용 처럼 사용하는 객체를 만들고 싶을때
		// 2. 나중에 배울 '익명 클래스' 라는 것을 사용할 때 -> 많이쓰임.
	}
	
	void bbb() {
		g = 100;
		//a = 200; //error!
	}
}
