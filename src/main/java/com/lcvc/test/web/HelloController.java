package com.lcvc.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {
	/*
	 * 张三丰，20180326
	 * 处理注销请求
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(){
		return "/hello.jsp";
	}

}
