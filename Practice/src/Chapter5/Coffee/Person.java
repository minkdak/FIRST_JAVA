package Chapter5.Coffee;

public class Person {
	String name;
	int money;
	String menuName;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void buyStarCoffee(StarCoffee cafe, int coffee) {
		if(getMoney() < coffee) {
			System.out.println("������ ���� �����ϴ�.");
		} else {
			setMoney(getMoney() - coffee);
			
			String message = cafe.buy(coffee);
			if(message != null) {
				System.out.println(getName() + "���� " + coffee +"���� " + message);	
			} else {
				System.out.println("�ش� Ŀ�Ǹ� �Ǹ����� �ʽ��ϴ�.");
			}
			
			
			
		}
		
		
	}
	
	public void buyBeanCoffee(BeanCoffee cafe, int coffee) {
		cafe.buy(coffee);
		if(coffee == 4000) {
			setMenuName("�Ƹ޸�ī��");
		} else if(coffee == 4500) {
			setMenuName("��");
		}
		setMoney(getMoney() - coffee);
		System.out.println(getName() + "���� " + coffee +"���� �� �ٹ� " + getMenuName() + "�� �����߽��ϴ�.");
		
	}
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}