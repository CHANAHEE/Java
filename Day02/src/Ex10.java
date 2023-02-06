import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int posX_left,posY_left,posX_right,posY_right,area;
		System.out.print("좌 상단 x 좌표 : ");
		posX_left = sc.nextInt();
		System.out.print("좌 상단 y 좌표 : ");
		posY_left = sc.nextInt();
		System.out.print("우 하단 x 좌표 : ");
		posX_right = sc.nextInt();
		System.out.print("우 하단 y 좌표 : ");
		posY_right = sc.nextInt();
		
		area = (posX_right - posX_left) * (posY_right - posY_left);
		System.out.println("두 점이 이루는 직사각형의 넓이는 " + area + "입니다");
	}
}
