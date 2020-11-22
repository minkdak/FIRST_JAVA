package apstractex;

public class DeskTop extends Computer{
	public void display() {
		System.out.println("DeskTop display");
	}

	public void typing() {
		System.out.println("DeskTop typing");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("desktop turnoff");
	};
	
	
}
