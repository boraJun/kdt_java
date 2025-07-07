package homework;

public class Person {
//	Person 클래스
//	필드 : 이름, 나이, 생년월일(8자리)
//	메소드 : introduce() 이름, 나이입니다 출력
	private String name;
	private int age;
	private String birthday;
	private int birthYear;

	private static int currentYear = 2025;

	public Person(String name) {
		this.name = name;
	}

	private void setAge(int age) {
		if (age < 0)
			age = 0;

		this.age = age;
	}

	private void setAge() {
		this.setAge(currentYear - birthYear);
	}

	public void setBirthday(String birthday) {
		if (birthday == null)
			System.out.println("잘못된 생일 입력");
		if (birthday.length() != 8)
			System.out.println("잘못된 생일 입력");
		if (!tryParseInt(birthday))
			System.out.println("잘못된 생일 입력");

		this.birthday = birthday;
		this.birthYear = calcBirthYear(birthday);

		setAge();
	}

	public int getAge() {
		return age;
	}

	private boolean tryParseInt(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch < '0' || ch > '9') {
				return false;
			}
		}

		return true;
	}

	private int calcBirthYear(String birthday) {
		String birtYear = "";

		for (int i = 0; i < 4; i++) {
			birtYear += birthday.charAt(i);
		}

		return Integer.parseInt(birtYear);
	}
	
	public void introduce() {
		System.out.println(this.getName() + ", " + this.getAge() + "입니다");
	}

	public String getName() {
		return name;
	}
}
