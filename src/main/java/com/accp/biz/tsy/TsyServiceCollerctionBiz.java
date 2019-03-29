package com.accp.biz.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tsy.TsyServiceCollerctionDao;
import com.accp.pojo.Servicecollection;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * TsyServiceCollerctionBiz
 * @date:2019年3月1日 @time:下午9:56:03
 * @description:服务收藏逻辑操作类
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TsyServiceCollerctionBiz {

	@Autowired
	private TsyServiceCollerctionDao serviceCollerctionDao;
	
	/**
	 * 
	 * @title: queryAllPostCollection
	 * @date:2019年3月1日 @time:下午9:51:08
	 * @param userName
	 * @param title
	 * @return
	 * @description:帖子收藏查询 
	 */
	public PageInfo<Servicecollection> queryAllServiceCollerction(String userName,String title,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Servicecollection>(serviceCollerctionDao.queryAllServiceCollerction(userName, title));
	}

	
}
