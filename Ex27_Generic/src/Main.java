import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		// 1_ Generic [ 제네릭 - 아직 명칭이 정해지지 않은 상품 (제네릭 상품) ]
		// 즉, class 를 설계할 때 멤버의 자료형을 정하지 않고 
		// 객체를 생성(new) 할 때 결정하도록 하는 문법
		
		// 2_ 데이터를 하나 저장할 수 있는 클래스 설계 [ 그런데, 자료형을 미리 정하지 않고 설계] -> Box 클래스
		
		// 5_ String 타입으로 Box 클래스의 객체 생성!
		Box<String> box = new Box<String>();
		
		// 6_ 
		box.a = "Hello";
		System.out.println(box.a);
		
		Box<Random> box2 = new Box<Random>();
		box2.a = new Random(); // 7_ 랜덤 참조변수만 만든것. 그래서 new 로 랜덤객체를 생성해주어야 함.
		
		// 8_ Generic 의 문법적 제약사항 - 참조형 자료형만 <> 안에 지정할 수 있음!!
		// Box<int> box3; // error : 기본형 자료형은 <> 에 사용할 수 없음!
		
		// 9_ 그럼에도 기본형을 사용하고 싶다면, Wrapper class 를 활용하자!
		// Wrapper class : Boolean, Byte, Character, Short, Integer, Long, Float, Double
		// Wrapper class 는 기본형을 객체형으로 감싸기 위해 존재한다!!
		
		int a = 10; // 기본형
		Integer b = new Integer(10);
		Integer c = 30; // 자동 new Integer(30); : auto boxing 이라고 부른다!
		System.out.println(c);
		
		int d = c; // 자동으로 Integer 를 int 로 변환한다. : auto unboxing 이라고 부른다! 줴기랄 
		
		// 10_ 결국 Wrapper class 의 참조변수를 마치 기본형 변수 자료형 처럼 사용해도 알아서 변환해준다!
		
		// 11_ 즉, 기본형 자료형을 제네릭에 사용하려면 Wrapper class 를 지정해주면 됨.
		Box<Integer> box3 = new Box<Integer>();
		box3.a = 10; // autoBoxing
		System.out.println(box3.a); // autoUnBoxing
		// 17_set,get 메소드 사용
		box3.setA(20);
		System.out.println(box3.getA());
		
		Box<Double> box4 = new Box<>(); // 12_ 참조변수에서 <> 안에 자료형을 명시했다면, 객체생성시 안의 자료형은 생략해도 괜찮다!
		box4.a = 3.14;
		System.out.println(box4.a);
		// 18_ set,get 메소드 사용.
		box4.setA(6.78);
		
		// 13_ 만약 Box 의 객체를 생성하면서 <> 를 명시하지 않는다면 어떻게 될까?
		Box box5 = new Box();
		box5.a = new String("Object");
		System.out.println(box5.a);
		// 14_ 자료형이 지정되지 않으면 기본 Object 자료형으로 만들어진다! 
		
		
		// 21_ 2개 이상의 제네릭 타입을 가진 클래스의 객체 생성
		Box2<String, Integer> obj = new Box2<String, Integer>();
		obj.a = "aaa";
		obj.b = 100;
		
		Box2<int[],double[]> obj2 = new Box2<int[],double[]>();
		obj2.a = new int[5];
		obj2.a[0] = 10;
	}
}
