package whileTest;

import java.util.Scanner;

// 10번 : while문 예제
public class WhileTest03 {
   public static void main(String[] args) {


      int result = 0, choice = 0; //정수형 변수 정의 및 초기화
      Scanner sc = new Scanner(System.in); //입력클래스 선언 및 정의
      while (true) { //반복문
         System.out.println("2개의 정수 입력(입력시 1, 0 제외) : "); //입력 문구 출력
         int num1 = sc.nextInt(); //정수형 변수 선언 및 입력받은 정수 대입
         int num2 = sc.nextInt(); //정수형 변수 선언 및 입력받은 정수 대입
         result = num1 + num2; //num1과 num2 더한 값을 result 변수에 대입
         System.out.println(num1 + " + " + num2 + " = " + result); //결과 출력
         System.out.println("계속 : 1, 종료 : 0을 누르세요 : "); //입력 문구 출력
         choice = sc.nextInt(); //정수형 변수 선언 및 입력받은 정수 대입
         if (choice == 0) { // choice가 0일 경우
            System.out.println("종료"); //출력
            break; //while문 탈출
         }
         if (choice == 1) { // choice가 1일 경우
            System.out.println("계속 진행합니다"); //출력
            continue;//반복문 시작 지점으로 이동
         }
         System.out.println("프로그램"); //출력
      }
      System.out.println("반복문을 종료합니다"); //출력
      
      //스캐너 해제
      sc.close();
      }
}
