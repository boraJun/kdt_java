package burger;

public class Burger {
//	버거종류
//	버거가격
//	세트여부
	
	int burgerId;
	String burgerName;
	int price;
	
	boolean isSet;

	public Burger(int burgerId, String burgerName, int price, boolean isSet) {
		this.burgerId = burgerId;
		this.burgerName = burgerName;
		this.price = price;
		this.isSet = isSet;
	}
}
