package com.accp.action.tsy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tsy.TsyNewsBiz;
import com.accp.pojo.News;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * @ClassName:TsyNewsAction.java
 * @date:2019年3月1日 @time:下午4:18:53
 * @description:站内消息访问控制类
 */
@RestController
@RequestMapping("tsyNewsApi")
public class TsyNewsAction {

	@Autowired
	private TsyNewsBiz newsBiz;

	
	/**
	 * 
	 * @title: queryAllNews
	 * @date:2019年3月1日 @time:下午4:24:01
	 * @param name
	 * @param names
	 * @param newsId
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:带条件查询分页
	 */
	@GetMapping("queryAllNews/{name}/{names}/{newsId}/{pageNum}/{pageSize}")
	public PageInfo<News> queryAllNews(@PathVariable("name") String name, @PathVariable("names") String names,
			@PathVariable("newsId") int newsId, @PathVariable("pageNum") int pageNum,
			@PathVariable("pageSize") int pageSize) {
		
			System.out.println("**********"+newsId);
		
			return newsBiz.queryAllNews(name, names, newsId, pageNum, pageSize);
		
	}

}
