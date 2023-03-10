import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1_ Object class : 모든 Java 클래스의 부모 클래스(최상위 클래스) 
		// 2_ 자바 언어에 존재하는 모든 클래스들은 extends의 명시여부와 상관없이
		// 무조건 Object 라는 클래스를 상속받은 상태로 만들어진다.
		
		// 4_ Test 참조변수 생성
		System.out.println("Hello");
		Test t = new Test();
		System.out.println("Hello");
		// 5_ Test 클래스는 명시적으로 아무것도 상속하지 않았지만 기본적으로 Object 클래스를 상속받은 상태임.
		// 6_ 명시적으로 다른 클래스를 상속받았더라도 Object 클래스는 상속됨.
		// 다중상속이 아니다! 계층 상속이다.
		
		// 7_ Object 클래스가 가진 주요한 기능메소드들.
		// 1. toString()
		// 2. equals(Object obj)
		// 3. hashCode()
		// 4. getClass()
		// 5. wait(), notify(), notifyAll() : 이건 Thread 수업에서 소개!
		
		// 1) toString() : 객체에 대한 소개 문자열을 리턴해주는 기능메소드
		System.out.println(t.toString()); // default : "클래스명@해시코드"
		// 해시코드 : 메모리 물리주소를 상대적인 주소로 표현한 숫자(자바에서의 주소) 
		Test t2 = new Test();
		System.out.println(t2.toString()); // t와 해시코드가 다르기에 다른 객체임.
		Test t3 = t2;
		System.out.println(t3.toString()); // t2와 같은 객체를 공유하기에 같은 해시코드
		
		// 당연히 java System Api 2000 여개들도 toString() 을 보유하고 있음.
		Random rnd = new Random();
		System.out.println(rnd.toString()); // default : "패키지명.클래스명@해시코드"
		
		// .toString() 의 특이한 결과
		String name = new String("sam");
		System.out.println(name.toString()); // 객체 소개글이 아니라 문자열 데이터가 나옴.
		// 원래의 toString() 기능으로 동작하지 않았다는것은 메소드를 오버라이드하여 기능을 개선했다는 의미.
		// 즉, Object 클래스의 메소드도 역시 기능개선 오버라이드가 가능하다!
		
		First f = new First();
		// First 객체의 멤버값을 출력해보고 싶다.. 
		// 그래서 toString() 기능을 개선하자
		System.out.println(f.toString());
		
		// 2) equals(Object obj) : 같은 객체 인지 확인하는 메소드
		Test t4 = new Test();
		Test t5 = new Test();
		boolean b = t4.equals(t5);
		System.out.println(b);
		
		Test t6 = t5;
		System.out.println( t6.equals(t5));
		// 사실 같은 객체인지 판별할 때 equals() 메소드를 잘 사용하지 않음. why?
		// 참조변수의 주솟값 끼리 비교연산이 가능하기에.
		System.out.println(t6 == t5);
		System.out.println();
		// 근데 equals() 도 상속받은 메소드니까 .. 오버라이드 할 수 있겠죠.
		// 멤버값 끼리 서로 같은지를 비교하여 결과를 리턴해주는 기능으로 개선해보자. 
		First f1 = new First();
		First f2 = new First();
		
		f1.num = 100;
		f2.num = 200;
		System.out.println(f1.equals(f2)); // 개선된 기능. 멤버값 비교결과를 보여줌!
		
		f1.num = 100;
		f2.num = 100;
		System.out.println(f1.equals(f2));
		// 이렇게 오버라이드 된 대표적인 클래스가 바로 String!
		String s6 = new String("Hello");
		String s7 = new String("Hello");
		String s8 = "Android";
		String s9 = "Android";
		System.out.println("============================");
		System.out.println(s6 == s7); // 주소비교
		System.out.println(s6.equals(s7)); // 값 비교 : 오버라이드 된 equals()
		System.out.println(s8 == s9); // 주소비교
		System.out.println(s8.equals(s9)); // 값 비교 : 오버라이드 된 equals()
		
		// 3) getClass() : 클래스의 정보를 가진 Class 객체를 리턴해줌
		Test t7 = new Test();
		Class obj = t7.getClass();
		System.out.println(obj.getName());
		System.out.println(obj.getPackageName());
		System.out.println(obj.getSuperclass());
		
		// 4) hashCode() : 자바에서의 주소값 [ 객체마다 고유한 번호가 부여됨 ] 
		Test t8 = new Test();
		
		System.out.println(t8.hashCode());
		System.out.println(t8.toString()); // 16진수 
		System.out.println(Integer.toHexString(t8.hashCode()));
		
		// 8_ Object class 를 사용하는 대표적인 상황
		// 업캐스팅 : 부모참조변수로 자식객체를 참조하는것
		Object obj2 = null;
		// 9_ Object는 모든 클래스의 최상위 부모 클래스이므로...
		// 어떤 클래스의 객체든 모두 참조하는것이 가능함. 
		obj2 = new Test();
		obj2 = new First();
		obj2 = new String();
		obj2 = new Random();
		obj2 = new int[5];
		obj2 = new ArrayList<String>();
		
		// 10_ 업캐스팅은 메소드의 파라미터나 리턴에도 사용가능하다!
		// 어떤 객체든 파라미터로 받고 싶을 때 Object 로 사용하기도 함!
		// 대표적인 사용 예) System.out.println(Object x);
		System.out.println(new Random()); // 자동 전달된 객체의 toString() 이 발동함.
	}

}
