
public class Ex23 {
	public static void main(String[] args) {
		for (int i = 2; i < 9; i += 2) {
			for (int k = 2; k <= i; k += 2) {
				System.out.println(i + " * " + k + " = " + (i * k));
			}
		}

		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0)
				continue;
			for (int k = 1; k < 10; k++) {
				if (k % 2 != 0)
					continue;
				if (i < k)
					break;
				System.out.println(i + " * " + k + " = " + (i * k));
			}
		}
	}
}
