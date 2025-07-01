package casting01;
//4번 : casting
public class TvMain {
	public static void main(String[] args) {
		//각각 클래스 객체
		Tv tv = new Tv();
		System.out.println(tv);
		
//		tv.netflix(); //부모 객체의 값은 자식 클래스에 있는 멤버 사용 불가능
		tv.powerOnOff();
		
		SmartTv smartTv = new SmartTv();
		System.out.println(smartTv);
		
		smartTv.netflix(); //자식 객체의 값은 자식 클래스에 있는 멤버 사용 가능
		smartTv.chUp(); //자식 객체의 값은 부모 클래스에 있는 멤버도 사용 가능
		
		//Up casting
		//방법1
		//SmartTv()는 Tv 클래스의 참조 변수 tv1에 할당된다
		//부모클래스 타입의 참조 변수로 자식 클래스 타입의 참조값을 대입하는 것이다
		
		Tv tv1 = (Tv)new SmartTv(); // 부모 타입의 객체에 자식의 참조값을 대입		
		System.out.println(tv1);
//		tv1.netflix(); 업캐스팅 되면 자식 클래스에 만들어진 멤버는 사용 불가능하다
		
		//방법2
		Tv tv2 = (Tv)smartTv; 
		//tv2는 SmartTv 클래스의 객체를 참조하지만 업캐스팅으로 인해 Tv 타입으로 취급된다
		//따라서 Tv 클래스의 필드와 메소드에만 접근할 수 있다
		
		//방법3
		Tv tv3 = new SmartTv();
		//부모 클래스 타입의 참조 변수로 자식 클래스 타입의 객체를 참조한다
		//부모 클래스 타입의 참조 변수에 자식 클래스 타입의 객체의 주소값(참조값)을 저장한다
//		tv3.netflix();
		
		//Down Casting
		SmartTv stv3 = (SmartTv) tv3;
		stv3.netflix();
		
		//잘못된 Down Casting
//		SmartTv stv = (SmartTv) new Tv();
//		System.out.println(stv);
//		빨간 밑줄이 나타나지 않고 실행해야 오류가 나는 것을 알 수 있다
//		Down Casting은 반드시 Up Casting 된 값으로 해야한다
//		즉, Up Casting 된 값을 다시 원래 자식 타입으로 되돌리는 것이 Down Casting이다
	}
}
