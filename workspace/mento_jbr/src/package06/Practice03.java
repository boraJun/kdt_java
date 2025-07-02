package package06;
import java.util.Arrays;

class GameController{
	private int[] cardArr;
	private int[] gameCardArr;
	static int CARD_COUNT = 100;
	static int GAME_CARD_COUNT = 10;
	
	private void initCardArr() {
		if(cardArr == null)
			cardArr = new int[CARD_COUNT];
		if(cardArr.length != CARD_COUNT)
			cardArr = new int[CARD_COUNT];
		
		for(int i = 0; i < cardArr.length; i++) {
			cardArr[i] = i + 1;
		}
	}
	
	private void initGameCardArr() {
		if(gameCardArr == null)
			gameCardArr = new int[GAME_CARD_COUNT];
		if(gameCardArr.length != GAME_CARD_COUNT)
			gameCardArr = new int[GAME_CARD_COUNT];
	}
	
	public GameController() {
		initCardArr();
		initGameCardArr();
	}
	
	public int[] playGame() {
		initCardArr();
		updateGameCard();
		
		return gameCardArr;
	}
	
	public void updateGameCard() {
		for(int i = 0; i < GAME_CARD_COUNT; i++) {
			int idx = (int)(Math.random() * 500) % (CARD_COUNT - i);
			
			gameCardArr[i] = cardArr[idx];
			
			for(int j = idx; j < GAME_CARD_COUNT - i - 1; j++) {
				cardArr[j] = cardArr[j + 1];
			}
 		}
	}
}

public class Practice03 {
//	3. 조건 : 1~100까지 숫자 중 랜덤하게 10장 뽑기
//	   메소드 정의하기
	
	static GameController gameController;
	
	public static void main(String[] args) {
		System.out.println("Section06.응용문제3)\n");
		gameController = new GameController();
		
		int[] gameCardArr = gameController.playGame();
		System.out.println("사용한 카드 : " + Arrays.toString(gameCardArr));
	}
}
