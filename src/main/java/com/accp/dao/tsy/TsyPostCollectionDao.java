package com.accp.dao.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Merchantcollection;
import com.accp.pojo.Postcollection;

/**
 * 
 * @author Tan
 * @ClassName:TsyPostCollectionDao.java
 * @date:2019年3月1日 @time:下午9:48:50
 * @description:BBS收藏（帖子收藏）接口
 */
public interface TsyPostCollectionDao {

	/**
	 * 
	 * @title: queryAllPostCollection
	 * @date:2019年3月1日 @time:下午9:51:08
	 * @param userName
	 * @param title
	 * @return
	 * @description:帖子收藏查询 
	 */
	public List<Postcollection> queryAllPostCollection(@Param("userName")String userName,@Param("title")String title);

	
}
