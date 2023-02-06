import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		// Java 의 2차원 배열 - 1차원 배열 참조변수를 여러개 가진 배열객체
		// 2차원 배열객체 생성
		int[][] aaa; // 2차원 배열 참조변수 생성!
		aaa = new int[3][]; // 1차원배열 참조변수 3개짜리 배열객체

		System.out.println(aaa[0]);

		// 2차원 배열의 배열요소(참조변수)에 값(배열객체)을 대입
		aaa[0] = new int[4];
		aaa[1] = new int[2];
		aaa[2] = new int[5];

		// 1차원 배열 객체들의 요소(int 변수)에 정수값 대입
		aaa[0][0] = 10;
		aaa[0][1] = 20;
		aaa[0][2] = 30;
		aaa[0][3] = 40;

		aaa[1][0] = 100;
		aaa[1][1] = 200;

		aaa[2][0] = 1000;
		aaa[2][1] = 2000;
		aaa[2][2] = 3000;
		aaa[2][3] = 4000;
		aaa[2][4] = 5000;

		System.out.println();
		// 기존 for 문
		for (int i = 0; i < aaa.length; i++) {
			for (int j = 0; j < aaa[i].length; j++) {
				System.out.print(aaa[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// 확장 for 문
		// 내가 쓴것
		for (int i = 0; i < aaa.length; i++) {
			for (int temp2 : aaa[i]) {
				System.out.print(temp2 + " ");
			}
			System.out.println();

		}
		System.out.println();
		// 정답
		for (int[] temp : aaa) { // 야, aaa 만큼 돌아라. 근데, 한번 돌때마다 temp 에 각각 넣어라.
			for (int temp2 : temp) { // 야, temp 만큼 돌아라. 근데, 한번 돌때마다 temp2에 각각 넣어라.
				System.out.print(temp2 + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 만약, 2차원 배열이 가진 1차원 배열을 참조하는 참조변수들이 모두 같은 개수를 가진 배열 객체를 참조한다면...
		int[][] bbb = new int[2][3]; // 1차원 배열 객체들도 모두 만들어진다. 따로 1차원 배열들을 만들지 않아도 된다.
		for (int i = 0; i < bbb.length; i++) {
			for (int k = 0; k < bbb[i].length; k++) {
				System.out.print(bbb[i][k] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 2차원 배열의 초기화
		int[][] ccc = new int[][] { 
			new int[] { 10, 20 }, 
			new int[] { 10, 20, 30, 40 } 
			};
		// 초기화의 축약표현 문법 허용!
		int[][] ddd = { 
				{ 10, 20 }, 
				{ 10, 20, 30, 40 } 
				};
		
		for(int[] t : ddd) {
			for(int e : t) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		// 2차원 배열의 길이값을 변수로 지정해보자!
//		Scanner sc = new Scanner(System.in);
//		System.out.print("층수 입력 : ");
//		int len = sc.nextInt();
//		
//		int[][] eee = new int[len][];
//		for(int i = 0; i < len; i++) {
//			System.out.print("호실 수 입력 : ");
//			int idx = sc.nextInt();
//			eee[i] = new int[idx];
//		}
//		//입력된 층수, 호실 수 만큼 배열이 잘 만들어 졌는지 확인해보자
//		for(int[] t : eee) {
//			for(int e : t) {
//				System.out.print(e + " ");
//			}
//			System.out.println();
//		}
		
		// 3차원 배열도 2차원 배열 참조연수를 여러개 가진 배열 객체
		int[][][] abc = new int[2][][];//2차원 배열객체를 참조하는 참조변수가 2개짜리 3차원 배열객체 생성 
		
		String[][] str = new String[2][];
		
		
		
		
		
		
		
		// 배열은 한번 만들어진 요소의 개수를 변경할 수 없음!!!
		// 실무에서는 대량의 데이터 개수가 유동적인 경우가 많음(ex. 게시글, 트윗, 상품목록 ...)
		
		// 그래서 등장한 유동적 배열용 클래스가 존재함.[마치 기차같은 모양]
		// ArrayList 클래스
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Hello");
		arr.add("Hello");
		arr.add("Hello");
		arr.add("Hello");
		arr.add("Hello");
		System.out.println(arr.get(0));
		System.out.println(arr.size());
		System.out.println();
		arr.clear();
		System.out.println(arr.size());
		
	}
}
