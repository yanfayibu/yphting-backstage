package com.accp.action.tsy;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tsy.TsyUserBiz;
import com.accp.pojo.Admin;


/**
 * 
 * @author Tan
 * @ClassName:UserAction.java
 * @date:2019年2月20日 @time:下午3:40:06
 * @description:后台用户访问控制类
 */
@RestController
@RequestMapping("tsyUserApi")
public class TsyUserAction {

	@Autowired
	private TsyUserBiz userBiz;
	
	/**
	 * 
	 * @title: UserLogin
	 * @date:2019年2月21日 @time:上午10:11:35
	 * @param username
	 * @param userpwd
	 * @param session
	 * @return
	 * @description:后台登录访问
	 */
	@GetMapping("UserLogin/{username}/{userpwd}")
	public Map<String, String> UserLogin(@PathVariable String username,@PathVariable String userpwd,HttpSession session) {
		
		Map<String, String> message = new HashMap<String, String>();
		
		
		Admin user=userBiz.Login(username, userpwd);
		
		if(user==null) {
			message.put("code", "500");
			message.put("msg", "no");
		}else {
			message.put("code", "200");
			message.put("msg", "ok");
			session.setAttribute("USER", user);
			
			userBiz.loginTime(user.getAdminid());
			
		}
		
		return message;
		
	}
	
	
	/**
	 * 
	 * @title: UserOne
	 * @date:2019年2月21日 @time:上午10:12:02
	 * @return
	 * @description:返回登录对象
	 */
	@GetMapping("UserOne")
	public Admin UserOne(HttpSession session) {
		
		Admin admin=(Admin)session.getAttribute("USER");
		
		return admin;
	}
	
	
	/**
	 * 
	 * @title: modifyUserPwd
	 * @date:2019年2月21日 @time:上午11:22:51
	 * @param password
	 * @param session
	 * @return
	 * @description:修改后台用户密码
	 */
	@PutMapping("modifyUserPwd/{password}")
	public Map<String, String> modifyUserPwd(@PathVariable String password,HttpSession session) {
		
		Map<String, String> message = new HashMap<String, String>();
		Admin admin=(Admin)session.getAttribute("USER");
		
		int i=userBiz.modifyUserPwd(admin.getAdminid(), password);
		if(i>0) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "500");
			message.put("msg", "no");
		}
		
		
		return message;
		
	}
	
	/**
	 * 
	 * @title: UserExit
	 * @date:2019年2月21日 @time:上午11:23:35
	 * @param session
	 * @return
	 * @description:后台用户退出
	 */
	@GetMapping("UserExit")
	public void UserExit(HttpSession session) {
		session.removeAttribute("USER");
		session.invalidate();
		
	}
	
}
