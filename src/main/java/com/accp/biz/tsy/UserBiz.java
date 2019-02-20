package com.accp.biz.tsy;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tsy.UserDao;
import com.accp.pojo.Admin;

/**
 * 
 * @author Tan
 * @ClassName:UserBiz.java
 * @date:2019年2月20日 @time:下午3:37:21
 * @description:后台用户逻辑操作类
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class UserBiz {
	@Autowired
	private UserDao user;
	/**
	 * 
	 * @title: Login
	 * @date:2019年2月20日 @time:下午3:30:54
	 * @return
	 * @description:后台用户登录
	 */
	public Admin Login(String username,String password) {
		return user.Login(username, password);
	}
	
	
}
