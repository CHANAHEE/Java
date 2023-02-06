import java.util.Scanner;

//질문사항 
// 참조변수의 주솟값은 객체의 주소? 그러면 배열의 시작주소가 객체의 주소와 같나?
// -> 참조변수의 주솟값은 객체의 주소가 맞다. 하지만 그 객체의 주소가 배열의 시작주소라고 자신할 수는 없다!
// -> 객체의 주소는 멤버변수들의 주소가 될 가능성이 높다. 
// -> 객체 내부적으로는 메소드들이 존재하지 않고,함수테이블표의 주소값을 가지고 있는 참조변수가 있다.
// 
// 배열을 자동 new int[] 로 사용할 때 string constant pool 에 올라가나?
// -> 형변환 할때도 컴파일러가 자동으로 처리해주는것처럼, 배열 자동 new 도 자동으로 처리해줄뿐 String 처리방식과는 다르다.
//
public class Main {
	public static void main(String[] args) {
		// Java 언어에서 배열은 객체임!!
		// int형 3개짜리 배열객체를 생성해보자
		int[] aaa; // 참조변수를 만들었다! -> 참조변수이기 때문에 8바이트
		aaa = new int[3]; // 크기가 3인 배열 객체 생성! 배열의 요소들은 자동 0에 해당하는 값으로 초기화!
		// int형 배열 객체 1개!!!! 를 만든것!!! 기억하기

		System.out.println(aaa); // 배열객체의 .toString()이라는 기능이 자동 발동함.
		// [I@1ee0005 : I (int형) [(배열) ee0005(객체 고유번호) --> hashcode
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		// System.out.println( aaa[3] ); // error - index 범위를 벗어나면 에러!

		// 배열 요소에 값 대입
		aaa[0] = 10;
		aaa[1] = 20;
		aaa[2] = 30;

		// 배열객체에게 배열요소의 개수(길이) 를 가진 멤버 '변수'가 존재함.
		int len = aaa.length;
		// 배열 요소값을 반복문을 이용하여 출력해보기
		for (int i = 0; i < len; i++) {
			System.out.println(aaa[i]);
		}
		System.out.println();

		// 배열객체를 생성하면서 배열 요소값들을 초기화해보자
		int[] bbb = new int[] { 10, 20, 30 }; // 초기화를 했다면, 괜히 갯수를 명시해서 실수할일 만들지마라!
		// 배열객체 생성 및 초기화할때 축약 표현 문법
		int[] ccc = { 100, 200, 300 }; // 자동 new int[]
		System.out.println(ccc[0]);
		System.out.println(ccc[1]);
		System.out.println(ccc[2]);

		// 배열 생성시 갯수지정을 상수가 아니라 변수로 지정할 수 있다
		int n = 3;

		// 배열 개수 n의 값을 키보드로 입력받을수도 있다
//		Scanner sc = new Scanner(System.in);
//		System.out.print("배열개수 입력 : ");
//		n = sc.nextInt();

		int[] ddd = new int[n]; // 이럴땐 초기화는 아무의미없겠군
		for (int i = 0; i < ddd.length; i++) {
			System.out.print(ddd[i] + ", ");
		}
		System.out.println();

		// 배열객체의 초기화할때도 변수로 값지정 가능
		int k = 10;
		int[] eee = new int[] { k, k + 1, k + 2 };

		for (int i = 0; i < eee.length; i++) {
			System.out.print(eee[i] + ", ");
		}
		System.out.println();

		// 배열요소의 개수가 0개 짜리인 배열객체도 존재할 수 있음.
		// 사실상 의미는 없지만, 가능은 하다!
		int[] fff = new int[0];
		System.out.println("배열길이 : " + fff.length);

		// 배열참조변수끼리의 대입
		double[] ggg = new double[] { 3.14, 2.48, 7.23 };
		double[] hhh = ggg; // 객체 대입이 아니라 주소값을 복사한것. - 하나의 객체를 공유

		for (int i = 0; i < ggg.length; i++) {
			System.out.print(ggg[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < ggg.length; i++) {
			System.out.print(hhh[i] + ", ");
		}
		System.out.println();

		// 공유된 객체를 참조하는 참조변수 중 하나를 이용하여 요소값을 변경하면 당연히 다른 참조변수에 값도 영향을 받음.
		hhh[1] = 6.49;
		System.out.println(ggg[1]);

		// 배열객체를 copy 해보기 [ 배열요소값들을 복사하기 ]
		int[] mmm = new int[] { 50, 60, 70 };
		int[] nnn = new int[mmm.length]; // mmm 배열과 같은 개수의, 요소값이 0인 배열객체 생성
		for (int i = 0; i < nnn.length; i++) {
			nnn[i] = mmm[i];
		}

		// 참조변수 mmm 과 nnn이 참조하는 배열객체는 서로 다른 객체!

		// 참조형 배열은 안에 객체가 여러개있는것이 아니고!!! 참조변수가 여러개!!!!
		// 참조형 배열은 참조변수를 만드는 배열이다!
		// 자, 참조변수는 객체를 참조하는 변수다. 그리고 우리는 여러개의 객체를 관리하고 싶다.
		// 여러개의 객체를 관리하려면 여러개의 참조변수가 필요하다.
		// 그래서 여러개의 참조변수를 만들려고 참조형 배열을 사용하는것이다!!
		// 참조형의 초기값은 null!!

		System.out.println();
		System.out.println("================");
		System.out.println();

		// 참조형 자료형의 배열객체 생성해보기
		String[] sss = new String[3]; // String 참조변수 3개짜리 배열객체를 생성!
		System.out.println(sss); // 자동 .toString() 발동
		System.out.println(sss[0]); // 참조형의 기본값은 null
		System.out.println(sss[1]);
		System.out.println(sss[2]);

		sss[0] = new String("sam");
		sss[1] = new String("robin");
		sss[2] = "hong";

		System.out.println(sss[0]);
		System.out.println(sss[1]);
		System.out.println(sss[2]);
		System.out.println();

		// 각 배열요소(String 참조변수) 의 기능메소드 사용해보기
		System.out.println("배열길이 : " + sss.length);
		System.out.println(sss[0].length());
		System.out.println(sss[1].length());
		System.out.println(sss[2].length());
		System.out.println();

		char ch = sss[1].charAt(0);
		System.out.println(ch);

		// 참조형 배열객체 생성하면서 배열 요소들 초기화 해보기
		int[] xxx = new int[] { 10, 20, 30 };
		String[] uuu = new String[] { new String("android"), new String("ios"), "web" }; // 축약표현 가능!
		String[] ttt = { "android", "ios", "web" }; // 배열 참조변수를 생성하면서 배열객체를 초기화를 할때는 축약가능! 단, 이미 초기화가 아닌 대입할때는 축약불가능하고
													// new String()으로 축약표현 없이 넣어줘야함.

		for (int i = 0; i < sss.length; i++) {
			for (int j = 0; j < sss[i].length(); j++) {
				System.out.print(sss[i].charAt(j));
			}
			System.out.println();
		}

		// 배열처럼 여러개의 요소를 가진 객체의 요소제어를 위한 반복문 쉽게 사용하기 위해 등장한 새로운 for 문법
		// 확장된 for 문 [for each 문 이라고도 부름]
		// 기본형으로 연습
			int[] nums = new int[] { 10, 20, 30 };
			// 반복문 이용하여 요소값들 출력
			// 1. 기존 for 문법
			for (int i = 0; i < nums.length; i++) {
				int temp = nums[i];
				System.out.println(temp);
			}
			System.out.println();
			// 2. 확장된 for 문법 
			for(int temp : nums) {
				System.out.println(temp);
			}
			System.out.println();
			
			double[] www = new double[] {3.14,2.56,8.79};
			for(double temp : www) {
				System.out.println(temp);
			}
			
		// 참조형으로 연습
			String[] strs = new String[] {"android","ios","web" };
			for(String temp : strs) {
				System.out.println(temp);
			}
			
		// 당연히 개발자가 만든 class 도 배열로 만들 수 있음.
		Person p = new Person();
		p.name = "sam";
		p.age = 20;
		p.print();

		Person[] people = new Person[3];
		people[0] = new Person();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < people.length; i++) {
			people[i] = new Person();

			people[i].num = i + 1;
			System.out.println("번호" + (i + 1));
			System.out.print("이름입력 : ");
			people[i].name = sc.next();
			System.out.print("나이입력 : ");
			people[i].age = sc.nextInt();
		}
		for (int i = 0; i < people.length; i++) {
			people[i].print();
		}
	}
}

// 사용자 정의 class
class Person {
	int num;
	String name;
	int age;

	void print() {
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println();
	}
}