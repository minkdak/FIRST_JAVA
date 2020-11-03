package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}

	// ������ ���� ���� �޼���� ���� Ŭ���� Ÿ������ ����� �ν��Ͻ����� ȣ���� �� ����.
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		// 1_1. �̷��� ������ ȣ�� ���� �ʰ�
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		// 1_2. ���� Ŭ���� Ÿ������ ������
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		// ���, ��ĳ����, ������
		// 1_3. �������̵� �� �޼��带 ȣ���� �� �ִ�. 
		for( Animal animal : animalList) {
			animal.move();
		} 
		
		// 2_1.������ Ŭ������ ���� �Ǿ� �ִ� �޼������ ����Ϸ��� �ٿ�ĳ����
		System.out.println("=============================");
//		Human human = (Human)hAnimal;
//		human.readBook();
		
		// Ÿ�԰� ����� ����ȯ�� ���ؼ� �����Ͽ����� �ȳ� -> �����߻�
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

	// �ϳ��� �޼���� 3���� �޼��带 ���� ȿ���� ���� �ִ�.
	public void moveAnimal(Animal animal ) {
		animal.move();
	}
	


}
