package typeCasting;
//4번 : 문자열과 다른 자료형과의 형변환
public class TypeCasting03 {
	public static void main(String[] args) {
		String data1 = "";
		String data2 = "abc";
		
		System.out.println(data1 + 1); //문자열 + 1 => 연결
		System.out.println(data2);
		
		char alpha = data2.charAt(1);
		System.out.println(alpha);
		
//		"True"		
		boolean result1 = Boolean.parseBoolean("True");
		System.out.println(result1);
		//문자열이 TRUE(대소문자 무관)이면 true를 반환하고, 그렇지 않으면 false를 반환
		
	}
}
