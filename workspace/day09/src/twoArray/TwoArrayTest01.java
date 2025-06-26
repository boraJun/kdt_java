package twoArray;

//3번 : 2차원 배열(행과 열로 구성된 데이터를 저장하는 배열의 형태)
public class TwoArrayTest01 {
	public static void main(String[] args) {
		// 2차원 배열 선언
		int[][] ar1 = new int[3][2];

		System.out.println(ar1);
		// [[I@1f32e575 : 2차원배열 전체의 참조값(JVM에 의해 제공)
		// [[0, 0], [0, 1]]
		// [[1, 0], [1, 1]]
		// [[2, 0], [2, 1]]

		System.out.println(ar1[0]);
		// [I@279f2327 : 0행의 참조값(1차원배열)
		// [0, 0], [0, 1]

		System.out.println(ar1[0][0]);
		// [0, 0] 1차원 배열의 첫번쨰 값(초기화된 기본값)

		// 2차원 배열 선언
		int[][] ar2 = { { 10, 20, 30 }, { 40, 50, 60 } };
//		System.out.println(ar2);
		System.out.println(ar2[0][0]);
		System.out.println(ar2[0][1]);
		System.out.println(ar2[0][2]);
		System.out.println(ar2[1][0]);
		System.out.println(ar2[1][1]);
		System.out.println(ar2[1][2]);

		System.out.println("2차원 배열(행) : " + ar2.length); // 행의 길이
		System.out.println("2차원 배열(열) : " + ar2[0].length); // 열의 길이

		for (int i = 0; i < ar2.length; i++) { // 행 반복
			System.out.println("ar2.length의 값(ar2의 행의 길이) : " + ar2.length);
			System.out.println("ar2의 각 행 : " + i + "의 주소값 : " + ar2[i]);
			for (int j = 0; j < ar2[i].length; j++) { // 열 반복
				System.out.println(i + "행 : " + ar2[i] + ", " + j + "열 : " + j + ", ar[i][j] 값 " + ar2[i][j]);
			}
		}

		int[] ar = new int[2];
		System.out.println(ar); // [I@119d7047

	}
}
