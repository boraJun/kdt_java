package threadMethod;

public class Test implements Runnable{
   private int number;
   
   public Test() {
      super();
      this.number = 100;
   }
   
   @Override
   public void run() { //run 동기화 처리하면 싱글 쓰레드로 작동한다
      for(int i = 0; i < 3; i++) {
         sub(10);
         try {
            Thread.sleep(500);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
   
   public /*synchronized*/ void sub(int number) {
      String name = Thread.currentThread().getName();
      synchronized (this) {
         this.number -= number;
      }
      System.out.println(name + " : " + number);
      System.out.println("현재 number : " + this.number);
   }

}













