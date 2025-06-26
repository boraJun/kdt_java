package twoForTest;

public class Gugudan02 {
	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			System.out.print(i + "단\t\t");// 출력
		}
		System.out.println();
		for (int i = 1; i < 10; i++) { // i는 0부터 10보다 작을때까지 1씩 증가
			for (int j = 2; j < 10; j++) {// j는 2부터 10보다 작을때까지 1씩 증가
				System.out.print(j + " x " + i + " = " + (j * i) + "\t"); // 계산 출력
			}
			System.out.println(); // 줄바꿈
		}
	}
}
