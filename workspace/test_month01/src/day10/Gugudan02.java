package day10;

public class Gugudan02 {
//	2) 단별로 가로로 출력하기 Gugudan02
//2단      3단      4단      5단      6단      7단      8단      9단
//2 x 1 = 2   3 x 1 = 3   4 x 1 = 4   5 x 1 = 5   6 x 1 = 6   7 x 1 = 7   8 x 1 = 8   9 x 1 = 9
//2 x 2 = 4   3 x 2 = 6   4 x 2 = 8   5 x 2 = 10   6 x 2 = 12   7 x 2 = 14   8 x 2 = 16   9 x 2 = 18
//...
//2 x 9 = 18   3 x 9 = 27   4 x 9 = 36   5 x 9 = 45   6 x 9 = 54   7 x 9 = 63   8 x 9 = 72   9 x 9 = 81

	public static void main(String[] args) {
		for(int i = 0; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print( (i == 0? j + "단\t\t" : j + " x " + i + " = " + (i * j) + "\t"));
			}
			
			System.out.println();
		}
	}
}
