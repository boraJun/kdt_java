package ex01_전보라;

public class Student extends Person{
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	@Override
	public void score() {
		System.out.println(getName() + "의 점수는 " + score + "점 입니다");
	}
}
