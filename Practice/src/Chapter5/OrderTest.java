package Chapter5;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.orderNumber = 201907210001L;
		order.ordererId = "abc123";
		order.date = "2019�� 7�� 21��";
		order.ordererName = "ȫ���";
		order.orderGoodsNumber = "PD0345-12";
		order.orderAddress = "����� �������� ���ǵ��� 20����";
		
		order.printOrderInfo();
		
	}

}
