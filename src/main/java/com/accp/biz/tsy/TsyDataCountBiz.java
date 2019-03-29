package com.accp.biz.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tsy.TsyDataCountDao;
import com.accp.pojo.Goldnotes;
import com.accp.pojo.Putforward;
import com.accp.vo.tsy.TsyChongZiVo;
import com.accp.vo.tsy.TsyGuangGaoVO;
import com.accp.vo.tsy.TsyTiXianBankVo;
import com.accp.vo.tsy.TsyTiXianDataCountVo;
import com.accp.vo.tsy.TsyTuiKuanVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * @ClassName:TsyDataCountBiz.java
 * @date:2019年3月21日 @time:上午11:13:07
 * @description:数据统计业务逻辑操作类
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TsyDataCountBiz {

	@Autowired
	private TsyDataCountDao dao;
	
	
	/**
	 * 
	 * @title: queryTiXianYearMonth
	 * @date:2019年3月21日 @time:上午11:06:06
	 * @return
	 * @description:按年份与月份分组后，再排序，查询每年中月份
	 */
	public PageInfo<TsyTiXianDataCountVo> queryTiXianYearMonth(int year,int month,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<TsyTiXianDataCountVo>(dao.queryTiXianYearMonth(year, month));
	}
	
	
	
	/**
	 * 
	 * @title: queryTiXianYearMonth
	 * @date:2019年3月21日 @time:下午3:14:19
	 * @param year
	 * @param month
	 * @return
	 * @description:查询每个月的所有数据
	 */
	public PageInfo<Putforward> queryTiXianMonth(int years,int months,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		
		return new PageInfo<Putforward>(dao.queryTiXianMonth(years, months));
	}
	
	
	/**
	 * 
	 * @title: queryTiXianBank
	 * @date:2019年3月21日 @time:下午4:12:45
	 * @param years
	 * @param months
	 * @return
	 * @description:提现银行分类图表报表显示 
	 */
	public List<TsyTiXianBankVo> queryTiXianBank(int years,int months){
		return dao.queryTiXianBank(years, months);
	}
	
	
	
	
	/**
	 * 
	 * @title: queryChongZhiYearMonth
	 * @date:2019年3月21日 @time:上午11:06:06
	 * @return
	 * @description:按年份与月份分组后，再排序，查询每年中月份
	 */
	public PageInfo<TsyTiXianDataCountVo> queryChongZhiYearMonth(int year,int month,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<TsyTiXianDataCountVo>(dao.queryChongZhiYearMonth(year, month));
	}
	
	
	
	/**
	 * 
	 * @title: queryChongZhiMonth
	 * @date:2019年3月21日 @time:下午3:14:19
	 * @param year
	 * @param month
	 * @return
	 * @description:查询每个月的所有数据
	 */
	public PageInfo<TsyChongZiVo> queryChongZhiMonth(int years,int months,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		
		return new PageInfo<TsyChongZiVo>(dao.queryChongZhiMonth(years, months));
	}
	
	
	/**
	 * 
	 * @title: queryChongZhiMode
	 * @date:2019年3月21日 @time:下午4:12:45
	 * @param years
	 * @param months
	 * @return
	 * @description:充值分类图表报表显示 
	 */
	public List<TsyTiXianBankVo> queryChongZhiMode(int years,int months){
		return dao.queryChongZhiMode(years, months);
	}
	
	
	
	
	/**
	 * 
	 * @title: queryGuangGaoYearMonth
	 * @date:2019年3月21日 @time:上午11:06:06
	 * @return
	 * @description:按年份与月份分组后，再排序，查询每年中月份
	 */
	public PageInfo<TsyTiXianDataCountVo> queryGuangGaoYearMonth(int year,int month,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<TsyTiXianDataCountVo>(dao.queryGuangGaoYearMonth(year, month));
	}
	
	
	
	/**
	 * 
	 * @title: queryGuangGaoMonth
	 * @date:2019年3月21日 @time:下午3:14:19
	 * @param year
	 * @param month
	 * @return
	 * @description:查询每个月的所有数据
	 */
	public PageInfo<TsyGuangGaoVO> queryGuangGaoMonth(int years,int months,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		
		return new PageInfo<TsyGuangGaoVO>(dao.queryGuangGaoMonth(years, months));
	}
	
	
	/**
	 * 
	 * @title: queryGuangGaoMode
	 * @date:2019年3月21日 @time:下午4:12:45
	 * @param years
	 * @param months
	 * @return
	 * @description:广告费用分类图表报表显示 
	 */
	public List<TsyTiXianBankVo> queryGuangGaoMode(int years,int months){
		return dao.queryGuangGaoMode(years, months);
	}
	
	/**
	 * 
	 * @title: queryTuiKuanYearMonth
	 * @date:2019年3月21日 @time:上午11:06:06
	 * @return
	 * @description:按年份与月份分组后，再排序，查询每年中月份
	 */
	public PageInfo<TsyTiXianDataCountVo> queryTuiKuanYearMonth(int year,int month,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<TsyTiXianDataCountVo>(dao.queryTuiKuanYearMonth(year, month));
	}
	
	
	
	/**
	 * 
	 * @title: queryTuiKuanMonth
	 * @date:2019年3月21日 @time:下午3:14:19
	 * @param year
	 * @param month
	 * @return
	 * @description:查询每个月的所有数据
	 */
	public PageInfo<TsyTuiKuanVo> queryTuiKuanMonth(int years,int months,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		
		return new PageInfo<TsyTuiKuanVo>(dao.queryTuiKuanMonth(years, months));
	}
	
	
	/**
	 * 
	 * @title: queryGuangGaoMode
	 * @date:2019年3月21日 @time:下午4:12:45
	 * @param years
	 * @param months
	 * @return
	 * @description:广告费用分类图表报表显示 
	 */
	public List<TsyTiXianBankVo> queryTuiKuanMode(int years,int months){
		return dao.queryTuiKuanMode(years, months);
	}
	
	/**
	 * 
	 * @title: queryTiXianYear
	 * @date:2019年3月28日 @time:下午2:30:03
	 * @param year
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:年度总金额
	 *//*
	public PageInfo<TsyTiXianDataCountVo> queryTiXianYear(int year,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<TsyTiXianDataCountVo>(dao.queryTiXianYear(year));
	}
	*//**
	 * 
	 * @title: queryChongZhiYearMonth
	 * @date:2019年3月28日 @time:下午2:31:59
	 * @param year
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:年度充值总金额
	 *//*
	public PageInfo<TsyTiXianDataCountVo> queryChongZhiYear(int year,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<TsyTiXianDataCountVo>(dao.queryChongZhiYear(year));
	}
	*//**
	 * 
	 * @title: queryGuanGaoYear
	 * @date:2019年3月28日 @time:下午2:32:49
	 * @param year
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:年度广告总金额
	 *//*
	public PageInfo<TsyTiXianDataCountVo> queryGuanGaoYear(int year,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<TsyTiXianDataCountVo>(dao.queryGuanGaoYear(year));
	}
	
	*//**
	 * 
	 * @title: queryTuiKuanYear
	 * @date:2019年3月28日 @time:下午2:33:24
	 * @param year
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:年度退款总金额
	 *//*
	public PageInfo<TsyTiXianDataCountVo> queryTuiKuanYear(int year,int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<TsyTiXianDataCountVo>(dao.queryTuiKuanYear(year));
	}*/
	
}
