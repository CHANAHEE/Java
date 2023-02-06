
// 6_ 탱크 클래스 생성!
public class Tank implements Unit,LevelUpAble{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("바퀴도 이동...");
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("자주포 발사!");
	}

	@Override
	public void levelUp() {
		// TODO Auto-generated method stub
		System.out.println("레벨업!");
	}
	
	public void changeSeize() {
		System.out.println("시즈모드!");
	}
}
