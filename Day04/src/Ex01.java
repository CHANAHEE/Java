import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("input" + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}
		
		int max=arr[0], min=arr[0], sum = 0;
		for(int i=0;i<arr.length;i++) {
			max = max < arr[i] ? arr[i] : max;
			min = min > arr[i] ? arr[i] : min;
			sum += arr[i];
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("총 합 : " + sum);
	}
}
