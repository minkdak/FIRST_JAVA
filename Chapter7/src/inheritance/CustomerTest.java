package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customerLee = new Customer(); 
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010); customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
//		Customer customerKim = new VIPCustomer(10020, "������");
//		customerKim.setCustomerName("������");
//		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		//���� Ŭ������ Ÿ���� ����Ŭ������ ���� Ÿ������ �ڵ� ����ȯ�̵ȴ�.(��ĳ����)
		// �޸𸮴� ���� Ŭ������ ������Ƽ���� ����������� Ÿ���� ���� Ŭ���� �̱� ������ ���� Ŭ������ �޸𸮸� �����Ҽ� �ִ�.
		customerLee = customerKim; 
		
//		customerKim.
	}

}
