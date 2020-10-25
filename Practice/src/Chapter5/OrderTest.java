package Chapter5;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.orderNumber = 201907210001L;
		order.ordererId = "abc123";
		order.date = "2019년 7월 21일";
		order.ordererName = "홍길순";
		order.orderGoodsNumber = "PD0345-12";
		order.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		order.printOrderInfo();
		
	}

}
