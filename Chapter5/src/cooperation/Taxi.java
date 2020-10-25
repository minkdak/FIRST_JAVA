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
		System.out.println(taxiLocalName + "지역 택시의 승객은 " + passengerCount + "명 이고, 수입은 " + money +"입니다.");
	}
	
}
