package burger;

public class Customer {
//	고객명, 주소, 전화번호, 주문번호[]
	String name;
	String address;
	String phoneNumber;
	
	int[] orderNumberArr;
	
	public Customer(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		
		orderNumberArr = null;
	}

	public Customer(String name, String address, String phoneNumber, int orderMaxCount) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		
		initOrderNumberArr(orderMaxCount);
	}
	
	void initOrderNumberArr(int orderMaxCount) {
		orderNumberArr = new int[orderMaxCount];
		
		for(int i = 0; i < orderMaxCount; i++) {
			orderNumberArr[i] = -1;
		}
	}
	
	int isExistOrderNumber(int orderNumber) {
		if(orderNumberArr == null)
			return -1;
		if(orderNumberArr.length == 0) //안해도 됨
			return -1;
		
		for(int i = 0; i < orderNumberArr.length; i++) {
			if(orderNumberArr[i] == orderNumber)
				return i;
		}
		
		return -1;
	}
	
	boolean addOrder(int orderNumber) {
		int idx = addOrderNumberArrIdx();
		
		if(idx == -1) {
			return false;
		}
		
		orderNumberArr[idx] = orderNumber;
		return true;
	}
	
	boolean refundOrder(int orderNumber) {
		int idx = isExistOrderNumber(orderNumber);
		
		if(idx == -1)
			return false;
		
		orderNumberArr[idx] = -1;
		return true;
	}
	
	int addOrderNumberArrIdx() {
		if(orderNumberArr == null)
			return -1;
		if(orderNumberArr.length == 0) //안해도 됨
			return -1;
		
		for(int i = 0; i < orderNumberArr.length; i++) {
			if(orderNumberArr[i] == -1)
				return i;
		}
		
		return -1; //비어있는거 없음
	}
}
