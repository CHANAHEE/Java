
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 26_ 예) 앱에 동물 캐릭터 3종류(Dog, Cat, Pig) 각각의 클래스 만들기
		Dog d = new Dog();
		Cat c = new Cat();
		Pig p = new Pig();

		// 27_ 각각의 기능 실행
		d.say();
		c.say();
		p.say();
		System.out.println();

		// 28_ 만약 이런 동물캐릭터가 여러마리라면??
		// 즉, Dog 5마리 , Cat 10마리, Pig 4마리가 있다고 한다면 어떻게 할까?
		// 하나씩 참조변수를 만드는것은 미친것 같음.
		// 29_ 그래서 배운 배열이라는 개념을 생각해보자!
		Dog[] dogs = new Dog[5];
		dogs[0] = new Dog();
		dogs[1] = new Dog();
		dogs[2] = new Dog();

		dogs[0].say();
		dogs[1].say();
		dogs[2].say();
		System.out.println();
		// 30_ 이런식으로 배열로 만들면 캐릭터 종류별로만 묶을 수 있어서 제어할 때 은근 짜증~
		// 그래서 동물캐릭터 객체 모두를 제어할 수 있는 참조변수만 있다면...
		// 이를 하나의 배열로 묶을 수 있다!

		// 31_ 동물 클래스들의 부모클래스가 있다면!
		// 그 부모클래스의 참조변수로 여러 종류의 자식객체들 모두를 참조할 수 있다!
		// 즉 하나의 배열로 묶을 수 있을거다!

		// 32_ Dog, Cat, Pig 의 부모로 Animal 클래스를 설계해보자!
		Animal ani;
		// 35_ 부모 참조변수로 자식객체 참조가능 -> 업캐스팅!
		// 36_ 근데 이렇게만 해놓으면 아무기능도 못쓴다! 자식들의 재산까지 빼앗아 쓸수는 없지.. 오버라이드된 메소드는 근데 사용가능했다!!
		ani = new Dog();

		// 38_ 이러면 오버라이드가 된 say() 메서드 발동!
		ani.say();

		Animal ani2 = new Cat();
		ani2.say();

		Animal ani3 = new Pig();
		ani3.say();

		System.out.println();
		// 39_ 가만보니, Animal 참조변수로 Dog, Cat, Pig 모두를 참조할 수 있으니,
		// Animal 참조변수를 여러개 가지는 배열을 만들면 여러종류의 객체들을 모두 참조할 수 있다!
		Animal[] anis = new Animal[5];// 40_ Animal 참조변수가 5개 짜리인 배열객체를 생성!!
		anis[0] = new Dog(); // 41_ 업캐스팅!!
		anis[1] = new Cat(); // 42_ 업캐스팅!!
		anis[2] = new Pig(); // 43_ 업캐스팅!!
		anis[3] = new Dog();
		anis[4] = new Cat();
		
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		// 모양은 같지만! 다 다른결과를 도출! -> 다형성~~

		System.out.println();
		// 44_ 반복문 이용가능
		for (int i = 0; i < anis.length; i++) {
			anis[i].say();
		}
		
		// 45_ 확장 for 문
		for(Animal t : anis) {
			t.say();
		}
		
		// 46_ 다형성은 이렇게 배열로 묶기 위해서만 사용되는것은 아님.
		// 메소드의 파라미터(매개변수) 나 리턴타입에서도 매우 유용하게 사용됨.
		// 안드로이드 앱 개발에서도 매우매우매우 많이 사용되는 기술!
		// 다음프로젝트로 gogo~
	}

}
