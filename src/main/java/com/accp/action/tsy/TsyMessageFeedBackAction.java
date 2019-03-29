package com.accp.action.tsy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tsy.TsyMessageFeedBackBiz;
import com.accp.pojo.Messagefeedback;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * @ClassName:TsyMessageFeedBackAction.java
 * @date:2019年3月1日 @time:下午2:12:12
 * @description：留言反馈访问控制类
 */
@RestController
@RequestMapping("tsyMessageFeedBackApi")
public class TsyMessageFeedBackAction {

	@Autowired
	private TsyMessageFeedBackBiz backBiz;
	
	
	/**
	 * 
	 * @title: queryAllMessageFeedBack
	 * @date:2019年3月1日 @time:下午2:19:42
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:查询所有的留住反馈信息并且进行分布处理
	 */
	@GetMapping("queryAllMessageFeedBack/{pageNum}/{pageSize}")
	public PageInfo<Messagefeedback> queryAllMessageFeedBack(@PathVariable("pageNum")int pageNum,@PathVariable("pageSize")int pageSize) {
		
		return backBiz.queryAllMessageFeedBack(pageNum, pageSize);
		
	}
	
	
	/**
	 * 
	 * @title: removeMessageFeedBack
	 * @date:2019年3月1日 @time:下午2:21:38
	 * @param mfId
	 * @return
	 * @description:删除留言反馈信息
	 */
	@DeleteMapping("removeMessageFeedBack/{mfId}")
	public Map<String, String> removeMessageFeedBack(@PathVariable("mfId")int mfId){
		
		Map<String, String> message = new HashMap<String, String>();
		
		message.put("code", "200");
		message.put("msg", "ok");
		
		
		
		return message;
		
	}
	
}
