package com.accp.action.tsy;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tsy.TsyDataCountBiz;
import com.accp.dao.tsy.TsyDataCountDao;
import com.accp.pojo.Goldnotes;
import com.accp.pojo.Putforward;
import com.accp.pojo.User;
import com.accp.util.file.TestExcel;
import com.accp.vo.tsy.TsyChongZiVo;
import com.accp.vo.tsy.TsyGuangGaoVO;
import com.accp.vo.tsy.TsyTiXianBankVo;
import com.accp.vo.tsy.TsyTiXianDataCountVo;
import com.accp.vo.tsy.TsyTuiKuanVo;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Tan
 * @ClassName:TsyDataCountAction.java
 * @date:2019年3月21日 @time:上午11:17:26
 * @description:数据统计访问控制类
 */
@RestController
@RequestMapping("tsyDataCountApi")
public class TsyDataCountAction {

	@Autowired
	private TsyDataCountBiz biz;

	@Autowired
	private TsyDataCountDao dao;

	/**
	 * 
	 * @title: queryTiXainYearMonth
	 * @date:2019年3月21日 @time:上午11:21:27
	 * @param year
	 * @param month
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:提现统计年月查询包含每月总金额
	 */
	@GetMapping("queryTiXainYearMonth/{year}/{month}/{pageNum}/{pageSize}")
	public PageInfo<TsyTiXianDataCountVo> queryTiXainYearMonth(@PathVariable("year") int year,
			@PathVariable("month") int month, @PathVariable("pageNum") int pageNum,
			@PathVariable("pageSize") int pageSize) {

		return biz.queryTiXianYearMonth(year, month, pageNum, pageSize);

	}

