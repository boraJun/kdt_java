package wrapperTest;
//6번 : wrapper 클래스
public class WrapperTest02 {
	public static void main(String[] args) {
		int num = 10;
		printObj(num);
		
		Object obj = num; //Integer
		Object obj2 = 10;
		System.out.println(obj2);		
	}
	
	static void printObj(Object obj) {
		System.out.println(obj);
	}
}
