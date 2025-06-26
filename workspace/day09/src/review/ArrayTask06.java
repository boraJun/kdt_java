package review;

public class ArrayTask06 {
	public static void main(String[] args) {
//      6. A ~ F까지 중 C만 제외하고 배열에 담아 출력

//      1) 문자형 5칸짜리 배열 선언
//      2) 정수형 임시변수 = 0
//      3) 반복문 (int i = 0 ; i < 배열명.length; i++)
//         A B C D E F
//         임시변수 = i;
//         조건문(if 임시변수 > 1) 
//            임시변수++
//         배열명[i] = (char)(임시변수 + 65);
//      4) 출력위한 반복문
		char[] arr = new char[5];
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			temp = i;
			if (temp > 1) {
				temp++;
			}
			arr[i] = (char) (temp + 65);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 방법2) index와 ch변수 이용
		char ch = 'A';
		int index = 0;
		while (index < 5) {
			if (ch != 'C') {
				arr[index++] = ch;
			}
			ch++;
//         System.out.println(arr);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
