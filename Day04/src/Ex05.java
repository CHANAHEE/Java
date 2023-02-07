
public class Ex05 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 1, 2, 3, 4, 5 };
		int[] arr3 = new int[5];

		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] + arr2[4-i];
		}
		for(int t : arr3) {
			System.out.print(t + " ");
		}

	}
}
