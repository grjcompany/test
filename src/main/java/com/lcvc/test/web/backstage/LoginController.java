package com.lcvc.test.web.backstage;

import com.lcvc.test.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
	@ResponseBody
	@RequestMapping(value = "/login")
	public Map<String,Integer> login(String username,String password){
		Map<String,Integer> map=new HashMap<String,Integer>();//定义一个map集合
		if(adminService.login(username, password)){
			map.put("status", 1);
			//return "redirect:/admin/index";
		}else{//如果登录失败
			map.put("status", -1);
			//return "/jsp/admin/login.jsp";
		}
		return map;

	}

}
