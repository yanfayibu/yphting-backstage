package com.accp.biz.tsy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.tsy.TsyHomeDao;

@Service("bizs")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TsyHomeBiz {

	@Autowired
	private TsyHomeDao dao;

	/**
	 * 
	 * @title: selectCountPutforward
	 * @date:2019年3月15日 @time:下午6:47:44
	 * @return
	 * @description:查询提现待审核
	 */
	public int selectCountPutforward() {
		return dao.selectCountPutforward();
	}

	/**
	 * 
	 * @title: selectCountAppraisalapply
	 * @date:2019年3月15日 @time:下午7:18:52
	 * @return
	 * @description:查询申请鉴定待审核数量
	 */
	public int selectCountAppraisalapply() {
		return dao.selectCountAppraisalapply();
	}

	/**
	 * 
	 * @title: selectCountUser
	 * @date:2019年3月15日 @time:下午7:19:30
	 * @return
	 * @description:查询商家入驻待审核数量
	 */
	public int selectCountUser() {
		return dao.selectCountUser();
	}

	/**
	 * 
	 * @title: selectCountServices
	 * @date:2019年3月15日 @time:下午7:20:00
	 * @return
	 * @description:查询服务待审核数量
	 */
	public int selectCountServices() {
		return dao.selectCountServices();
	}

	/**
	 * 
	 * @title: selectCountOrders
	 * @date:2019年3月15日 @time:下午7:20:29
	 * @return
	 * @description:查询管理员介入申请数量
	 */
	public int selectCountOrders() {
		return  dao.selectCountOrders();
	}

	/**
	 * 
	 * @title: selectCountPost
	 * @date:2019年3月15日 @time:下午7:20:52
	 * @return
	 * @description:帖子待审核数量
	 */
	public int selectCountPost() {
		return dao.selectCountPost();
	}
	
	
}
