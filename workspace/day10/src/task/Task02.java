package task;


//하나의 자바 파일에서 class 앞에 public 붙은 클래스가 대표 클래스 - 하나만 public 붙임
public class Task02 {
	public static void main(String[] args) {
		//Animal 클래스 => 3개 객체만들기
		//필드 : 동물이름, 나이, 종
		//메소드
		//동물이 먹이를 먹는 메소드 	매개변수 1개
		//=> 동물이름이 00을 먹습니다 출력
		
		// 동물이 잠을 잡니다 출력하는 메소드
		// => 동물이름이 잠을 잡니다 출력
		
		// 동물의 생일 축하하는 메소드 출력 메소드
		// => 동물이름의 나이를 축하합니다 출력
		
		//배열 선언 및 초기화
		Animal[] animalArr = new Animal[3];
		
		
		//배열 길이만큼 반복
		for(int i = 0; i < animalArr.length; i++) {
			animalArr[i] = new Animal(); //객체 생성 및 대입
		}
		
		//메소드 호출하여 객체의 멤버 변수값 정의
		animalArr[0].init("야옹이", 3, "고양이");
		animalArr[1].init("멍멍이", 5, "강아지");
		animalArr[2].init("짹짹이", 2, "새");
		
		//배열 선언 및 초기화
		String[] feedArr = {"참치", "사료", "씨앗"};
		
		//Animal 객체 배열의 길이만큼 반복
		for(int i = 0; i < animalArr.length; i++) {
			animalArr[i].eat(feedArr[i]); //메소드 호출
			animalArr[i].sleep(); //메소드 호출
			animalArr[i].celerbrateBirthday(); //메소드 호출
			
			System.out.println();//줄바꿈
		}
	}
}
