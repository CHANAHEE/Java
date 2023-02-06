//4
public class SynchronizedTest {

	public static void main(String[] args) {
		
		// 1_ 용어정리
		// 동기화 처리 : Thread 를 사용하는 것은 비동기 처리를 의미함. 이로 인한 문제 해결하는 기법.
		// 동기 (Synchronize) : A 작업이 끝나면 그 다음에 B 작업을 해라~ 정도로 이해해보자. 동시가 아님!
		// 비동기 (Asynchronize) : A 작업 할때, B 작업을 동시에 하는것. 시작시점이 똑같다는 의미는 아니고, A 가 사용중인데, B작업을 할때 라는 의미.
		
		// 2_ 계좌 객체를 생성해보자.
		Account acc = new Account();
		
		// 6_ 계좌에 돈을 입금하는 작업을 수행하는 별도 Thread 객체 생성
		TestThread t1 = new TestThread(acc);
		TestThread t2 = new TestThread(acc);
		
		t1.start();
		t2.start();
		
	}

}

// 3_ 계좌 객체
class Account {
	
	int money = 0;
	
	
	
	// 4_ 입금 기능 - 별도의 동기화 처리를 하지 않으면 서로 다른 스레드가 동시에 이 기능을 실행하여 문제가 생길 수 있음.
//	public void add(int money) {
//		String name = Thread.currentThread().getName();
//		System.out.println(name + " : " + "입금 작업을 시작합니다.");
//		System.out.println(name + " : " + "현재 잔액 : " + money);
//		this.money += money;
//		
//		// 5_ 전산처리시간을 가정하여 임의로 오래걸리는 코드를 작성해놓자. 동기화 처리 확인해보게~
//		for(long i = 0; i < 60000000000L; i++) {
//			new String();
//		}
//		System.out.println(name + " : " + "입금 후 잔액 : " + money);
//		
//		System.out.println();
//	}
	
	// 9_ 새로운 입금 기능 동기화 처리가 된 메소드로 설계하기 - 어떤 메소드를 동기화해야할지 잘 생각하자! 
	// 10_ 이녀석은 메소드를 동기화 처리한것임! 근데 부분적으로 할 수는 없을까? 
//	synchronized void add(int money) {
//		String name = Thread.currentThread().getName();
//		System.out.println(name + " : " + "입금 작업을 시작합니다.");
//		System.out.println(name + " : " + "현재 잔액 : " + this.money);
//		this.money += money;
//		
//		// 5_ 전산처리시간을 가정하여 임의로 오래걸리는 코드를 작성해놓자. 동기화 처리 확인해보게~
//		for(long i = 0; i < 60000000000L; i++) {
//			new String();
//		}
//		System.out.println(name + " : " + "입금 후 잔액 : " + this.money);
//		
//		System.out.println();
//	}
	
	// 11_ 또 한번 새로운 입금 기능 : 부분적 동기화
	void add(int money) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + "입금 작업을 시작합니다.");
		
		// 12_ 어떤 자원을 건드렸을 때 막아줄꺼냐? 요게 매개변수안에 들어가야함. 즉, this 를 넣어주면 Account 객체자원을 건드렸을때, 동기화를 해준다!
		// 13_ Vector 의 경우 동기화처리가 되어있다. -> 즉, Vector 를 통해 기능을 사용할 때 synchronized 처리가 되어있다! 즉, 안정성이 높아지긴하나 
		// 지나친 동기화는 성능의 저하를 불러온다. Thread 를 사용하는 의미가 없다! 
		// 동기화는 멀티스레드를 이야기할때 항상 따라오는 내용~~
		
		synchronized (this) {
			System.out.println(name + " : " + "현재 잔액 : " + this.money);
			this.money += money;
			
			// 5_ 전산처리시간을 가정하여 임의로 오래걸리는 코드를 작성해놓자. 동기화 처리 확인해보게~
			for(long i = 0; i < 60000000000L; i++) {
				new String();
			}
			System.out.println(name + " : " + "입금 후 잔액 : " + this.money);
			
			System.out.println();
		}
	}
}

// 7_ Thread 객체 생성
class TestThread extends Thread {
	
	Account acc;
	
	public TestThread(Account acc) {
		this.acc = acc;
	}
	@Override
	public void run() {
		acc.add(100); // 8_ 100원을 입금하는 동작 수행
		
	}
}
