package homework07;

import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1 ~ 5번 클래스명 : Review01
//		1. 한 개의 정수를 입력받아 짝수인지 홀수인지 출력하기(삼항 연산자 이용)
		System.out.println("==============문제 1=============="); //출력
		
		System.out.print("숫자 입력 : "); //입력 문구 출력
		
		int number = sc.nextInt(); //변수 선언 및 입력받은 정수 값 대입
		sc.nextLine(); //버퍼 소모
		
		//삼항 연산자를 사용하여 짝수 여부 확인 결과 출력
		System.out.println(number % 2 == 0? number + "는 짝수입니다" : number + "는 홀수입니다" ); 
		
//		2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기(조건문)
		System.out.println("\n\n==============문제 2=============="); //출력
		
		System.out.print("숫자 입력 : "); //입력 문구 출력
		
		number =sc.nextInt(); //변수 선언 및 입력받은 정수 값 대입
		sc.nextLine(); //버퍼 소모
		
		if(number > 0) //양수인 경우
		{
			System.out.println(number + "는 양수입니다"); //결과 출력
		}
		else if(number < 0) //음수인 경우
		{
			System.out.println(number + "는 음수입니다"); //결과 출력
		}
		else { //양수, 음수 모두 아닌 경우 => 0
			System.out.println(number + "는 0입니다"); //결과 출력
		}
		
//		3. 나이를 입력받아서 다음 기준으로 출력하기
//		   0 ~ 12   : 어린이입니다
//		   13 ~ 19 : 청소년입니다
//		   20 이상 : 성인입니다
//		   나이입력 : 16
//		   현재 나이는 16살이고 청소년입니다
		
		System.out.println("\n\n==============문제 3==============");

		System.out.print("나이 입력 : "); //입력 문구 출력
		int age = sc.nextInt(); // 변수 선언 및 입력받은 정수 값 대입
		
		if(age >= 0 && age <= 12) { 		// age 변수 값이 0 ~ 12인 경우
			System.out.println("어린이입니다");// 결과 출력
		}else if(age >= 13 && age <= 19) { 	// age 변수 값이 13 ~ 19인 경우
			System.out.println("청소년입니다");// 결과 출력
		}else if(age >= 20) { 				// age 변수 값이 20 이상인 경우
			System.out.println("성인입니다");	// 결과 출력
		}else { 							// 0보다 작은 경우
			System.out.println("0이상의 숫자를 입력해주세요");// 결과 출력
		}
		
//		4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기
//		   단, 세 개의 정수는 모두 다른 숫자이어야한다(중복값 X)
//		   
//		   숫자 3개 입력 :  5 1 9
//		   정렬된 숫자 : 9 5 1
		
		System.out.println("\n\n==============문제 4==============");
		
		System.out.print("숫자 3개 입력 : "); //입력 문구 출력
		int num1 = 0, num2 = 0, num3 = 0; //정렬한 변수 대입할 선언
		
		int inputNum; //입력받을 값 대입할 변수 선언
		boolean isSuccess = false; //정렬 성공 여부
		
		for(int i = 0; i < 3; i++) { //3번의 입력을 위한 반복
			inputNum = sc.nextInt(); //정수형 변수에 입력받은 정수를 대입
			
			if(i == 0){ //첫번째 입력
				num1 = inputNum; //첫 숫자는 바로 대임
				continue;
			}else if(i == 1) { //두번째 입력
				if(inputNum == num1) { //첫번째 입력 값과 입력받은 값 비교
					System.out.println("모두 다른 숫자를 입력하세요"); //오류 메시지 출력
					break; //반복문 끝
				}
				
				if(inputNum > num1) { //새로 입력받은 값이 더 클 경우
					 num2 = num1; //기존 값 두번째 위치로 대입
					 num1 = inputNum; //새로 입력받은 값 제일 큰 변수로 대입
				}
				else { //원래 값이 더 클 경우
					num2 = inputNum; //두번째 변수에 대입
				}
			}else if(i == 2) { //세번째 입력
				if(inputNum == num1 || inputNum == num2) { //첫번째, 두번째 입력 값과 입력받은 값 비교
					System.out.println("모두 다른 숫자를 입력하세요"); //오류 메시지 출력
					break; //반복문 끝
				}
				
				if(inputNum > num1) { //새로 입력받은 값이 제일 큰 값보다 더 클 경우
					num3 = num2; //두번째 값을 세번째 큰 변수 값으로 대입
					num2 = num1; //첫번째 값을 두번째 큰 변수 값으로 대입
					num1 = inputNum; //입력 받은 값을 첫번째 큰 변수 값으로 대입
				} else if(inputNum > num2){ //새로 입력받은 값이 두번째 큰 값보다 더 클 경우
					num3 = num2; //두번째 값을 세번째 큰 변수 값으로 대입
					num2 = inputNum; //입력 받은 값을 두번째 큰 변수 값으로 대입
				} else { //입력받은 값 중 가장 작을 때
					num3 = inputNum; //입력 받은 값을 세번째 큰 변수 값으로 대입
				}
				
				isSuccess = true; //성공 값 대입
			}
		}
		
		if(isSuccess) { //3개의 정수 입력 및 정렬 성공하였을 경우
			System.out.println(num1 + " " + num2 + " " + num3); //결과 출력
		}
		
		sc.nextLine(); //버퍼 소모
		
//		5. 사용자가 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지 출력하고 그 외에는 입력한 문자열을 출력하기
		
		System.out.println("\n\n==============문제 5==============");
		
		String input = "";
		
		do {
			System.out.print("입력 : ");
			input = sc.nextLine();
		}while(!input.equals("X"));
		
		//스캐너 해제
		sc.close();
	}
}
