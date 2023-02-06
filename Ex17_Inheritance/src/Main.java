
public class Main {

	public static void main(String[] args) {
		// 어떤 대학교의 정보제공 앱을 제작해보자! - 회원가입 기능!
		// 회원의 종류를 나눠놓자 - 일반, 학생, 교수, 근로학생
		// 1. 일		반 : 이름, 나이
		// 2. 학		생 : 이름, 나이, 전공
		// 3. 교		수 : 이름, 나이, 연구과제
		// 4. 근로 학생 : 이름, 나이, 전공, 업무 
		
		// 5_ 일반회원 
		Person p = new Person("sam",20);
		p.show();
		System.out.println();
		
		// 9_ 학생회원
		Student stu = new Student("robin",23,"android");
		stu.show();
		System.out.println();
		
		// 13_ 교수회원
		Professor pro = new Professor("park",45,"mobile");
		pro.show();
		System.out.println();
		
		// 15_ 근로학생 회원
		AlbaStudent alba = new AlbaStudent("hong",27,"ios","pc Manager");
		alba.show();
		System.out.println();
				
	}

}
