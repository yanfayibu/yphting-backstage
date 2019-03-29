package com.accp.action.tsy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Tan
 * @ClassName:TsyPostCollectionAction.java
 * @date:2019年3月1日 @time:下午9:59:28
 * @description:帖子收藏访问控制类
 */

import com.accp.biz.tsy.TsyPostCollectionBiz;
import com.accp.pojo.Postcollection;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("tsyPostCollectionApi")
public class TsyPostCollectionAction {

	@Autowired
	private TsyPostCollectionBiz postCollectionBiz;

	/**
	 * 
	 * @title: queryAllMerchantcollection
	 * @date:2019年3月1日 @time:下午10:02:53
	 * @param userName
	 * @param title
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:帖子收藏所有查询
	 */
	@GetMapping("queryAllPostCollection/{userName}/{title}/{pageNum}/{pageSize}")
	public PageInfo<Postcollection> queryAllPostCollection(@PathVariable("userName") String userName,
			@PathVariable("title") String title, @PathVariable("pageNum") int pageNum,
			@PathVariable("pageSize") int pageSize) {

		return postCollectionBiz.queryAllPostCollection(userName, title, pageNum, pageSize);

	}

}
