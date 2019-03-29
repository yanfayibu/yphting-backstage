package com.accp.action.tsy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tsy.TsyMerchantcollectionBiz;
import com.accp.pojo.Merchantcollection;
import com.accp.pojo.News;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * @ClassName:TsyMerchantcollectionAction.java
 * @date:2019年3月1日 @time:下午9:00:51
 * @description:店铺收藏访问控制类
 */
@RestController
@RequestMapping("tsyMerchantcollectionApi")
public class TsyMerchantcollectionAction {

	@Autowired
	private TsyMerchantcollectionBiz merchantcollectionBiz;
	
	
	/**
	 * 
	 * @title: queryAllNews
	 * @date:2019年3月1日 @time:下午9:05:13
	 * @param userName
	 * @param shopName
	 * @param firstServiceID
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:带条件查询所有的收藏店铺
	 */
	@GetMapping("queryAllMerchantcollection/{userName}/{shopName}/{firstServiceID}/{pageNum}/{pageSize}")
	public PageInfo<Merchantcollection> queryAllMerchantcollection(@PathVariable("userName") String userName, @PathVariable("shopName") String shopName,
			@PathVariable("firstServiceID") int firstServiceID, @PathVariable("pageNum") int pageNum,
			@PathVariable("pageSize") int pageSize) {
			
			return merchantcollectionBiz.queryAllMerchantcollection(userName, shopName, firstServiceID, pageNum, pageSize);
		
	}
	
}
