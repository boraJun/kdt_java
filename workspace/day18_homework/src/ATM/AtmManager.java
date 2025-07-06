package ATM;

import java.util.ArrayList;

public class AtmManager {
	public static AtmManager Inst;
	static CustomerManager customerManager;
	static AccountManager accountManager;
	
	public static void InitInst() {
		if(Inst == null)
			Inst = new AtmManager();
	}
	
	public AtmManager() {
		customerManager = new CustomerManager();
		accountManager = new AccountManager();
	}
	
	public Account getAccount(long accNum) {
		return accountManager.getAccount(accNum);
	}
	
	public boolean isCorrectCustomer(String id, String pw) {
		return customerManager.isCorrectCustomer(id, pw);
	}
	
	public boolean isExistCustomer(String id) {
		return customerManager.isExistCustomer(id);
	}
	
	public void addCustmer(String id, String pw) {
		customerManager.addCustomer(id, pw);
	}
	
	public Customer getCustomerInfo(String id) {
		return customerManager.getCustomerInfo(id);
	}
	
	public long getTotalBalance(ArrayList<Long> accNumList) {
		return accountManager.getTotalBalance(accNumList);
	}
	
	public long addAccount(String customerId) {
		long accNum = accountManager.addCount(customerId);
		getCustomerInfo(customerId).addAccount(accNum);
		
		return accNum;
	}
	
	public boolean deposit(Account acc, long money) {
		return accountManager.run(AccountManager.AccountWork.DEPOSIT.idx , acc, money);
	}
	
	public boolean withdraw(Account acc, long money) {
		return accountManager.run(AccountManager.AccountWork.WITHDRAW.idx , acc, money);
	}
	
	public boolean transfer( Account fromAcc, Account toAcc, long money) {
		return accountManager.transfer(fromAcc, toAcc, money);
	}
}
