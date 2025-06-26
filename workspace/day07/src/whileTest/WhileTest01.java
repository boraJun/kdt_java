package whileTest;
//8번 : while문 기초
public class WhileTest01 {
   public static void main(String[] args) {
      
      //안녕하세요 문자열을 10번 출력하기
      //조건식을 true로 작성시 무한루프에 빠진다
      while(true) {
         for(int i = 0; i < 10; i++) {
            System.out.println("안녕하세요!");
         }
         break;
      }
      
      //변수 선언
      //while(조건식){}
      int cnt = 0;
      while(cnt < 10) {
//         System.out.println(cnt); //증감식이 출력문 다음에 작성되면 0 ~ 9까지 출력
         cnt++; //cnt = cnt + 1;
//         System.out.println(cnt); //증감식이 출력문 전에 작성되면 1 ~ 10까지 출력
         System.out.println("안녕하세요");
      }
   }
}
