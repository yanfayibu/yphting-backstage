package com.accp.dao.tsy;
/**
 * 
 * @author Tan
 * @ClassName:TsyPostComplaintDao.java
 * @date:2019年3月14日 @time:下午9:03:00
 * @description:帖子投诉管理接口
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.tsy.TsyPostComplaintVo;

public interface TsyPostComplaintDao {

	/**
	 * 
	 * @title: selectPostComplaint
	 * @date:2019年3月14日 @time:下午9:04:37
	 * @param title
	 * @return
	 * @description:帖子投诉带条件查询
	 */
	public List<TsyPostComplaintVo> selectPostComplaint(@Param("title")String title);
	
}
