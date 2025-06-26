package array;

//5번 : 배열 사용(저장공간과 값)
public class ArrayTest03 {
   public static void main(String[] args) {
      int[] arData = {5, 2, 6, 4};
      System.out.println(arData); //배열의 시작주소값(참조값)
      System.out.println("배열의 길이 : " + arData.length);
      
      System.out.println(arData[0]);
      System.out.println(arData[1]);
      System.out.println(arData[2]);
      System.out.println(arData[3]);
      
      for(int i = 0; i < arData.length; i++) {
         System.out.println(arData[i]);
      }
      
      arData[0] = arData[1] + arData[3]; //저장공간, 값, 값
      System.out.println(arData[0]);
      
      int[] arData2 = new int[10];
      //값 대입 반복문
      for(int i = 0; i < arData2.length; i++) {
         arData2[i] = i + 1;
//         System.out.println(i);
      }
      //출력 반복문
      for(int i = 0; i < arData2.length; i++) {
         System.out.print(arData2[i] + " ");
      }         
   }
}