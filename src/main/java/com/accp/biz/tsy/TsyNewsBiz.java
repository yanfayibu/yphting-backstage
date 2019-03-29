package com.accp.biz.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tsy.TsyNewsDao;
import com.accp.pojo.News;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * @ClassName:TsyNewsBiz.java
 * @date:2019年3月1日 @time:下午4:15:08
 * @description:消息逻辑操作类
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TsyNewsBiz {

	@Autowired
	private TsyNewsDao newsDao;
	
	/**
	 * 
	 * @title: queryAllNews
	 * @date:2019年3月1日 @time:下午3:58:46
	 * @return
	 * @description:查询所有的站内消息
	 */
	public PageInfo<News> queryAllNews(String theSenderName,String addResseeName,int newsId,int pageNum,int pageSize){
		
		PageHelper.startPage(pageNum, pageSize);
		
		return new PageInfo<News>(newsDao.queryAllNews(theSenderName, addResseeName, newsId));
		
	}
	
}
