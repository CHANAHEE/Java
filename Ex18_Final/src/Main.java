
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1_ 단원바껴쓰니까 1로 다시 바꿈 
		//1_ 지역변수에 final을 붙이면 상수화된 변수
		int a = 10;
		a=20;
		final int aa = 10;
		//aa = 20; error! aa의 값 변경 불가!
		
		// 2_ 자바의 특이한 점.
		final int b;
		b=20; //  처음 값을 대입할 때 상수화 됨 - 권장 X
		// 에러가 안난다! 너가 쓰다 만거야! 라고 자바는 생각한다. 
		//b = 30; // error!
		
		// 3_ 멤버변수에는 final?? 당연 가능함.
		
		// 9_ static final 출력!
		System.out.println(Test.COUNT);
		//Test.COUNT = 10; // error 값변경 X
		
		// 13_ class 에도 final 키워드 적용가능 - 상속이 불가능한 클래스
		
		
		Sample sp = Sample.makeObj();
		Sample sp2 = Sample.makeObj();
		sp.max = 5;
		sp.aaa();
		sp2.max = 10;
		sp2.aaa();
		sp.aaa();
	}

}
