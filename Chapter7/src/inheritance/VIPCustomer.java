package inheritance;

public class VIPCustomer extends Customer {
	double salesRatio;
	private int agentID;

	
//	public VIPCustomer() {
//	 
//		super(0, null); 
//		customerGrade = "VIP"; 
//		bonusRatio = 0.05; 
//		salesRatio = 0.1; 
//		System.out.println("VIPCustomer() 생성자 호출"); 
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// TODO Auto-generated constructor stub
		
		customerGrade = "VIP"; 
		bonusRatio = 0.05; 
		salesRatio = 0.1; 
		System.out.println("VIPCustomer(int, String) 생성자 호출"); 
	}
}
