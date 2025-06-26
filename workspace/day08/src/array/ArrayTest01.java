package array;
//3번 : 배열 선언 및 생성
public class ArrayTest01 {
	public static void main(String[] args) {
		//1) 어떤 값이 들어갈지모르나 몇 칸 만들지는 알 때
		//정수형 배열변수 number1 선언하고 크기 5칸인 배열 생성
		int[] number1 = new int[5];
		
		//2) 어떤 값이 들어갈지 알 떄
		//문자열 배열변수 alpha 선언하고 a, b, c 값으로 배열생성
		String[] alpha = {"a", "b", "c"};
		
		//3) 어떤 값이 들어갈지도 모르고 몇 칸 만들지도 모를 때
		//실수형 배열 number2
		double[] number2 = null;
		
		//4) 배열변수 선언 후 배열 생성과 초기화
		//정수형 배열 number3 선언
		//1, 2, 3, 4 값으로 초기화
		int[] number3;
		
		number3 = new int[]{1, 2, 3, 4};
		
		System.out.println(number1);
		System.out.println(alpha);
		System.out.println(number2);
		System.out.println(number3);
	}
}
