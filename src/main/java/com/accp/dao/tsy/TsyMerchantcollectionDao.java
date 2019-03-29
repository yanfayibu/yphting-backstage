package com.accp.dao.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Merchantcollection;

/**
 * 
 * @author Tan
 * @ClassName:TsyMerchantcollectionDao.java
 * @date:2019年3月1日 @time:下午7:59:20
 * @description:商家收藏表
 */
public interface TsyMerchantcollectionDao {

	/**
	 * 
	 * @title: queryAllMerchantcollection
	 * @date:2019年3月1日 @time:下午8:46:52
	 * @param userName
	 * @param shopName
	 * @param firstServiceID
	 * @return
	 * @description:查询所有店铺收藏
	 */
	public List<Merchantcollection> queryAllMerchantcollection(@Param("userName")String userName,@Param("shopName")String shopName,@Param("firstServiceID")int firstServiceID);
	
}
