import java.net.MalformedURLException;
import java.net.URL;

public class Main2 {
	public static void main(String[] args) {
		
		// 1_ throws : 예외 떠넘기기 문법
		
		// 4_ 메소드를 호출한 쪽에서 대신 예외를 처리해준다
		try {
			int num = divide(10,-1);
			System.out.println("num : " + num);
		} catch(ArithmeticException e) {
			System.out.println("divide 메소드의 throws 된 예외 대신처리");
		}
		
		System.out.println();
		
		// 5_ 강제로 예외처리 해야만 하는 Checked Exception 을 던지는 메소드 사용
		try {
			aaa();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 9_
		try {
			ccc();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// 8_ 
	static void ccc() throws MalformedURLException {
		bbb();
	}
	// 7_ throws 는 폭탄 떠넘기듯이 예외도 마구 떠넘길 수 있다.
	static void bbb() throws MalformedURLException {
		aaa();
	}
	
	static void aaa() throws MalformedURLException {
		// 6_ 이곳에서 해야할 예외처리를 떠넘기기 : throws
		URL url = new URL("http://www.google.com");
	}
	// 2_ 두 수를 나눗셈 연산하여 결과를 리턴해주는 기능 메소드
	// 3_ 경우에 따라서는 예외가 발생하는 코드에서 직접 처리가 애매할 수 있음.
	// 이럴때 이곳에서 예외를 처리하지 않고 이 메소드를 호출하는 쪽으로 예외를 던져버리는 문법 : throws!!! 일종의 폭탄돌리기!
	static int divide(int x, int y) throws ArithmeticException{
		return x/y;
//		try {
//			return x/y;
//		}catch(ArithmeticException e) {
//			return ???
//		}
	}
}
