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
	public Admin Login(String username, String password) {
		return user.Login(username, password);
	}

	/**
	 * 
	 * @title: modify
	 * @date:2019年2月21日 @time:上午11:03:37
	 * @param adminID
	 * @param password
	 * @return
	 * @description:修改后台用户密码
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int modifyUserPwd(int adminID, String password) {
		return user.modifyUserPwd(adminID, password);
	}

	/**
	 * 
	 * @title: loginTime
	 * @date:2019年2月21日 @time:上午11:39:10
	 * @return
	 * @description:管理员最后一次登录时间
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int loginTime(int adminID) {
		return user.loginTime(adminID);
	}

}
