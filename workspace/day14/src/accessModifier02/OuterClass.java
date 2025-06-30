package accessModifier02;
//7번 : 접근 제한자
import accessModifier01.Parents;
//다른 패키지의 다른 클래스에서 필드 접근 => public
public class OuterClass {
	public void printAccess() {
		Parents p = new Parents();
		System.out.println(p.publicVar);
	}
}
