package atm_전보라;

import java.util.Calendar;
import java.util.Date;

public class Withdraw implements ATM{
	@Override
	public boolean run(Account account, long money) {
		boolean result = account.setBalance(-money);
		if(result)
			account.addRecordList("[출금]금액 : " + money + "\t 잔액 : " + account.getBalance() + "\t" + Calendar.getInstance().getTime().toString());
		
		return result;
	}
}
