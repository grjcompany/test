package com.lcvc.test.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class LoginLogoutController {
	
	/*@Resource
	private AdminBean adminBean;
	*/
	

	@RequestMapping(value = "/admin/login", method = RequestMethod.POST)
	public String login(String username,String password,HttpSession session){
		if(username.equals("admin")&&password.equals("123")){
			return "/jsp/admin/index.jsp";
		}else{
			return "/jsp/admin/login.jsp";
		}

	}
	

}
