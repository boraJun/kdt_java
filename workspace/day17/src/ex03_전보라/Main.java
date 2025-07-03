package ex03_전보라;

public class Main {
//	3. 문자열의 쉼표를 느낌표로 바꿔서 출력하는 프로그램(람다식 활용, 익명클래스 먼저 작성)
//	인터페이스 : StringInter
//	메소드   : String modify(String str);    매개변수 o , 리턴값 o      
//
//	메인 클래스 : Main
//	메소드 : main메소드
//	   String nation = "Korea,Spain,Germany,America";
	
	public static void main(String[] args) {
		String nation = "Korea,Spain,Germany,America";		
		StringInter si1 = new StringInter() {
			@Override
			public String modify(String str) {
				String result = "";
				for(int i = 0; i < str.length(); i++) {
					if(str.charAt(i) == ',')
						result += '!';
					else
						result += str.charAt(i);
				}
				return result;
			}
		};
		
		StringInter si2 = (str) -> str.replace(",", "!");

		System.out.println("기존 : " + nation);
		System.out.println("변경 : " + si1.modify(nation));
		
		System.out.println("기존 : " + nation);
		System.out.println("변경 : " + si2.modify(nation));
	}
}
