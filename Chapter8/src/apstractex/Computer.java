package apstractex;

// �߻�Ŭ������ ���� Ŭ���������� ����.
public abstract class Computer { // �߻� �޼��带 �����Ϸ��� �߻� Ŭ����������.
	// �߻�޼���
	// ���� Ŭ�������� �����ؾߵ� �޼���	
	public abstract void display();
	public abstract void typing(); 
	
	// �Ϲ����� �޼ҵ�
	public void turnOn() {
		System.out.println("������ �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
