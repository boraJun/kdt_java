package twoArray;

//5번 : 2차원 배열 연습
public class TwoArrayTest03 {
	public static void main(String[] args) {
		//1 2 3 4
		//5 6 7 8
		//9 10 11 112
		
		//1. 배열명 ar1 값놓고 출력
		
		int[][] ar1 = {	{1, 2, 3, 4},
						{5, 6, 7, 8},
						{9, 10, 11, 12}};
		
		//행의길이 : ar1.length
		//열의길이 : ar1[i].length
		
		for(int i = 0; i < ar1.length; i++) {
			for(int j = 0; j < ar1[i].length; j++) {
				System.out.print(ar1[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		
		//2. 배열명 ar2 칸수만 선언 후 값 대입 후 출력
		int[][] ar2 = new int[3][4];
		//ar2 크기만 지정된 2차원 배열 3개와 행과 4개의 열
		//이중 for문을 이용하여 1부터 값 대입
		int value = 1;
		
		for(int i = 0; i < ar2.length; i++) {
			for(int j = 0; j < ar2[i].length; j++)
			{
				//System.out.println("i : " + i + ", j : " + j);
				ar2[i][j] = value++;
				System.out.print(ar1[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
