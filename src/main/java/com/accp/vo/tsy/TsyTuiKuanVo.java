package com.accp.vo.tsy;

import java.util.Date;

/**
 * 
 * @author Tan
 * @ClassName:TsyTuiKuanVo.java
 * @date:2019年3月27日 @time:下午3:34:10
 * @description:退款手续费vo
 */
public class TsyTuiKuanVo {

	
	private String userName;			//用户名
	private String orderID;			//订单号
	private String refundExplain;			//退款原因
	private Date applicationTime;			//退款申请时间
	private Double applyRefundMoney;			//申请退款金额
	private Double actualRefundMoney;			//实际退款金额
	private Double money;			//退款手续费用
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
	public String getRefundExplain() {
		return refundExplain;
	}
	public void setRefundExplain(String refundExplain) {
		this.refundExplain = refundExplain;
	}
	public Date getApplicationTime() {
		return applicationTime;
	}
	public void setApplicationTime(Date applicationTime) {
		this.applicationTime = applicationTime;
	}
	public Double getApplyRefundMoney() {
		return applyRefundMoney;
	}
	public void setApplyRefundMoney(Double applyRefundMoney) {
		this.applyRefundMoney = applyRefundMoney;
	}
	public Double getActualRefundMoney() {
		return actualRefundMoney;
	}
	public void setActualRefundMoney(Double actualRefundMoney) {
		this.actualRefundMoney = actualRefundMoney;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public TsyTuiKuanVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TsyTuiKuanVo(String userName, String orderID, String refundExplain, Date applicationTime,
			Double applyRefundMoney, Double actualRefundMoney, Double money) {
		super();
		this.userName = userName;
		this.orderID = orderID;
		this.refundExplain = refundExplain;
		this.applicationTime = applicationTime;
		this.applyRefundMoney = applyRefundMoney;
		this.actualRefundMoney = actualRefundMoney;
		this.money = money;
	}
	
	
}
