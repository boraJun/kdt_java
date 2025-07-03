package exceptionTest01;
//12번 : 예외클래스 메소드
public class ExceptionTest03 {
	public static void main(String[] args) {
		ExceptionTest03 et = new ExceptionTest03();
		System.out.println("프로그램 시작");
		
		et.printLength("java");
		et.printLength(null);
		
		System.out.println("프로그램 종료");
	}

	public void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("글자수 : " + result);
		}catch(NullPointerException e) {
//			System.out.println("null값은 입력 불가능합니다");

			
			//예외 정보를 얻는 방법 3가지
//			1. e.toString(); e => 예외 종류(클래스)와 발생한 이유 반환
//			System.out.println(e.toString());
//			System.out.println(e);
			
//			2. e.printStackTrace(); => 예외가 어디서 발생했는지 추적한 내용까지 출력
//			e.printStackTrace();

//			3. e.getMessage(); => 예외가 발생한 이유만 반환
			System.out.println(e.getMessage());
			
		}catch(Exception e) {
			System.out.println("예상치 못한 오류");
		}
	}
}
