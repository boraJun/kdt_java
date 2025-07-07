package homework08;

public class Gugudan03 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) { // i는 0부터 3보다 작을때까지 1씩 증가
			
			for (int l = 1; l <= 3; l++) { // l는 1부터 3까지 1씩 증가
				System.out.print((i * 3 + l) + "단\t\t");// 출력
			}
			
			System.out.println();
			
			for (int j = 1; j <= 9; j++) {// j는 0부터 9까지 1씩 증가
				for (int k = 1; k <= 3; k++) {// k는 1부터 3까지 1씩 증가
					// 출력
					System.out.print((i * 3 + k) + " x " + j + " = " + (j * (i * 3 + k)) + "\t"); // 계산 출력
				}
				System.out.println(); // 줄바꿈
			}
			System.out.println(); // 줄바꿈
		}
	}
}
