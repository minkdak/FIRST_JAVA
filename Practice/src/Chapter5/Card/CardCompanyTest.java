package Chapter5.Card;

public class CardCompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.creatCard();
		Card yourCard = company.creatCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
	}

}

