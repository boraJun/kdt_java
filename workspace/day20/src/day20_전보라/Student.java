package day20_전보라;

public class Student {
	private String name;
	private int age;
	private int mathScore;
	private int engScore;
	private int korScore;

	public enum SCORE {
		MATH(0), ENG(1), KOR(2);

		private SCORE(int idx) {
			this.idx = idx;
		}

		int idx;
	}

	// 생성자
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter와 setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 점수의 합을 구하고 반환하는 메소드
	public int total() {
		return this.mathScore + this.engScore + this.korScore;
	}

	// 평균점수 구하는 메소드
	public double printAvg() {
		return total() / 3.0;
	}

	// 학생의 점수를 저장하여 반환하는 메소드
	public int[] addScore(int[] scoreArr) {
		this.mathScore = scoreArr[SCORE.MATH.idx];
		this.engScore = scoreArr[SCORE.ENG.idx];
		this.korScore = scoreArr[SCORE.KOR.idx];

		int[] scores = new int[3];

		scores[SCORE.MATH.idx] = mathScore;
		scores[SCORE.ENG.idx] = mathScore;
		scores[SCORE.KOR.idx] = mathScore;

		return scores;
	}

	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			if ((this == obj) && (this.hashCode() == obj.hashCode())) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
