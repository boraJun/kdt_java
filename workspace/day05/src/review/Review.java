package review;
//1번 : 복습
public class Review {
	public static void main(String[] args) {
		//printf() : 서식에 맞춰 출력하고 줄바꿈되지 않는 출력 메소드
		System.out.printf("'%s' '%d' '%f' '%s'\n", "hello", 2025, 6.17, true);
		System.out.printf("'%-7.2s' '%05d' '%10.2f' '%-5s'\n", "hello", 2025, 6.17, true);
		
		//변수
		byte num1 = 5;
		byte num2 = 127;
		
		System.out.println(num1);
		System.out.println(num2);
		
		int num3 = 128;
		byte num4 = (byte)num3;
		
		System.out.println(num4);
	}
}
