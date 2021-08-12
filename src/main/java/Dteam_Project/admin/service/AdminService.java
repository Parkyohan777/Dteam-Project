package Dteam_Project.admin.service;

import java.sql.SQLException;

import Dteam_Project.admin.model.AdminVO;

public interface AdminService {
	
	public AdminVO getLoginInfo(String admin_id) throws SQLException;
}
