package threadTest;

public class MyThread extends Thread{
	//필드
	String str;

	//생성자
	public MyThread(String str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(str + "쓰레드 종료!");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}
}
