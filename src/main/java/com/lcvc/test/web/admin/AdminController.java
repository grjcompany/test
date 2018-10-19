package com.lcvc.test.web.admin;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lcvc.test.model.Admin;

@Controller
public class AdminController {
	
	/*@Resource
	private AdminBean adminBean;
	
	*//*
	 * 修改基本信息
	 *//*
	@RequestMapping(value = "/admin/updateAdmin", method = RequestMethod.POST)
	public String updateAdmin(String username,String name,HttpSession session
			,HttpServletRequest request){
		if(username.equals("")){//如果网名为空
			request.setAttribute("myMessage", "编辑失败：账户名不能为空");
		}else if(name.equals("")){
			request.setAttribute("myMessage", "编辑失败：网名不能为空");
		}else{//如果验证通过
			Admin admin=(Admin)session.getAttribute("admin");
			Boolean status=adminBean.updateAdmin(admin.getId(), username, name);
			if(status==true){//如果编辑成功
				admin.setUsername(username);
				admin.setName(name);	
				request.setAttribute("myMessage", "编辑成功");
			}
		}
		return "/jsp/admin/adminupdate.jsp";
	}
	
	*//*
	 * 修改密码
	 *//*
	@RequestMapping(value = "/admin/updatePassword", method = RequestMethod.POST)
	public String updatePassword(String oldPass,String newPass,String confirmPass,HttpSession session
			,HttpServletRequest request){
		Admin admin=(Admin)session.getAttribute("admin");
		if(adminBean.login(admin.getUsername(), oldPass)!=null){//如果原密码正确
			if(newPass.equals(confirmPass)){//如果新密码和确认密码相同
				//保存新密码
				adminBean.updatePassword(newPass, admin.getId());
			}else{//如果不相同
				request.setAttribute("myMessage", "密码修改失败：新密码和确认密码不一致");
			}
		}else{//如果原密码错误
			request.setAttribute("myMessage", "密码修改失败：原密码不正确");
		}		
		return "/jsp/admin/passwordupdate.jsp";
	}*/
}
