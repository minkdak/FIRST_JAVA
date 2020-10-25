package Chapter5;

public class Order {
	long orderNumber;
	String ordererId;
	String date;
	String ordererName;
	String orderGoodsNumber;
	String orderAddress;
	
	public void printOrderInfo() {
		System.out.println("주문번호: " + this.orderNumber);
		System.out.println("주문자 아이디: " + this.ordererId);
		System.out.println("주문날짜: " + this.date);
		System.out.println("주문자 이름: " + this.ordererName);
		System.out.println("주문상품번호: " + this.orderGoodsNumber);
		System.out.println("배송주소: " + this.orderAddress);
		
		
	}
	
}
