// 1
public class Main {

	public static void main(String[] args) {

		// 1_ Thread(쓰레드) : 작성된 코드를 실행하는 객체 - 동시에 여러작업을 처리하는 기법을 사용하고싶을때 사용!
		// 2_ 용어소개
		// 2_1 Process : 실행중인 하나의 자바 프로그램 -> 프로세스간에는 별도의 메모리를 사용하기 때문에 자원 공유가 불가능하다.
		// 2_2 Thread : 하나의 프로세스 안에서 동작하는 직원같은 개념. -> 스레드간에는 같은 메모리공간을 사용하기 때문에 자원 공유가 가능하다!

		// 3_ 하나의 프로세스에는 적어도 하나의 스레드가 기본적으로 존재하며 그 스레드를 Main Thread 라고 부른다.

		// 4_ 스레드 혼자 오래걸리는 작업(코드)을 수행하면 다른 코드들(작업) 이 대기 상태로
		// 오랫동안 실행되지 못할 수 있기 때문에 동시에 여러작업을 하려면 별도의 스레드 객체를 생성하여 요청해야 한다!

		// 5_ 동시에 했으면 하는 작업을 2개 구현해보자! ( 실제작업은 불가하니 느낌만 주자..)

		// 5_1 20개의 파일을 다운로드하는 작업
//		for (int i = 0; i < 20; i++) {
//			System.out.println(i+1 + " 번째 파일 다운로드 중...");
//			
//			// 강제로 잠시 시간을 벌기...
//			for(long k = 0; k < 8000000000L ; k++) {
//				new String("Hello");
//			}
//		}
//		// 5_2 20개의 음악을 재생하는 작업
//		for (int i = 0; i < 20; i++) {
//			System.out.println(i+1 + " 번째 음악 재생 중...");
//			
//			// 강제로 잠시 시간을 벌기...
//			for(long k = 0; k < 8000000000L ; k++) {
//				new String("Hello");
//			}
//		}
		
		// 6_ 별도의 직원(Thread : 코드를 실행하는 녀석) 객체 생성하여 각각의 코드(작업)를 실행하도록 요구해보자.
		// Thread 객체를 그냥 new 로 만들어 쓰는 것이 아니라. Thread 가 해야할 작업을 별도로 설계하여 작성해 놓아야 함.
		// 즉, 별도의 클래스를 설계하여 그 class 가 Thread 의 능력을 가지도록 하며 해야할 작업들을 작성해놓아야 함. 
		
		
		// 12_ 쓰레드 객체 생성! 
		ThreadA a = new ThreadA();
		// 13_ 쓰레드가 해야할 작업을 작성해 놓은 run() 메소드는 절대로 직접 호출하면 안됨.!!!!!!!! 절대로!!!!!
		// a.run();
		//a.start(); // 자동 run() 이 발동함. 
	
		// 14_ 쓰레드 객체 생성!
		ThreadB b = new ThreadB();
		//b.start();
		
		// 15_ 메인쓰레드도 별도의 추가작업을 할 수 있음!
		
		
		// 19_ 만일 a.run() 을 하고 이름을 받아오면, 스레드 이름이 main 으로 표시됨!! 그러니까 하지마
		//a.run2();
		for(int i = 100; i< 120; i++) {
			System.out.println(i);
			// 16_ 현재 이 코드를 읽고 있는 스레드가 누군지 알려주는 기능
			String name = Thread.currentThread().getName();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

// 7_ 파일 다운로드 작업을 수행하는 직원 클래스(Thread 를 상속하는 클래스) 
class ThreadA extends Thread {
	// 8_ 모든 Thread 는 이 메소드 안에 작성한것만 스스로 실행함.run() 메소드 안에만 스스로 읽음. 그 밖에있는건 메인쓰레드가 읽기때문에 소용없다~
	// Thread 클래스 안에 있는 run() 메소드를 오버라이드 해서 사용해야만 함. 
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		// 17_ 스레드 이름 받아오기!!
		String name = Thread.currentThread().getName();
		for(int i = 0; i < 20 ; i++) {
			System.out.println(name +" : " + (i+1) + " 번째 파일 다운로드 중...");
			
			
			// 9_ 잠시대기... 0.5 초 정도
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	static ThreadA aaa() {
		ThreadA t = new ThreadA();
		return t;
	}
	public void run2() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
	}
}

// 10_ 음악재생 작업을 수행하는 직원 클래스(Thread 를 상속하는 클래스)
class ThreadB extends Thread {

	
	// 18_ 스레드 이름 받아오기!!!
	String name = Thread.currentThread().getName();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 20 ; i++) {
			System.out.println(name + " : " + (i+1) + " 번째 음악 재생 중...");
			
			
			// 11_ 잠시대기... 0.5 초 정도
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}




























