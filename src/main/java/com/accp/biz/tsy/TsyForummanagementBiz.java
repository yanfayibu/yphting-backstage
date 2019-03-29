package com.accp.biz.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tsy.TsyForummanagementDao;
import com.accp.pojo.Forummanagement;

/**
 * 
 * @author Tan
 * @ClassName:TsyForummanagementBiz.java
 * @date:2019年3月11日 @time:下午9:34:33
 * @description:帖子类别逻辑操作类
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TsyForummanagementBiz {

	@Autowired
	private TsyForummanagementDao dao;
	
	/**
	 * 
	 * @title: queryAllForummanagement
	 * @date:2019年3月11日 @time:下午9:21:35
	 * @param fmId
	 * @return
	 * @description:带条件查询所有的分类
	 */
	public List<Forummanagement> queryAllForummanagement(int fmId){
		return dao.queryAllForummanagement(fmId);
	}
	
}
