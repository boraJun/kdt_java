package apiTest2;
/**
 * @author 전보라
 * @since jdk17
 * <br>
 */
public class Calc {
	
	/**
	 * 
	 * @param num1 : 나눠지는 정수
	 * @param num2 : 나누는 정수
	 * @return 나눗셈 결과 정수(몫)
	 * @throws ArithmeticException
	 * @see		보통 부모 클래스를 사용한다
	 * @see		Math
	 * <br>
	 * <p>두 정수를 나눗셈 후 몫을 반환한다</p>
	 */
	
	public int divide(int num1, int num2) throws ArithmeticException{
		return num1 / num2;
	}
}
