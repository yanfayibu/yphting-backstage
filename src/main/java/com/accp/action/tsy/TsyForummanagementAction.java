package com.accp.action.tsy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tsy.TsyForummanagementBiz;
import com.accp.pojo.Forummanagement;

/**
 * 
 * @author Tan
 * @ClassName:TsyForummanagementAction.java
 * @date:2019年3月11日 @time:下午9:36:34
 * @description:访问逻辑操作控制类
 */
@RestController
@RequestMapping("tsyForummanagementApi")
public class TsyForummanagementAction {

	@Autowired
	private TsyForummanagementBiz biz;
	
	
	/**
	 * 
	 * @title: queryAllForummanagement
	 * @date:2019年3月11日 @time:下午9:40:49
	 * @param fmId
	 * @return
	 * @description:查询所有的帖子分类
	 */
	@GetMapping("queryAllForummanagement/{fmId}")
	public List<Forummanagement> queryAllForummanagement(@PathVariable("fmId")int fmId){
		return biz.queryAllForummanagement(fmId);
	}
	
}
