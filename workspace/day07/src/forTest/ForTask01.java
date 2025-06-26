package forTest;

//6번 : for문 연습
public class ForTask01 {
	public static void main(String[] args) {
		// for문만 사용

		// 1. 100부터 1까지 출력 (tab키로 띄어쓰기)
		System.out.println("=====문제 1=====");
		for (int i = 0; i < 100; i++) {
			System.out.print(i + 1 + "\t");
		}

		// 2. 구구단 3단만 출력
		System.out.println("\n\n=====문제 2=====");
		for (int i = 1; i <= 9; i++) {
			System.out.println("3 * " + i + "= " + (i * 3));
		}

		// 3. A ~ F 출력(초기식 char i = 'A')
		System.out.println("\n\n=====문제 3=====");

		char interval = 'B' - 'A';
		for (char i = 'A'; i <= 'F'; i += interval) {
			System.out.print(i + "\t");
		}

		// 4. A ~ F 출력(초기식 int i = 0)
		System.out.println("\n\n=====문제 4=====");
		char a = 'A';
		for (int i = 0; i <= 5; i++) {
			System.out.print((char) (a + interval * i) + "\t");
		}

		// 5. aBcDeFgHiJkLmNoPqRsTuVwXyZ
		char intervalBig = 'a' - 'A';
		interval = 'b' - 'a';
		int index = 0;

		System.out.println("\n\n=====문제 5=====");
		for (char ch = 'a'; ch <= 'z'; ch += interval, index++) {
			if (index % 2 == 0)
				System.out.print(ch);
			else
				System.out.print((char) (ch - intervalBig));
		}

		System.out.println();

		for (int i = 0; i < 26; i++) {
			if (i % 2 == 0) {
				System.out.print((char) (i + 97));
			} else {
				System.out.print((char) (i + 65));
			}
		}

		System.out.println();
		for (int i = 0; i < 26; i++) {
			System.out.print((char) (i % 2 == 0 ? i + 97 : i + 65));
		}

		int count = 'z' - 'a' + 1;

		for (int i = 0; i < count; i++) {
			System.out.print((char) (i % 2 == 0 ? i + 'a' : i + 'A'));
		}

		// 첫번째 반복문
		// 초기식 i가 0, 조건식 0 < 26 true, 중괄호 영역 (char)(97) => a, 증감식 i++ => i = 0 + 1
		// 현재 i의 값 1
		// 조건식 1 < 26 true, 중괄호영역 (char)(1 + 65) => (char)66 => B, 증감식 i++ => i = 1 + 1
		System.out.println("\n" + 0 % 2);
	}
}
