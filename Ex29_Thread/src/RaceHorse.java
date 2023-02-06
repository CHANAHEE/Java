// 2
public class RaceHorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Main 다음 
		
		// 2_ 말 객체 생성 후 start() 실행! 생성자를 통해 말 이름 전달
		Horse h1 = new Horse("천리안");
		Horse h2 = new Horse("적토마");
		Horse h3 = new Horse("캐논");
		
		System.out.println("경주시작!");
		
		// 4_ setPriority() 메서드는 각 스레드의 우선순위를 정할 수 있는 메서드. 10에 가까울수록 쎈놈이다. 근데 100프로는 아님! 상황에 따라 달라질 수 있음.
		h1.setPriority(10);
		h2.setPriority(5);
		h3.setPriority(4);
		
		h1.start();
		h2.start();
		h3.start();
	}

}

// 1_ 말 클래스 만들기
class Horse extends Thread {
	
	// 3_ 말이름 전달받기 
	String name;
	public Horse(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.println(name + " : " + "다그닥! 다그닥!");
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {}
			
		}
		
		System.out.println();
		System.out.println(name +  "도착!");
	}
}
