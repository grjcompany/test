package com.lcvc.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
	/*
	 * 张三丰，20180326
	 * 处理注销请求
	 */
	@RequestMapping(value = "/hello")
	public String hello(){
		return "jsp/hello.jsp";
	}

}
