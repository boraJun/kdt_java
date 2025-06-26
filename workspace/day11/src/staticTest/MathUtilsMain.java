package staticTest;

//8번 : 정적메소드 호출
public class MathUtilsMain {
	public static void main(String[] args) {
		//getMax 호출 => 매개변수 o, 리턴값 o
		System.out.println(MathUtils.getMax(10, 20));
		
		//round() 호출 => 매개변수 o, 리턴값 o
		System.out.println(MathUtils.round(5.5));
	}
}
