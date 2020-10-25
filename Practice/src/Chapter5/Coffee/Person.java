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
			System.out.println("구매할 돈이 없습니다.");
		} else {
			setMoney(getMoney() - coffee);
			
			String message = cafe.buy(coffee);
			if(message != null) {
				System.out.println(getName() + "님이 " + coffee +"으로 " + message);	
			} else {
				System.out.println("해당 커피를 판매하지 않습니다.");
			}
			
			
			
		}
		
		
	}
	
	public void buyBeanCoffee(BeanCoffee cafe, int coffee) {
		cafe.buy(coffee);
		if(coffee == 4000) {
			setMenuName("아메리카노");
		} else if(coffee == 4500) {
			setMenuName("라떼");
		}
		setMoney(getMoney() - coffee);
		System.out.println(getName() + "님이 " + coffee +"으로 콩 다방 " + getMenuName() + "를 구입했습니다.");
		
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
