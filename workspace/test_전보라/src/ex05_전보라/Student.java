package ex05_전보라;

//Person 클래스를 상속받는다.
public class Student extends Person {
	// 필드
	int javaScore;
	int dbmsScore;
	int htmlScore;
	Major major;

	// 생성자
	// 이름, 전공, 세 과목 점수를 받아 초기화(부모생성자 사용)
	public Student(String name, Major major, int javaScore, int dbmsScore, int htmlScore) {
		// 부모 생성자에 인수로 name 값 전달하며 호출
		super(name);

		// 필드 초기화 //전공 및 세 과목 점수
		this.major = major;
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
	}

	// 메소드
	// 기능 :총점 반환
	// 반환타입 : int
	// 매개변수 : x
	// 구현부
	// {
	// return 세 점수를 더한 값;
	// }
	int getTotalScore(){
		return this.javaScore + this.dbmsScore + this.htmlScore;
	}

	// 기능 : 정수 평균 반환
	// 반환타입 : int
	// 매개변수 : x
	// 구현부
	// {
	//	//자기 자신 객체의 세 점수를 더한 값을 구하는 메소드 호출하여 반환 받은 값을 3으로 나눠 반환
	// 	return this.getTotalScore() / 3;
	// }
	int getAverageScore(){
		return this.getTotalScore() / 3;
	}

	// 기능 : 전공 반환
	// 반환타입 : Major
	// 매개변수 : x
	// 구현부
	// {
	// return this.major;
	// }
	Major getMajor() {
		return this.major;
	}
}
