package com.accp.vo.hzj;

import java.util.Date;

public class refundVo {
	private Integer refundID;			//退款编号
	private String orderID;				//订单号
	private Date applicationTime;		//退款申请时间
	private String userName;			//申请会员
	private String serviceTitle;		//服务主题
	private Float applyRefundMoney;		//申请退款金额
	private String refundstatus;		//处理状态
	private Date adminTime;				//管理员审核时间
	private String refundExplain;		//备注
	
	public refundVo() {
		super();
	}

	public refundVo(Integer refundID, String orderID, Date applicationTime, String userName, String serviceTitle,
			Float applyRefundMoney, String refundstatus, Date adminTime, String refundExplain) {
		super();
		this.refundID = refundID;
		this.orderID = orderID;
		this.applicationTime = applicationTime;
		this.userName = userName;
		this.serviceTitle = serviceTitle;
		this.applyRefundMoney = applyRefundMoney;
		this.refundstatus = refundstatus;
		this.adminTime = adminTime;
		this.refundExplain = refundExplain;
	}

	public Integer getRefundID() {
		return refundID;
	}

	public void setRefundID(Integer refundID) {
		this.refundID = refundID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public Date getApplicationTime() {
		return applicationTime;
	}

	public void setApplicationTime(Date applicationTime) {
		this.applicationTime = applicationTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getServiceTitle() {
		return serviceTitle;
	}

	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}

	public Float getApplyRefundMoney() {
		return applyRefundMoney;
	}

	public void setApplyRefundMoney(Float applyRefundMoney) {
		this.applyRefundMoney = applyRefundMoney;
	}

	public String getRefundstatus() {
		return refundstatus;
	}

	public void setRefundstatus(String refundstatus) {
		this.refundstatus = refundstatus;
	}

	public Date getAdminTime() {
		return adminTime;
	}

	public void setAdminTime(Date adminTime) {
		this.adminTime = adminTime;
	}

	public String getRefundExplain() {
		return refundExplain;
	}

	public void setRefundExplain(String refundExplain) {
		this.refundExplain = refundExplain;
	}
	
}
