package day20_전보라;

public class ScoreRangeException extends RuntimeException{
	public ScoreRangeException() {
		super("점수는 0점~100점 사이의 값이어야 합니다.");
	}
}
