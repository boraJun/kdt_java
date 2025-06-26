package burger;

public class OrderManager {
//	매출, 주문서[], String 버거종류[], 최소금액, 고객[], int 현재주문갯수, 최대주문수, 한 주문서 당 최대 주문 개수
	int totalMoney;
	final int MAX_ORDER_COUNT;
	//한 주문서 당 최대 주문 개수
	final int MAX_BURGER;
	

	int currentOrderCount;
	PurchaseOrder[] purchaseOrderArr;

	BurgerMenu[] burgerMenuArr;

	final int MIN_ORDER_AMOUNT;

	int currentCustomerCount;
	Customer[] customerArr;

	// 기본생성자 구현
	public OrderManager() {
		MAX_ORDER_COUNT = 10;
		MIN_ORDER_AMOUNT = 12000;
		MAX_BURGER = 10;

		currentOrderCount = 0;
		currentCustomerCount = 0;

		purchaseOrderArr = new PurchaseOrder[MAX_ORDER_COUNT];
		customerArr = new Customer[MAX_ORDER_COUNT];

		burgerMenuArr = new BurgerMenu[] { 
				new BurgerMenu(BurgerMenu.currentBurgerId++, "새우버거", 7000, 7500),
				new BurgerMenu(BurgerMenu.currentBurgerId++, "불고기버거", 8500, 9000),
				new BurgerMenu(BurgerMenu.currentBurgerId++, "오징어버거", 7800, 8200),
				new BurgerMenu(BurgerMenu.currentBurgerId++, "소고기버거", 9000, 9500), };
	}

	BurgerMenu getBurgerItem(int burgerId) {
		if (burgerMenuArr == null)
			return null;
		if (burgerMenuArr.length == 0)
			return null;

		for (int i = 0; i < burgerMenuArr.length; i++) {
			if (burgerMenuArr[i].burgerId == burgerId)
				return burgerMenuArr[i];
		}
		
		return null;
	}

	int[] getBurgerMenuIdArr() {
		if (burgerMenuArr == null)
			return null;
		if (burgerMenuArr.length == 0)
			return null;

		int[] arr = new int[burgerMenuArr.length];

		for (int i = 0; i < burgerMenuArr.length; i++) {
			arr[i] = burgerMenuArr[i].burgerId;
		}

		return arr;
	}

//	boolean 첫주문고객인지(전화번호); 
	int isExistCustomer(String phoneNumber) {
		if (customerArr == null) // 생성자에서 배열 생성해주므로 우선 null 아닐 경우만 예외처리
		{
			customerArr = new Customer[MAX_ORDER_COUNT];
			return -1;
		}

		for (int i = 0; i < customerArr.length; i++) {
			if(customerArr[i] == null)
				continue;
			if (customerArr[i].phoneNumber.equals(phoneNumber))
				return i;
		}

		return -1;
	}

//	고객정보입력(고객);
	boolean addCustomer(Customer customer) {
		if (isExistCustomer(customer.phoneNumber) == -1) // 존재하지 않는 사용자
		{
			// 사용자 추가
			this.customerArr[currentCustomerCount++] = new Customer(customer.name, customer.address,
					customer.phoneNumber, MAX_ORDER_COUNT);
			return true; // 추가 성공 반환
		}

		return false; // 이미 사용자가 존재함, 실패 반환
	}

//	boolean 추가주문가능여부()
//	{ 
//		if(주문갯수 < MAX_COUNT) 
//			return true;
//			return false;
//	}

//	주문(전화번호, 주문서); // 주문서 확인 // 황승우 //주문 가능한지 확인 갯수
	boolean canOrder() {
		if ((1 + currentOrderCount) > MAX_ORDER_COUNT) { // 주문 가능한지 여부 확인
			return false; // 하나 더 주문하면 최대 주문수 초과, 실패 반환
		}

		return true; // 주문 가능
	}

//	판매(); // 주문서추가 //이서진
	boolean sell(String phoneNumber, Burger[] burgerList) {
		int customerIdx = isExistCustomer(phoneNumber);
		if (customerIdx == -1) {
			System.out.println("고객정보 존재하지 않음");
			return false; // 고객정보 존재하지 않음
		}

		// 주문서 추가
		PurchaseOrder newOne = new PurchaseOrder(phoneNumber, burgerList);
		totalMoney += newOne.total;
		
		System.out.println("총 매출 액 : " + totalMoney);
		
		this.purchaseOrderArr[currentOrderCount++]  = newOne;
				
		this.customerArr[customerIdx].addOrder(newOne.orderNumber);
		return true;
	}

//	환불(주문서 id); // 주문서 삭제 // 고객에 있는 주문아이디 삭제 //이남혁
	boolean refund(String phoneNumber, int orderNumber) {
		// 존재하는 넘버인지 확인
		// 리턴타입 : 0번 : 주문서배열의 인덱스, 1번 : 고객배열의 인덱스
		int[] arrIdx = canRefund(phoneNumber, orderNumber);

		if (arrIdx == null) // 존재하지 않는 주문번호
			return false;
		
		totalMoney -= this.purchaseOrderArr[arrIdx[0]].total;

		System.out.println("총 매출 액 : " + totalMoney);
		
		this.customerArr[arrIdx[1]].refundOrder(orderNumber); // 고객에게서 환불처리
		this.purchaseOrderArr[arrIdx[0]] = null; // 안비우고 뒤에 배열 인덱스 앞으로 넣어줘도됨

		return true;
	}

