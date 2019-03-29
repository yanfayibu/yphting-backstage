package com.accp.action.tsy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tsy.TsyPostManagementBiz;
import com.accp.pojo.Post;
import com.accp.pojo.Postcollection;
import com.accp.vo.tsy.TsyPostManagementVo;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * @ClassName:TsyPostManagementAction.java
 * @date:2019年3月11日 @time:下午4:43:40
 * @description:访问控制操作类
 */
@RestController
@RequestMapping("tsyPostManagementApi")
public class TsyPostManagementAction {

	@Autowired
	private TsyPostManagementBiz managementBiz;
	
	/**
	 * 
	 * @title: queryAllPostManagement
	 * @date:2019年3月11日 @time:下午4:46:54
	 * @param fmId
	 * @param title
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:带条件查询所有的帖子管理
	 */
	@GetMapping("queryAllPostManagement/{fmId}/{title}/{pageNum}/{pageSize}")
	public PageInfo<TsyPostManagementVo> queryAllPostManagement(@PathVariable("fmId") int fmId,
			@PathVariable("title") String title, @PathVariable("pageNum") int pageNum,
			@PathVariable("pageSize") int pageSize) {

		return managementBiz.queryTsyPostManagement(fmId, title, pageNum, pageSize);

	}
	
	
	
	
	/**
	 * 
	 * @title: removePostManagement
	 * @date:2019年3月11日 @time:下午4:51:44
	 * @param postId
	 * @return
	 * @description：删除帖子管理，改变其状态
	 */
	@PutMapping("removePostManagement/{postId}")
	public Map<String, String> removePostManagement(@PathVariable("postId")int postId){
			
		Map<String, String> message = new HashMap<String, String>();
		
		message.put("code", "200");
		message.put("msg", "ok");
		managementBiz.removeTsyPostManagement(postId);
		
		return message;
		
	}
	
	
	/**
	 * 
	 * @title: queryOneTsyPostManagement
	 * @date:2019年3月11日 @time:下午8:35:51
	 * @param postId
	 * @return
	 * @description:查询一个单独的帖子对象
	 */
	@GetMapping("queryOneTsyPostManagement/{postId}")
	public Post queryOneTsyPostManagement(@PathVariable("postId")int postId) {
		return managementBiz.queryOneTsyPostManagement(postId);
	}
	
	
	@PutMapping("modifyOneTsyPostManagement/posts")
	public Map<String, String> modifyOneTsyPostManagement(@RequestBody Post post){
			
		Map<String, String> message = new HashMap<String, String>();
		
		message.put("code", "200");
		message.put("msg", "ok");
		managementBiz.modifyOneTsyPostManagement(post);
		
		return message;
		
	}
	
	
	
	
}
