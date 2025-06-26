package constructorThis03;
//6번 : this() 자기자신의 생성자 호출
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("홍길동");
		Person p3 = new Person("짱구", 5);
		Person p4 = new Person("유리", "학생");
		Person p5 = new Person("전보라", 31, "학생");
		
		System.out.println(p3);
		System.out.println(p5);
		
		p3.printInfo();
		p5.printInfo();
	}
}
