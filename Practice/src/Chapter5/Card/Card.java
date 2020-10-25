package Chapter5.Card;

public class Card {
	private int cardNumber; 
	private static int serialNum = 10000;
	
	public Card() {
		serialNum++;
		this.cardNumber = serialNum;
	}
	
	public int getCardNumber() {
		return this.cardNumber;
	}
}
