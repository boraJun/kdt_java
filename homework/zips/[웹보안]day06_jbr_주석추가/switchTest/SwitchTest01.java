package switchTest;

//14번 : switch문
public class SwitchTest01 {
	public static void main(String[] args) { // main 시작
		//문자열 변수 선언 및 정의
		String animal = "고양이";
				
//		switch(animal) {
//			case "고양이" : 
//				System.out.println("선택한 동물은 고양이입니다");
//				break;
//			case "강아지" :
//				System.out.println("선택한 동물은 강아지입니다");
//				break;
//			case "코알라" :
//				System.out.println("선택한 동물은 코알라입니다");
//				break;
//			default:
//				System.out.println("선택한 동물이 없습니다");
//				break;
//		}
		
		//switch 문 사용하여 값에 따른 결과 출력
		switch(30) {
		case 10: //값이 10인 경우
			System.out.println("10입니다"); //결과 출력
			break; //조건문 탈출
		case 100: //값이 100인 경우
			System.out.println("100입니다"); //결과 출력
			break; //조건문 탈출
		case 50: //값이 50인 경우
			System.out.println("50입니다"); //결과 출력
			break; //조건문 탈출
		default: //값이 10, 100, 50이 모두 아닌 경우
			System.out.println("case에 값이 없습니다"); //결과 출력
			break; //조건문 탈출
		}
	} // main 끝
}
