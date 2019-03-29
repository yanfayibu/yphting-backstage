package com.accp.dao.tsy;
/**
 * 
 * @author Tan
 * @ClassName:TsyNewsDao.java
 * @date:2019年3月1日 @time:下午3:57:58
 * @description:消息表接口类
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.News;

public interface TsyNewsDao {

	/**
	 * 
	 * @title: queryAllNews
	 * @date:2019年3月1日 @time:下午3:58:46
	 * @return
	 * @description:查询所有的站内消息
	 */
	public List<News> queryAllNews(@Param("theSenderName")String theSenderName,@Param("addResseeName")String addResseeName,@Param("newsId")int newsId);
	
}
