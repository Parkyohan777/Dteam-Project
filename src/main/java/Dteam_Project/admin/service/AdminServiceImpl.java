package Dteam_Project.admin.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Dteam_Project.admin.model.AdminDAO;
import Dteam_Project.admin.model.AdminVO;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDAO admindao;

	@Override
	public AdminVO getLoginInfo(String admin_id) throws SQLException {
		
		AdminVO adminVO =admindao.getLoginInfo(admin_id);
		
		return adminVO;
	}
	
	
}
