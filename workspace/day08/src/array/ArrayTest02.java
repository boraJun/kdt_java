package array;
//4번 ; 배열 index
public class ArrayTest02 {
	public static void main(String[] args) {
		//어떤 값을 넣을 지 알 떄
		int[] ar1 = {1, 2, 3, 4, 5};
		System.out.println(ar1);
		//ar1 => stack 메모리에 있는 참조변수(heap 메모리에 저장된 배열의 시작주소 => 참조값)
		
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]);
		System.out.println(ar1[4]);
		
		//몇 칸 만들지 알떄
		int[] ar2 = new int[3];
		System.out.println(ar2);
		
		System.out.println(ar2[0]);
		System.out.println(ar2[1]);
		System.out.println(ar2[2]);
		
		int[] ar3 = null;
		System.out.println(ar3);
		System.out.println(ar3[0]);
 	}
}
