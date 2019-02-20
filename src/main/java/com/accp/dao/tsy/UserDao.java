package com.accp.dao.tsy;
/**
 * 
 * @author Tan
 * @ClassName:UserDao.java
 * @date:2019年2月20日 @time:下午3:26:57
 * @description:后台用户管理接口
 */

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Admin;

public interface UserDao {

	/**
	 * 
	 * @title: Login
	 * @date:2019年2月20日 @time:下午3:30:54
	 * @return
	 * @description:后台用户登录
	 */
	public Admin Login(@Param("username")String username,@Param("password")String password);
	
	
}