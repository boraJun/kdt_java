package day20_전보라;

public class Student {
	private String name;
	private int age;
	private int mathScore;
	private int engScore;
	private int korScore;

	//점수 배열 인덱스 정보
	public enum SCORE {
		MATH(0), ENG(1), KOR(2);

		private SCORE(int idx) {
			this.idx = idx;
		}

		int idx;
	}

	// 이름과 나이만 받는 생성자
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
	public int[] addScore(int[] scoreArr) throws ScoreRangeException {
		for (int score : scoreArr) {
			if (score < 0 || score > 100) {
				//점수는 0점~100점 사이의 값이어야한다 예외 발생
				throw new ScoreRangeException();
			}
		}

		this.mathScore = scoreArr[SCORE.MATH.idx];
		this.engScore = scoreArr[SCORE.ENG.idx];
		this.korScore = scoreArr[SCORE.KOR.idx];

		int[] scores = new int[3];

		scores[SCORE.MATH.idx] = mathScore;
		scores[SCORE.ENG.idx] = mathScore;
		scores[SCORE.KOR.idx] = mathScore;
		
		//점수 반환
		return scores;
	}

	// hashCode의 값은 나이로 반환
	@Override
	public int hashCode() {
		return this.age;
	}
	
	// 이름과 나이가 같을 경우 같은 객체로 판단
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		String str1 = this.toString();
		String str2 = obj.toString();

		if(str1.length() != str2.length())
			return false;
		
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i))
				return false;
		}

		return this.hashCode() == obj.hashCode();
	}

	@Override
	public String toString() {
		return this.name;
	}
}
