package wrapperTest;

//5번 : wrapper 클래스(boxing과 unboxing)
public class WrapperTest01 {
	public static void main(String[] args) {
		// boxing : 기본자료형 -> wrapper 클래스
		int num1 = 10;
		System.out.println(num1);
		// 예전방법
//		Interger number = new Integer(num1);
		// 최근방법
		Integer number = Integer.valueOf(num1);
		System.out.println(number.toString());
		System.out.println(number.intValue());

		// unboxing : wrapper 클래스 -> 기본 자료형
		int unNum1 = number.intValue();
		System.out.println(unNum1);

		// AutoBoxing
		double num2 = 1.1; // 기본자료형
		Double dNum = num2; // boxing

		System.out.println(dNum);
		System.out.println(num2);

		// AutoUnBoxing
		double unNum2 = dNum; //unboxing
		System.out.println(unNum2);
	}
}
