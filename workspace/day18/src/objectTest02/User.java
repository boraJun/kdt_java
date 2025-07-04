package objectTest02;

//4번 : Object 클래스 - equals() 메소드
public class User {
	// 필드
	String name;
	int age;

	// 생성자
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 메소드
	// toString() : alt + shift + s + s
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// 자기자신과 같은 경우
		if (this == obj) {
			return true;
		}

		// 이름이 같은 경우 => 같은 객체로 판단
//		if (obj instanceof User) {
//			String other = ((User) obj).name;
//			if (this.name.length() == other.length()) {
//				for (int i = 0; i < this.name.length(); i++) {
//					if (this.name.charAt(i) != other.charAt(i)) {
//						return false;
//					}
//				}
//				return true;
//			}
//		}
		
		// 이름이 같은 경우(짧은 코드 가능)
		if(obj instanceof User) {
			return this.name.equals(((User)obj).name);
		}

		return false;
	}
	
	//equals를 재정의하면 hashCode도 재정의해야한다
	//동일 객체에 대해 같은 hashCode값이 반환되도록 한다
	//이름을 해시코드값으로 쓸 때는 name.hashCode()
	//나이를 해시코드값으로 쓸 때는 Integer.hashCode(age);
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age;
//		return Integer.hashCode(age);
//		return name.hashCode();
	}
	
}
