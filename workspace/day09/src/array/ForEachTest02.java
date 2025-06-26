package array;

//2) 3과목 점수의 총합과 평균점수 구하기(for-each문만 이용)
public class ForEachTest02 {
	public static void main(String[] args) {
		int[] scores = {100, 88, 99};
		//1) 총합구할 변수 선언
		//2) 총합 구하기(for-each문)
		//3) 평균 구하기
		//4) 출력
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = sum / (double)scores.length;
		
		System.out.println("총합 : " +  sum);
		System.out.printf("평균 : %.2f",  avg);
	}
}
