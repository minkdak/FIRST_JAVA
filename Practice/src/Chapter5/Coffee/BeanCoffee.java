package Chapter5.Coffee;

public class BeanCoffee {
	int money;
	
	public String buy(int money) {
		this.money += money;
		
		if(money == Menu.BEANMERICANO) {
			return "��ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�";
		} else if(money == Menu.BEANLATTE) {
			return "��ٹ� �󶼸� �����߽��ϴ�.";
		} else {
			return null;
		}
	}
	
}
