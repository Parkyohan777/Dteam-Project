package Dteam_Project.user.service;

import java.sql.SQLException;
import java.util.List;

import Dteam_Project.user.model.UserVO;

public class UserService {
	
	public int insertUser(UserVO userVO) throws SQLException;
	
	public int updateUser(UserVO userVO) throws SQLException;
	
	public int deleteUser(UserVO userVO) throws SQLException;
	
	public UserVO getUser(String user_id) throws SQLException;	
	
	public List<UserVO> getUserList() throws SQLException;

}
