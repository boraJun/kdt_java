package gameTask;

public class Wizard extends Character {

	public Wizard() {
//		기본 생성자를 통해 마법사, 15, 30, 1, 30, 0 전달
		super("마법사", 15, 30, 1, 30, 0);
	}

	@Override
	public void normalAttack() {
//		체력 2 감소 후 공격 실행
		hp -= 2;
		super.normalAttack();
		
		revive();
	}

	@Override
	public void skillAttack() {
//		mp가 부족하면 출력 후 실패
		int skillMp = 10;

		if (!checkMp(skillMp)) {
			System.out.println("mp가 " + skillMp + "보다 작습니다.");
			super.showStatus();
			
			return;
		}

		super.skillAttack();
	}

	@Override
	public void specialAttack() {
		System.out.println("마법사는 특수공격이 없습니다");
		super.showStatus();
	}
}
