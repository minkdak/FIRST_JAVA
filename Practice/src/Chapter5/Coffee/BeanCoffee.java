package Chapter5.Coffee;

public class BeanCoffee {
	int money;
	
	public String buy(int money) {
		this.money += money;
		
		if(money == Menu.BEANMERICANO) {
			return "콩다방 아메리카노를 구매했습니다";
		} else if(money == Menu.BEANLATTE) {
			return "콩다방 라떼를 구매했습니다.";
		} else {
			return null;
		}
	}
	
}
