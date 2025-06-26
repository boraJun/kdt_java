package ifTest;
//9번 : 조건문(if문)
public class IfTest01 { //클래스 시작
   public static void main(String[] args) { //main 시작
      
      System.out.println("출력 시작");
      
      int number = 5;
      if(number == 10) { //if문 시작
//         System.out.println("if문의 조건식이 true입니다");
//         System.out.println("숫자는 " + number + "입니다.");
         
         //조건식에서 number에 저장된 값이 10과 같다면
         //number 10을 더한값을 저장후 number 출력
//         number += 10; //number = number + 10;
//         System.out.println(number);
         
         System.out.println("10입니다");
         
      } //if문 종료
      System.out.println("10이 아닙니다.");
      System.out.println("출력 끝");
      
   } //main 종료
} //클래스 종료
