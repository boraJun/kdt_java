package exceptionTest01;
//11번 : Exception Basic
public class ExceptionTest02 {
	public static void main(String[] args) {
		ExceptionTest02 et = new ExceptionTest02();
		System.out.println(et);
		et.printLength("java");
		
//		et.printLength(15.5);		
//		java.lang.Error
		
		try {
			et.printLength(null);
//			java.lang.NullPointerException
		}catch(NullPointerException e) {
			System.out.println("null은 입력할 수 없습니다");
		}catch(Exception e) {
			System.out.println("알 수 없는 예외가 발생했습니다");
		}finally {
			System.out.println("프로그램실행종료");
		}
	}
	
	public void printLength(String data) {
		int result = data.length();
		System.out.println(data + "의 글자수는 " + result + "입니다");
	}
}
