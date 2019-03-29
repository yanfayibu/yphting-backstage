package com.accp.dao.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Messagefeedback;

/**
 * 
 * @author Tan
 * @ClassName:TsyMessageFeedBack.java
 * @date:2019年3月1日 @time:下午1:58:59
 * @description:留言反馈接口
 */
public interface TsyMessageFeedBackDao {

	/**
	 * 
	 * @title: queryAllMessageFeedBack
	 * @date:2019年3月1日 @time:下午2:00:58
	 * @return
	 * @description:查询所有的留言反馈信息
	 */
	public List<Messagefeedback> queryAllMessageFeedBack();
	
	
	/**
	 * 
	 * @title: removeMessageFeedBack
	 * @date:2019年3月1日 @time:下午2:03:26
	 * @param mfId
	 * @return
	 * @description:删除留言反馈信息
	 */
	public int removeMessageFeedBack(@Param("mfId")int mfId);
}
