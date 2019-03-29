package com.accp.dao.tsy;

/**
 * 
 * @author Tan
 * @ClassName:TsyHomeDao.java
 * @date:2019年3月15日 @time:下午6:38:50
 * @description:
 */
/**
 * 
 * @author Tan
 * @ClassName:TsyHomeDao.java
 * @date:2019年3月15日 @time:下午6:47:55
 * @description:后台首页接口
 */
public interface TsyHomeDao {

	/**
	 * 
	 * @title: selectCountPutforward
	 * @date:2019年3月15日 @time:下午6:47:44
	 * @return
	 * @description:查询提现待审核
	 */
	public int selectCountPutforward();

	/**
	 * 
	 * @title: selectCountAppraisalapply
	 * @date:2019年3月15日 @time:下午7:18:52
	 * @return
	 * @description:查询申请鉴定待审核数量
	 */
	public int selectCountAppraisalapply();

	/**
	 * 
	 * @title: selectCountUser
	 * @date:2019年3月15日 @time:下午7:19:30
	 * @return
	 * @description:查询商家入驻待审核数量
	 */
	public int selectCountUser();

	/**
	 * 
	 * @title: selectCountServices
	 * @date:2019年3月15日 @time:下午7:20:00
	 * @return
	 * @description:查询服务待审核数量
	 */
	public int selectCountServices();

	/**
	 * 
	 * @title: selectCountOrders
	 * @date:2019年3月15日 @time:下午7:20:29
	 * @return
	 * @description:查询管理员介入申请数量
	 */
	public int selectCountOrders();

	/**
	 * 
	 * @title: selectCountPost
	 * @date:2019年3月15日 @time:下午7:20:52
	 * @return
	 * @description:帖子待审核数量
	 */
	public int selectCountPost();

}
