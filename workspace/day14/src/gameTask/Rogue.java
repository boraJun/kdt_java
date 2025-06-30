package gameTask;
import java.util.Random;

public class Rogue extends Character{
	static int[] randomDmg;
	
	public Rogue() {
//		기본 생성자를 통해 로그, 20, 20, 3, 20, 0 전달
		super("로그", 20, 20, 3, 20, 0);
		randomDmg = new int[]{20, 30, 40, 50, 60, 70, 80, 90, 100};
	}

	@Override
	public void normalAttack() {
		// TODO Auto-generated method stub
		//super.normalAttack();
		
//		mp3 소모, 부족하면 실패
	}

	@Override
	public void skillAttack() {
		// TODO Auto-generated method stub
		//super.skillAttack();
//		mp 2 소모 + hp 5 소모, 부족하면 실패
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		//super.specialAttack();
//		20~100사이의 무작위 피해량 출력(Random 사용)
//		정수형 배열 필드 이용
		
		Random r = new Random();
	    int dmg = randomDmg[r.nextInt(randomDmg.length)];
	}
}
