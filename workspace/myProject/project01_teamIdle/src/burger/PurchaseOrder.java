package burger;

//주문서 클래스
public class PurchaseOrder {
//	주문번호, 전화번호, 버거[], 총가격
//	   
//	String get전화번호;
//	int 총가격();
	static int currentOrderNumber;
	int orderNumber;
	String phoneNumber;
	
	Burger[] burgerList;
	int total;

	public PurchaseOrder(String phoneNumber, Burger[] burgerList) {
		PurchaseOrder.currentOrderNumber++;
		
		this.orderNumber = PurchaseOrder.currentOrderNumber;
		
		this.phoneNumber = phoneNumber;
		initBurgerList(burgerList);
		
		this.total = calculateTotal();
	}
	
	void initBurgerList(Burger[] burgerList) {
		if(burgerList == null) {
			this.burgerList = null;
			return;
		}
		if(burgerList.length == 0) {
			this.burgerList = null;
			return;
		}
		
		this.burgerList = new Burger[burgerList.length];
		
		Burger burger;
		for(int i = 0; i < burgerList.length; i++) {
			burger = burgerList[i];
			
			this.burgerList[i] = new Burger(burger.burgerId, burger.burgerName, burger.price, burger.isSet);
		}
	}
	
	int calculateTotal() {
		int cnt = this.burgerList.length;
		int total = 0;
		
		for(int i = 0; i < cnt; i++) {
			total += this.burgerList[i].price;
		}
		
		return total;
	}
}
