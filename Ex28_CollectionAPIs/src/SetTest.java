import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		
		// 1_ Set 인터페이스 : 순서 X, index X, 중복데이터 X
		
		// Set<String> set = new Set(); // error : 인터페이스는 객체 생성 불가!
		
		// Set 인터페이스를 구현한 하위 클래스들 : HashSet, TreeSet, LinkedHashSet
		
		HashSet<String> set = new HashSet<String>(); // 성능이 가장 우수함.
		
		// 2_ 요소 추가
		
		String str1 = "Hello";
		String str2 = new String("HI");
		
		set.add(new String("aaa"));
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add("eee");
		set.add("ccc"); // 4_ 중복 데이터를 추가해보기. - 무시됨.
		set.add(new String("aaa"));
		set.add(str1);
		// 3_ 요소 개수 출력 및 요소 값 확인
		System.out.println(set.size() + " : " + set.toString());
		
		// 5_ 요소값을 얻어오는 기능 .get() 이 없다
		// set.get(); // error! - 인덱스번호가 없기 때문!
		
		// 6_ 일반적으로는 set의 요소 하나를 얻어오기 보다는
		// 모든 요소들을 순차적으로 얻어오는 경우가 많다! 순서는 필요없이!
		
		// 7_ 순차적으로 요소값을 얻어오자.
		// 방법 1 for 이용불가! - 인덱스번호가 없어서...
		// 방법 2 확장된 for 문 이용하자!
		for(String s : set) {
			System.out.println(s.isBlank() + " hi");
			
		}
		System.out.println();
		// 방법 3 iterator(반복자) 활용!
		Iterator<String> datas = set.iterator();
		while(datas.hasNext()) {
			String s = datas.next();
			System.out.println(s + " me too");	
		}
		System.out.println();
		
		// 방법 4 배열로 변환하여 접근
		String[] aaa = new String[set.size()];
		set.toArray(aaa);
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		
		// 8_ TreeSet
		TreeSet<String> set2 = new TreeSet<String>(); // 값의 오름차순으로 저장됨. 단, 성능은 중간쯤..
		set2.add(new String("aaa"));
		set2.add("eee");
		set2.add("ccc");
		set2.add("kkk");
		set2.add("bbb");
		set2.add("ccc");
		System.out.println(set2);
		
		// 9_ LinkedHashSet
		LinkedHashSet<String> set3 = new LinkedHashSet<String>(); // 값을 저장한 순서대로.. 성능은 제일 안좋다. @@@ 값을 저장한 순서대로../??
		set3.add(new String("aaa"));
		set3.add("eee");
		set3.add("ccc");
		set3.add("kkk");
		set3.add("bbb");
		set3.add("ccc");
		System.out.println(set);
		System.out.println(set3);
		
		// 10_ 사용자 정의 클래스 를 Set 의 요소로 사용해보기
		// 중복체크가 될까?
		HashSet<Person> people = new HashSet<Person>();
		people.add(new Person("sam",20));
		people.add(new Person("sam",20));
		
		System.out.println(people.size());
		
		// Set 이 객체가 중복되었다고 판단하는 기준은 그 객체의 기능메소드 중 .hashCode() 와 .equals() 메소드의 결과가 같을때 이다. 
	}

}
class Person{
	String name;
	int age;
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age; // 나이가 같다면~ set 이용할 때 같다고 판단해야쥐~
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person)obj;
		return this.name.equals(p.name);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age =age;
		
	}
}
