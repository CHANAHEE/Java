
public class Main {

	public static void main(String[] args) {
		
		// 39_ 객체 생성
		Robot r = new Robot();
		r.move();
		r.attack();
		System.out.println();
		
		FlyRobot fr = new FlyRobot();
		fr.move();
		fr.attack(); // 42_ 상속받은 기능이 있다!
		fr.fly(); // 새로 만든 기능도 있다!
		System.out.println();
		
		// 45_ 객체 생성!
		SwimmingRobot sr = new SwimmingRobot();
		sr.move();
		sr.attack();
		sr.swimming(); 
		System.out.println();
		// 46_ 근데 수영하는 놈이 주먹발사, 아장아장 이런게 좀 이상하다! 변경해보자!
	}

}
