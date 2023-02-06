import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 학생성적을 관리하는 프로그램
		// 이름, 국어, 영어, 평균의 정보를 가지고 있음
		String name;
		int kor;
		int eng;
		double aver;

		// 1_ 학생 1명의 정보를 넣어보았다.
		name = "sam";
		kor = 80;
		eng = 70;
		aver = (double) (kor + eng) / 2;

		// 2_ 만약, 이런 학생이 여러명이라면? 위 변수 4개를 매번 만드는 작업이 매우 번거로움.
		// 여러개의 데이터를 관리하는 배열객체를 한번 이용해볼까?
		String[] arrName = new String[10];
		int[] arrKor = new int[10];
		int[] arrEng = new int[10];
		double[] arrAver = new double[10];

		arrName[0] = "sam";
		arrKor[0] = 80;
		arrEng[0] = 70;
		arrAver[0] = (double) (arrKor[0] + arrEng[0]) / 2;

		// 3_ 위 처럼 자료형 별로 묶어서 사용하는것도 은근 짜증남. 가독성도 떨어짐.
		// 학생 1명의 데이터가 서로 다른 배열 객체에 나누어져 있기 때문.

		// 4_ 그래서 서로 연관있는 데이터끼리(이름, 국어, 영어, 평균) 묶어서 관리하는것이 더 효과적.

		// 5_ 연관있는 데이터끼리의 묶음을 설계하는 class 를 정의해보자!
		// 별도의 .java 문서에 새로운 클래스를 설계해보자!

		// 8_ 새로 설계한 Student 클래스로 객체를 생성해보자.
		// 9_ 객체를 생성하면 Heap 메모리에 올라가고, Heap 메모리에 올라간 메모리는 명명할 수 없기때문에
		// 참조변수를 통해 참조해야한다.
		Student stu = new Student();
		stu.name = "sam";
		stu.kor = 80;
		stu.eng = 70;
		stu.aver = (double) (stu.kor + stu.eng) / 2;

		Student stu2 = new Student();
		stu2.name = "robin";
		stu2.kor = 90;
		stu2.eng = 95;
		stu2.aver = (double) (stu2.kor + stu2.eng) / 2;

		// 10_ 화면 출력
		System.out.println(stu); // 참조변수를 출력하면 자동 .toString() 발동
		System.out.println("name : " + stu.name);
		System.out.println("kor : " + stu.kor);
		System.out.println("eng : " + stu.eng);
		System.out.println("aver : " + stu.aver);
		System.out.println();
		System.out.println("name : " + stu2.name);
		System.out.println("kor : " + stu2.kor);
		System.out.println("eng : " + stu2.eng);
		System.out.println("aver : " + stu2.aver);
		System.out.println();

		// 11_ 객체 멤버값 변경해보기
		int k = 80;
		stu2.kor = k;
		System.out.println("변경된 국어성적 : " + stu2.kor);
		System.out.println();

		// 12_ 3번째 학생의 데이터는 키보드로 입력받고 출력하기
		Scanner sc = new Scanner(System.in);

		Student stu3 = new Student();
//		stu3.name = sc.next();
//		stu3.kor = sc.nextInt();
//		stu3.eng = sc.nextInt();
		stu3.aver = (double) (stu3.kor + stu3.eng) / 2;
		System.out.println("name : " + stu3.name);
		System.out.println("kor : " + stu3.kor);
		System.out.println("eng : " + stu3.eng);
		System.out.println("aver : " + stu3.aver);
		System.out.println();
		// 13_ 이런식으로 멤버값을 일일이 출력하는 코드를 작성하는거 은근 짜증.
		// 그래서 객체라는 녀석이 스스로 본인의 멤버값을 출력하는 기능!! 이 있다면, 편할것같다!

		// 14_ 객체가 기능을 가질 수 있도록 class 안에 기능(함수) 를 설계하자!

		// 15_ 객체의 기능을 사용하기 - 메소드를 호출!
		stu3.show();

		// 16_ 이런식으로 객체안에 기능을 만들면 편하게 코딩이 가능하다!
		Student stu4 = new Student();
		stu4.name = "hong";
		stu4.kor = 75;
		stu4.eng = 77;
		// 17_ 가만보니 평균 계산하는것도 직접 매번 작성하기 번거로움.
		// 그러니 평균을 계산하는 기능이 객체안에 있다면, 코드가 더 간결해질것같다!
		stu4.calAver();

		// 19_ 객체의 값출력은 객체의 출력기능을 이용!
		stu4.show();

		// 20_ 이런식으로 특정한 기능들을 미리 class 에 설계해놓으면 훨씬 코드가 간결해진다!
		Student stu5 = new Student();
		stu5.name = "kim";
		stu5.kor = 80;
		stu5.eng = 75;
		stu5.calAver();
		stu5.show();

		// 21_ 이렇게 계속 데이터를 넣다보니 한줄씩 멤버값을 넣는게 번거로움.
		// 입력하는 기능도 있다면..?? 코드가 더 간결해질것같다!
		Student stu6 = new Student();
		stu6.setMembers("park", 50, 60);
		stu6.calAver();
		stu6.show();
		
		// 24_ 7번째 학생데이터를 함수를 이용하여 입력하고 출력해보기
		Student stu7 = new Student();
		stu7.setMembers("lee", 90, 75);
		stu7.calAver();
		stu7.show();
		
		// 25_ 결국 메소드의 존재이유는 코드를 보다 간결하게 하고, 객체의 멤버를
		// 객체 스스로 제어하도록 하기 위함!
		
		// 26_ 정리하면, 객체는 변수 + 메소드를 가진 녀석을 지칭한다!
		// 메소드만 있는 객체도 있을수 있음.(사실 많음)
	}

}
