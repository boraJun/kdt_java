package threadMethod;

public class TestMain {
   public static void main(String[] args) {
      Test test = new Test();
      
      Thread t1 = new Thread(test, "쓰레드-1");
      Thread t2 = new Thread(test, "쓰레드-2");
      
      t1.start();
      t2.start();
   }
}
