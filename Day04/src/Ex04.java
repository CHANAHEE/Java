import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Ticketing tk = new Ticketing();
		tk.mainView();
	}
}

class Ticketing{
	Scanner sc = new Scanner(System.in);
	int[] res = new int[10];
	int menu;
	
	void mainView() {
		while (true) {
			System.out.print("좌석예매 1번\n좌석취소 2번\n종료 0번\n입력 : ");
			menu = sc.nextInt();
			if(menu == 0) {
				System.out.println("예약을 종료합니다.");
				break;
			}
			else if(menu == 1) {
				showReserve();
				selectSeat();
			}
			else {
				showReserve();
				cancelSeat();
			}
			
			
		}
	}
	
	
	
	void showReserve() {
		System.out.println("\n현재의 예약 상태는 다음과 같습니다.");
		System.out.println("-----------------");
		System.out.println("좌석 번호 : 1 2 3 4 5 6 7 8 9 10");
		System.out.println("-----------------");
		System.out.print("예약 상태 : ");
		for(int t : res) {
			System.out.print(t + " ");	
		}
		System.out.println();
		System.out.println();
	}
	
	
	
	void selectSeat() {
		while(true) {
			System.out.print("몇번째 좌석을 예약하시겠습니까? : ");
			int selSeat = sc.nextInt() - 1;
			
			if(selSeat < 0 || selSeat > 9) {
				System.out.println("없는 좌석입니다. 다시 입력해주세요.");
				System.out.println();
				continue;
			}else if(res[selSeat] == 0) {
				System.out.println((selSeat+1) + "번 좌석 예약되었습니다.");
				res[selSeat] = 1;
				break;
			}else {
				System.out.println(" 죄송합니다. 이미 예약된 좌석입니다. 다른 좌석을 선택해 주세요.");
				continue;
			}
		}
	}
	
	
	void cancelSeat() {
		while(true) {
			System.out.print("몇번째 좌석을 취소하시겠습니까? : ");
			int selSeat = sc.nextInt() - 1;
			
			if(selSeat < 0 || selSeat > 9) {
				System.out.println("없는 좌석입니다. 다시 입력해주세요.");
				System.out.println();
				continue;
			}else if(res[selSeat] == 1) {
				System.out.println((selSeat+1) + "번 좌석 취소되었습니다.");
				res[selSeat] = 0;
				break;
			}else {
				System.out.println(" 죄송합니다. 이미 예약되지 않은 좌석입니다. 다른 좌석을 선택해 주세요.");
				continue;
			}
		}
	}
}
