package atm_전보라;

import java.util.ArrayList;
import java.util.HashMap;

public class AccountManager {
	static long CURRENT_ACCOUNT_NUM = 0;
	private HashMap<Long, Account> accountMap;
	private ATM[] atm;

	enum AccountWork {
		WITHDRAW(0), DEPOSIT(1), TRANSFER(2);

		private AccountWork(int idx) {
			this.idx = idx;
		}

		int idx;
	}


	public AccountManager() {
		accountMap = new HashMap<Long, Account>();
		atm = new ATM[] { new Withdraw(), new Deposit() };
	}

	public long getTotalBalance(ArrayList<Long> accNumberList) {
		long total = 0;

		for (Long accNum : accNumberList) {
			if (accountMap.containsKey(accNum)) {
				total += accountMap.get(accNum).getBalance();
			}
		}

		return total;
	}

	public long addCount(String customerId) {
		CURRENT_ACCOUNT_NUM++;

		accountMap.put(CURRENT_ACCOUNT_NUM, new Account(CURRENT_ACCOUNT_NUM, customerId));
		return CURRENT_ACCOUNT_NUM;
	}

	public Account getAccount(long accNum) {
		if (accountMap.containsKey(accNum)) {
			return accountMap.get(accNum);
		}

		return null;
	}

	public boolean run(int select, Account acc, long money) {
		switch (select) {
		case 0:
			return atm[AccountWork.WITHDRAW.idx].run(acc, money);
		case 1:
			return atm[AccountWork.DEPOSIT.idx].run(acc, money);
		default:
			return false;
		}
	}

	public boolean transfer(Account fromAcc, Account toAcc, long money) {
		if (!run(AccountWork.WITHDRAW.idx, fromAcc, money))
			return false;
		fromAcc.addRecordList("[송금 정보]계좌 번호 : " + fromAcc.getAccountNumber() + " -> " +toAcc.getAccountNumber()+"");
		toAcc.addRecordList("[송금 정보]계좌 번호 : " + fromAcc.getAccountNumber() + " -> " +toAcc.getAccountNumber()+"");
		return run(AccountWork.DEPOSIT.idx, toAcc, money);
	}
}
