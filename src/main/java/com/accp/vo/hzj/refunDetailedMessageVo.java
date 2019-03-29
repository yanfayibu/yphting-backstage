package com.accp.vo.hzj;

import java.util.Date;

public class refunDetailedMessageVo {
	private Integer refundID;			//退款编号
	private Integer userID;				//用户编号
	private String userName;			//申请会员
	private String orderID;				//订单号
	private Float totalPrice;			//订单金额
	private Float applyRefundMoney;		//申请退款金额
	private Date applicationTime;		//申请日期
	private Float refundstatus;			//处理状态
	private String refundReason;		//申请原因
	private Float ActualRefundMoney;	//退款金额
	private Date auditTime;				//商家审核时间
	private String businessremarks;     //商家审核备注
	private Date adminTime;				//管理员审核时间
	private String adminremarks;        //管理员审核备注
	private Float userMoney;			//用户金币
	public refunDetailedMessageVo() {
		super();
	}
	public refunDetailedMessageVo(Integer refundID, Integer userID, String userName, String orderID, Float totalPrice,
			Float applyRefundMoney, Date applicationTime, Float refundstatus, String refundReason,
			Float actualRefundMoney, Date auditTime, String businessremarks, Date adminTime, String adminremarks,
			Float userMoney) {
		super();
		this.refundID = refundID;
		this.userID = userID;
		this.userName = userName;
		this.orderID = orderID;
		this.totalPrice = totalPrice;
		this.applyRefundMoney = applyRefundMoney;
		this.applicationTime = applicationTime;
		this.refundstatus = refundstatus;
		this.refundReason = refundReason;
		ActualRefundMoney = actualRefundMoney;
		this.auditTime = auditTime;
		this.businessremarks = businessremarks;
		this.adminTime = adminTime;
		this.adminremarks = adminremarks;
		this.userMoney = userMoney;
	}
	public Integer getRefundID() {
		return refundID;
	}
	public void setRefundID(Integer refundID) {
		this.refundID = refundID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public Float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Float getApplyRefundMoney() {
		return applyRefundMoney;
	}
	public void setApplyRefundMoney(Float applyRefundMoney) {
		this.applyRefundMoney = applyRefundMoney;
	}
	public Date getApplicationTime() {
		return applicationTime;
	}
	public void setApplicationTime(Date applicationTime) {
		this.applicationTime = applicationTime;
	}
	public Float getRefundstatus() {
		return refundstatus;
	}
	public void setRefundstatus(Float refundstatus) {
		this.refundstatus = refundstatus;
	}
	public String getRefundReason() {
		return refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public Float getActualRefundMoney() {
		return ActualRefundMoney;
	}
	public void setActualRefundMoney(Float actualRefundMoney) {
		ActualRefundMoney = actualRefundMoney;
	}
	public Date getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	public String getBusinessremarks() {
		return businessremarks;
	}
	public void setBusinessremarks(String businessremarks) {
		this.businessremarks = businessremarks;
	}
	public Date getAdminTime() {
		return adminTime;
	}
	public void setAdminTime(Date adminTime) {
		this.adminTime = adminTime;
	}
	public String getAdminremarks() {
		return adminremarks;
	}
	public void setAdminremarks(String adminremarks) {
		this.adminremarks = adminremarks;
	}
	public Float getUserMoney() {
		return userMoney;
	}
	public void setUserMoney(Float userMoney) {
		this.userMoney = userMoney;
	}
	
}
