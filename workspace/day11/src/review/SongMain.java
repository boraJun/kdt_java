package review;

class Song {
	// 필드
	String title;
	String artist;
	String album;

	// 메소드
	// 정보출력메소드
	void displayInfo() {
		System.out.println("노래 제목 : " + title);
		System.out.println("가수명 : " + artist);
		System.out.println("앨범발매일 : " + album);
	}
}

//메인 메소드는 public이 붙은 클래스(대표클래스)안에 존재해야한다
//대표클래스 이름과 class 파일의 이름이 동일해야한다
public class SongMain {

	// 메인메소드
	public static void main(String[] args) {
		// 객체화
		Song song = new Song();

		song.title = "HAPPY";
		song.artist = "DAY6";
		song.album = "2025년 06월 25일";

		// 매개변수 x, 리턴값 x
		song.displayInfo();
	}
}
