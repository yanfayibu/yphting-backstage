package com.accp.biz.yl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yl.IBackstageDao;
import com.accp.pojo.*;
import com.accp.pojo.System;
import com.accp.vo.yl.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class BackstageBiz {
	@Autowired
	private IBackstageDao dao;

	public List<Advertisement> queryAllAdv() {
		return dao.queryAllAdv();
	}

	public PageInfo<AdvertisementVo> queryAllAdvVo(Integer atid, Integer p, Integer s) {
		PageHelper.startPage(p, s);
		return new PageInfo<AdvertisementVo>(dao.queryAllAdvVo(atid));
	}

	public Advertisement queryObjAdv(Integer aid) {
		return dao.queryObjAdv(aid);
	}

	public boolean removeAdv(String[] ids) {
		return dao.deleteAdv(ids) > 0;
	}

	/**
	 * 
	 * @Description 变更版本号 @author yl @date 2019年3月21日 @param p @throws
	 */
	public void updatePlate(Integer p) {
		dao.updatePlate(p);
	}

	/**
	 * 
	 * @Description 审核广告 @author yl @date 2019年3月22日 @param alf @throws
	 */
	public void updateApplufor(ApplyforVo alf) {
		alf.setStarttime(new Date());
		Calendar cal = Calendar.getInstance();
		cal.setTime(alf.getStarttime());// 设置起时间
		cal.add(Calendar.MONTH, alf.getRentamonth());// 增加月份
		alf.setEndtime(cal.getTime());
		dao.updateApplufor(alf);
	}

	/**
	 * 
	 * @Description 获取所有申请广告位 @author yl @date 2019年3月21日 @param atid @param
	 * p @param s @return @throws
	 */
	public PageInfo<ApplyforVo> queryAllApplyfor(Integer atid, Integer p, Integer s, Integer aaid) {
		PageHelper.startPage(p, s);
		return new PageInfo<ApplyforVo>(dao.queryAllApplyfor(atid, aaid));
	}

	public boolean addAdv(Advertisement a) {
		return dao.addAdv(a) > 0;
	}

	public boolean addzzs(Advertisementapply a) {
		a.setApplytime(new Date());
		return dao.addzzs(a) > 0;
	}

	public boolean moAdv(Advertisement a) {
		return dao.updateAdv(a) > 0;
	}
}
