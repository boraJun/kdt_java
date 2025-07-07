package homework08;

public class Gugudan04 {
	public static void main(String[] args) {
		//변수 선언 및 초기화
		int i = 1;
		
		//변수 선언 및 초기화
		int x = 0;
		int y = 0;
		
		//방법 1
		System.out.println("==================방법 1=================="); //출력
		while(i <= 89) { //i 값이 89이하일 경우 반복
			x = (i % 9) + 1; //i를 9로 나눈 나머지에 1을 더한 값을 x 변수에 대입
			y = (i / 9); //i를 9로 나눈 몫을 y 변수에 대입
					
			//출력
			System.out.print(y == 0? x + "단\t\t" : x >= 2 ? (x  +" x " + y + " = " + (x * y)  +"\t") : "\n");
			i++; //i값 1 증가
		}

		System.out.print("\n\n"); //줄바꿈
		
		//방법 2
		System.out.println("==================방법 2=================="); //출력
		i = 2; //변수 값 초기화

		while (i <= 9) { //i 값이 9이하일 경우 반복
			System.out.print(i++ + "단\t\t");// 출력
		}
		
		System.out.println(); //줄바꿈
		
		i = 1; //변수 값 초기화
		while (i < 10) { // i는 0부터 10보다 작을때까지 1씩 증가
			int j = 2;
			while ( j < 10) {// j는 2부터 10보다 작을때까지 1씩 증가
				System.out.print(j + " x " + i + " = " + (j * i) + "\t"); // 계산 출력
				j++; //j 값 1 증가
			}
			
			System.out.println(); // 줄바꿈
			i++; //i 값 1 증가
		}		
	}
}
