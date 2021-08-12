package Dteam_Project.user.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Dteam_Project.user.model.UserDAO;
import Dteam_Project.user.model.UserVO;

@Service
@Transactional
public class UserService implements UserDAO {
	
	@Autowired
	private UserDAO userDAO;
	public UserVO getUserInfo(String user_id) throws SQLException {
		UserVO userVO = userDAO.getUserInfo(user_id);
		return userVO;
	}
	
	public int insertUser(UserVO userVO) throws SQLException {
		int cnt = userDAO.insertUser(userVO);
		return cnt;
	}
	
	public int modifyUser(UserVO userVO) throws SQLException {
		return (Integer) null;
	}
	
	public int delUser(UserVO userVO) throws SQLException {
		return (Integer) null;
	}
}
