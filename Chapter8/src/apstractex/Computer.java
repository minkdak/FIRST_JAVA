package apstractex;

// 추상클래스는 상위 클래스용으로 사용됨.
public abstract class Computer { // 추상 메서드를 구현하려면 추상 클래스여야함.
	// 추상메서드
	// 하위 클래스에서 구현해야될 메서드	
	public abstract void display();
	public abstract void typing(); 
	
	// 일방적인 메소드
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
