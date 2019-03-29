package com.accp.biz.yl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.yl.IUserDao;
import com.accp.pojo.Appraisalapply;
import com.accp.pojo.Sharea;
import com.accp.pojo.User;
import com.accp.vo.yl.UserShareaVo;
import com.accp.vo.yl.UserTruVo;
import com.accp.vo.yl.VipVo;
import com.accp.vo.yl.shopRecomment;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @Description 用户逻辑类
 * @author Administrator
 * @date 2019年2月20日
 */
@Service
public class ylUserBiz {
	@Autowired
	private IUserDao dao;
	/**
	 * 
	 * @Description 查询全部用户，分页
	 * @author yl
	 * @date 2019年2月20日
	 * @return  
	 * @throws
	 */
	public PageInfo<User> findUserListByPage(Integer p,Integer s,String userName) {
		PageHelper.startPage(p, s);
		return new PageInfo<User>(dao.selectUserList(userName));
	}
	/**
	 * 
	 * @Description 导出Excel
	 * @author yl
	 * @date 2019年2月20日
	 * @return  
	 * @throws
	 */
	public List<User> findUserList(String userName) {
		return dao.selectUserList(userName);
	}
	/**
	 * 
	 * @Description 单个会员
	 * @author yl
	 * @date 2019年2月21日
	 * @param userID
	 * @return  
	 * @throws
	 */
	public VipVo queryVipById(int userID) {
		return dao.qeuryByUserId(userID);
	}
	/**
	 * 
	 * @Description 修改单个用户，并插入消息表
	 * @author yl
	 * @date 2019年2月26日
	 * @param vo
	 * @return  
	 * @throws
	 */
	public boolean updateVip(VipVo vo) {
		return dao.updateVip(vo);
	}
	/**
	 * 
	 * @Description 修改商家信息，并插入消息表
	 * @author yl
	 * @date 2019年3月13日
	 * @param uVo
	 * @return  
	 * @throws
	 */
	public boolean updateShop(UserShareaVo uVo) {
		return dao.updateShop(uVo);
	}
	/**
	 * 
	 * @Description 查询所有商家，分页
	 * @author yl
	 * @date 2019年2月21日
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @param shopName
	 * @param merchantType
	 * @return  
	 * @throws
	 */
	public PageInfo<User> queryShop(Integer pageNum, Integer pageSize,String userName,String shopName,String merchantType) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<User>(dao.selectShop(userName, shopName, merchantType));
	}
	/**
	 * 
	 * @Description 查看所有商家入驻，带查询
	 * @author yl
	 * @date 2019年2月26日
	 * @param pageNum
	 * @param pageSize
	 * @param userid
	 * @return  
	 * @throws
	 */
	public PageInfo<UserShareaVo> queryEnter(Integer pageNum, Integer pageSize,String userName,Integer merchantType,Integer auditStatus) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<UserShareaVo>(dao.queryEnterAll(userName, merchantType, auditStatus));
	}
	/**
	 * 
	 * @Description 查看单个商家入驻详情
	 * @author yl
	 * @date 2019年2月26日
	 * @param userID
	 * @return  
	 * @throws
	 */
	public UserShareaVo queryEnterById(Integer userID) {
		return dao.queryEnterById(userID);
	}
	/**
	 * 
	 * @Description 查询国
	 * @author yl
	 * @date 2019年3月1日
	 * @return  
	 * @throws
	 */
	public List<Sharea> findShareaCountry() {
		return dao.queryShareaCountry();
	}
	/**
	 * 
	 * @Description 查询省
	 * @author Administrator
	 * @date 2019年3月1日
	 * @param pid
	 * @return  
	 * @throws
	 */
	public List<Sharea> findShareaProvincial(Integer pid) {
		return dao.queryShareaProvincial(pid);
	}
	/**
	 * 
	 * @Description 查询市
	 * @author Administrator
	 * @date 2019年3月1日
	 * @param pid
	 * @return  
	 * @throws
	 */
	public List<Sharea> findShareaCity(Integer pid) {
		return dao.queryShareaCity(pid);
	}
	/**
	 * 
	 * @Description 查看审核鉴定
	 * @author yl
	 * @date 2019年3月4日
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @param auditStatus
	 * @return  
	 * @throws
	 */
	public PageInfo<shopRecomment> queryShopAuthen(Integer pageNum, Integer pageSize,String userName,Integer auditStatus) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<shopRecomment>(dao.queryShopAuthen(userName, auditStatus));
	}
	/**
	 * 
	 * @Description 查看商家推荐
	 * @author yl
	 * @date 2019年3月4日
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @param shopName
	 * @param merchantType
	 * @param recommendbool
	 * @return  
	 * @throws
	 */
	public PageInfo<shopRecomment> queryShopRecommend(Integer pageNum, Integer pageSize,String userName,String shopName,Integer merchantType,Integer recommendbool) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<shopRecomment>(dao.queryShopRecommend(userName, shopName, merchantType, recommendbool));
	}
	/**
	 * 
	 * @Description 查看鉴定详情
	 * @author yl
	 * @date 2019年3月6日
	 * @param applyid
	 * @return  
	 * @throws
	 */
	public Appraisalapply queryfindAuthenDetails(Integer applyid) {
		return dao.queryAuthenDetails(applyid);
	}
	/**
	 * 
	 * @Description 查看单个商家推荐
	 * @author yl
	 * @date 2019年3月9日
	 * @param serviceID
	 * @return  
	 * @throws
	 */
	public shopRecomment queryRecommendById(Integer serviceID) {
		return dao.queryRecommendById(serviceID);
	}
	/**
	 * 
	 * @Description 查询所有托管
	 * @author yl
	 * @date 2019年3月11日
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @param shopName
	 * @param merchantType
	 * @param trusteeship
	 * @return  
	 * @throws
	 */
	public PageInfo<UserTruVo> queryTrusteeship(Integer pageNum,Integer pageSize,String userName,String shopName,Integer merchantType,Integer trusteeship) {
		PageHelper.startPage(pageNum, pageSize);
		List<UserTruVo> list=dao.queryTrusteeship(userName, shopName, merchantType, trusteeship);
		Date date = new Date();
	    Calendar cal = Calendar.getInstance();
		for (UserTruVo tmp : list) {
		     cal.setTime(tmp.getTrusteeshipstarttime());//设置起时间
		     cal.add(Calendar.MONTH, tmp.getTrusteeshipmonth());//增加一个月 
		     tmp.setTrusteeshipendtime(cal.getTime());
		}
		return new PageInfo<UserTruVo>(list);
	}
}
