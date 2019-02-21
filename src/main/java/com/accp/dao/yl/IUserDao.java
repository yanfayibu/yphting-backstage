package com.accp.dao.yl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.User;

public interface IUserDao {
		/**
		 * 
		 * @Description 查询所有用户
		 * @author Administrator
		 * @date 2019年2月20日  
		 * @throws
		 */
		public List<User> selectUserList(@Param("userName") String userName);
		/**
		 * 
		 * @Description 查询所有商家
		 * @author Administrator
		 * @date 2019年2月21日
		 * @param userName
		 * @param shopName
		 * @param merchantType
		 * @return  
		 * @throws
		 */
		public List<User> selectShop(@Param("userName")String userName,@Param("shopName")String shopName,@Param("merchantType")String merchantType);
}
