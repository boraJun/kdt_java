package package06;

import java.util.Arrays;
import java.util.Scanner;

public class LottoMain {
	//양의 정수만 가능
	static int parseInt(String inputStr) {
		if(inputStr == null )
			return -1;
		if(inputStr.length() == 0)
			return -1;
		
		for(int i = 0; i < inputStr.length(); i++) {
			if(inputStr.charAt(i) < '0'  || inputStr.charAt(i) > '9')
			{
				return -1;
			}
		}
		
		return Integer.parseInt(inputStr);
	}
	
	static boolean isExistNum(int[] arr, int input, int count) {
		for(int i = 0; i < count; i++) {
			if(arr[i] == input) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] inputNum = new int[6];
		int count = 0;
		
		while(count < 6) {
			System.out.print("숫자" + (count + 1) + " 입력 >> ");
			int input = parseInt(sc.nextLine());
			
			if(input != -1) {
				if(input >= 1 && input <= 45) {
					if(isExistNum(inputNum, input, count + 1)) {
						System.out.println("이미 존재하는 번호입니다.");
					}else {
						inputNum[count] = input;
						count++;
					}
				}
				else{
					System.out.println("1부터 45까지의 숫자 입력 필요");
				}
			}
			else {
				System.out.println("잘못된 입력");
			}
		}
		
		Arrays.sort(inputNum);
		System.out.println("입력 번호 : " + Arrays.toString(inputNum));
		
		Lotto lotto = new Lotto();		
		lotto.playLotto(inputNum);
		
		sc.close();
	}
}
