package com.accp.dao.yl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.*;
import com.accp.pojo.System;
import com.accp.vo.yl.*;


public interface IBackstageDao {
		
		
		//广告位管理
		/**
		 * 获取所有广告位分类
		 * @return
		 */
		public List<Advertisement> queryAllAdv();
		
		/**
		 * 获取所有广告位
		 * @return
		 */
		public List<AdvertisementVo> queryAllAdvVo(@Param("atid") Integer atid);
		/**
		 * 
		 * @Description 获取所有申请广告位
		 * @author yl
		 * @date 2019年3月21日
		 * @param atid
		 * @return  
		 * @throws
		 */
		public List<ApplyforVo> queryAllApplyfor(@Param("atid") Integer atid,@Param("aaid") Integer aaid);
		
		/**
		 * 修改广告位
		 * @param a
		 * @return
		 */
		public int updateAdv(@Param("a")Advertisement a);
		/**
		 * 
		 * @Description 审核广告位
		 * @author yl
		 * @date 2019年3月22日  
		 * @throws
		 */
		public void updateApplufor(@Param("alf") ApplyforVo alf);
		
		/**
		 * 新增广告位
		 * @param a
		 * @return
		 */
		public int addAdv(@Param("a")Advertisement a);
		
		/**
		 * 新增赞助商广告位
		 * @param a
		 * @return
		 */
		public int addzzs(@Param("a")Advertisementapply a);
		/**
		 * 
		 * @Description 变更前台版本布局
		 * @author yl
		 * @date 2019年3月21日
		 * @param p  
		 * @throws
		 */
		public void updatePlate(@Param("p") Integer p);
		
		/**
		 * 得到某一个列
		 * @param atid
		 * @return
		 */
		public Advertisement queryObjAdv(@Param("aid") Integer atid);
		
		/**
		 * 广告批量删除
		 * @param ids
		 * @return
		 */
		public int deleteAdv(String[] ids);
		
}
