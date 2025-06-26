package typeCasting;

//13번 : 모든 데이터 타입 조합
public class TypeCasting03 {
	public static void main(String[] args) {
		// 변수
		byte b = 10;
		short s = 100;
		char c = 'a'; // 97
		int i = 1000;
		long l = 10000L;
		float f = 3.14f;
		double d = 3.141592;
		boolean bool = true;

		// byte
		System.out.println("=========byte========");
		System.out.println("byte 타입의 값 : " + b);
		short bs = b;
//      char bc = b;
		int bi = b;
		long bl = b;
		double bd = b;
		float bf = b;
//      boolean bb = b;

		// short
		System.out.println("\n=========short========");
//      byte sb = s; 자동형변환 불가(short -> byte)
		short ss = s;
//      char sc = s;
		int si = s;
		long sl = s;
		double sd = s;
		float sf = s;
//      boolean sb = s;

		// char
		int ci = c;
		System.out.println(c);
		System.out.println(ci);
		long cl = c;
		float cf = c;
		double cd = c;
		short cs = (short) c; // 강제형변환 가능
		byte cb = (byte) c; // 강제형변환 가능

		// int
		i = 100000;
		long il = i;
		float i_f = i;
		double id = i;
		byte ib = (byte) i;
		char ic = (char) i;
		System.out.println(i);
		System.out.println(ic);

		// long
		float lf = l;
		double ld = l;
		int li = (int) l; // 강제형변환 가능

		// float
		double fd = f;
		int fi = (int) f; // 강제형변환 가능

		// double
		float df = (float) d; // 강제형변환 가능
		int di = (int) d; // 강제형변환 가능

		// boolean
//      int bi2 = (int)bool;

	}
}
