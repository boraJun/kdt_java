package review;

public class Animal{
   //필드
   String name; //동물 이름
   int age; //동물 나이
   String species; //동물의 종
   
   //메소드
   // 동물이 먹이를 먹는 메소드   매개변수 1개
   //=> 동물이름이 00을 먹습니다
   void eat(String food) {
      System.out.println(name + "이/가 " + food + "를/을 먹습니다");
   }

   // 동물이 잠을 잡니다 출력하는 메소드
   // => 동물이름이 잠을 잡니다 출력
   void sleep(String place) {
      System.out.println(name + "이/가 " + place +"에서 잠을 잡니다");
   }
   
   // 동물의 생일 축하하는 출력 메소드
   //   => 동물이름의 나이 생일을 축하합니다 출력 
   void printBrithday() {
      System.out.println(name + "의 " + age +"번째 생일을 축하합니다");
   }
}

