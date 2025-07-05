package interfaceTest04;

public class ClassC implements Inter1, Inter2, Inter3{
	@Override
	public void printText() {
		//어차피 부모에 정의된 default 메소드를 사용할 것이기 때문에
		//어떤 부모의 메소드를 사용할 지 정해서 사용한다
		Inter1.super.printText();
		Inter2.super.printText();
		Inter3.super.printText();
	}
	
	public static void main(String[] args) {
		ClassC c= new ClassC();
		System.out.println(c);
		c.printText();
	}
}