	// 리턴타입 : 0번 : 주문서배열의 인덱스, 1번 : 고객배열의 인덱스
	int[] canRefund(String phoneNumber, int orderNumber) {
		int purchaseOrderIdx = isExistOrderNumber(orderNumber); // 주문서배열에서 존재하는 주문번호인지 확인
		int customerIdx = isExistOrderNumber(phoneNumber, orderNumber); // 고객에게서 존재하는 주문번호인지 확인

		if (purchaseOrderIdx == -1 || customerIdx == -1) // 존재하지 않는 주문번호
			return null; // 환불 불가

		return new int[] { purchaseOrderIdx, customerIdx }; // 주문서 배열 인덱스와 고객 배열 인덱스 반환
	}

	int isExistOrderNumber(String phoneNumber, int orderNumber) // 고객에게 주문번호 있는지 확인
	{
		int customerIdx = isExistCustomer(phoneNumber); // 존재하는 고객인지 확인

		if (customerIdx == -1) // 존재하지 않음
			return -1; // 실패 값 반환

		// 검색 성공한 고객에게서 존재하는 주문 번호인지 확인 후 존재하면 고객 배열 인덱스 반환
		return customerArr[customerIdx].isExistOrderNumber(orderNumber) == -1 ? -1 : customerIdx;
	}

	int isExistOrderNumber(int orderNumber) { // 관리 시스템에 주문번호 있는지 확인
		if (purchaseOrderArr == null)
			return -1;
		if (purchaseOrderArr.length == 0)
			return -1;

		// 주문서 조회
		for (int i = 0; i < purchaseOrderArr.length; i++) {
			// 매개변수 값과 일치하는 주문번호 있을 경우
			if (purchaseOrderArr[i].orderNumber == orderNumber) {
				return i; // 주문서 배열 인덱스 반환
			}
		}

		return -1; // 못찾음, 실패 반환
	}

//	고객배달(); // 고객 배달 // 최소금액확인 //민경승
	boolean deliver(int total) {
		if (total < MIN_ORDER_AMOUNT) // 최소 주문금액보다 적은 금액인지 확인
			return false; // 실패

		return true; // 성공
	}

//
//	 주문리스트조회(고객정보);
	PurchaseOrder[] getPurchaseOrder(String phoneNumber) {
		int idx = isExistCustomer(phoneNumber); // 존재하는 고객인지 확인
		if (idx == -1) // 존재하지 않음
			return null; // 실패

		int[] orderNumberArr = customerArr[idx].orderNumberArr; // 고객의 주문번호 배열 값

		if (orderNumberArr == null)
			return null;
		if (orderNumberArr.length == 0)
			return null;

		// 반환할 주문리스트 배열 생성
		PurchaseOrder[] resultPurchaseOrder = new PurchaseOrder[orderNumberArr.length];
		int count = 0; // 반환할 주문리스트 수

		// 주문리스트 조회
		for (int i = 0; i < orderNumberArr.length; i++) {
			for (int j = 0; j < purchaseOrderArr.length; j++) {
				if(purchaseOrderArr[j] == null)
					continue;
				if (purchaseOrderArr[j].orderNumber == orderNumberArr[i]) {
					resultPurchaseOrder[count++] = purchaseOrderArr[j];
					break;
				}
			}
		}
		if(count == 0)
			return null;
		
		// 주문리스트 배열 반환
		return resultPurchaseOrder;
	}
}
