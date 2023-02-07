
public class Main {

	public static void main(String[] args) {
		// 72_ 일반 클래스들은 간단하게 객체로 만들어짐
		Test t = new Test();
		System.out.println();
		
		
		// 76_1_ 이너 클래스는 아우터명 없이는 인식불가능
		// Nice nice; // error!
		// 76_2_ 이너클래스는 아우터클래스명으로 인식가능하더라도 직접 객체생성이 불가능하다!  
		// Test.Nice nice = new Test.Nice(); // error!
		// 76_3 그럼에도 이너클래스를 객체로 만들어 사용하고 싶다면..
		// 아우터 객체에게 이너클래스 객체를 만들어서 리턴해달라고 요청! - 즉, 아우터 객체를 이용해 메소드 호출!
		Test.Nice n = t.makeInnerClassObject();
		
		// 78_ 결국, 아우터객체를 생성하지 않는다면, 이너클래스를 객체로 생성할 수 없도록
		// 해서, 잘못된 객체사용을 막아주기 위함.
		
		// 79_ 이너 클래스에는 static 키워드 적용가능! 
		// 아우터 객체 없이 생성가능한 이너클래스를 만들때 사용!
		First.Hello h = new First.Hello();
		h.show();
		// 82_ 그럼 왜 이너클래스를 만들까? -> 소속감을 주기위해서! 패키지 보다 조금 소규모로 소속감을 부여!
	}

}
