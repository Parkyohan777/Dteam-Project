package Dteam_Project.admin.model;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AdminDAO {
	
	public AdminVO getLoginInfo(String admin_id) throws SQLException;
}
