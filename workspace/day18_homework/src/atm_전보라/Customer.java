package atm_전보라;

import java.util.ArrayList;

public class Customer {
	private String id;
	private String pw;
	
	private ArrayList<Long> accountNumberList;

	public Customer(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
		this.accountNumberList = new ArrayList<Long>();
	}
	
	public ArrayList<Long> GetAcountNumberList(){
		return accountNumberList;
	}
	
	public String getId() {
		return id;
	}
	
	public void addAccount(long accoutNumber) {
		accountNumberList.add(accoutNumber);
	}
	
	public boolean isCorrectPw(String pw) {
		return this.pw.equals(pw);
	}
	
	public void setPassword(String pw) {
		this.pw = pw;
	}
}
