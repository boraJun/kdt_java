package constructorOverloading;
//7번 : 생성자 오버로딩
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
//      기본 생성자가 호출되었습니다
//      생성자 : constructorOverloading.Person@279f2327

		Person p2 = new Person("유리");
		System.out.println(p2.name); // 유리
		System.out.println(p2.age); // 10

		Person p3 = new Person("짱아", 2, null);
		System.out.println(p3.age);
	}
}
