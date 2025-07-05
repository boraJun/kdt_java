package exceptionTest02;
//13번 : throws와 throw (throws 예외 던지기, 메소드 선언부에 사용한다)
//Thread 클래스의 sleep 메소드는 throws 되어있다
public class ThrowsTest {
	public static void main(String[] args) {
		method();
	}
	
	static void method() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			//try ~ catch 블록 단축키
			//예외 발생 할 수 있는 코드에서 드래그 된 상태에서 alt + shift + z
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// 500 => 0.5초, 1000 => 1초
		}
	}
}
