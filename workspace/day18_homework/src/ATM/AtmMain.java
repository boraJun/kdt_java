package ATM;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AtmMain {
	enum PrintMenu {
		SELECT(0), CUSTOMER(1), ACCOUNT(2), LOGIN(3);

		private PrintMenu(int idx) {
			this.idx = idx;
		}

		private int idx;
	}

	static String[] printMenuArr = {
			"----------------\n" + "1. 고객 정보 관련\n" + "2. 계좌 관련\n" + "3. 로그아웃\n" + "----------------",

			"----------------\n" + "[고객 정보]\n" + "1. 조회\n" + "2. 수정\n" + "3. 이전 메뉴\n" + "----------------",

			"----------------\n" + "[계좌]\n" + "1. 잔액조회\n" + "2. 이력조회\n" + "3. 입금\n" + "4. 출금\n" + "5. 송금\n"
					+ "6. 초기 메뉴\n" + "----------------",

			"----------------\n" + "1. 로그인\n" + "2. 회원가입\n" + "3. 종료\n"+ "----------------" };

	static int tryParseInt(String str) {
		int result = -1;

		try {
			result = Integer.parseInt(str);
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
		}

		return result;
	}

	static long tryParseLong(String str) {
		long result = -1;

		try {
			result = Long.parseLong(str);
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
		}

		return result;
	}

	static void initPrintList(PrintMenu menu) {
		System.out.println(printMenuArr[menu.idx]);
	}

	static String printLogin() {
		String id = null;

		do {
			initPrintList(PrintMenu.LOGIN);
			System.out.print(">> ");
			int choice = tryParseInt(sc.nextLine());

			if (choice == -1)
				continue;

			if (choice == 1) {
				id = login();
			} else if (choice == 2) {
				id = addCustomer();
			} else if(choice == 3){
				return null;
			} else{
				System.out.println("올바른 번호를 입력하세요");
			}
		} while (id == null);

		return id;
	}

	static String addCustomer() {
		String id = null, pw = null;

		do {
			System.out.println("[회원가입] 취소 시 id 입력 : !");

			System.out.print("id : ");
			id = sc.nextLine();
			
			if(id.equals("!"))
			{
				return null;
			}
			
			if (atm.isExistCustomer(id)) {
				System.out.println("이미 존재하는 id 입니다");
				id = null;
				continue;
			}

			System.out.print("pw : ");
			pw = sc.nextLine();

		} while (id == null);

		atm.addCustmer(id, pw);
		System.out.println("회원가입 성공\n로그인 완료\n\n");

		return id;
	}

	static String login() {
		String id = null, pw = null;

		do {
			System.out.println("[로그인] 취소 시 id 입력 : !");

			System.out.print("id : ");
			id = sc.nextLine();

			if (id.equals("!")) {
				id = null;
				break;
			}

			System.out.print("pw : ");
			pw = sc.nextLine();

			if (!atm.isCorrectCustomer(id, pw)) {
				System.out.println("잘못된 id 또는 pw 입력\n");
				id = null;
			} else {
				System.out.println("로그인 완료\n\n");
			}
		} while (id == null);

		return id;
	}

	static int selectMenu() {
		int choice = -1;

		do {
			initPrintList(PrintMenu.SELECT);
			System.out.print(">> ");
			choice = tryParseInt(sc.nextLine());
		} while (choice == -1);

		return choice;
	}

	static void showCustomerInfo(String customerId) throws IOException {
		Customer customer = atm.getCustomerInfo(customerId);
		ArrayList<Long> accNumList = customer.GetAcountNumberList();
		long total = atm.getTotalBalance(accNumList);

		System.out.println("고객 id : " + customer.getId());
		System.out.println("총 자산 : " + total);

		System.out.println("[ 계좌 리스트 ]");

		if (!accNumList.isEmpty()) {
			for (Long accNum : accNumList) {
				System.out.println(accNum);
			}
		} else {
			System.out.println("계좌 정보가 존재하지 않습니다");
		}

		System.out.println("");
		System.out.println("이전 메뉴 : 엔터");

		sc.nextLine();
	}

	static void updateCustomerInfo(String id) {
		System.out.println("----비밀번호 변경(취소 시 ! 입력)----");
		Customer customer = atm.getCustomerInfo(id);

		while (true) {
			System.out.print("새로운 비밀번호 : ");

			String newPw = sc.nextLine();

			if (newPw.equals("!")) {
				return;
			}

			if (customer.isCorrectPw(newPw)) {
				System.out.println("기존과 동일한 비밀번호입니다. 다른 비밀번호로 설정하세요");
			} else {
				customer.setPassword(newPw);
				return;
			}
		}
	}

	static void customer(String customerId) {
		int choice = -1;
		boolean flag = true;

		do {
			initPrintList(PrintMenu.CUSTOMER);
			System.out.print(">> ");
			choice = tryParseInt(sc.nextLine());

			switch (choice) {
			case 1:
				try {
					showCustomerInfo(customerId);
				} catch (IOException e) {

				}
				break;
			case 2:
				updateCustomerInfo(customerId);
				break;
			case 3:
				flag = false;
				System.out.println();
				break;
			default:
				System.out.println("잘못된 숫자 입력\n");
			}

		} while (flag);
	}
	
	static long addAccount(String id) {
		long accNum = atm.addAccount(id);
		System.out.println("생성된 계좌 번호 : " + accNum);
		
		return accNum;
	}
	
	static long selectAccountInfo(String id)
	{
		int choice = -1;
		
		while(true) {
			System.out.println("----------------\n" + "1. 계좌 생성\n" + "2. 계좌 선택\n" + "3. 이전 메뉴\n" + "----------------\n");
			System.out.print(">> ");
			choice = tryParseInt(sc.nextLine());
			
			if(choice == 1) {
				return addAccount(id);
			}else if(choice == 2) {
				return showAccountList(id);
			}else if(choice == 3){
				return -1L;
			}else {
				System.out.println("잘못된 숫자 입력");
			}
		}
	}
	
	static long showAccountList(String id) {
		Customer customer = atm.getCustomerInfo(id);
		ArrayList<Long> accNumList = customer.GetAcountNumberList();
		System.out.println("[ 계좌 선택 ]");

		if (!accNumList.isEmpty()) {
			for (Long accNum : accNumList) {
				System.out.println(accNum);
			}
		} else {
			System.out.println("계좌 정보가 존재하지 않습니다");
		}

		String input = "";
		long inputLong = -1;
		long accNum = -1;
		do {
			System.out.print("계좌 번호 입력(취소:!) >>");

			input = sc.nextLine();
			if (input.equals("!"))
				break;

			inputLong = tryParseLong(input);
			if (inputLong == -1) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}

			if (accNumList.contains(inputLong)) {
				accNum = inputLong;
				break;
			} else {
				System.out.println("존재하지 않는 계좌번호입니다. 다시 입력해주세요.");
			}

		} while (true);

		return accNum;
	}

	static void printRecordList(ArrayList<String> recordList) {
		if(recordList.isEmpty()) {
			System.out.println("이력이 존재하지 않습니다");
			return;
		}
		
		System.out.println("----이력----");
		
		for(String rec : recordList) {
			System.out.println(rec);
		}
		
		System.out.println("-----------\n");
	}
	
	static void deposit(Account acc) {
		long money = 0;
		String input = "";
		
		while(true) {
			System.out.print("입금할 금액 >> ");
			
			input = sc.nextLine();
			money = tryParseLong(input);
			
			if(money < 0) {
				System.out.println("잘못된 입력");
			}else
				break;
		}
		
		atm.deposit(acc, money);
		System.out.println("현재 잔액 : " + acc.getBalance());
	}
	
	static void withdraw(Account acc) {
		long money = 0;
		String input = "";
		
		while(true) {
			System.out.print("출금할 금액 >> ");
			
			input = sc.nextLine();
			money = tryParseLong(input);
			
			if(money < 0) {
				System.out.println("잘못된 입력");
			}else
				break;
		}
		
		if(!atm.withdraw(acc, money)) {
			System.out.println("출금 실패");
		}
		
		System.out.println("현재 잔액 : " + acc.getBalance());
	}
	
	static void transfer(Account acc) {
		long money = 0;
		Account toAcc = null;
		String input = "";
		long accNum = -1;
		
		while(true) {
			System.out.print("송금할 상대 계좌 번호(취소 : !) : ");
			input = sc.nextLine();
			
			if(input.equals("!"))
				return;
			
			accNum = tryParseLong(input);
			if(accNum == -1) {
				System.out.println("잘못된 입력");
			} else if(accNum == acc.getAccountNumber()){
				System.out.println("현재 계좌 번호와 동일한 입력");
			}else {
				toAcc = atm.getAccount(accNum);
			}
			
			if(toAcc != null)
				break;
			else
				System.out.println("존재하지 않는 계좌입니다.");
		}
		
		while(true) {
			System.out.print("송금할 금액 >> ");
			
			input = sc.nextLine();
			money = tryParseLong(input);
			
			if(money < 0) {
				System.out.println("잘못된 입력");
			}else
				break;
		}
		
		if(!atm.transfer(acc, toAcc, money)) {
			System.out.println("송금 실패");
		}
		System.out.println("현재 잔액 : " + acc.getBalance());
	}
	
	static void account(long accNum) {
		int choice = -1;
		boolean flag = true;

		Account acc = atm.getAccount(accNum);
		
		if(acc == null){
			System.out.println("존재하지 않는 계좌");
			return;
		}
		
		// 돈은 0보다 큰숫자 입력하도록
		do {
			initPrintList(PrintMenu.ACCOUNT);
			System.out.println("계좌 번호 : " + accNum);
			
			System.out.print(">> ");
			choice = tryParseInt(sc.nextLine());

			switch (choice) {
			case 1:
				System.out.println("잔액 : " + acc.getBalance()); 
				break;
			case 2:
				printRecordList(acc.getRecordList());
				break;
			case 3:
				deposit(acc);
				break;
			case 4:
				withdraw(acc);
				break;
			case 5:
				transfer(acc);
				break;
			case 6:
				flag = false;
				System.out.println();
				break;
			default:

			}
		} while (flag);
	}

	static Scanner sc;
	static AtmManager atm;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int choice = -1;

		AtmManager.InitInst();
		atm = AtmManager.Inst;

		while (true) {
			String id = printLogin();
			if(id == null)
				break;
			
			long accNum = -1;

			while (true) {
				choice = selectMenu();
				
				if (choice == PrintMenu.CUSTOMER.idx) {
					customer(id);
				} else if (choice == PrintMenu.ACCOUNT.idx) {
					accNum = selectAccountInfo(id);

					if (accNum == -1L) {
						continue;
					}
					else {
						account(accNum);
					}
				} else if(choice == 3) {
					break;
				}else {
					System.out.println("잘못된 입력\n");
				}
			}
		}

		sc.close();
	}
}
