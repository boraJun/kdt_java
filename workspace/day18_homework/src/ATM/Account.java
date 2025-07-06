package ATM;
import java.util.ArrayList;

public class Account {
	private long accountNumber;
	private String customerId;
//	private String pw;
	
	private ArrayList<String> recordList;
	
	private long balance;
	
	
	public Account(long accountNumber, String customerId) {
		this.accountNumber = accountNumber;
		this.customerId = customerId;
		
		this.recordList = new ArrayList<String>();
		balance = 0;
	}
	
	public void addRecordList(String str) {
		recordList.add(str);
	}
	
	public ArrayList<String> getRecordList() {
		return recordList;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public boolean setBalance(long money) {
		if(balance + money < 0) {
			return false;
		}
		
		balance += money;
		
		return true;
	}
}
