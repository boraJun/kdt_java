package ex05_전보라;

//Major 열거형 정의
public enum Major {
	COMPUTER_SCIENCE("컴퓨터공학"), 
	CYBER_SECURITY("정보보안학"), 
	ARTIFICIAL_INTELLIGENCE("인공지능학");

	// 생성자
	private Major(String koreanName) {
		// 매개변수로 전달받은 값으로 상수 값 초기화
		this.koreanName = koreanName;
	}

	// 필드
	// 한글전공명 //상수
	final private String koreanName;
	
	//메소드
	//기능 : 한글명을 반환
	//매개변수 : x
	//반환타입 : String
	//구현부
	//{
	//	return this.koreanName;
	//}
	String getKoreanName() {
		return this.koreanName;
	}
}
