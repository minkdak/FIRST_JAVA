package Chapter5;

public class Order {
	long orderNumber;
	String ordererId;
	String date;
	String ordererName;
	String orderGoodsNumber;
	String orderAddress;
	
	public void printOrderInfo() {
		System.out.println("�ֹ���ȣ: " + this.orderNumber);
		System.out.println("�ֹ��� ���̵�: " + this.ordererId);
		System.out.println("�ֹ���¥: " + this.date);
		System.out.println("�ֹ��� �̸�: " + this.ordererName);
		System.out.println("�ֹ���ǰ��ȣ: " + this.orderGoodsNumber);
		System.out.println("����ּ�: " + this.orderAddress);
		
		
	}
	
}
