package atm_전보라;

import java.util.Calendar;

public class Deposit implements ATM{
	@Override
	public boolean run(Account account, long money) {
		boolean result = account.setBalance(money);
		
		if(result)
			account.addRecordList("[입금]금액 : " + money + "\t 잔액 : " + account.getBalance() + "\t" + Calendar.getInstance().getTime().toString());
		
		return result;
	}
}
