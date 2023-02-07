
// 5_ 마린 클래스 생성!
public class Marine implements Unit,LevelUpAble{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("걸어서 이동..");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("총알 발사!");
	}

	@Override
	public void levelUp() {
		// TODO Auto-generated method stub
		System.out.println("레벨업!");
	}
	
	public void injectSteamPack() {
		System.out.println("스팀팩!");
	}
}
