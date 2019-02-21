package com.accp.action.tsy;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tsy.UserBiz;
import com.accp.pojo.Admin;


/**
 * 
 * @author Tan
 * @ClassName:UserAction.java
 * @date:2019年2月20日 @time:下午3:40:06
 * @description:后台用户访问控制类
 */
@RestController()
@RequestMapping("userApi")
public class UserAction {

	@Autowired
	private UserBiz userBiz;
	
	
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
		}
		
		return message;
		
	}
	
	
}
