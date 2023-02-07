
// 40_ FlyRobot 에 Robot 상속 
public class FlyRobot extends Robot{
	//41_ fly 기능만 추가!
	void fly() {
		System.out.println("날자~");
	}
	
	// 47_ 상속받은 공격기능 메소드의 기능을 변경
	// 메소드 오버라이딩!!
	// 부모객체와 자식객체는 서로 다른 객체 이기 떄문에 같은 메소드를 작성해도 에러는 아니다! 
	// . 연산자를 이용해서 들어가면 바깥쪽에 있는 메소드 부터 보인다! 이게 오버라이딩의 원리
	void attack() {
		System.out.println("미사일 발사!");
	}
}
