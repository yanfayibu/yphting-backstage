package com.accp.biz.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tsy.TsyPostManagementDao;
import com.accp.pojo.Post;
import com.accp.vo.tsy.TsyPostManagementVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * @ClassName:TsyPostManagementBiz.java
 * @date:2019年3月11日 @time:下午4:19:54
 * @description:帖子管理逻辑操作类
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TsyPostManagementBiz {

	@Autowired
	private TsyPostManagementDao postManagementDao;
	
	/**
	 * 
	 * @title: queryTsyPostManagement
	 * @date:2019年3月11日 @time:下午3:51:48
	 * @param fmId	帖子分类
	 * @param title	帖子标题
	 * @return
	 * @description:根据帖子分类和帖子标题查询发表的帖子
	 */
	public PageInfo<TsyPostManagementVo> queryTsyPostManagement(int fmId,String title,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(postManagementDao.queryTsyPostManagement(fmId, title));
	}

	/**
	 * 
	 * @title: removeTsyPostManagement
	 * @date:2019年3月11日 @time:下午3:53:34
	 * @param postId	帖子编号
	 * @return
	 * @description:删除帖子
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeTsyPostManagement(int postId) {
		return postManagementDao.removeTsyPostManagement(postId);
	}
	
	
	/**
	 * 
	 * @title: queryOneTsyPostManagement
	 * @date:2019年3月11日 @time:下午3:56:59
	 * @return
	 * @description:查询一个帖子对象
	 */
	public Post queryOneTsyPostManagement(int postId) {
		return postManagementDao.queryOneTsyPostManagement(postId);
	}
	
	
	/**
	 * 
	 * @title: modifyOneTsyPostManagement
	 * @date:2019年3月11日 @time:下午3:59:40
	 * @param post 一个帖子对象
	 * @return
	 * @description:传值一个对象让其修改
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int modifyOneTsyPostManagement(Post post) {
		return postManagementDao.modifyOneTsyPostManagement(post);
	}
	
}
