package package06;

import java.util.Arrays;
import java.util.Scanner;

class Lotto {
	private int[] numArr;
	private int[][] lottoNumArr;
	private int[] bonusNum;
	
	private int[] winningCount;

	private static int MAX_LENGTH_LOTTO = 45;
	private static int LOTTO_NUM_LENGTH = 6;
	private static int LOTTO_COUNT;

	public Lotto(int lottoCount) {
		LOTTO_COUNT = lottoCount;

		lottoNumArr = new int[LOTTO_COUNT][LOTTO_NUM_LENGTH];
		numArr = new int[MAX_LENGTH_LOTTO];
		bonusNum = new int[LOTTO_COUNT];
		
		winningCount = new int[6];

		initNumArr();
	}

	private void initNumArr() {
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
		}
	}

	private void initWinningCount() {
		for(int i = 0; i < winningCount.length; i++) {
			winningCount[i] = 0;
		}
	}
	
	private void updateLottoNum() {
		for (int j = 0; j < LOTTO_COUNT; j++) {
			initNumArr();

			for (int i = 0; i < LOTTO_NUM_LENGTH + 1; i++) {
				int idx = ((int) (Math.random() * 100)) % (numArr.length - i);

				if (i == LOTTO_NUM_LENGTH) {
					bonusNum[j] = numArr[idx];

				} else {
					lottoNumArr[j][i] = numArr[idx];
				}

				for (int k = idx; k < numArr.length - i - 1; k++) {
					numArr[k] = numArr[k + 1];
				}
			}

			Arrays.sort(lottoNumArr[j]);
		}
	}

	private int getCorrectCount(int lottoIdx, int[] inputArr) {
		Arrays.sort(inputArr);
		int count = 0;

		for (int i = 0; i < lottoNumArr[lottoIdx].length; i++) {
			for (int j = 0; j < inputArr.length; j++) {
				if (lottoNumArr[lottoIdx][i] == inputArr[j]) {
					count++;
					break;
				}
			}
		}

		return count;
	}

	private boolean isCorrectBounus(int lottoIdx, int[] inputNum) {
		for (int i = 0; i < inputNum.length; i++) {
			if (inputNum[i] == bonusNum[lottoIdx]) {
				return true;
			}
		}

		return false;
	}

	private int getRanking(int lottoIdx, int[] inputArr) {
		int count = getCorrectCount(lottoIdx, inputArr);

		switch (count) {
		case 6:
			return 1;
		case 5:
			return isCorrectBounus(lottoIdx, inputArr) ? 2 : 3;
		case 4:
			return 4;
		case 3:
			return 5;
		default:
			return 0;
		}
	}

	public void playLotto(int[] inputArr) {
		updateLottoNum();
		initWinningCount();

		for (int i = 0; i < LOTTO_COUNT; i++) {
			int ranking = getRanking(i, inputArr);
			winningCount[ranking] = winningCount[ranking] + 1;
			
			System.out.println((i + 1) + "회차");
			printLottoNum(i);
			printRanking(ranking);

			System.out.println();
		}
		
		printResult();
	}
	
	private void printResult() {		
		for(int i = 1; i < winningCount.length; i++) {
			System.out.print( i + "등 : " +winningCount[i]+ "회 ");
		}

		System.out.println("미당첨 : " + winningCount[0]);
	}

	private void printRanking(int ranking) {
		System.out.println("당첨 순위 : " + ((ranking == 0) ? "미당첨" : ranking));
	}

	private void printLottoNum(int lottoIdx) {
		System.out.println("당첨 번호 : " + Arrays.toString(lottoNumArr[lottoIdx]) + " 보너스번호 : " + bonusNum[lottoIdx]);
	}
}

public class LottoMain {
	// 양의 정수만 가능
	static int parseInt(String inputStr) {
		if (inputStr == null)
			return -1;
		if (inputStr.length() == 0)
			return -1;

		for (int i = 0; i < inputStr.length(); i++) {
			if (inputStr.charAt(i) < '0' || inputStr.charAt(i) > '9') {
				return -1;
			}
		}

		return Integer.parseInt(inputStr);
	}

	static boolean isExistNum(int[] arr, int input, int count) {
		for (int i = 0; i < count; i++) {
			if (arr[i] == input) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println("Section06.예제6-16) 2차원 배열을 활용한 로또\n");

		Scanner sc = new Scanner(System.in);
		int lottoCount = 0;
		do {
			System.out.print("로또 회수 입력 >> ");
			lottoCount = parseInt(sc.nextLine());
		} while(lottoCount == -1);
			
		int[] inputNum = new int[6];
		int count = 0;
		
		System.out.println("\n[번호 입력]");

		while (count < 6) {
			System.out.print("숫자" + (count + 1) + " 입력 >> ");
			int input = parseInt(sc.nextLine());

			if (input != -1) {
				if (input >= 1 && input <= 45) {
					if (isExistNum(inputNum, input, count + 1)) {
						System.out.println("이미 존재하는 번호입니다.");
					} else {
						inputNum[count] = input;
						count++;
					}
				} else {
					System.out.println("1부터 45까지의 숫자 입력 필요");
				}
			} else {
				System.out.println("잘못된 입력");
			}
		}

		Arrays.sort(inputNum);
		System.out.println("입력 번호 : " + Arrays.toString(inputNum) + "\n");

		Lotto lotto = new Lotto(lottoCount);
		lotto.playLotto(inputNum);

		sc.close();
	}
}
