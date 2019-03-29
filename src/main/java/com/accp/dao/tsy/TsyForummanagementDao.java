package com.accp.dao.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Forummanagement;

/**
 * 
 * @author Tan
 * @ClassName:TsyForummanagementDao.java
 * @date:2019年3月11日 @time:下午9:20:28
 * @description:帖子类别方法
 */
public interface TsyForummanagementDao {

	/**
	 * 
	 * @title: queryAllForummanagement
	 * @date:2019年3月11日 @time:下午9:21:35
	 * @param fmId
	 * @return
	 * @description:带条件查询所有的分类
	 */
	public List<Forummanagement> queryAllForummanagement(@Param("fmId")int fmId);
	
}
