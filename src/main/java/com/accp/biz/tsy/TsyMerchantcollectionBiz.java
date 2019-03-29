package com.accp.biz.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tsy.TsyMerchantcollectionDao;
import com.accp.pojo.Merchantcollection;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * @ClassName:TsyMerchantcollectionBiz.java
 * @date:2019年3月1日 @time:下午8:57:10
 * @description:店铺收藏逻辑操作类
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TsyMerchantcollectionBiz {

	@Autowired
	private TsyMerchantcollectionDao merchantcollectionDao;
	
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
	public PageInfo<Merchantcollection> queryAllMerchantcollection(String userName,String shopName,int firstServiceID,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Merchantcollection>(merchantcollectionDao.queryAllMerchantcollection(userName, shopName, firstServiceID));
	}
	
	
}
