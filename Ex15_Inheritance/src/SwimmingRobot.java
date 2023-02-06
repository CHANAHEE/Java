
// 43_ 부분상속은 안된다! 멤버를 꺼내오는것이 아니라 객체 자체를 꺼내오는것!
public class SwimmingRobot extends Robot {
	
	// 44_ 이미 기능이 다 있기 때문에 새로운기능만 추가하자!
	void swimming() {
		System.out.println("음파~");
	}
	//48_ swimmingRobot 도 바꿔보자!
	void attack() {
		System.out.println("어뢰 발사!!");
	}
	
	// 49_ 상속받은 기능을 수정하는 Override 중에서
	// 기존 기능을 완전히 바꾸는 것만 실습해봤음!
	// 기존기능을 유지하면서 조금만 새로운 기능을 추가하는 형태도 있을수 있음! 
	// 다음 프로젝트에서! 
}
