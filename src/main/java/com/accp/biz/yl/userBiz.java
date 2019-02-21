package com.accp.biz.yl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.yl.IUserDao;
import com.accp.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @Description 用户逻辑类
 * @author Administrator
 * @date 2019年2月20日
 */
@Service
public class userBiz {
	@Autowired
	private IUserDao dao;
	/**
	 * 
	 * @Description 查询全部用户，分页
	 * @author Administrator
	 * @date 2019年2月20日
	 * @return  
	 * @throws
	 */
	public PageInfo<User> findUserListByPage(Integer p,Integer s,String userName) {
		PageHelper.startPage(p, s);
		return new PageInfo<User>(dao.selectUserList(userName));
	}
	/**
	 * 
	 * @Description 导出Excel
	 * @author Administrator
	 * @date 2019年2月20日
	 * @return  
	 * @throws
	 */
	public List<User> findUserList(String userName) {
		return dao.selectUserList(userName);
	}
	
	/**
	 * 
	 * @Description 查询所有商家，分页
	 * @author Administrator
	 * @date 2019年2月21日
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @param shopName
	 * @param merchantType
	 * @return  
	 * @throws
	 */
	public PageInfo<User> queryShop(Integer pageNum, Integer pageSize,String userName,String shopName,String merchantType) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<User>(dao.selectShop(userName, shopName, merchantType));
	}
}
