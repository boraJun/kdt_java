package package06;

import java.util.Arrays;

public class Lotto {
	int[] numArr;
	int[] lottoNumArr;
	
	static int MAX_LENGTH_LOTTO = 45;
	static int LOTTO_NUM_LENGTH = 7;
	
	public Lotto() {
		lottoNumArr = new int[LOTTO_NUM_LENGTH];
		numArr = new int[MAX_LENGTH_LOTTO];
		
		initNumArr();
	}
	
	private void initNumArr() {
		for(int i =0; i< numArr.length; i++) {
			numArr[i] = i + 1;
		}
	}
	
	private void updateLottoNum() {
		initNumArr();
		
		for(int i = 0; i < 7; i++) {
			int idx = ((int)(Math.random() * 100)) % (numArr.length - i);
			
			lottoNumArr[i] = numArr[idx];
			
			for(int j = idx; j < numArr.length - i - 1; j++) {
				numArr[j] = numArr[j + 1];
			}
		}
	}
	
	private int getCorrectCount(int[] inputArr) {
		Arrays.sort(inputArr);
		int count = 0;
		
		for(int i = 0; i < (lottoNumArr.length - 1); i++) {
			for(int j = 0; j < inputArr.length; j++) {
				if(lottoNumArr[i] == inputArr[j]) {
					count++;
					break;
				}
			}
		}
		
		return count;
	}
	
	private boolean isCorrectBounus(int[] inputNum) {
		for(int i = 0; i < inputNum.length; i++){
			if(inputNum[i] == lottoNumArr[lottoNumArr.length - 1]) {
				return true;
			}
		}
		
		return false;
	}
	
	private int getRanking(int[] inputArr) {
		int count = getCorrectCount(inputArr);
		
		switch(count) {
		case 6:
			return 1;
		case 5:
			return isCorrectBounus(inputArr) ? 2 : 3;
		case 4:
			return 4;
		case 3:
			return 5;
		default:
			return -1;
		}
	}
	
	public void playLotto(int[] inputArr) {
		updateLottoNum();
		
		int ranking = getRanking(inputArr);
		
		printLottoNum();
		printRanking(ranking);
	}
	
	private void printRanking(int ranking) {
		System.out.println("당첨 순위 : " + ((ranking == -1) ? "미당첨" :  ranking));
	}
	
	private void printLottoNum() {
		System.out.println("당첨 번호 : " + Arrays.toString(lottoNumArr) + "(마지막 번호는 보너스번호)");
	}
}
