import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		int num1, num2, num3, max, min, sum;
		double avg;
		Scanner sc = new Scanner(System.in);

		System.out.print("input1 : ");
		num1 = sc.nextInt();
		System.out.print("input2 : ");
		num2 = sc.nextInt();
		System.out.print("input3 : ");
		num3 = sc.nextInt();

		sum = num1 + num2 + num3;
		avg = (num1 + num2 + num3)/3;
		max = (num1 > num2) ? (num1 > num3) ? num1 : num3 : (num2 > num3) ? num2 : num3;
		min = (num1 < num2) ? (num1 < num3) ? num1 : num3 : (num2 < num3) ? num2 : num3;
		
		System.out.print("합 :" + sum + "평균 :" + avg + "최대값 :" + max + "최소값 :" + min);
	}
}
