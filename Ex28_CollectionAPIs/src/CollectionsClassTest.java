import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassTest {

	public static void main(String[] args) {
		
		// 1_ Collections 클래스의 유용한 static 기능 메소드 
		// 1) Collections.sort();
		// 2) Collections.shuffle();

		ArrayList<String> datas = new ArrayList<String>();
		datas.add("nice");
		datas.add("world");
		datas.add("ANDROID");
		datas.add("pI");
		datas.add("with");
		datas.add("man");
		datas.add("toilet");
		
		System.out.println(datas.toString());
		
		Collections.sort(datas); // 리스트의 요소들이 정렬된다! 실제 값이 바뀌는거임.
		System.out.println(datas.toString());
		Collections.shuffle(datas);
		System.out.println(datas);
	}

}
