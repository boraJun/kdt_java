package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	public static Connection getConnection() {
		Connection connection = null;
		
		//연결에 필요한 정보
		String userName = "kdt1";
		String password = "1234";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//jdbc url 구글링하면 나온다
		//url은 주소/어디로 전달할래? url을 정확하게 작성해야 한다
		
		try {
			//드라이버를 메모리에 할당
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//위의 라인이 문제가 없으면
			//getConnection 객체에 정보를 알려준다(userName, password, url 정보를 알려준다)
			connection = DriverManager.getConnection(url, userName, password);
			//SQLException 연결정보가 잘못 되었을 때 연결 정보 예외
			System.out.println("연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 정보 오류");
			e.printStackTrace();
		}
		
		return connection;
	}
}
