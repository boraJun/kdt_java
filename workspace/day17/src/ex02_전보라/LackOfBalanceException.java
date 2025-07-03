package ex02_전보라;

public class LackOfBalanceException extends Exception{
	public LackOfBalanceException() {
		super("출금 불가");
	}
}
