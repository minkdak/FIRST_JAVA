package cooperation;

public class Taxi {
	String taxiLocalName;
	int passengerCount;
	int money;
	
	public Taxi(String taxiLocalName) {
		this.taxiLocalName = taxiLocalName;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(taxiLocalName + "���� �ý��� �°��� " + passengerCount + "�� �̰�, ������ " + money +"�Դϴ�.");
	}
	
}
