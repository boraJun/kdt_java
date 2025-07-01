package casting02;
//5번 : 자식 객체의 타입이 여러개인지 확인 - 메인클래스
public class TypeTest {
   public static void main(String[] args) {
      
      Parents p = new Parents();
      Child c = new Child();
      
      System.out.println(p);
      System.out.println(c);
      
      // 객체명 instanceof 클래스명 => boolean
      // instanceof : 객체가 특정 클래스나 해당 클래스의 자식클래스인지 확인할 때 사용
      System.out.println(p instanceof Parents);
      System.out.println(c instanceof Child);
//      System.out.println(p instanceof Child); //false
//      System.out.println(c instanceof Parents); //true
      //자식 클래스 타입의 객체는 부모 클래스 타입도 동시에 갖는다!!
      
//      Parents pp = new Child();
//      Child cc = (Child) pp;
   }
}



