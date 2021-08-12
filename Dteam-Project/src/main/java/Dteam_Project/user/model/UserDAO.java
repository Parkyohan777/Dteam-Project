package Dteam_Project.user.model;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository
@Mapper		
public interface UserDAO {
	
	public UserVO getUserInfo(String user_id) throws SQLException;
	
	public int insertUser(UserVO userVO) throws SQLException;
	
	public int modifyUser(UserVO userVO) throws SQLException;
	
	public int delUser(UserVO userVO) throws SQLException;
}


