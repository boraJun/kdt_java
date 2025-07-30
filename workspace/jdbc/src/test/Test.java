package test;

import java.util.List;

import dao.UserDAO;
import dto.UserDTO;

public class Test {
	public static void main(String[] args) {
		//연결테스트
//		try {
//			Connection conn = DBConnector.getConnection();
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		
		userDTO.setUserId("aaa");
		userDTO.setUserPw("aaa1234");
		userDTO.setUserName("홍길동");
		userDTO.setUserAge(20);
		userDTO.setUserGender("M");
		userDTO.setUserBirth("20000101");
		System.out.println(userDTO);
		
		//회원가입
		//userDAO.join(userDTO);
		
		//System.out.println("user Number : " + userDAO.login("aaa", "aaa1234"));
		//System.out.println("user Number : " + userDAO.login("aaa", "aaa12345"));
		
		//아이디 중복 검사
//		System.out.println(userDAO.checkId(userDTO.getUserId()));
//		System.out.println(userDAO.checkId("aaa"));
		
		//사용자 아이디 찾기
//		List<String> userIds = userDAO.findID("유리", "2017-01-01");
		
		//foreach(String userId : userIds)
		
		//회원정보 전체 수정
		userDTO.setUserId("updateTest");
		userDTO.setUserPw("123123");
		userDTO.setUserName("test");
		userDTO.setUserAge(20);
		userDTO.setUserBirth("1999-09-01");
		userDTO.setUserNumber(7);
		userDAO.update(userDTO);
		
		userDAO.delete(6);
		

		if(userDAO.delete(7)) {
			System.out.println("탈퇴 성공");
		}else {
			System.out.println("탈퇴 실패");
		}
	}
}
