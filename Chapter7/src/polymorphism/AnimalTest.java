package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	// 재정의 되지 않은 메서드는 상위 클래스 타입으로 선언된 인스턴스에서 호출할 수 없다.
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		// 1_1. 이렇게 일일이 호출 하지 않고
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		// 1_2. 상위 클래스 타입으로 선언후
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		// 상속, 업캐스팅, 다형성
		// 1_3. 오버라이딩 된 메서드를 호출할 수 있다. 
		for( Animal animal : animalList) {
			animal.move();
		} 
		
		// 2_1.각각의 클래스에 생성 되어 있는 메서드들을 사용하려면 다운캐스팅
		System.out.println("=============================");
//		Human human = (Human)hAnimal;
//		human.readBook();
		
		// 타입과 명시적 형변환만 비교해서 컴파일에러가 안남 -> 에러발생
		// Eagle human1 = (Eagle)hAnimal;
//		if(hAnimal instanceof Human) {
//			Human human = (Human)hAnimal;
//			human.readBook();
//		}
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
				
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		
		for(int i = 0; i < list.size(); i++) {
			Animal ani = list.get(i);
			if(ani instanceof Human) {
				Human human = (Human)ani;
				human.readBook();
			}else if(ani instanceof Tiger) {
				Tiger tiger = (Tiger)ani;
				tiger.hunting();
			}else if(ani instanceof Eagle) {
				Eagle eagle = (Eagle)ani;
				eagle.flying();
			} else {
				System.out.println("error");
			}
		}
		
	}

	// 하나의 메서드로 3개의 메서드를 만든 효과를 볼수 있다.
	public void moveAnimal(Animal animal ) {
		animal.move();
	}
	


}
