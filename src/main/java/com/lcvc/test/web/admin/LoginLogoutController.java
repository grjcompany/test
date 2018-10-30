package com.lcvc.test.web.admin;

import com.lcvc.test.model.Admin;
import com.lcvc.test.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginLogoutController {
	
	@Resource
	private AdminService adminService;



	@RequestMapping(value = "/admin/toLogin")
	public String toLogin(HttpServletRequest request){
		request.setAttribute("count",15);
		return "/jsp/admin/signin.jsp";
	}



	@RequestMapping(value = "/admin/login")
	public String login(String username,String password,HttpSession session){
		Admin admin=adminService.login(username,password);
		if(admin!=null){
			session.setAttribute("admin",admin);
			return "redirect:/admin/index";
		}else{
			return "/jsp/admin/signin.jsp";
		}
	}

	@RequestMapping(value = "/admin/index")
	public String index(HttpSession session){

		return "/jsp/admin/index.jsp";
	}



	@RequestMapping(value = "/admin/logout")
	public String logout(HttpSession session){
		session.removeAttribute("admin");
		return "/admin/toLogin";

	}




}
