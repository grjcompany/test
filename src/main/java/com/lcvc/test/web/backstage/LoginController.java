package com.lcvc.test.web.backstage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/backstage")
public class LoginController {
	/*
	 * 张三丰，20180326
	 * 处理注销请求
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String username,String password){
		String url;
		if (username.equals("admin")&&password.equals("321")){
			url="/jsp/backstage/loginsuccess.jsp";
		}else {
			url="/jsp/backstage/loginerror.jsp";
		}
		return url;
	}

}
