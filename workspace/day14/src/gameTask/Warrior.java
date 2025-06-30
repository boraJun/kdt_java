package gameTask;

public class Warrior extends Character {

	public Warrior() {
//		기본 생성자를 통해 전사, 30, 10, 5, 15, 100 전달
		super("전사", 30, 10, 5, 15, 100);
	}

	public void onlyWarrior() {
//		전사만 사용할 수 있는 고유 행동입니다 출력
		System.out.println("전사만 사용할 수 있는 고유 행동입니다");
	}

	@Override
	public void skillAttack() {
//		mp가 3보다 부족하면 실패, 아니면 mp 3소모
		if(checkMp(3))
		{
			System.out.println("mp가 3보다 부족합니다.");
			return;
		}
		
		System.out.println(name + "이(가) 스킬공격을 실행했습니다.");
		System.out.println("적에게 " + skillDmg + " 만큼 피해를 입혔습니다.");
		System.out.println("mp가 3 감소했습니다.");
		mp -= 3;
		
		showStatus();
	}

	@Override
	public void specialAttack() {
		
//		피해 출력 + 체력 10 감소 + 부활 검사
	}
}
