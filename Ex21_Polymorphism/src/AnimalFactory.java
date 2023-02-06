
public class AnimalFactory {
	// 51_ 애니멀(Dog, Cat, Pig) 객체를 생성하여, 리턴해주는 기능 메소드를 설계하자!
	
	Animal makeAnimal(int n) {
		
		Animal ani = null;
		
		switch(n) {
		case 1:
			ani = new Dog();
			break;
		case 2:
			ani = new Cat();
			break;
		case 3:
			ani = new Pig();
			break;
		}
		return ani;
	
	}
}
