import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int charge,price;
		
		System.out.print("받은금액 : ");
		charge = sc.nextInt();
		System.out.print("상품 가격 : ");
		price = sc.nextInt();
		double vat = price * 0.1;
		
		System.out.println("부가세 : " + (int)vat);
		System.out.println("잔돈 : " + (int)(charge - (vat+price)));
	}
}
