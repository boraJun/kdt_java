package ATM;

import java.util.HashMap;

public class CustomerManager {
	private HashMap<String, Customer> customerMap;
	
	public CustomerManager() {
		customerMap = new HashMap<String, Customer>();
	}
	
	public boolean isCorrectCustomer(String id, String pw) {
		if(customerMap.containsKey(id)) {
			return customerMap.get(id).isCorrectPw(pw);
		}
		
		return false;
	}
	
	public boolean isExistCustomer(String id) {
		return customerMap.containsKey(id);
	}
	
	public void addCustomer(String id, String pw) {
		customerMap.put(id, new Customer(id, pw));
	}
	
	public Customer getCustomerInfo(String id) {
		if(!customerMap.containsKey(id)) {
			return null;
		}
		
		return customerMap.get(id);
	}
}
