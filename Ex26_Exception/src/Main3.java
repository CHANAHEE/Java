
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1_ throw : 코드를 통해 강제로 예외를 발생시키는 문법
		
		try {
			System.out.println("aaa");
			// 2_ 억지로 예외 발생 - 억지로 catch 문으로 이동시키기 
			throw new Exception();
			// System.out.println("bbb");
		} catch(Exception e) {
			System.out.println("예외발생");
		}
		
		System.out.println();
		
		// 3_ 활용예]
		// 메소드에 계산을 요청할 때 그 결과가 음수가 나오는것이 싫어!
		// 즉, 음수가 나오면 예외라고 인지 했으면...
		// java 언어에서 연산결과가 음수라고 예외로 보지 않음.
		int n;
		try {
			n = aaa(10,5);
			n = aaa(10,15);
			System.out.println("n : " + n);
		}catch(Exception e) {
			System.out.println("계산결과가 음수인 예외");
			System.out.println("예외 메세지 : " + e.getMessage());
		}

	}
	
	// 3_1
	static int aaa(int a, int b) throws Exception {
		// 음수가 나오면 에러라고 하고싶을때...
		if(a<b) {
			// 4_ throw 키워드 사용 
			throw new MyException("Hello");
		}
		return a-b;
	}
	
	

}

// 5_ 나만의 Exception class 
class MyException extends Exception{
	// 6_ 생성자 
	public MyException(String msg) {
		super(msg);
		
	}
}