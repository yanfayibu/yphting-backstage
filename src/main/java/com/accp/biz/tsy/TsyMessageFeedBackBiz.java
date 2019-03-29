package com.accp.biz.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tsy.TsyMessageFeedBackDao;
import com.accp.pojo.Messagefeedback;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * @ClassName:TsyMessageFeedBackBiz.java
 * @date:2019年3月1日 @time:下午2:05:16
 * @description:留言反馈信息操作类
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TsyMessageFeedBackBiz {

	@Autowired
	private TsyMessageFeedBackDao backDao;
	
	
	
	
	/**
	 * 
	 * @title: queryAllMessageFeedBack
	 * @date:2019年3月1日 @time:下午2:00:58
	 * @return
	 * @description:查询所有的留言反馈信息
	 */
	public PageInfo<Messagefeedback> queryAllMessageFeedBack(int pageNum,int pageSize){
		
		PageHelper.startPage(pageNum, pageSize);
		
		return new PageInfo<Messagefeedback>(backDao.queryAllMessageFeedBack());
		
	}
	
	
	
	
	
	
	/**
	 * 
	 * @title: removeMessageFeedBack
	 * @date:2019年3月1日 @time:下午2:03:26
	 * @param mfId
	 * @return
	 * @description:删除留言反馈信息
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeMessageFeedBack(int mfId) {
		return backDao.removeMessageFeedBack(mfId);
	}
	
	
}
