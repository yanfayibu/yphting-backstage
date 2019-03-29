package com.accp.dao.yl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.accp.pojo.Appraisalapply;
import com.accp.pojo.Putforward;
import com.accp.pojo.Servicetype;
import com.accp.pojo.Services;
import com.accp.pojo.Sharea;
import com.accp.pojo.User;
import com.accp.vo.lxt.AppraisalVo;
import com.accp.vo.lxt.BusinessCollection;
import com.accp.vo.lxt.CommentVo;
import com.accp.vo.lxt.GoldVo;
import com.accp.vo.lxt.IntegralVo;
import com.accp.vo.lxt.PostcollectionVo;
import com.accp.vo.lxt.PutforwardVo;
import com.accp.vo.lxt.ServiceCollectionVo;
import com.accp.vo.lxt.ServiceVo;
import com.accp.vo.lxt.UserVo;

public interface IlxtDao {
	public List<User> queryAll();
	
	public List<User> queryByName(@Param("userName")String userName);
	
	public User queryByUserId(@Param("userId")int userId);
	
	public List<User> queryBusiness();
	
	public List<User> queryByBusName(@Param("userName")String userName,@Param("shopName")String shopName,@Param("merchantType") int merchantType);
	
	public List<User> queryByEnter(@Param("userName") String userName,@Param("merchantType")int merchantType,@Param("auditState") int auditState);
	
	public int updateUser(@Param("user")User user);
	
	public UserVo queryBusinessById(@Param("userId")int userId);
	
	public int updateGuaranteeMoney(@Param("userId")int userId);
	
	public List<GoldVo> queryGoldRecord(@Param("userName") String userName);
	
	public List<IntegralVo> queryIntegral(@Param("userName")String userName);
	
	public List<AppraisalVo> queryAppraisal(@Param("userName")String userName,@Param("auditStatus")int auditStatus);
	
	public AppraisalVo queryAppraisalById(@Param("aid")int aid);
	
	public int updateAppraisal(@Param("Appraisal")AppraisalVo Appraisal);
	
	public List<CommentVo> queryCommentList(@Param("userName") String userName,@Param("title")String title);
	
	public int DeleteComment(@Param("id")int id);
	
	public List<ServiceVo> queryReCommend(@Param("userName")String userName,@Param("shopName")String shopName,@Param("merchantType")int merchantType,@Param("recommendBool")int recommendBool);
	
	public ServiceVo queryReCommendById(@Param("id")int id);
	
	public int updateSerices(@Param("services") Services services);
	
	public List<GoldVo> queryRecharge(@Param("userName")String userName,@Param("yearDate")String yearDate,@Param("monthDate")String monthDate);
	
	public List<PutforwardVo> queryWithdrawal(@Param("userName")String userName,@Param("yearDate")String yearDate,@Param("monthDate")String monthDate);
	
	public PutforwardVo queryWithById(@Param("id")int id);
	
	public int updatewithdrawal(@Param("putforward")PutforwardVo putforward);
	
	public int queryIncome(@Param("yearDate")String yearDate,@Param("monthDate")String monthDate);
	
	public int queryExpenditure(@Param("yearDate")String yearDate,@Param("monthDate")String monthDate);
	
	public List<ServiceCollectionVo> queryseCollection(@Param("userName")String userName,@Param("title")String title,@Param("stid")int stid);
	
	public List<Servicetype> queryTypelist();
	
	public List<PostcollectionVo> querypoCollection(@Param("userName")String userName,@Param("title")String title);
	
	public List<BusinessCollection> querybsCollection(@Param("shopName")String shopName,@Param("stid")int stid,@Param("merchanType")int merchantType);
}
