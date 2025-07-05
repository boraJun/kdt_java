package interfaceTest05;

//20번 : static 메소드, default 메소드, private 메소드
public interface Calculator {
	default int add(int num1, int num2) {
		return validate(num1, num2) * (num1 + num2);
	}

	default int substarct(int num1, int num2) {
		return num1 - num2;
	}

	private int validate(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			System.out.println("음수값은 사용 불가합니다. 양수만 가능합니다.");
			return 0;
		}

		return 1;
	}

	static void info() {
		System.out.println("계산기 인터페이스입니다. 양수만 가능합니다.");
	}
}
