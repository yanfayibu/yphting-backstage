package com.accp.dao.tsy;
/**
 * 
 * @author Tan
 * @ClassName:TsyPostManagementDao.java
 * @date:2019年3月11日 @time:下午3:49:40
 * @description:帖子管理接口类
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Post;
import com.accp.vo.tsy.TsyPostManagementVo;

public interface TsyPostManagementDao {

	/**
	 * 
	 * @title: queryTsyPostManagement
	 * @date:2019年3月11日 @time:下午3:51:48
	 * @param fmId	帖子分类
	 * @param title	帖子标题
	 * @return
	 * @description:根据帖子分类和帖子标题查询发表的帖子
	 */
	public List<TsyPostManagementVo> queryTsyPostManagement(@Param("fmId") int fmId, @Param("title") String title);

	/**
	 * 
	 * @title: removeTsyPostManagement
	 * @date:2019年3月11日 @time:下午3:53:34
	 * @param postId	帖子编号
	 * @return
	 * @description:删除帖子
	 */
	public int removeTsyPostManagement(@Param("postId") int postId);
	
	
	/**
	 * 
	 * @title: queryOneTsyPostManagement
	 * @date:2019年3月11日 @time:下午3:56:59
	 * @return
	 * @description:查询一个帖子对象
	 */
	public Post queryOneTsyPostManagement(@Param("postId") int postId);
	
	
	/**
	 * 
	 * @title: modifyOneTsyPostManagement
	 * @date:2019年3月11日 @time:下午3:59:40
	 * @param post 一个帖子对象
	 * @return
	 * @description:传值一个对象让其修改
	 */
	public int modifyOneTsyPostManagement(@Param("post")Post post);
}
