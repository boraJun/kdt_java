package twoForTest;

import java.util.Scanner;

public class TwoForTest02 {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) { //바깥 for문(2행)
			for(int j = 1; j <= i; j++) { //안쪽 for문(3열)
//				System.out.println("i = " + i +", j = " + j);
				System.out.print("*");
			}
			System.out.println();
		}
		
		//사용자로부터 행과 열을 입력받아 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("행과 열을 입력하세요 : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
//				System.out.println("i:" + i + ", j:" + j + ",");
				System.out.println("* ");
			}
			
			System.out.println();
		}
	}
}
