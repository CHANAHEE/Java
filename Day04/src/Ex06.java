import java.util.Random;

public class Ex06 {
	public static void main(String[] args) {
		int[] num = new int[25];
		Random rand = new Random();

		for (int i = 0; i < 25; i++) {
			num[i] = rand.nextInt(25) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			if(i % 5 == 0) System.out.println();
			System.out.print(num[i] + "\t");
			
		}

	}
}
