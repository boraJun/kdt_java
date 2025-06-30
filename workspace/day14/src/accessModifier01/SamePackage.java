package accessModifier01;

//다른 클래스
class SamePackage {
	public void printAccess() {
		Parents p = new Parents();
		System.out.println(p.publicVar);
		System.out.println(p.protectedVar);
		System.out.println(p.defaultVar);
//    System.out.println(p.privateVar);
//    같은 패키지 내 다른 클래스에서 private 접근제한자의 필드 접근 불가
	}
}