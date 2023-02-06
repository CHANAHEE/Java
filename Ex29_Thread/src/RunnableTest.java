// 3
public class RunnableTest {

	public static void main(String[] args) {
		
		// 1_ Thread 능력( 코드를 실행할 수 있는 능력) 을 가지는 2가지 방법
		// 1_1 Thread 클래스를 상속한(extends) 클래스를 설계하여 사용하는 방법
		// 1_2 Runable 인터페이스!! 를 구현한 (implements) 클래스를 설계하여 사용하는 방법
		
		// 2_ 왜 2가지 방법이나 있지..??
		// 다중상속의 효과를 보고싶어서 Runable 을 이용한다~
		// Person 클래스의 능력을 가지면서 Thread 의 능력도 있었으면 좋겠다..
		// 자바는 다중상속이 금지되어 있음. 대신 인터페이스의 구현은 다중구현이 가능하다! 그래서 여러능력을 가질 수 있음. 
		
		// 6_ 객체 생성!
		PersonThread pt = new PersonThread();
		
		// 7_ 스레드를 실행하려면 run() 을 실행하려면 '자동실행시켜주는 기능이 작성된' .start() 메서드를 호출해야함!!
		// pt.start();//error!! -> Runnable 은 인터페이슨데 말이 안되지... 기능이 작성되어 있는게 아니라 추상메서드만 있잖니..
		// Runnable 인터페이스를 구현한 객체의 run() 을 실행시켜 주는 별도의 객체가 필요하다!
		
		
		// 8_ Thread 의 존재목적은 Runnable 을 트리거 하기 위해 만들어짐. 근데 그러려면 두번 작성해야하니, Thread 로 실행시킬 수 있게 발전됨.
		// Thread 객체를 생성하면서 생성자 메서드에 파라미터로 Runnable 을 구현한 객체를 전달하면 스레드 객체를 start() 할때 자동 run() 이 발동됨. 
		Thread t = new Thread(pt);// 파라미터로 전달받은 Runnable 을 실행해~ 라고 적혀있음. 
		t.start(); // t는 단순히 트리거의 역할!
		
		Runnable t1 = new PersonThread();
		
		// 9_ 다중상속이 아닌 그냥 스레드 객체가 필요할때도 Runnable 로 만들기도 함.
		// Runnable r = new Runnable(); // 인터페이스는 객체 생성 불가능~
		// 인터페이스는 반드시 추상메소드를 구현한 별도의 클래스를 설계한 후 객체로 생성해야함!
		// 실제로 코딩을 해보면 이 별도의 클래스의 이름을 명명하는것 조차 은근 스트레스...
		// 이름에 따라서는 이게 Thread 임을 잘 인식하지 못하는 이름을 사용했을수도 있음. 
		
		MyThread mt = new MyThread();
		Clicker c = new Clicker();
		
		Runnable obj = new MyThread();
		obj = new Clicker();
		obj = new PersonThread();
		// 10_ Thread 가 작업할 코드는 별도의 class 영역에 작성되어 있어 start() 를 할때 어떤 동작을 수행할지 한눈에 들어오지 않는다.
		// 그래서 스레드 작업코드를 작성하는 run() 메소드를 스레드 객체를 생성하면서, 곧바로 작성하는 문법이 생겼다!! 아주 편리하네
		// 객체를 만들면서 클래스를 설계하는 문법이다! : 익명 클래스!!!! 이것도 업캐스팅!!!
		
		// 11_ 자, 원래는 Runnable 로 스레드를 돌리기 위해서는, Runnable 을 구현한 클래스를 만든다음에 그 클래스에서 
		// run() 메소드를 구현해주고 그 run() 메소드를 호출하기 위해서 Thread 객체를 만들어서 생성자 파라미터로 run() 을 설계한 클래스의 객체 참조변수를 전달해준뒤,
		// 스레드의 참조변수를 통해 start() 메소드를 실행시켜 스레드를 돌린다! 그걸 익명클래스를 통해 익명클래스의 객체 생성과 동시에 클래스를 구현함으로써
		// 한눈에 알아보기 쉬워졌다. 
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("별도 스레드가 작업할 내용...");
			}
			
		};
		
		Runnable[] rd = new Runnable[5];
		rd[0] = new Runnable() {
			public void run() {};
		};
		new Thread(rd[0]).start();
		
		
		new Thread(r).start();

		
	}

}

// 9_1 MyThread
class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
// 9_2 Clicker
class Clicker implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
// 3_ Person 클래스 설계
class Person {
	String name;
	int age;

}

// 4_  Person 클래스의 멤버를 상속받으면서 Thread 의 역할도 하는 클래스를 설계
class PersonThread extends Person implements Runnable{

	
	@Override
	public void run() {
		
		// 5_ 1초마다 이름, 나이를 출력하는 코드작성
		for( int i = 0; i<5; i++) {
			System.out.println(name + ", " + age);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
