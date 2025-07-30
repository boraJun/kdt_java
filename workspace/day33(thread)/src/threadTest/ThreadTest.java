package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		//객체 2개 만들기 t1 #, t2 *
		MyThread t1 = new MyThread("#");
		MyThread t2 = new MyThread("*");
		
		//run()이 아닌 start() 실행해야한다
		//멀티 쓰레드로 생각할 수 있지만 지금은 단일 쓰레드로 실행된다
		//run()메소드에 재정의한 코드를 실행시킨 것이다
//		t1.run();
//		t2.run();
		
		t1.start();
		t2.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
