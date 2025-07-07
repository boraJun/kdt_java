package typeCasting;
//13번 : 모든 데이터 타입 조합
public class TypeCastingTest03 {
	public static void main(String[] args) { //main 메소드 중괄호영역 시작
		//변수
		byte b = 10; //byte 타입 b 변수 선언 후, 10 값 대입
		short s = 100; //short  타입 s 변수 선언 후, 100 값 대입
		char c = 'a'; //97 // 문자형 c 변수 선언 후, a 값 대입
		int i = 1000; // 정수형 i 변수 선언 후, 1000 값 대입
		long l = 10000L; // 정수형 l 변수 선언 후, 10000 값 대입
		float f = 3.14f; // 실수형 f 변수 선언 후, 3.14 값 대입
		double d = 3.141592; // 실수형 d 변수 선언 후, 3.141592 값 대입
		boolean bool = true; // 논리형 bool 변수 선언 후, true 값 대입
		
		//byte
		System.out.println("=========byte========"); //소괄호 안에 있는 내용 출력
		System.out.println("byte 타입의 값 : " + b); //소괄호안에 있는 내용 출력
		short bs = b; //short 타입 bs 변수 선언 후, b 대입
//		char bc = b;
		int bi = b; //정수형 타입 bi 변수 선언 후, b 대입
		long bl = b; //정수형 타입 bl 변수 선언 후, b 대입
		double bd = b; //실수형 타입 bd 변수 선언 후, b 대입
		float bf = b; //실수형 타입 bf 변수 선언 후, b 대입
//		boolean bb = b;
		
		//short
		System.out.println("\n=========short========"); //소괄호 안에 있는 내용 출력
//		byte sb = s; 자동형변환 불가(short -> byte)
		short ss = s; //short 타입 s 변수 선언 후, s 대입
//		char sc = s;
		int si = s; //정수형 타입 si 변수 선언 후, s 대입
		long sl = s; //정수형 타입 sl 변수 선언 후, s 대입
		double sd = s; //실수형 타입 sd 변수 선언 후, s 대입
		float sf = s; //실수형 타입 sf 변수 선언 후, s 대입
//		boolean sb = s;
		
		//char
		int ci = c; // 타입 c 변수 선언 후, c 대입
		System.out.println(c); // c 변수 출력
		System.out.println(ci); // ci 변수 출력
		long cl = c; // 정수형 타입 cl 변수 선언 후, c 대입
		float cf = c; // 실수형 타입 cf 변수 선언 후, c 대입
		double cd = c; // 실수형 타입 cd 변수 선언 후, c 대입
		short cs = (short)c; //강제형변환 가능 // short 타입 cs 변수 선언 후, c 대입
		byte cb = (byte)c; //강제형변환 가능  // byte 타입 cb 변수 선언 후, c 대입
		
		//int
		i = 100000; // 정수형 변수 i에 100000 값 대입
		long il = i; // 타입 il 변수 선언 후, i 대입
		float i_f = i; // 타입 i_f 변수 선언 후, i 대입
		double id = i; // 타입 id 변수 선언 후, i 대입
		byte ib = (byte)i; // 타입 ib 변수 선언 후, i 대입
		char ic = (char)i; // 타입 ic 변수 선언 후, i 대입
		System.out.println(i); // i 변수 출력
		System.out.println(ic); // ic 변수 출력
		
		//long
		float lf = l; // 실수형 lf 변수를 선언하고, l 변수를 대입
		double ld = l; // 실수형 ld 변수를 선언하고, l 변수를 대입
		int li = (int)l; //강제형변환 가능
		
		//float
		double fd = f; // 실수형 fd 변수를 선언하고, f 변수를 대입
		int fi = (int)f; //강제형변환 가능 // 정수형 fi 변수를 선언하고, f 변수를 대입
		
		//double
		float df = (float)d; //강제형변환 가능 // 실수형 df 변수를 선언하고, d 변수를 대입
		int di = (int)d; //강제형변환 가능 // 정수형 di 변수를 선언하고, d 변수를 대입
		
		//boolean
//		int bi2 = (int)bool;
		
		
	} //main 메소드 중괄호영역 끝
}




