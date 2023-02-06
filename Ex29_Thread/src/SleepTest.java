// 5
public class SleepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2_ 객체 생성
		SThread t = new SThread();
		t.start();
		
		// 3_ 5초 후에 깨우기 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 4_ sleep() 으로 자고 있는 스레드를 강제로 깨우기 위해 예외발생시키는 문법.
		t.interrupt();
	}

}

class SThread extends Thread {
	@Override
	public void run() {
		// 1_ 10초 대기 후 "Hello" 글씨 출력
		try {
			sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hello");
	}
}