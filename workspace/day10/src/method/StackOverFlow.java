package method;

//5번 : 스택오버플로우 발생
public class StackOverFlow {
	public static void main(String[] args) {
		recursiveMethod();
	}
	
	static void recursiveMethod() {
		recursiveMethod();
		// java.lang.StackOverflowError
		// 재귀 호출이나 반복적인 메소드 호출로 인해
		// 스택 프레임이 계속 쌓여서 스택영역의 크기 제한을 초과하면 발생
		// JVM이 할당한 스택영역의 최대 크기를 초과하므로 더 이상 메소드 호출 정보를 쌓을 공간이 없어서
		// StackOverflowError가 발생한다
	}
}
