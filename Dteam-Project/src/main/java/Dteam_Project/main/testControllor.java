package Dteam_Project.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class testControllor {
	
	@GetMapping("con")
	public String  test() throws Exception {
		return "test";
	}
	
}