	/**
	 * 
	 * @title: queryTiXianMonth
	 * @date:2019年3月21日 @time:下午3:19:52
	 * @param years
	 * @param months
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:查询每月的数据
	 */
	@GetMapping("queryTiXianMonth/{years}/{months}/{pageNum}/{pageSize}")
	public PageInfo<Putforward> queryTiXianMonth(@PathVariable("years") int years, @PathVariable("months") int months,
			@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
		return biz.queryTiXianMonth(years, months, pageNum, pageSize);
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
	@GetMapping("queryTiXianBank/{years}/{months}")
	public List<TsyTiXianBankVo> queryTiXianBank(@PathVariable("years") int years, @PathVariable("months") int months) {
		return biz.queryTiXianBank(years, months);
	}

	/**
	 * 
	 * @title: outPrintTiXianBook
	 * @date:2019年3月21日 @time:下午6:45:07
	 * @param response
	 * @return
	 * @description:导出提现报表
	 */
	@GetMapping("outPrintTiXianBook/{years}/{months}")
	public Map<String, Object> outPrintTiXianBook(@PathVariable("years") int years,
			@PathVariable("months") int months) {
		List<Putforward> list = dao.queryTiXianMonth(years, months);
		Map<String, Object> map = new HashMap<String, Object>();

		try {

			TestExcel.outPrintTiXianBook(list);
			map.put("code", 200);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * 
	 * @title: tiXianTotalMoney
	 * @date:2019年3月21日 @time:下午8:04:55
	 * @return
	 * @description：提现每月的总金额
	 */
	@GetMapping("tiXianTotalMoney/{years}/{months}")
	public double tiXianTotalMoney(@PathVariable("years") int years, @PathVariable("months") int months) {

		List<Putforward> list = dao.queryTiXianMonth(years, months);

		double sunMoney = 0;

		for (int i = 0; i < list.size(); i++) {
			sunMoney = sunMoney + list.get(i).getMoney();
		}

		return sunMoney;

	}

	/**
	 * 
	 * @title: queryTiXainYearMonth
	 * @date:2019年3月21日 @time:上午11:21:27
	 * @param year
	 * @param month
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:充值统计年月查询包含每月总金额
	 */
	@GetMapping("queryChongZhiYearMonth/{year}/{month}/{pageNum}/{pageSize}")
	public PageInfo<TsyTiXianDataCountVo> queryChongZhiYearMonth(@PathVariable("year") int year,
			@PathVariable("month") int month, @PathVariable("pageNum") int pageNum,
			@PathVariable("pageSize") int pageSize) {

		return biz.queryChongZhiYearMonth(year, month, pageNum, pageSize);

	}

	/**
	 * 
	 * @title: queryTiXianMonth
	 * @date:2019年3月21日 @time:下午3:19:52
	 * @param years
	 * @param months
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:查询每月的数据
	 */
	@GetMapping("queryChongZhiMonth/{years}/{months}/{pageNum}/{pageSize}")
	public PageInfo<TsyChongZiVo> queryChongZhiMonth(@PathVariable("years") int years,
			@PathVariable("months") int months, @PathVariable("pageNum") int pageNum,
			@PathVariable("pageSize") int pageSize) {
		return biz.queryChongZhiMonth(years, months, pageNum, pageSize);
	}

	/**
	 * 
	 * @title: queryTiXianBank
	 * @date:2019年3月21日 @time:下午4:12:45
	 * @param years
	 * @param months
	 * @return
	 * @description:充值分类图表报表显示
	 */
	@GetMapping("queryChongZhiMode/{years}/{months}")
	public List<TsyTiXianBankVo> queryChongZhiMode(@PathVariable("years") int years,
			@PathVariable("months") int months) {
		return biz.queryChongZhiMode(years, months);
	}

	/**
	 * 
	 * @title: outPrintTiXianBook
	 * @date:2019年3月21日 @time:下午6:45:07
	 * @param response
	 * @return
	 * @description:导出提现报表
	 */
	@GetMapping("outPrintChongZhiBook/{years}/{months}")
	public Map<String, Object> outPrintChongZhiBook(@PathVariable("years") int years,
			@PathVariable("months") int months) {
		List<TsyChongZiVo> list = dao.queryChongZhiMonth(years, months);
		Map<String, Object> map = new HashMap<String, Object>();

		try {

			TestExcel.outPrintChongZhiBook(list);
			map.put("code", 200);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * 
	 * @title: tiXianTotalMoney
	 * @date:2019年3月21日 @time:下午8:04:55
	 * @return
	 * @description：充值每月的总金额
	 */
	@GetMapping("chongZhiTotalMoney/{years}/{months}")
	public double chongZhiTotalMoney(@PathVariable("years") int years, @PathVariable("months") int months) {

		List<TsyChongZiVo> list = dao.queryChongZhiMonth(years, months);

		double sunMoney = 0;

		for (int i = 0; i < list.size(); i++) {
			sunMoney = sunMoney + list.get(i).getRecordInAndOut();
		}

		return sunMoney;

	}

	/* 广告费用 */

	/**
	 * 
	 * @title: queryGuangGaoYearMonth
	 * @date:2019年3月21日 @time:上午11:21:27
	 * @param year
	 * @param month
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:广告费用统计年月查询包含每月总金额
	 */
	@GetMapping("queryGuangGaoYearMonth/{year}/{month}/{pageNum}/{pageSize}")
	public PageInfo<TsyTiXianDataCountVo> queryGuangGaoYearMonth(@PathVariable("year") int year,
			@PathVariable("month") int month, @PathVariable("pageNum") int pageNum,
			@PathVariable("pageSize") int pageSize) {

		return biz.queryGuangGaoYearMonth(year, month, pageNum, pageSize);

	}

	/**
	 * 
	 * @title: queryGuangGaoMonth
	 * @date:2019年3月21日 @time:下午3:19:52
	 * @param years
	 * @param months
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:查询每月的数据
	 */
	@GetMapping("queryGuangGaoMonth/{years}/{months}/{pageNum}/{pageSize}")
	public PageInfo<TsyGuangGaoVO> queryGuangGaoMonth(@PathVariable("years") int years,
			@PathVariable("months") int months, @PathVariable("pageNum") int pageNum,
			@PathVariable("pageSize") int pageSize) {
		return biz.queryGuangGaoMonth(years, months, pageNum, pageSize);
	}

	/**
	 * 
	 * @title: queryTiXianBank
	 * @date:2019年3月21日 @time:下午4:12:45
	 * @param years
	 * @param months
	 * @return
	 * @description:广告分类图表报表显示
	 */
	@GetMapping("queryGuangGaoMode/{years}/{months}")
	public List<TsyTiXianBankVo> queryGuangGaoMode(@PathVariable("years") int years,
			@PathVariable("months") int months) {
		return biz.queryGuangGaoMode(years, months);
	}

	/**
	 * 
	 * @title: outPrintTiXianBook
	 * @date:2019年3月21日 @time:下午6:45:07
	 * @param response
	 * @return
	 * @description:导出广告费用报表
	 */
	@GetMapping("outPrintGuangGaoBook/{years}/{months}")
	public Map<String, Object> outPrintGuangGaoBook(@PathVariable("years") int years,
			@PathVariable("months") int months) {
		List<TsyGuangGaoVO> list = dao.queryGuangGaoMonth(years, months);
		Map<String, Object> map = new HashMap<String, Object>();

		try {

			TestExcel.outPrintGuanGaoBook(list);
			map.put("code", 200);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * 
	 * @title: tiXianTotalMoney
	 * @date:2019年3月21日 @time:下午8:04:55
	 * @return
	 * @description：广告每月的总金额
	 */
	@GetMapping("guangGaoTotalMoney/{years}/{months}")
	public double guangGaoTotalMoney(@PathVariable("years") int years, @PathVariable("months") int months) {

		List<TsyGuangGaoVO> list = dao.queryGuangGaoMonth(years, months);

		double sunMoney = 0;

		for (int i = 0; i < list.size(); i++) {
			sunMoney = sunMoney + list.get(i).getMoney();
		}

		return sunMoney;

	}
	/* 退款手续费用 */

	/**
	 * 
	 * @title: queryTuiKuanYearMonth
	 * @date:2019年3月21日 @time:上午11:21:27
	 * @param year
	 * @param month
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:广告费用统计年月查询包含每月总金额
	 */
	@GetMapping("queryTuiKuanYearMonth/{year}/{month}/{pageNum}/{pageSize}")
	public PageInfo<TsyTiXianDataCountVo> queryTuiKuanYearMonth(@PathVariable("year") int year,
			@PathVariable("month") int month, @PathVariable("pageNum") int pageNum,
			@PathVariable("pageSize") int pageSize) {

		return biz.queryTuiKuanYearMonth(year, month, pageNum, pageSize);

	}

	/**
	 * 
	 * @title: queryTuiKuanMonth
	 * @date:2019年3月21日 @time:下午3:19:52
	 * @param years
	 * @param months
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @description:查询每月的数据
	 */
	@GetMapping("queryTuiKuanMonth/{years}/{months}/{pageNum}/{pageSize}")
	public PageInfo<TsyTuiKuanVo> queryTuiKuanMonth(@PathVariable("years") int years,
			@PathVariable("months") int months, @PathVariable("pageNum") int pageNum,
			@PathVariable("pageSize") int pageSize) {
		return biz.queryTuiKuanMonth(years, months, pageNum, pageSize);
	}

	/**
	 * 
	 * @title: queryTuiKuanBank
	 * @date:2019年3月21日 @time:下午4:12:45
	 * @param years
	 * @param months
	 * @return
	 * @description:退款手续分类图表报表显示
	 */
	@GetMapping("queryTuiKuanMode/{years}/{months}")
	public List<TsyTiXianBankVo> queryTuiKuanMode(@PathVariable("years") int years,
			@PathVariable("months") int months) {

		System.out.println(biz.queryTuiKuanMode(years, months));

		return biz.queryTuiKuanMode(years, months);
	}

	/**
	 * 
	 * @title: outPrintTuiKuanBook
	 * @date:2019年3月21日 @time:下午6:45:07
	 * @param response
	 * @return
	 * @description:导出退款手续费用报表
	 */
	@GetMapping("outPrintTuiKuanBook/{years}/{months}")
	public Map<String, Object> outPrintTuiKuanBook(@PathVariable("years") int years,
			@PathVariable("months") int months) {
		List<TsyTuiKuanVo> list = dao.queryTuiKuanMonth(years, months);
		Map<String, Object> map = new HashMap<String, Object>();

		try {

			TestExcel.outPrintTuiKuanBook(list);
			map.put("code", 200);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * 
	 * @title: tuiKuanTotalMoney
	 * @date:2019年3月21日 @time:下午8:04:55
	 * @return
	 * @description：退款手续每月的总金额
	 */
	@GetMapping("tuiKuanMoney/{years}/{months}")
	public double guangTuiKuanMoney(@PathVariable("years") int years, @PathVariable("months") int months) {

		List<TsyTuiKuanVo> list = dao.queryTuiKuanMonth(years, months);

		double sunMoney = 0;

		for (int i = 0; i < list.size(); i++) {
			sunMoney = sunMoney + list.get(i).getMoney();
		}

		return sunMoney;

	}

	@GetMapping("LiRunMoney/{years}/{months}")
	public Map<String, String> LiRunMoney(@PathVariable("years") int years, @PathVariable("months") int months) {

		Map<String, String> message = new HashMap<String, String>();

		List<TsyTuiKuanVo> list = dao.queryTuiKuanMonth(years, months); // 退款手续费用

		if (list != null) {
			double tuiKuanMoney = 0; // 退款手续费用

			for (int i = 0; i < list.size(); i++) {
				tuiKuanMoney = tuiKuanMoney + list.get(i).getMoney();
			}

			message.put("tuiKuan", tuiKuanMoney + "");
		} else {
			message.put("tuiKuan", 0 + "");
		}

		List<TsyGuangGaoVO> list1 = dao.queryGuangGaoMonth(years, months); // 广告费用

		if (list1 != null) {
			double guanGao = 0; // 广告费用

			for (int i = 0; i < list1.size(); i++) {
				guanGao = guanGao + list1.get(i).getMoney();
			}

			message.put("guanGao", guanGao + "");
		} else {
			message.put("guanGao", 0 + "");
		}

		List<TsyChongZiVo> list2 = dao.queryChongZhiMonth(years, months);	//充值金额
			
		if(list2!=null) {
			double chongZi = 0;				//充值金额

			for (int i = 0; i < list2.size(); i++) {
				chongZi = chongZi + list2.get(i).getRecordInAndOut();
			}

			message.put("chongZi", chongZi + "");
		}else {
			message.put("chongZi", 0 + "");
		}
		

		List<Putforward> list3 = dao.queryTiXianMonth(years, months);		//提现金额

		if(list3!=null) {
			double tiXian = 0;

			for (int i = 0; i < list3.size(); i++) {
				tiXian = tiXian + list3.get(i).getMoney();
			}

			message.put("tiXian", tiXian + "");
		}else {
			message.put("tiXian", 0 + "");
		}
		

		return message;
	}
	
	
	
	/**
	 * 
	 * @title: LiRunMoneyYear
	 * @date:2019年3月28日 @time:下午2:22:02
	 * @param years
	 * @return
	 * @description:每年利润总金额
	 */
	@GetMapping("LiRunMoneyYear/{years}")
	public double LiRunMoneyYear(@PathVariable("years") int years) {
		double chongzhiMoney=0;
		double tiXianMoney=0;
		double tuiKuanMoney=0;
		double guanGaoMoney=0;
		
		TsyTiXianDataCountVo chongzhi=dao.queryChongZhiYear(years);
		TsyTiXianDataCountVo tiXian=dao.queryTiXianYear(years);
		TsyTiXianDataCountVo tuiKuan=dao.queryTuiKuanYear(years);
		TsyTiXianDataCountVo guanGao=dao.queryGuanGaoYear(years);
		
		if(chongzhi!=null) {
			chongzhiMoney=chongzhi.getMoney();
		}else {
			chongzhiMoney=0;
		}
		if(tiXian!=null) {
			tiXianMoney=tiXian.getMoney();
		}else {
			tiXianMoney=0;
		}
		if(tuiKuan!=null) {
			tuiKuanMoney=tuiKuan.getMoney();
		}else {
			tuiKuanMoney=0;
		}
		if(guanGao!=null) {
			guanGaoMoney=guanGao.getMoney();
		}else {
			guanGaoMoney=0;
		}
		
		
		return ((chongzhiMoney+tuiKuanMoney+guanGaoMoney)-tiXianMoney);
		
		
	}


}
