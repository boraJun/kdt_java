package setTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class LottoSet {
	public static void main(String[] args) {
//      Random r = new Random();
//      System.out.println(r.nextInt(10) + 1);
		printLotto(5);

	}

	static void printLotto(int num) {
		Random r = new Random();
		HashSet<Integer> lottoNum = new HashSet<>();
		ArrayList<Integer> result = null;
		
		for (int i = 0; i < num; i++) {
			while (lottoNum.size() < 7) {
				lottoNum.add(r.nextInt(45) + 1);
			}
		}
		
		result = new ArrayList<>(lottoNum);
		Collections.sort(result);
		System.out.println(result);
	}
}
