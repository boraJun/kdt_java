package burger;

public class OrderManager {
//	매출, 주문서[], String 버거종류[], 최소금액, 고객[], int 현재주문갯수, 최대주문수, 한 주문서 당 최대 주문 개수
	int totalMoney; // 총 매출
	
	final int MAX_ORDER_COUNT; // 최대 주문 수
	
	final int MAX_BURGER; // 한 주문서 당 최대 버거 수
	int currentOrderCount; // 현재 누적 주문 수
	PurchaseOrder[] purchaseOrderArr; // 주문서 배열

	BurgerMenu[] burgerMenuArr; // 버거 종류 정보

	final int MIN_ORDER_AMOUNT; // 최소 배달 주문 금액

	int currentCustomerCount; // 현재 고객 수
	Customer[] customerArr; // 고객 정보 배열

	// 기본생성자 구현
	public OrderManager() {
		//상수 초기화
		MAX_ORDER_COUNT = 2;
		MIN_ORDER_AMOUNT = 12000;
		MAX_BURGER = 10;

		//인스턴스 변수 초기화
		currentOrderCount = 0;
		currentCustomerCount = 0;

		//배열 생성
		purchaseOrderArr = new PurchaseOrder[MAX_ORDER_COUNT];
		customerArr = new Customer[MAX_ORDER_COUNT];

		//버거 메뉴 종류 초기화
		burgerMenuArr = new BurgerMenu[] { 
				new BurgerMenu(BurgerMenu.currentBurgerId++, "새우버거", 7000, 7500),
				new BurgerMenu(BurgerMenu.currentBurgerId++, "불고기버거", 8500, 9000),
				new BurgerMenu(BurgerMenu.currentBurgerId++, "오징어버거", 7800, 8200),
				new BurgerMenu(BurgerMenu.currentBurgerId++, "소고기버거", 9000, 9500), };
	}

	// 버거 id를 통해 버거 메뉴 정보를 조회
	// 리턴타입 : 버거 메뉴 정보
	// 매개변수 : 버거 id
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

	// 버거 id 배열 반환
	// 리턴타입 : int[] 버거메뉴아이디배열
	// 매개변수 : x
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

	// 고객 조회 
	// 리턴타입 : int 고객의 배열 인덱스 값
	// 매개변수 : String 전화번호
	int isExistCustomer(String phoneNumber) {
		if (customerArr == null) // 생성자에서 배열 생성해주므로 우선 null 아닐 경우만 예외처리
		{
			// 배열 생성
			customerArr = new Customer[MAX_ORDER_COUNT];
			return -1; // 오류 값 반환
		}

		// 고객 배열만큼 반복
		for (int i = 0; i < customerArr.length; i++) {
			if(customerArr[i] == null) // 고객 정보가 비어있으면 
				continue; // 다음 고객 배열 값 조회
			if (customerArr[i].phoneNumber.equals(phoneNumber)) // 전화번호가 이미 등록되어 있으면
				return i; // 해당 고객의 배열 인덱스 값 반환
		}

		return -1; // 오류 값 반환 - 고객 정보 없음
	}

	// 고객 등록
	// 리턴타입 : boolean 추가성공여부 
	// 매개변수 : Customer 고객정보
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

	//주문 // 주문서 확인 // 황승우 //주문 가능한지 확인 갯수
	// 리턴타입 : boolean 주문가능한지
	// 매개변수 : x
	boolean canOrder() {
		if ((1 + currentOrderCount) > MAX_ORDER_COUNT) { // 주문 가능한지 여부 확인
			return false; // 하나 더 주문하면 최대 주문수 초과, 실패 반환
		}

		return true; // 주문 가능
	}

	// 판매 // 주문서추가 //이서진
	// 리턴타입 : boolean 판매성공여부
	// 매개변수 : String 고객구분값, Burger[] 구매하고자하는 버거 정보 배열
	boolean sell(String phoneNumber, Burger[] burgerList) {
		// 고객 정보 조회
		int customerIdx = isExistCustomer(phoneNumber);
		if (customerIdx == -1) { // 고객 정보 조회 불가 값
			System.out.println("고객정보 존재하지 않음"); // 정보 출력
			return false; // 고객정보 존재하지 않음 반환
		}

		// 주문서 생성
		PurchaseOrder newOne = new PurchaseOrder(phoneNumber, burgerList);
		totalMoney += newOne.total; // 총 매출액 변경
		
		System.out.println("총 매출 액 : " + totalMoney); // 총 매출액 출력(테스트용)
		
		this.purchaseOrderArr[currentOrderCount++]  = newOne; // 현재 주문 수 배열 위치에 주문서 인스턴스 대입
				
		this.customerArr[customerIdx].addOrder(newOne.orderNumber); // 조회한 고객 배열 인덱스 위치에 주문서 추가
		return true; // 주문 성공
	}

	
	// 환불 // 주문서 삭제 // 고객에 있는 주문아이디 삭제 //이남혁
	// 리턴타입 : boolean
	// 매개변수 : String 고객구분값, int 주문번호
	boolean refund(String phoneNumber, int orderNumber) {
		// 존재하는 넘버인지 확인
		// 리턴타입 : 0번 : 주문서배열의 인덱스, 1번 : 고객배열의 인덱스
		int[] arrIdx = canRefund(phoneNumber, orderNumber);

		if (arrIdx == null) // 존재하지 않는 주문번호
			return false; // 실패 반환
		
		totalMoney -= this.purchaseOrderArr[arrIdx[0]].total; //총 매출액 변경

		System.out.println("총 매출 액 : " + totalMoney); // 총 매출액 출력(테스트용)
		
		this.customerArr[arrIdx[1]].refundOrder(orderNumber); // 고객에게서 환불처리
		this.purchaseOrderArr[arrIdx[0]] = null; // 안비우고 뒤에 배열 인덱스 앞으로 넣어줘도됨

		return true; // 성공 반환
	}

