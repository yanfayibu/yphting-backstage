package com.accp.action.tsy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tsy.TsyPostComplaintBiz;
import com.accp.vo.tsy.TsyPostComplaintVo;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * @ClassName:TsyPostComplaintAction.java
 * @date:2019年3月14日 @time:下午9:13:59
 * @description:帖子投诉访问类
 */
@RestController
@RequestMapping("tsyPostComplaintApi")
public class TsyPostComplaintAction {

	@Autowired
	private TsyPostComplaintBiz complaintBiz;
	
	
	/**
	 * 
	 * @title: selectPostComplaint
	 * @date:2019年3月14日 @time:下午9:17:44
	 * @param title
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:帖子投诉查询
	 */
	@GetMapping("selectPostComplaint/{title}/{pageNum}/{pageSize}")
	public PageInfo<TsyPostComplaintVo> selectPostComplaint(@PathVariable("title") String title,
			@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
			
		return complaintBiz.selectPostComplaint(title, pageNum, pageSize);
	}
}
