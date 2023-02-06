
// 74_ 상속받은 추상클래스안에 추상메소드가 있다면.. 이를 반드시 오버라이드 해서 구현해야만 할 의무가 생김. *** 중요
public class Nice extends Test{

	// 75_ 상속받은 클래스의 추상메소드를 반드시 구현할 수 밖에 없게됨.
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("Nice 클래스에서 구현한 aaa 기능");
	}

}
