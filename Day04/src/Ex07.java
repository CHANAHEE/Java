import java.util.Arrays;
import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int[][] num = new int[5][5];
		int[] num1 = new int[25];
		Random rand = new Random();

		for (int i = 0; i < 25; i++) {
			num1[i] = rand.nextInt(25) + 1;
			for (int j = 0; j < i; j++) {
				if (num1[i] == num1[j]) {
					i--;
					break;
				}
			}
		}
		int k =0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num[i][j] = num1[k];
				k++;
			}
			
		}
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();

		}

	}
}
