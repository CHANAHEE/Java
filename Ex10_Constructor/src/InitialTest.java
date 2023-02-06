
public class InitialTest {
	// 38_ 1. 기본값 초기화 - 0에 해당하는 값
	int a;
	// 39_ 2. 명시적 초기화
	int b = 10;

	// 40_ 3. 초기화 블럭 : 프로그래밍적으로 초기화를 할 수 있다는 장점이 있음.
	{
		int c = 30;
		c++;
		if(c<25) c--;
		System.out.println("초기화블럭!");
	}
	// 41_ 4. 생성자 메소드를 이용한 초기화 : 파라미터를 전달받아 초기화를 할 수 있다는 장점.
	public InitialTest (){
		System.out.println("생성자 메소드!!");
	}
}
