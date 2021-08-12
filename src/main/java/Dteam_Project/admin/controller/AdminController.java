package Dteam_Project.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Dteam_Project.admin.model.AdminVO;
import Dteam_Project.admin.service.AdminService;

@Controller
@RequestMapping("ad")
public class AdminController {
	
	@Autowired
	private AdminService adminsevice;
	
	@GetMapping("login")
	public String login() throws Exception{
		return "admin/adminlogin";
	}
	
	@PostMapping("login")
	public String loginPost(HttpServletRequest request,Model model) throws Exception{
		
		String admin_id = request.getParameter("admin_id");
		System.out.println("아이디:"+admin_id);
		String admin_pw = request.getParameter("admin_pw");
		AdminVO adminVO = adminsevice.getLoginInfo(admin_id);
	
		System.out.println("adminVO:"+adminVO);
		
		if(adminVO  == null) {
			model.addAttribute("errMsg", "아이디가 없습니다.");
			return "error";
		}
		
		if(adminVO.getAdmin_pw().equals(admin_pw)) {
			model.addAttribute("adminvo", adminVO);
			return "admin/adminmain";
		}else {
			model.addAttribute("errMsg", "암호가 틀립니다.");
			return "error";
		}
	}
}
