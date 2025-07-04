package wrapperTest;

//7번 : String 메소드
public class StringTest {
	public static void main(String[] args) {
		String msg1 = "안녕하세요";

		// charAt()
		System.out.println(msg1.charAt(0));

//      System.out.println(msg1.charAt(5));
//      java.lang.StringIndexOutOfBoundsException
//      int[] num = {1, 2, 3, 4, 5};
//      System.out.println(num[5]);
//      java.lang.ArrayIndexOutOfBoundsException
		
		//indexOf()
		System.out.println(msg1.indexOf('안'));
		System.out.println(msg1.indexOf('h'));
		
		String msg2 = "안!녕!하!세!요!";
		System.out.println(msg2.split("!"));
		
		String[] ar = msg2.split("!");
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		for(String str : ar) {
			System.out.print(str);
		}
		
		//length()
		System.out.println("\n" + msg2.length());
		
		//strip()
		String msg3 = "          안녕하세요!! !!  ";
		System.out.println(msg3);
		System.out.println(msg3.strip());
		
		//substring()
		System.out.println(msg3.strip().substring(3, 7));
		
		//contains() : 해당 문자열이 포함되어있는지 여부를 true, false로 반환
		System.out.println(msg3.contains("하"));
		System.out.println(msg3.contains("하하하"));
	}
}
