package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");	
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 구현이 있는 메서드
	public void washCar() {};
	
	// 재정의 할수 없는 메서드
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
	
}
