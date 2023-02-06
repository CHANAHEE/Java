
public class Test {
	// _28
	// 1) 리턴 X , 파라미터 X
	void aaa() {
		System.out.println("aaa");
	}

	// 2) 리턴 X , 파라미터 O
	void bbb(int n) {
		System.out.println("n : " + n);
	}

	// 3) 리턴 O , 파라미터 X
	double ccc() {
		return 10;
	}

	// 4) 리턴 O , 파라미터 O
	int ddd(int x, int y) {
		return x + y;
	}
}
