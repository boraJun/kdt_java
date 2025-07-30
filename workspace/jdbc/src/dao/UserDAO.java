package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.UserDTO;

public class UserDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;

	// 아이디 중복 검사
	public boolean checkId(String id) {
		String query = "SELECT USER_NUMBER FROM TBL_USER WHERE USER_ID = ?";

		// 우리가 만든 DBConnector에서 커넥션 객체를 얻어온다(DB와 연결 완료)
		connection = DBConnector.getConnection();
		// 쿼리를 보내기 위한 preparedStatement 객체를 커넥션 객체를 커낵션 객체에서 가져온다
		try {
			preparedStatement = connection.prepareStatement(query);
			// 쿼리에 ?강 있다(미완성상태)
			// ?를 메소드의 매개변수로 받은 id로 바꿔줘야한다
			// preparedStatement 기능으로 완성시킨다
			// set자료형(물음표의 순서, 넣을 값)
			preparedStatement.setString(1, id);

			// 완성된 쿼리를 실행시키는 방법
			// 1. executeQuery()
			// SELECT 할 때 반환되는 결과값을 받기 위해 사용
			// 반환타입은 ResultSet이다

			// 2. executeUpdate()
			// select 를 제외하고 반환되는 값이 없으면 사용
			resultSet = preparedStatement.executeQuery();
			// resultSet은 쿼리의 결과(테이블)를 저장하고 있다
			// 각 데이터에 접근하는 방식은 Iterator와 동일하게 커서를 사용한다
			// next() : 현재 커서 다음에 데이터가 존재하는지를 true/false로 반환한다

			// get자료형(컬럼번호) : 커서를 다음 행으로 옮기고 해당 컬럼의 값을 자료형에 맞게 가져온다
			if (resultSet.next()) {
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("checkId() SQL 오류!!");
			e.printStackTrace();
		} finally {
			// jdbc에서 제공하는 객체들은 사용 후 닫아줘야 한다
			// 오류 여부와 상관 없이 반드시 닫아야 하므로 finally에 작성한다
			// 닫을 때도 예외가 발생할 수 있으므로 try-catch를 사용한다
			// 닫을 때는 여는 순서와 반대로 닫는다
			try {
				if (resultSet != null) {
					resultSet.close();
				}

				if (preparedStatement != null) {
					preparedStatement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("checkId() sql 닫을 때 오류");
				e.printStackTrace();
			}
		}

		return true;
	}

	// 회원가
	public void join(UserDTO userDTO) {
		String query = "INSERT INTO TBL_USER(USER_NUMBER, USER_ID, USER_PW, USER_NAME, "
				+ "USER_AGE, USER_GENDER, USER_BIRTH) " + "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?)";

		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, userDTO.getUserId());
			preparedStatement.setString(2, userDTO.getUserPw());
			preparedStatement.setString(3, userDTO.getUserName());
			preparedStatement.setInt(4, userDTO.getUserAge());
			preparedStatement.setString(5, userDTO.getUserGender());
			preparedStatement.setString(6, userDTO.getUserBirth());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("join() sql오류!!");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public int login(String userId, String userPw) {
		String query = "SELECT USER_NUMBER " + "FROM TBL_USER " + "WHERE USER_ID = ? AND USER_PW = ?";
		int userNumber = -1;
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);

			preparedStatement.setString(2, userPw);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				userNumber = resultSet.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("login() SQL 오류");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}

				if (preparedStatement != null) {
					preparedStatement.close();
				}

				if (connection != null) {
					connection.close();

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return userNumber;
	}

	// 아이디 찾기
	// 반환 타입을 List인 이유 : 이름/생일이 같은 사람이 여러 명일 수 있으므로 List로 반환
	public List<String> findID(String userName, String userBirth) {
		String query = "SELECT USER_ID FROM TBL_USER "
				+ "WHERE USER_NAME = ? AND USER_BIRTH = TO_DATE(?, 'YYYY-MM-DD')";
		// userBirth가 "YYYY-MM-DD"형식인 경우
		// SQL문에서
		// TO_DATE(?, 'YYYY-MM-DD') 형식으로 작성한다
		// JAVA코드에서
		// java.sql.Date.valueOf(userBirth) 형식으로 작성한다

		List<String> userIds = new ArrayList<>();

		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, userBirth); // YYYY-MM-DD형식으로 입력되어야 한다

			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String userId = resultSet.getString("USER_ID");
				userIds.add(userId);
			}

			if (userIds.isEmpty()) {
				System.out.println("해당하는 사용자 아이디를 찾을 수 없습니다");
			} else {
				System.out.println("찾은 사용자 아이디 : ");

				for (String userId : userIds) {
					System.out.println(userId);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("findId() sql 오류!!");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return userIds;
	}

	// 1명의 회원정보 전체 수정
	public void update(UserDTO userDTO) {
		String query = "UPDATE TBL_USER SET USER_ID = ? , USER_PW = ? , USER_NAME = ? , "
				+ "USER_AGE = ? , USER_GENDER = ? , USER_BIRTH = ? " + "WHERE USER_NUMBER = ? ";

		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, userDTO.getUserId());
			preparedStatement.setString(2, userDTO.getUserPw());
			preparedStatement.setString(3, userDTO.getUserName());
			preparedStatement.setInt(4, userDTO.getUserAge());
			preparedStatement.setString(5, userDTO.getUserGender());
			// preparedStatement.setString(6, userDTO.getUserBirth());
			preparedStatement.setDate(6, java.sql.Date.valueOf(userDTO.getUserBirth()));
			preparedStatement.setInt(7, userDTO.getUserNumber());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update() SQL오류!!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 1명의 회원정보 조회
	// (유저 생일을 JAVA의 DATE 타입으로 변환해서 다루기 => SimpleDateFormat)
	// * 을 사용하지 않는다!!(성능 저하, 속도가 저하된다)
	public UserDTO findUser(int userNumber) {
		String query = "SELECT USER_ID, USER_NAME, USER_AGE, USER_GENDER " + "FROM TBL_USER "
				+ "WHERE USER_NUMBER = ? ";

		UserDTO userDTO = null;

		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, userNumber);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				userDTO = new UserDTO();

				userDTO.setUserNumber(userNumber);
				userDTO.setUserId(resultSet.getString(1));
				userDTO.setUserPw(resultSet.getString(2));
				userDTO.setUserAge(resultSet.getInt(3));
				userDTO.setUserGender(resultSet.getString(4));
			}

		} catch (SQLException e) {
			System.out.println("findUser() sql 오류!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return userDTO;
	}

	// 회원 탈퇴
	public boolean delete(int userNumber) {
		String query = "DELETE FROM TBL_USER WHERE USER_NUMBER = ? ";
		int result = 0;
		
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, userNumber);
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("delete() SQL 오류!!");
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null)
					preparedStatement.close();
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result > 0;
	}
}
