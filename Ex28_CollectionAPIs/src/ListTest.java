import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1_ Collection 클래스들 : 자료구조를 구현한 Java 의 API 클래스들 - 대량의 데이터를 관리 [ 교재 page 458 참고 ]
		
		// 2_ Collection 인터페이스의 3가지 종류 : List 계열, Set 계열, Map 계열 
		// 2_1 List : 순서대로 저장, 인덱스 번호 O, 중복데이터 허용
		// 2_2 Set : 순서는 없음, 인덱스 번호 X, 중복데이터 X
		// 2_3 Map : 순서는 없음, 인덱스 번호 대신 Key 식별자 사용, Key 는 중복불가, Value 중복허용
		
		// 3_ 3가지 종류 모두 인터페이스이다! 즉, 그냥 사용하는것이 아니라 이를 구현한 하위 클래스를 사용하는것!
		
		// 4_ List 인터페이스를 구현한 하위클래스 3개를 보자 : ArrayList, LinkedList, Vector
		// 3가지 모두 사용문법은 거의 동일하다! 단지 성능이 다른것뿐.
		
		// 5_ List list = new List(); // error! List 인터페이스는 직접 객체생성이 불가하다!
		// 6_ List 인터페이스를 구현한 하위클래스를 객체로 생성하여 사용하자!
		
		ArrayList<String> list = new ArrayList<String>();
		
		// 7_ ArrayList 클래스가 데이터를 제어하기 위해 만들어놓은 기능을 실습해보자.
		// 7_1 요소의 개수
		int size = list.size();
		System.out.println("요소 개수 : "+size);
		
		System.out.println();
		// 7_2 요소의 추가
		list.add("aaa");
		String s = new String("bbb");
		list.add(s);
		list.add("ccc");
		System.out.println("요소 개수 : " + list.size());
		
		System.out.println();
		// 7_3 요소 얻어오기
		System.out.println(list.get(0));
		System.out.println(list);
		for(String sd : list)
		{
			System.out.println(sd);
		}
		
		System.out.println();
		// 7_4 요소 제거하기
		list.remove(1);
		for(String sdd : list) {
			System.out.println(sdd);
		}
		
		System.out.println();
		// 7_5 특정위치에 요소 추가하기
		list.add(1, "ddd");
		for(String sdd : list) {
			System.out.println(sdd);
		}
		System.out.println();
		
		// 7_6 제거할 때, 인덱스 번호가 아니라 객체 주솟값으로 제거가 가능하다!
		// 주소가 같을 때, 앞에꺼만 차례대로 제거! 언어마다 다르다~
		// remove() 가 오버로딩되어 있다!
		String sss = new String("TEST");
		list.add(sss);
		String s1 = "1234";
		String s2 = "1234";
		list.add(s1);
		list.add(s2);
		System.out.println(list.size());
		list.remove(sss);
		System.out.println(list.size());
		for(String ss : list) {
			System.out.println("제거 : " + ss);
		}
		list.remove(s1);
		System.out.println(list.size());
		
		for(String ss : list) {
			System.out.println("제거 : " + ss);
		}
		// 7_7 요소 모두를 한번에 깨끗이 제거하기
		list.clear();
		System.out.println(list.size());
		
		// 7_8 리스트가 비어있는지 확인하는 메소드
		System.out.println(list.isEmpty());
		
		// 7_9 중복된 데이터가 허용됨.
		list.add("aaa");
		list.add("aaa");
		list.add("aaa");
		System.out.println("요소개수 : " + list.size());
		
		// 7_10 리스트안에 특정 요소가 있는지 여부
		System.out.println(list.contains("aaa"));
		System.out.println(list.contains("Hello"));
		
		// 7_11 '다른' 리스트의 요소들을 한번에 추가하기
		list.clear();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		// 새로운 리스트 생성!
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("sam");
		list2.add("robin");
		
		list.addAll(list2);
		System.out.println(list.size());
		// 요소값을 확인하기 위해 반복문 사용하여 .get()을 여러번..
		// 다만, 단순하게 요소값을 보고만 싶다면 List의 toString() 기능을 활용하자!
		System.out.println(list);
		
		// 7_12 다른 리스트의 요소들과 같은 요소들 모두 제거하기
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("bbb");
		list3.add("sam");
		
		list.removeAll(list3);
		System.out.println("1 : " + list);
		System.out.println(list3);
		
		// 7_13 다른 리스트의 요소들과 같은 요소들을 제외하고 모두 제거하기
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("aaa");
		list4.add("robin");
		
		list.retainAll(list4);
		System.out.println("2 : " + list);
		
		// 7_14 특정 요소들이 모두 포함되어 있는지 여부
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("aaa");
		list5.add("robin");
		
		System.out.println(list.containsAll(list5)); // true
		
		list5.add("kkk");
		System.out.println(list.containsAll(list5)); // false
		
		// 7_15 특정 요소가 몇번째 있는지 인덱스를 반환
		list.add("aaa");
		list.add("sss");
		System.out.println(list);
		System.out.println(list.indexOf("robin")); // 1 return
		System.out.println(list.indexOf("aaa")); // 1 return
		System.out.println(list.lastIndexOf("aaa"));
		System.out.println();
		
		// 7_16 요소들을 순차적으로 얻어오기 
		// 방법 1. for 문 사용하기
		for(int i =0;i<list.size();i++)
		{
			String t = list.get(i);
			System.out.println(t);
		}
		System.out.println();
		// 방법 2. 확장 for 문 사용하기
		for(String t : list) {
			System.out.println(t);
		}
		System.out.println();
		
		// 7_17 경우에 따라서 List 를 배열로 변환해야 하는 경우가 있음. 뭐 어떤 기능을 쓰려는데 그 메소드가 파라미터를 배열로 받아야 한다던가..
		// 1. 리스트를 배열로 변환.. 
		// 우선 빈 배열부터 준비해야함.
		String[] aaa = new String[list.size()]; // 리스트의 크기와 같은 크기의, 요소값이 없는 빈 배열 생성!
		list.toArray(aaa); // toArray 메서드 활용~
		System.out.println(aaa.toString()); // 요소값이 안나와 ㅠㅠ 
		System.out.println(list);
		// 배열객체의 요소값들을 그냥 문자열로 내보내는 static 기능메소드를 활용
		System.out.println(Arrays.toString(aaa));
		
		// 2. 배열을 리스트로 변환..
		String[] bbb = new String[] { "sam", "robin", "hong" };
		List<String> list6 = Arrays.asList(bbb);
		System.out.println("Array : " +list6);
		
		
		System.out.println("========================");
		// 8_ List 인터페이스를 구현한 또 다른 하위 클래스 
		// 사용방법은 ArrayList 와 똑같다. 단지, 성능에 차이가 있을 뿐이다.
		// 빈번하게 요소를 추가, 삭제를 할 때 속도가 빠르다.
		// 반대로 특정 요소값을 얻어올때는 느리다. 
		LinkedList<String> linkli = new LinkedList<String>();
		
		linkli.add(new String("aaa"));
		linkli.add("bbb");
		linkli.add("ccc");
		
		linkli.remove(1);
		System.out.println(linkli.toString());
		
		// 9_ LinkedList 에만 있는 메소드도 존재함.
		linkli.addFirst("sam");
		linkli.addLast("robin");
		
		// 10_ 지금은 ArrayList 의 성능이 많이 향상되서 굳이 고민하지 않고 그냥 ArrayList 만 사용하기도 함. 
		
		// 11_ Vector 클래스 - ArrayList 와 완전 같음. [ 단, Vector 는 동기화 처리가 되어있음. Thread 를 배워야 동기화를 이해할 수 있음~ ] 
		Vector<String> vector = new Vector<String>();
		
		// 12_ ArrayList, LinkedList, Vector 클래스 모두 List 인터페이스를 구현한 클래스이다.
		// 즉, List 인터페이스는 위 3개 클래스의 부모가 됨.
		// 부모 참조변수로 자식객체를 참조할 수 있다. -> 업캐스팅 확장될 여지, 변경될 여지가 있으니까!! 그래서 부모 참조변수를 이용하면
		// 유지보수가 편리해진다~
		List<String> list8 = null;
		list8 = new ArrayList<String>(); 
		list8 = new LinkedList<String>();
		list8 = new Vector<String>();
		
	}

}
