package com.lcvc.test.web.backstage;

import com.lcvc.test.model.Admin;
import com.lcvc.test.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping(value = "/backstage")
public class LoginController {
	/*
	 * 张三丰，20180326
	 * 处理注销请求
	 */
	@Resource
	private AdminService adminService;


	/*
	 * 跳转到登录页面
	 */
	@RequestMapping(value = "/toLogin")
	public String toLogin(){
		return "/jsp/backstage/login.jsp";
	}



	/*
	 * 后台登录处理
	 */
	@RequestMapping(value = "/login")
	public String login(String username,String password,HttpSession session){
		Admin admin=adminService.login(username, password);
		if(admin!=null){
			session.setAttribute("admin",admin);
			return "redirect:/backstage/adminmanage/toManageAdmin";
		}else{
			return "/jsp/backstage/loginerror.jsp";
		}
	}

	/**
	 * 注销
	 * @return
	 */
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session){
		session.removeAttribute("admin");
		return "/jsp/backstage/login.jsp";

	}

}
