package homework;

import java.util.Arrays;

public class Section06_Practice04 {

	static void printMagicSquare(int rowCount, int colCount, int[][] magicSquare) {
		System.out.print("행열\t");

		for (int i = 0; i < colCount; i++) {
			System.out.print(i + "\t");
		}

		System.out.println("합");

		int[] sumCol = new int[colCount];
		int diagonal1 = 0, diagonal2 = 0;

		for (int i = 0; i < magicSquare.length; i++) {
			int sumRow = 0;
			for (int j = -1; j < magicSquare[i].length + 1; j++) {
				if (j == -1)
					System.out.print(i + "\t");
				else if (j == magicSquare[i].length) {
					System.out.print(sumRow);
				} else {
					sumRow += magicSquare[i][j];
					sumCol[j] += magicSquare[i][j];
					System.out.print(magicSquare[i][j] + "\t");
				}

				if (i == j)
					diagonal1 += magicSquare[i][j];
				if ((i + j) == 4)
					diagonal2 += magicSquare[i][j];
			}

			System.out.println();
		}

		System.out.print("합 " + diagonal1);
		
		for (int i = 0; i < colCount; i++) {
			System.out.print("\t" + sumCol[i]);
		}

		System.out.print("\t" + diagonal2);
	}

	static int[][] initMagicSquare(int rowCount, int colCount) {
		int[][] magicSquare = new int[rowCount][colCount];

		int rowIdx = 0, colIdx = 2;
		int previousRow = rowIdx, previousCol = colIdx;

		// 오른쪽위 없으면 아래
		for (int i = 0; i < rowCount * colCount; i++) {

			if (magicSquare[rowIdx][colIdx] == 0) {
				magicSquare[rowIdx][colIdx] = i + 1;

				previousRow = rowIdx;
				previousCol = colIdx;
			} else {
				rowIdx = (previousRow + 1) % rowCount;
				colIdx = previousCol;

				magicSquare[rowIdx][colIdx] = i + 1;

				previousRow = rowIdx;
				previousCol = colIdx;
			}
			rowIdx = ((rowIdx - 1 < 0) ? rowCount - 1 : rowIdx - 1);
			colIdx = (colIdx + 1) % colCount;
		}
		
		return magicSquare;
	}
	
	public static void main(String[] args) {
//		4. 마방진 규칙 찾아서 코드 작성
//		   2차원 배열
		int rowCount = 5, colCount = 5;

		System.out.println("Section06.응용문제4) 마방진 \n");
		
		printMagicSquare(rowCount, colCount, initMagicSquare(rowCount, colCount));
	}
}
