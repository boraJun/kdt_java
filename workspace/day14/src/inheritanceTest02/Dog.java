package inheritanceTest02;
//2번 : 상속 기초(Animal 클래스를 상속받은 Dog 클래스)
public class Dog extends Animal{
	
	//강아지 고유 메소드
	void bark() {
		System.out.println(this.name + "이/가 멍멍 짖습니다.");
	}
}
