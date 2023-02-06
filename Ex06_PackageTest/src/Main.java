// bbb 패키지 안에 있는 Student 클래스를 편하게 사용하도록 미리 불러오자!!
import java.util.Random;

// bbb 패키지 안에 있는 모든 클래스들 한번에 import 하기
import bbb.*;

import bbb.Student;

public class Main {
	public static void main(String[] args) {
		
		// 기본적인 class 를 설계하고 객체를 생성하여 사용하는 모습
		Test t = new Test();
		t.a = 10;
		t.show();
		
		// 같은 이름의 클래스를 사용하게 되는 문제가 발생할수도 있음!!
		// 이때 사용하는것이 Package 라는 개념!
		// 물리적인 폴더구분을 통해 같은 이름의 class 를 구별할 수 있음!
		
		// 사용자 정의 클래스로 Student 객체를 생성해보기
		// 즉, 학생의 정보[이름, 나이, 주소]를 가진 클래스가 있고,
		// Student stu; // error ! Student 클래스가 한 프로젝트에 두 개 이상이므로, 앞에 패키지 명을 명시해주어 헷갈리지 않게 해주어야 한다.
		aaa.Student stu = new aaa.Student();
		stu.name = "sam";
		
		//stu.age = 20; error! public 이 아니기때문!
		// 또 다른 학생에 대한 정보가 필요할 수 있음.
		// [이름, 국어, 영어] 데이터를 가진 클래스가 있다고 해보자.
		// 근데 이때도 Student 라는 이름이 적합해 보임.
		bbb.Student stu2 = new bbb.Student();
		stu2.name = "robin";
		stu2.kor = 90;
		stu2.eng = 85;
		// 멤버들을 모두 public 으로 바꿔주니 Main 클래스에서도 다른 패키지의 Student 객체의 멤버에 접근이 가능하다.
		// 그런데 객체가 하나라서 괜찮아보인다. 몇개 더 만들어보자
		// 패키지명을 매번 작성하는것이 은근 귀찮고 짜증난다.
		// 그래서 이 .java 문서 안에서는 bbb. 패키지를 마음대로 인식할 수 있도록 미리 클래스를 가져오자. 
		// 이때 쓰는것이 import!!
		bbb.Student stu3 = new bbb.Student();
		Student stu4 = new Student();
		
		// 2000 여개의 Java System API 클래스들은 모두 패키지가 있음. 이름이 중복될테니..
		java.util.Random rnd = new java.util.Random();
		// 즉, Random 클래스 앞에 쓰는 java.util. 이 패키지 명이었던것.
		// java.util 패키지명 쓰는것이 번거로워서 import 를 썼던것.
		Random rnd2 = new Random();
		
		//Scanner 클래스도 마찬가지
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		// 패키지 중에 특별한 패키지 하나가 존재함.
		// String, System ... 이런 클래스들이 있는 java.lang 패키지...
		// 원래는 패키지명을 아래처럼 같이 써야하지만, 
		java.lang.String s = new java.lang.String("Hello");
		// java.lang 은 워낙 기본적인 클래스들만 있어서 자바언어에서 자동으로 import 해줌.
		String s2 = new String("Nice"); // 자동 import
		
		aaa.Person p = new aaa.Person();
				
		// 가만 보니 java System API 클래스들의 패키지명이 모두
		// xxx.xxx 라는 식으로 두 단어 이상으로 구성됨.
		// 패키지명을 가급적 유의미한 단어(마치 카테고리 같은)를 사용하고
		// 두 단어 이상으로 사용하기를 권장함. 
		// 보통 클래스를 만든 회사명의 도메인을 역으로 작성함
		// 예를 들어, 지도클래스, Map 클래스
		// 이를 만드는 회사가 3개 .. Google, Naver, Kakao
		// com.google.Map
		// com.naver.Map
		// com.kakao.Map
		
		// kr.or.mrhi.android.Map
		// 이때 패키지명은 반드시 소문자로만 작성할것을 강제로 권장함.
		// 여러 단어를 구분할때 사용하는 . 은 사실 하위폴더를 의미함.
		mrhi.dev.First f = new mrhi.dev.First();
		mrhi.dev.android.Second s3 = new mrhi.dev.android.Second();
		
		System.out.print("aaa");
	}
}
