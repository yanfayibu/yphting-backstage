package com.accp.biz.yl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yl.IlxtDao;
import com.accp.pojo.Appraisalapply;
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
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation=Propagation.SUPPORTS,isolation=Isolation.READ_COMMITTED,readOnly=true)
public class LxtBiz {
	@Autowired
	private IlxtDao dao;
	
	/**
	 * 查询所有会员信息
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<User> queryAll(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<User> list = dao.queryAll();
		return new PageInfo<User>(list);
	}
	
	/**
	 * 按条件查询会员列表
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @return
	 */
	public PageInfo<User> queryByUserName(int pageNum,int pageSize,String userName){
		PageHelper.startPage(pageNum, pageSize);
		List<User> list =dao.queryByName(userName);
		return new PageInfo<User>(list);
	}
	
	/**
	 * 查询会员详情
	 * @param userId
	 * @return
	 */
	public User queryByUserId(int userId) {
		return dao.queryByUserId(userId);
	}
	
	/**
	 * 查询所有商家
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<User> queryBusiness(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<User> list =dao.queryBusiness();
		return new PageInfo<User>(list);
	}
	
	/**
	 * 按照条件查询商家信息列表
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @param shopName
	 * @param merchantType
	 * @return
	 */
	public PageInfo<User> queryByBusName(int pageNum,int pageSize,String userName,String shopName,int merchantType){
		PageHelper.startPage(pageNum, pageSize);
		List<User> list =dao.queryByBusName(userName, shopName, merchantType);
		return new PageInfo<User>(list);
	}
	
	/**
	 * 查询商家入驻信息
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @param merchantType
	 * @param auditState
	 * @return
	 */
	public PageInfo<User> queryEnter(int pageNum,int pageSize,String userName,int merchantType,int auditState){
		PageHelper.startPage(pageNum, pageSize);
		List<User> list =dao.queryByEnter(userName, merchantType, auditState);
		return new PageInfo<User>(list);
	}
	
	/**
	 * 修改会员，商家信息
	 * @param user
	 * @return
	 */
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public int update(User user) {
		return dao.updateUser(user);
	}
	/**
	 * 查询商家信息详情
	 * @param userId 用户编号
	 * @return
	 */
	public UserVo queryBusinessById(int userId) {
		return dao.queryBusinessById(userId);
	}
	
	/**
	 * 扣除用户保证金
	 * @param userId
	 * @return
	 */
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public int updateGuaranteeMoney(int userId) {
		return dao.updateGuaranteeMoney(userId);
	}
	
	/**
	 * 查询金币记录
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @return
	 */
	public PageInfo<GoldVo> queryGoldRecord(int pageNum,int pageSize,String userName){
		PageHelper.startPage(pageNum, pageSize);
		List<GoldVo> list = dao.queryGoldRecord(userName);
		return new PageInfo<GoldVo>(list);
	}
	/**
	 * 查询积分记录	
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @return
	 */
	public PageInfo<IntegralVo> queryIntegral(int pageNum,int pageSize,String userName){
		PageHelper.startPage(pageNum, pageSize);
		List<IntegralVo> list =dao.queryIntegral(userName);
		return new PageInfo<IntegralVo>(list);
	}
	/**
	 * 查询鉴定列表
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @param auditStatus
	 * @return
	 */
	public PageInfo<AppraisalVo> queryAppraisal(int pageNum,int pageSize,String userName,int auditStatus){
		PageHelper.startPage(pageNum, pageSize);
		List<AppraisalVo> list =dao.queryAppraisal(userName,auditStatus);
		return new PageInfo<AppraisalVo>(list);
	}
	
	/**
	 * 查询单个鉴定信息
	 * @param aid
	 * @return
	 */
	public AppraisalVo queryAppraisalById(int aid) {
		return dao.queryAppraisalById(aid);
	}
	
	/**
	 * 修改鉴定状态
	 * @param Appraisal
	 * @return
	 */
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public int updateAppraisal(AppraisalVo Appraisal) {
		return dao.updateAppraisal(Appraisal);
	}
	
	/**
	 * 查询评论列表
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @param title
	 * @return
	 */
	public PageInfo<CommentVo> queryCommentList(int pageNum,int pageSize,String userName,String title){
		PageHelper.startPage(pageNum, pageSize);
		List<CommentVo> list = dao.queryCommentList(userName, title);
		return new PageInfo<CommentVo>(list);
	}
	
	/**
	 * 删除评论
	 * @param id
	 * @return
	 */
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public int deleteComment(int id) {
		return dao.DeleteComment(id);
	}
	
	/**
	 * 查询商家服务推荐列表
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @param shopName
	 * @param merchantType
	 * @param recommendBool
	 * @return
	 */
	public PageInfo<ServiceVo> queryRecommend(int pageNum,int pageSize,String userName,String shopName,int merchantType,int recommendBool){
		PageHelper.startPage(pageNum,pageSize);
		List<ServiceVo> list = dao.queryReCommend(userName,shopName,merchantType,recommendBool);
		return new PageInfo<>(list);
	}
	
	/**
	 * 查询单个商家服务推荐信息
	 * @param id
	 * @return
	 */
	public ServiceVo queryReCommendById(int id) {
		return dao.queryReCommendById(id);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public int updateReCommend(Services services) {
		return dao.updateSerices(services);
	}
	
	/**
	 * 查询充值记录
	 * @param pageNum
	 * @param pageSize
	 * @param userName
	 * @param yearDate
	 * @param monthDate
	 * @return
	 */
	public PageInfo<GoldVo> queryRecharge(int pageNum,int pageSize,String userName,String yearDate,String monthDate){
			PageHelper.startPage(pageNum, pageSize);
			List<GoldVo> list =dao.queryRecharge(userName,yearDate, monthDate);
			return new PageInfo<>(list);
	}
	
	public PageInfo<PutforwardVo> queryWithdrawal(int pageNum,int pageSize,String userName,String yearDate,String monthDate){
		PageHelper.startPage(pageNum, pageSize);
		List<PutforwardVo> list =dao.queryWithdrawal(userName,yearDate, monthDate);
		return new PageInfo<>(list);
	}
	public PutforwardVo queryWithById(int id) {
		return dao.queryWithById(id);
	}
	
	public int updatewithdrawal(PutforwardVo pt) {
		return dao.updatewithdrawal(pt);
	}
	
	public int queryIncome(String yearDate,String monthDate) {
		return dao.queryIncome(yearDate, monthDate);
	}
	
	public int queryExpenditure(String yearDate,String monthDate) {
		return dao.queryExpenditure(yearDate, monthDate);
	}
	
	public PageInfo<ServiceCollectionVo> queryseCollection(int pageNum,int pageSize,String userName,String title,int stid){
		PageHelper.startPage(pageNum, pageSize);
		List<ServiceCollectionVo> list = dao.queryseCollection(userName, title, stid);
		return new PageInfo<>(list);
	}
	
	public List<Servicetype> queryTypelist(){
		return dao.queryTypelist();
	}
	
	public PageInfo<PostcollectionVo> querypoCollection(int pageNum,int pageSize,String userName,String title){
		PageHelper.startPage(pageNum, pageSize);
		List<PostcollectionVo> list = dao.querypoCollection(userName, title);
		return new PageInfo<>(list);
	}
	
	public PageInfo<BusinessCollection> queryBsCollection(int pageNum,int pageSize,String shopName,int stid,int merchanType){
		PageHelper.startPage(pageNum, pageSize);
		List<BusinessCollection> list = dao.querybsCollection(shopName, stid, merchanType);
		return new PageInfo<>(list);
	}
}
