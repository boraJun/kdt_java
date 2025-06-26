package twoArray;

import java.util.Arrays;

//7번 : 버블 정렬
public class BubbleSort {
   public static void main(String[] args) {
      int[] number = {5, 2, 9, 1, 6};
      
      System.out.println("초기 배열 : " + Arrays.toString(number));
      
      for(int i = 0; i < number.length; i++) {
         boolean swap = false; // 교환 발생여부
         for(int j = 0; j < number.length - 1 - i; j++) {
            if(number[j] > number[j+1]) {
               //두 요소 교환(swap)
               int temp = number[j];
               number[j] = number[j+1];
               number[j+1] = temp;
               swap = true;
            }
         }
         System.out.println((i + 1) + "단계 : " + Arrays.toString(number));
         //i = 0   => j = 0 < 4 ture
         if(!swap) {
            break;
         }
      }
      System.out.println("정렬완료 : " + Arrays.toString(number));
      
   }
}