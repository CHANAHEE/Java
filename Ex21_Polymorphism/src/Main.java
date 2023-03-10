import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 47_ 동물 캐릭터 3종류[Dog, Cat, Pig] 를 만들어 내는 기능을 가진 애니멀 공장객체를 생성해보자!
		
		final int DOG = 1,CAT = 2,PIG = 3;
		// 52_ AnimalFactory 의 객체부터 만들자!
		AnimalFactory af = new AnimalFactory();
		Dog d = (Dog) af.makeAnimal(DOG); // 53_ 형변환 연산자보다 . 연산자가 먼저!!
		d.say(); // 오버라이드 된 기능
		d.guardHouse(); // 55_1 고유 기능

		Cat c = (Cat) af.makeAnimal(CAT);
		c.say();
		c.handleButtler(); // 55_2 고유 기능

		Pig p = (Pig) af.makeAnimal(PIG);
		p.say();
		p.eatAndEat(); // 55_3 고유 기능
		System.out.println();

		// 56_ Animal 참조변수 1개로 여러객체 제어하기도 가능.. 나중에 배열로 적용!
		Animal a = af.makeAnimal(1);
		a.say();
		// 자식 객체의 고유기능은 사용불가! 오버라이드 되어있지 않으므로!!
		// a.guardHouse(); // error!!
		// 그래서 고유기능들도 Animal에 오버라이드 용 메서드를 만들자니, 다른 Cat 이나 Pig 에도 그 기능이 들어가기 때문에 안된다!
		// 그래서 down casting 을 해줘야함!

		a = af.makeAnimal(2);
		a.say();
		// (Cat)a.??? // 57_ 연산자 우선순위 생각하자!
		((Cat) a).handleButtler();

		System.out.println();

		// 58_ 마지막 응용
		// 동물캐릭터 5마리를 랜덤하게 만들어서 공통기능과 고유기능을 사용해보자!
		// 랜덤값을 만들어내는 능력을 가진 객체를 생성하자!
		Random rand = new Random();

		// 59_ 동물 참조변수 5개를 가진 배열을 만들자!
		Animal[] anis = new Animal[5];

		for (int i = 0; i < anis.length; i++) {
			int n = rand.nextInt(3) + 1; // 1,2,3 중 하나를 n에 대입!
			anis[i] = af.makeAnimal(n);
		}

		// 60_ 각 객체들의 기능을 호출해보자!
		for (int i = 0; i < anis.length; i++) {
			// 61_ 동물들의 공통기능...
			anis[i].say();// 오버라이드된 메소드가 발동!

			// 62_ 동물들의 고유기능...
			// anis[i] 참조변수가 어떤 클래스의 객체인지부터 알아야 down casting 을 하고, 고유기능을 사용할 수 있다.
			// 즉, 참조변수가 어떤 클래스의 객체를 참조하고 있는지를 알려주는 연산자 : instanceof
			if (anis[i] instanceof Dog) {
				((Dog) anis[i]).guardHouse();
			} else if (anis[i] instanceof Cat) {
				((Cat) anis[i]).handleButtler();
			} else if (anis[i] instanceof Pig) {
				((Pig) anis[i]).eatAndEat();
			}

		}
		
		// 63_ Animal 클래스는 객체생성용이 아니라, 오로지 상속을 위해서만 존재하는 추상적 개념의 클래스!!
		// 즉, 객체를 만들면 안되는 클래스임.
		// 하지만, 그냥 클래스로 만들어버리면 실수로 객체를 생성시키는 문제를 발생시킬수있음. 객체를 만들면 안되니까~~
		// Animal ani212 = new Animal(); 65_ ERROR!! 객체생성을 할 수 없음!!
		
		// 이처럼 실행해봐야 아무것도 안뜸. 이상하지. new 로 객체도 생성이 가능하고, 메서드도 호출할 수 있다. 오류도 아니다. 근데 논리적으로 이상하지~~ 개발자의 실수를 유발한다.
		// 이런식으로 클래스를 설계하는것은 분명한 장점이 있다. 업캐스팅과 다운캐스팅이 가능해서 다양한 타입의 객체를 묶어서 관리할수도 있으니까! 근데, 이러한 설계는 위와같은 뚜렷한 단점도 있다!
		// 설계한 사람은 분명히 Animal 이 추상적인 개념을 담고 있는 클래스라는걸 알지만, 사용하는 사람은 Animal 이 어떤 클래스인지 알지못한다.
		// 그래서 이렇게 객체를 생성하지 않도록 설계한 클래스를 실수로 new 하지 못하도록 문법적으로 막는 문법이 등장! - 추상클래스!! abstract class 
		
		// 67_ 추상클래스에 대한 문법적 학습을 위해 다음프로젝트로 gogo!
	}

}
