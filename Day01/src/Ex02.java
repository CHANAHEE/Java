
public class Ex02 {
	public static void main(String[] args) {
		System.out.println("제 이름은 홍길동입니다.");
		System.out.println("제 나이는 " + 20 + "살이고요.");
		System.out.println("제가 사는 곳의 번지수는 " + 123+"-"+456+"입니다.");
		
		System.out.println('A' + 'B');
		System.out.println(true+"1");
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println();
		
		int _hel = 10;
		int $MAX_NUM = 10;
		System.out.println($MAX_NUM);
		
		byte b = 10;
		char ch =60000;
		int i = 100;
		long l = 100L;
		
		// 자동형변환
		// 
		b = (byte)i;
		ch = (char) (i+1);
		short s = (short)ch;
		float f = l;
		i = ch;
	}
}
