package thisex;
// this ����
public class Person {
	String name;
	int age;
	
	// ������: �ν��Ͻ� ������ �ν��Ͻ� �ʱ�ȭ
	public Person() {
		// this.name = "�̸�����"
		// ��ſ� �Ʒ��� ���� ���.
		
		// age = 100; // �ٸ� �����ڸ� ȣ���� �� �ٸ� statement�� �ü� ���� 
		this("�̸�����", 1); // �ٸ� ������ ȣ���� first statement������
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	
	public Person getSelf() {
		return this;
	}
}