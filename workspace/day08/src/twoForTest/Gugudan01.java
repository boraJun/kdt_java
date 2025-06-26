package twoForTest;

public class Gugudan01 {
	public static void main(String[] args) {
		
		for(int i = 2; i < 10; i++) { //i는 2부터 10보다 작을때까지 1씩 증가
			System.out.println(i + "단"); // 출력
			
			for(int j = 1; j < 10; j++) { //j는 1부터 10보다 작을때까지 1씩 증가
				System.out.println(i + " x " + j + " = " + (i * j));  // 출력
			}
			
			System.out.println(); //줄바꿈
		}
	}
}
