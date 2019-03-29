package com.accp.biz.hzj;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.hzj.IserviceDao;
import com.accp.pojo.News;
import com.accp.pojo.Servicelevel;
import com.accp.pojo.Servicetype;
import com.accp.pojo.User;
import com.accp.vo.hzj.refunDetailedMessageVo;
import com.accp.vo.hzj.refundVo;
import com.accp.vo.hzj.serviceAuditVo;
import com.accp.vo.hzj.serviceComplaintVo;
import com.accp.vo.hzj.serviceLevelVo;
import com.accp.vo.hzj.serviceReservationVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class serviceBiz {
	@Autowired
	private IserviceDao dao;
	
	
	//@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
	
	
	//查询退款
	public PageInfo<refundVo> queryRefund(String userName,String orderID,Integer PageNum,Integer PageSize){
		PageHelper.startPage(PageNum,PageSize);
		return new PageInfo<refundVo>(dao.queryRefund(userName, orderID));
	}
	
	
	//查看退款詳情
	public refunDetailedMessageVo queryRefunDetailedMessage(Integer refundID) {
		return dao.queryRefunDetailedMessage(refundID);
	}
	
	
	//修改退款信息
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int modifyRefund(refunDetailedMessageVo refunDetailedMessageVo) {
		return dao.modifyRefund(refunDetailedMessageVo);
	}
	
	
	//查询商家Id
	public List<refunDetailedMessageVo> queryMerchantId(Integer refundID) {
		return dao.queryMerchantId(refundID);
	}
	
	
	//发送信息给用户
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int setToUser(News news) {
		return dao.setToUser(news);
	}
	
	
	//发送信息给用户
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int setToMerchant(News news) {
		return dao.setToMerchant(news);
	}
	
	
	//查询服务级别
	public List<Servicetype> queryLevelName(){
		return dao.queryLevelName();
	}
	
	
	//查询服务级别
	public PageInfo<serviceLevelVo> queryLevel(Integer stid,Integer PageNum,Integer PageSize){
		PageHelper.startPage(PageNum,PageSize);
		return new PageInfo<serviceLevelVo>(dao.queryLevel(stid));
	}
	
	
	//查看服务级别詳情
	public serviceLevelVo queryLevelMessage(Integer serlevelid) {
		return dao.queryLevelMessage(serlevelid);
	}
	
	
	//修改服务级别信息
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int modifyLevel(Servicelevel servicelevel) {
		return dao.updateLevel(servicelevel);
	}
	
	
	//删除服务级别信息
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeLevel(Integer serlevelid) {
		return dao.deleteLevel(serlevelid);
	}
	
	
	//新增服务级别信息
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addLevel(Servicelevel servicelevel) {
		return dao.insertLevel(servicelevel);
	}
	
	
	//查询服务预约
	public PageInfo<serviceReservationVo> queryReservation(String orderid,Integer stid,Integer orderstatus,Integer PageNum,Integer PageSize){
		PageHelper.startPage(PageNum,PageSize);
		return new PageInfo<serviceReservationVo>(dao.selectReservation(orderid, stid, orderstatus));
	}
	
	
	//查询服务审核
	public PageInfo<serviceAuditVo> queryAudit(Integer stid,Integer auditstatus,String servicetitle,Integer businessstate,Integer serviceid,Integer recommendbool,Integer PageNum,Integer PageSize){
		PageHelper.startPage(PageNum,PageSize);
		return new PageInfo<serviceAuditVo>(dao.selectAudit(stid, auditstatus, servicetitle, businessstate, serviceid,recommendbool));
	}
	
	
	//修改服务审核信息
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int modifyAudit(serviceAuditVo serviceAuditVo) {
		return dao.updateAudit(serviceAuditVo);
	}
	
	
	//查询服务类别管理
	public PageInfo<Servicetype> queryType(Integer stid,Integer stpid,Integer PageNum,Integer PageSize){
		PageHelper.startPage(PageNum,PageSize);
		return new PageInfo<Servicetype>(dao.selectType(stid,stpid));
	}
	/*public PageInfo<Servicetype> queryTypeChilder(Integer stid,Integer PageNum,Integer PageSize){
		PageHelper.startPage(PageNum,PageSize);
		return new PageInfo<Servicetype>(dao.selectTypeChilder(stid));
	}*/
	
	
	//新增服务类别管理
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addType(Servicetype servicetype) {
		return dao.insertType(servicetype);
	}
	
	//删除服务类别管理
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeType(Integer stid) {
		return dao.deleteType(stid);
	}
	
	
	//修改服务类别管理
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int modifyType(Servicetype servicetype) {
		return dao.updateType(servicetype);
	}
	
	
	//修改服务审核管理
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int modifyAuditManagement(Servicetype servicetype) {
		return dao.updateAuditManagement(servicetype);
	}
	
	
	//查询服务投诉
	public PageInfo<serviceComplaintVo> queryComplaint(String servicetitle,Integer PageNum,Integer PageSize){
		PageHelper.startPage(PageNum,PageSize);
		return new PageInfo<serviceComplaintVo>(dao.selectComplaint(servicetitle));
	}
	
	
	//修改服务审核管理
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int modifyComplaint(serviceComplaintVo serviceComplaintVo) {
		return dao.updateComplaint(serviceComplaintVo);
	}
}
