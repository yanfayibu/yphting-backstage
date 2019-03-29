package com.accp.dao.tsy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Goldnotes;
import com.accp.pojo.Putforward;
import com.accp.vo.tsy.TsyChongZiVo;
import com.accp.vo.tsy.TsyGuangGaoVO;
import com.accp.vo.tsy.TsyTiXianBankVo;
import com.accp.vo.tsy.TsyTiXianDataCountVo;
import com.accp.vo.tsy.TsyTuiKuanVo;

/**
 * 
 * @author Tan
 * @ClassName:TsyDataCountDao.java
 * @date:2019年3月21日 @time:上午11:05:10
 * @description:数据统计接口
 */
public interface TsyDataCountDao {

	/**
	 * 
	 * @title: queryTiXianYearMonth
	 * @date:2019年3月21日 @time:上午11:06:06
	 * @return
	 * @description:按年份与月份分组后，再排序，查询每年中月份
	 */
	public List<TsyTiXianDataCountVo> queryTiXianYearMonth(@Param("year")int year,@Param("month")int month);
	
	/**
	 * 
	 * @title: queryTiXianYearMonth
	 * @date:2019年3月21日 @time:下午3:14:19
	 * @param year
	 * @param month
	 * @return
	 * @description:查询每个月的所有数据
	 */
	public List<Putforward> queryTiXianMonth(@Param("years")int years,@Param("months")int months);
	
	/**
	 * 
	 * @title: queryTiXianBank
	 * @date:2019年3月21日 @time:下午4:12:45
	 * @param years
	 * @param months
	 * @return
	 * @description:提现银行分类图表报表显示 
	 */
	public List<TsyTiXianBankVo> queryTiXianBank(@Param("years")int years,@Param("months")int months);
	
	
	
	/**
	 * 
	 * @title: queryChongZhiYearMonth
	 * @date:2019年3月25日 @time:上午9:31:55
	 * @param year
	 * @param month
	 * @return
	 * @description:按年份与月份分组后，再排序，查询每年中月份
	 */
	public List<TsyTiXianDataCountVo> queryChongZhiYearMonth(@Param("year")int year,@Param("month")int month);
	
	/**
	 * 
	 * @title: queryChongZhiMonth
	 * @date:2019年3月25日 @time:上午10:04:36
	 * @param years
	 * @param months
	 * @return
	 * @description:查询每个月的所有数据
	 */
	public List<TsyChongZiVo> queryChongZhiMonth(@Param("years")int years,@Param("months")int months);
	
	/**
	 * 
	 * @title: queryChongZhiMode
	 * @date:2019年3月25日 @time:上午10:06:01
	 * @param years
	 * @param months
	 * @return
	 * @description:充值分类图表报表显示 
	 */
	public List<TsyTiXianBankVo> queryChongZhiMode(@Param("years")int years,@Param("months")int months);
	
	
	
	
	/**
	 * 
	 * @title: queryGuangGaoMonth
	 * @date:2019年3月26日 @time:上午11:02:18
	 * @param years
	 * @param months
	 * @return
	 * @description:查询广告每个月的所有数据
	 */
	public List<TsyGuangGaoVO> queryGuangGaoMonth(@Param("years")int years,@Param("months")int months);
	
	
	/**
	 * 
	 * @title: queryGuangGaoYearMonth
	 * @date:2019年3月26日 @time:上午10:36:04
	 * @param year
	 * @param month
	 * @return
	 * @description:按年份与月份分组后，再排序，查询每年中月份
	 */
	public List<TsyTiXianDataCountVo> queryGuangGaoYearMonth(@Param("year")int year,@Param("month")int month);
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @title: queryGuangGaoMode
	 * @date:2019年3月26日 @time:上午10:39:23
	 * @param years
	 * @param months
	 * @return
	 * @description:广告分类图表报表显示 
	 */
	public List<TsyTiXianBankVo> queryGuangGaoMode(@Param("years")int years,@Param("months")int months);
	
	
	
	/*退款手续费用*/
	
	/**
	 * 
	 * @title: queryGuangGaoMonth
	 * @date:2019年3月26日 @time:上午11:02:18
	 * @param years
	 * @param months
	 * @return
	 * @description:查询广告每个月的所有数据
	 */
	public List<TsyTuiKuanVo> queryTuiKuanMonth(@Param("years")int years,@Param("months")int months);
	
	
	/**
	 * 
	 * @title: queryGuangGaoYearMonth
	 * @date:2019年3月26日 @time:上午10:36:04
	 * @param year
	 * @param month
	 * @return
	 * @description:按年份与月份分组后，再排序，查询每年中月份
	 */
	public List<TsyTiXianDataCountVo> queryTuiKuanYearMonth(@Param("year")int year,@Param("month")int month);
	
	
	
	
	/**
	 * 
	 * @title: queryGuangGaoMode
	 * @date:2019年3月26日 @time:上午10:39:23
	 * @param years
	 * @param months
	 * @return
	 * @description:退款手续费分类图表报表显示 
	 */
	public List<TsyTiXianBankVo> queryTuiKuanMode(@Param("years")int years,@Param("months")int months);
	
	
	/**
	 * 
	 * @title: queryTuiKuanYear
	 * @date:2019年3月28日 @time:下午2:07:45
	 * @param year
	 * @param month
	 * @return
	 * @description:查询该年总金额
	 */
	public TsyTiXianDataCountVo queryTuiKuanYear(@Param("year")int year);
	/**
	 * 
	 * @title: queryTuiKuanYear
	 * @date:2019年3月28日 @time:下午2:07:45
	 * @param year
	 * @param month
	 * @return
	 * @description:查询该年总金额
	 */
	public TsyTiXianDataCountVo queryChongZhiYear(@Param("year")int year);
	/**
	 * 
	 * @title: queryTuiKuanYear
	 * @date:2019年3月28日 @time:下午2:07:45
	 * @param year
	 * @param month
	 * @return
	 * @description:查询该年总金额
	 */
	public TsyTiXianDataCountVo queryTiXianYear(@Param("year")int year);
	/**
	 * 
	 * @title: queryTuiKuanYear
	 * @date:2019年3月28日 @time:下午2:07:45
	 * @param year
	 * @param month
	 * @return
	 * @description:查询该年总金额
	 */
	public TsyTiXianDataCountVo queryGuanGaoYear(@Param("year")int year);
}
