package staticTest;
//8번 : 정적메소드
public class MathUtils {
	//메소드
	//두 수를 비교해서 큰 수를 반환하는 메소드
	static int getMax(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}
	
	//
	static double round(double num) {
		return Math.round(num);
		//Math 클래스 : 수학과 관련된 멤버들이 있는 클래스
		//round() : 소수점 값을 가장 가까운 정수로 반올림하여 반환하는 메소드
	}
}
