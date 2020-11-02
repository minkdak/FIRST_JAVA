package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customerLee = new Customer(); 
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010); customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
//		Customer customerKim = new VIPCustomer(10020, "김유신");
//		customerKim.setCustomerName("김유신");
//		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		//하위 클래스의 타입은 상위클래스의 변수 타입으로 자동 형변환이된다.(업캐스팅)
		// 메모리는 하위 클래스의 프로퍼티까지 만들어졌지만 타입이 상위 클래스 이기 때문에 상위 클래스의 메모리만 참조할수 있다.
		customerLee = customerKim; 
		
//		customerKim.
	}

}
