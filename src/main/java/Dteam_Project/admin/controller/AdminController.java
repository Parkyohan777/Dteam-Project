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
		System.out.println("test");
		return "admin/adminlogin";
	}
	
	@PostMapping("login")
	public String loginPost(HttpServletRequest request,Model model) throws Exception{
		
		String loginId = request.getParameter("admin_id");
		String loginPass = request.getParameter("admin_pw");
		AdminVO adminVO = adminsevice.getLoginInfo(loginId);
		
		System.out.println("아이디:"+loginId);
		System.out.println("비번:"+loginPass);
		
		if(adminVO  == null) {
			model.addAttribute("errMsg", "아이디가 없습니다.");
			return "error";
		}
		
		if(adminVO.getAdmin_pw().equals(loginPass)) {
			model.addAttribute("adminvo", adminVO);
			return "admin/adminmain";
		}else {
			model.addAttribute("errMsg", "암호가 틀립니다.");
			return "error";
		}
	}
}
