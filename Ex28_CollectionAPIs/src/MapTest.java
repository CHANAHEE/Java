import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		
		// 1_ Map : 키-밸류 쌍으로 데이터를 저장하는 방식이다.
		
		// Map 도 인터페이스 이므로 바로 객체생성은 불가하다.
		// 대신 Map 인터페이스를 구현한 하위 클래스들 : HashMap , TreeMap, LinkedHashMap, HashTable
		
		// 2_ HashMap<T(key),S(value)> - 가장 성능이 좋다!!
		HashMap<String, String> map = new HashMap<String,String>();
		
		// 3_ 요소추가
		map.put("name", "sam"); // (식별자, 값)
		map.put("id", "CHA");
		map.put("pass", "1234");
		
		// 4_ 요소개수
		System.out.println(map.size());
		
		// 5_ 요소값 얻어오기
		System.out.println(map.get("name")); // 키값으로 얻어오기
		System.out.println(map.get("id"));
		
		// 6_ 데이터는 중복되지만 키 값이 다르기에 추가됨.
		map.put("kkk", "sam"); 
		// 7_ 키 값이 중복되면 새로 추가되지 않고 그 위치값이 변경됨!
		map.put("kkk", "hong");

		System.out.println();
		// 8_ 순서대로 요소값을 얻어오기
		// 방법 1. for 문 불가 - 인덱스 번호가 없으니까!
		// 방법 2. 확장 for 문 불가 - 내부적으로 key 값에 접근하는 방법이 없다!
		// 방법 3. 우선 키값 부터 Set 객체로 우선 얻어와서 반복문으로 처리
		Set<String> keys = map.keySet();
		
		// 3.1 key 들을 가진 Set 컬렉션 객체를 반복문으로 접근
		for(String key : keys) {
			System.out.println(key);
		}
		// 3.2 key 들을 가진 Set 컬렉션 객체의 반복자 iterator 사용!
		Iterator<String> datas = keys.iterator();
		while(datas.hasNext()) {
			String k = datas.next();
			System.out.println(map.get(k));
		}
		// 방법 4. Map 객체를 Set 객체로 변환하여 접근
		// Map 의 요소객체(키, 밸류)인 Entry 들을 가진 Set 으로 변환 
		Set<Entry<String, String>> entries = map.entrySet();
		for(Entry<String,String> t : entries ) {
			System.out.println(t.getKey() + " : " + t.getValue());
		}
		System.out.println();
		
		// 9_ 요소 삭제 
		map.remove("kkk");
		System.out.println(map);
		
		
		//10_ 
		System.out.println("==========================");
		TreeMap<String,String> map2 = new TreeMap<String,String>(); // 키값을 오름차순으로 저장한다! 성능 중간정도..첫글자 기준
		map2.put("name", "sam"); // (식별자, 값)
		map2.put("ㅋidㅋㅋ", "CHA");
		map2.put("pass", "1234");
		System.out.println(map2);
		
		//11_
		System.out.println("==========================");
		LinkedHashMap<String,String> map3 = new LinkedHashMap<String,String>(); // 저장된 순서대로, 성능은 최하!
		map3.put("name", "sam"); // (식별자, 값)
		map3.put("ㅋidㅋㅋ", "CHA");
		map3.put("pass", "1234");
		System.out.println(map3);

		// 12_ HashTable 은 동기화처리가 되어있음 - Thread 를 배워야 알수있다!
		
		// 13_ 키값을 그냥 정수숫자로 할 수도 있음. 
		HashMap<Integer, String> map4 = new HashMap<>();
		
		map4.put(1, "AAA");
		
		// 14_ 사용자 정의 클래스를 value 로 사용할 수도 있음. 물론 키값도 가능.
		HashMap<Person, Person> map5 = new HashMap<>();
		
	}

}
