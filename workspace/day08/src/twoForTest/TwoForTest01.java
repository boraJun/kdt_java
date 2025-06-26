package twoForTest;
//1번 : 이중 for문 기본
public class TwoForTest01 {
	public static void main(String[] args) {
		
		for(int i = 1; i < 3; i++) {//바깥 for문 //행
			for(int j = 1; j < 3; j++) {//안쪽 for문 //열
				System.out.println("i : " +i + ", j : " + j);
			}
			
			System.out.println();
		}
		
//		1. 바깥 for문 시작
//		1-1) 초기식 i를 1로 초기화
//			조건식 i < 3 조건을 검사해서 1 < 3 true이면 바깥for문 중괄호 영역안으로 들어간다
//		2. 안쪽 for문 시작
//		2-1) 초기식 j를 1로 초기화
//			조건식 j < 3조건을 검사 => 1 < 3 true이면 안쪽for문 중괄호 영역안으로 들어간다
//		2-2) 출력메소드	System.out.println("i : " + i +", j : " + j);
//			출력결과	=> i : 1, j : 1
//		3.안쪽 for 계속 진행
//		3-1) 증감식으로 이동 j가 1증가(j++)	현재 j의 값 : 2
//		3-2) 조건식 j < 3조건 검사 => 2 < 3 true이면 안쪽for문 중괄호 영역안으로 들어간다
//		3-3) 출력메소드	System.out.println(i : " + i +", j : " + j);
//		4. 안쪽 for문 시작
//		4-1) 증감식으로 이동 j가 1증가(j++)	현재 j의 값 : 3
//		4-2)조건식 j < 3조건 검사 => 3 < 3 false이면 안쪽for문 중괄호 밖으로 이동
//		4-3) 안쪽 for문 중괄호 밖, 바깥쪽 for문 중괄호 안의 내용이 있다면 해당 내용 실행한다
//		5. 바깥쪽 for 계속 진행
//		5-1) 증감식 이동	i가 1증가(i++)	현재 i값 : 2
//		5-2) 조건식 	i < 3조건 검사 => 2 < 3 true 바깥쪽 for문 중괄호 영역 안으로 들어간다
//		6. 안쪽 for문 시작
//		2~5계속 반복
//		+)바깥for문의 증감식으로 이동 후 조건식을 확인 시 false가 나오면 바깥for문의 중괄호 영역 밖으로 이동한다
		
	}
}
