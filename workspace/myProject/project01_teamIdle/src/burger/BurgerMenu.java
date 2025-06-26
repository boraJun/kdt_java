package burger;

public class BurgerMenu {
//	버거종류
//	버거가격
//	세트가격
	static int currentBurgerId;
	
	int burgerId;
	
	int burgerPrice;
	int setPrice;

	String burgerName;
	
	public BurgerMenu(int burgerId, String burgerName, int burgerPrice, int setPrice) {
		this.burgerId = burgerId;
		this.burgerName = burgerName;
		this.burgerPrice = burgerPrice;
		this.setPrice = setPrice;
	}

	public int getPrice(boolean isSet) {
		return isSet ? setPrice : burgerPrice;
	}
	
	public int getSetPrice() {
		return setPrice;
	}
	
	public int getBurgerPrice() {
		return burgerPrice;
	}
}
