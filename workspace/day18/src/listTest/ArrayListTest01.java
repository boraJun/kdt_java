package listTest;

import java.util.ArrayList;

//8번 : ArrayList와 제네릭
public class ArrayListTest01 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al);
		
		//요소 추가 메소드 add
//		al.add(al); // 객체 자기 자신을 추가하면 (this Collection)이 나온다
		al.add(2);
		al.add("1");
		al.add(0.5);
		al.add(true);
		
		System.out.println(al);
		
		//요소 길이 확인 메소드 size()
		//배열 length;
		//문자여 length();
		
		System.out.println(al.size());
		System.out.println(al);
		
		//ArrayList의 크기를 반복하여 요소 출력
		//요소를 가져오는 메소드 get(index)
		for(int i = 0; i < al.size(); i++) {
			System.out.println(i + " : " + al.get(i));
		}
		
		//<Element> : 제네릭
		ArrayList<Integer> al2 = new ArrayList<>();
//		al2.add("1");
//		al2.add(1); //auto boxing
		
		//반복문을 이용하여 10 ~ 1 순서대로 값 추가
		//1) for문 초기식 int i = 0; 조건식 i < 10; 증감식 i++
		//2) ArrayList 객체 al2.add(10 - i);
		//3) 반복문 밖에서 출력
		for(int i = 0; i < 10; i++) {
			al2.add(10 - i);
		}
		System.out.println(al2);
		
		//값 가져오기 : index 번호로 특정 값 가져오기 .get(idx)
		System.out.println(al2.get(0));
		
		//삭제 : index 번호로 삭제하고 삭제한 요소를 반환(int).remove(int)
		System.out.println("인덱스 1의 값 : " + al2.remove(1) + "을 삭제했습니다");
		System.out.println(al2);
		
		//삭제 : 값으로 검색하여 삭제(Object), 삭제 성공 여부를 반환 .remove(Object)
		System.out.println("값 삭제 여부 : " + al2.remove(Integer.valueOf(50)));
		System.out.println("값 삭제 여부 : " + al2.remove(Integer.valueOf(5)));
		System.out.println(al2);
		
		//수정 : 수정 전의 값을 반환 set(idx, value)
		System.out.println(al2.set(2, 100));
		System.out.println(al2);
	}
}
