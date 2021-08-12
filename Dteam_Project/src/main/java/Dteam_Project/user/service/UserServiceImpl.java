package Dteam_Project.user.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Dteam_Project.user.model.UserDAO;
import Dteam_Project.user.model.UserVO;

@Service
public class UserServiceImpl {
	@Autowired
	UserDAO userDAO;

	@Override
	public List<UserVO> getUserList() throws SQLException {
		List<UserVO> userList = userDAO.getUserList();
		return userList;
	}

	@Override
	public UserVO getUser(String user_id) throws SQLException {
		UserVO userVO = userDAO.getUser(code);
		return userVO;
	}

	@Override
	public int updateUser(UserVO userVO) throws SQLException {
		int cnt = userDAO.updateUser(userVO);
		return cnt;
	}

	@Override
	public int deleteUser(String user_id) throws SQLException {
		int cnt = userDAO.deleteUser(user_id);
		return cnt;
	}


	@Override
	public int insertGoods(GoodsVO goodsVO) throws SQLException {
		int cnt = goodsDAO.insertGoods(goodsVO);
		return cnt;
	}


}
