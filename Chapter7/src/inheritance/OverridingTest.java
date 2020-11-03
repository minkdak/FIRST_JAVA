package inheritance;

public class OverridingTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customerLee = new Customer(10010, "이순신"); 
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo() + "지불 금액은 " + priceLee + " 원입니다");
		System.out.println(customerKim.showCustomerInfo() + "지불 금액은 " + priceKim + " 원입니다");
		
		Customer customerNo = new VIPCustomer(10030, "나몰라");
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.showCustomerInfo() + "지불 금액은 " + customerKim.calcPrice(10000) + " 원입니다");
		// customerNo.calcPrice(price) 보이는건 customer 클래스의 메서드로 보이는데 실제로는 vipcustomer의 메서드
		// 이것을 가상 메서드라고한다.
		// 가상메서드는 선언된 타입 기준이 아니라, 생성된 인스턴스 기준.
		// 인스턴스에 재정의된 경우 재정이된 메서드 호출됨.
	}

}
