package com.accp.biz.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tsy.TsyPostComplaintDao;
import com.accp.vo.tsy.TsyPostComplaintVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 
 * @author Tan
 * @ClassName:TsyPostComplaintBiz.java
 * @date:2019年3月14日 @time:下午9:12:58
 * @description:帖子投诉逻辑操作
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TsyPostComplaintBiz {

	@Autowired
	private TsyPostComplaintDao complaintDao;
	
	/**
	 * 
	 * @title: selectPostComplaint
	 * @date:2019年3月14日 @time:下午9:04:37
	 * @param title
	 * @return
	 * @description:帖子投诉带条件查询
	 */
	public PageInfo<TsyPostComplaintVo> selectPostComplaint(String title,int pageNum,int pageSize){
		
		PageHelper.startPage(pageNum, pageSize);
		
		return new PageInfo<TsyPostComplaintVo>(complaintDao.selectPostComplaint(title));
		
	}
	
}
