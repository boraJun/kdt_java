package ifTest;
//13번 : if~if문, if~else if문 차이 / if문 중첩
public class IfTest04 {
	public static void main(String[] args) {
		
		//if~if문 : 위의 조건이 true라도 아래 if문의 조건식을 확인한다
		int num = 10, grade = 100; //정수형 변수 선언 후 정의
		
		if(num > 5) { //num 변수 값이 5보다 큰가?
			//num 변수 값이 5보다 클 경우 출력
			System.out.println("num은 5보다 큽니다");
		}
		if(num > 3) { //num 변수 값이 3보다 큰가?
			//num 변수 값이 3보다 클 경우 출력
			System.out.println("num은 3보다 큽니다");
		}
		
		//if~else if문 : 위의 조건식이 true면 아래 있는 조건식은 무시된다
		if(num > 5) { //num 변수 값이 5보다 큰가?
			//num 변수 값이 5보다 클 경우 출력
			System.out.println("num은 5보다 큽니다");
		}else if(num > 3) { //num 변수 값이 3보다 큰가?
			//num 변수 값이 3보다 클 경우 출력
			System.out.println("num은 3보다 큽니다");
		}
		
		//if문 중첩
		//90점 이상은 A, 100점은 만점으로 A 출력
//		if(grade == 100) {
//			System.out.println("만점으로 A");
//		} else if(grade >= 90) {
//			System.out.println("A");
//		}
		
		
		if(grade >= 90) { //grade 변수 값이 90보다 크거나 같은가?
			if(grade == 100) { //grade 변수 값이 100이랑 같은가?
				//grade 변수 값이 90보다 크거나 같고, 100과 같을 경우 출력
				System.out.println("만점으로 A");
			} else { //grade 변수 값이 100이랑 같지않다
				//grade 변수 값이 90보다 크거나 같고, 100과 같지 않을 경우 출력
				System.out.println("A");
			}
		}
	}
}