	// 환불 가능한지 여부 반환
	// 리턴타입 : int 0번 : 주문서배열의 인덱스, 1번 : 고객배열의 인덱스
	// 매개변수 : String 고객구분값, int 주문번호
	int[] canRefund(String phoneNumber, int orderNumber) {
		int purchaseOrderIdx = isExistOrderNumber(orderNumber); // 주문서배열에서 존재하는 주문번호인지 확인
		int customerIdx = isExistOrderNumber(phoneNumber, orderNumber); // 고객에게서 존재하는 주문번호인지 확인

		if (purchaseOrderIdx == -1 || customerIdx == -1) // 존재하지 않는 주문번호
			return null; // 환불 불가

		return new int[] { purchaseOrderIdx, customerIdx }; // 주문서 배열 인덱스와 고객 배열 인덱스 반환
	}

	// 주문 번호 조회
	// 리턴타입 : int 고객배열인덱스값
	// 매개변수 : String 고객구분값, int 주문번호ing 
	int isExistOrderNumber(String phoneNumber, int orderNumber) // 고객에게 주문번호 있는지 확인
	{
		int customerIdx = isExistCustomer(phoneNumber); // 존재하는 고객인지 확인

		if (customerIdx == -1) // 존재하지 않음
			return -1; // 실패 값 반환

		// 검색 성공한 고객에게서 존재하는 주문 번호인지 확인 후 존재하면 고객 배열 인덱스 반환
		return customerArr[customerIdx].isExistOrderNumber(orderNumber) == -1 ? -1 : customerIdx;
	}

	// 주문 번호 조회
	// 리턴타입 : int 주문서 배열 인덱스 값
	// 매개변수 : int 주문번호
	int isExistOrderNumber(int orderNumber) { // 관리 시스템에 주문번호 있는지 확인
		if (purchaseOrderArr == null) // 주문서 배열 비어있을 경우
			return -1; // 실패 반환
		if (purchaseOrderArr.length == 0) // 주문서 배열 비어있을 경우
			return -1;// 실패 반환

		// 주문서 조회
		for (int i = 0; i < purchaseOrderArr.length; i++) {
			if(purchaseOrderArr[i] == null) // 주문서 정보가 비어있을 경우
				continue; // 다음으로 넘어가기
			
			// 매개변수 값과 일치하는 주문번호 있을 경우
			if (purchaseOrderArr[i].orderNumber == orderNumber) {
				return i; // 주문서 배열 인덱스 반환
			}
		}

		return -1; // 못찾음, 실패 반환
	}

	//고객배달(); // 고객 배달 // 최소금액확인 //민경승
	// 리턴타입 : boolean 배달 가능 여부
	// 매개변수 : int 총구매액
	boolean deliver(int total) {
		if (total < MIN_ORDER_AMOUNT) // 최소 주문금액보다 적은 금액인지 확인
			return false; // 실패

		return true; // 성공
	}

	// 주문리스트조회(고객정보)
	// 리턴타입 : PurchaseOrder[] 주문서 배열 반환
	// 매개변수 : String 고객구분값
	PurchaseOrder[] getPurchaseOrder(String phoneNumber) {
		int idx = isExistCustomer(phoneNumber); // 존재하는 고객인지 확인
		if (idx == -1) // 존재하지 않음
			return null; // 실패

		int[] orderNumberArr = customerArr[idx].orderNumberArr; // 고객의 주문번호 배열 값

		if (orderNumberArr == null) // 고객 정보 비어있음
			return null; // 실패 반환
		if (orderNumberArr.length == 0) // 고객 정보 비어있음
			return null; // 실패 반환

		// 반환할 주문리스트 배열 생성
		PurchaseOrder[] resultPurchaseOrder = new PurchaseOrder[orderNumberArr.length];
		int count = 0; // 반환할 주문리스트 수

		// 주문리스트 조회 //고객이 가지고 있던 주문번호 배열을 이용하여 주문서 배열 조회
		for (int i = 0; i < orderNumberArr.length; i++) {
			for (int j = 0; j < purchaseOrderArr.length; j++) {
				if(purchaseOrderArr[j] == null) // 비어있는 주문서
					continue; // 다음 purchaseOrderArr로 이동
				if (purchaseOrderArr[j].orderNumber == orderNumberArr[i]) { // 주문서 번호 일치
					resultPurchaseOrder[count++] = purchaseOrderArr[j]; // 주문서 정보 대입
					break; // 다음 orderNumberArr서로 이동
				}
			}
		}
		if(count == 0) // 반환할 주문리스트 수가 0
			return null; // 실패 반환
		
		// 조회한 주문리스트 배열 반환
		return resultPurchaseOrder;
	}
}
