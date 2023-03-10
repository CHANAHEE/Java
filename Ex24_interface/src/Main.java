import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1_ 팀장이 인터페이스를 설계하고, 추상메소드의 이름을 정하면
		// 팀원들은 그 이름을 토대로 기능을 구현하여 클래스를 설계.

		// 2_ 팀장 : Unit 인터페이스 설계.
		// 팀원 1 : Marine 클래스 정의 및 Unit 기능 구현. -> Unit 이라면 가져야 할 기본기능을 구현.(메소드 이름 통일)
		// 팀원 2 : Tank 클래스 정의 및 Unit 기능 구현.
		// 팀원 3 : Race 클래스 정의 및 Unit 기능 구현.

		// 3_ Marine, Tank, Race 객체는 attack(), move() 기능이 있음을 확신함.-> Unit 이 가지고 있는 추상메소드
		// 이므로.

		// 8_ 팀장은 이제 만들어진 클래스를 이용하여 객체를 생성하고 게임의 알고리즘을 구현!

		// 9_ 캐릭터별 참조변수를 사용할 수도있지만, 부모참조변수로 자식객체들을 모두 참조할 수 있으니...차라리 Unit 참조변수 타입 하나로
		// 모든 객체들을 제어하는것이 보다 효과적이다! --> 배열로 묶을 수 있음!!!
		// Unit[] us = new Unit[200]; 별로 선호안함.

		// 10_ 단, 실제 게임에서는 캐릭터들의 생성과 제거가 빈번하다!
		// 배열을 한번 만들면 개수를 변경할 수 없고 요소를 제거할 수도 없다!
		// 그래서 실제 이렇게 대량의 객체를 다룰 때는 유동적 배열을 더 선호한다!
		// 마치 기차처럼 객체를 끌고다니는 클래스 : ArrayList
		ArrayList<Unit> units = new ArrayList<Unit>();

		// 11_ 요소 개수 확인해보기
		int num = units.size();
		System.out.println("유닛 개수 : " + num);

		// 12_ 유닛 종류 객체들 생성해서 추가해주자! -> 업캐스팅!!
		units.add(new Marine());
		units.add(new Tank());
		units.add(new Race());
		units.add(new Marine());
		units.add(new Tank());

		// 13_ 유닛 개수 확인해보기
		System.out.println("유닛 개수 : " + units.size());

		// 14_ 유닛 기능 사용해보기
		for (int i = 0; i < units.size(); i++) {
			Unit unit = units.get(i);
			unit.move();
			unit.attack();
		}
		System.out.println();
		// 15_ 확장 for문
		for (Unit unit : units) {
			unit.move();
			unit.attack();

			// 16_ 레벨업이 가능한 캐릭터들은 레벨업하기!
			// unit참조변수가 참조하는 객체가 Marine 인지확인!
//			if (unit instanceof Marine) {
//				Marine m = (Marine) unit;
//				m.levelUp();
//			} else if(unit instanceof Tank) {
//				((Tank)unit).levelUp();
//			}
			
			// 17_ 근데 만약에 레벨업되는 유닛이 많으면?? 
			if(unit instanceof LevelUpAble) {
				((LevelUpAble)unit).levelUp();
			}
		}
	}

}
