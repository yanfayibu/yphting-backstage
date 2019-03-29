package com.accp.vo.tsy;

import java.util.Date;

/**
 * 
 * @author Tan
 * @ClassName:TsyGuangGaoVO.java
 * @date:2019年3月26日 @time:上午10:59:37
 * @description:
 */
public class TsyGuangGaoVO {

	private String userName;		//用户名
	private String atitle;			//广告位置
	private double price;			//每月价格
	private int rentAMonth;			//月数
	private double money;			//总金额
	private Date startTime;			//开始时间
	private Date endTime;			//开始时间
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAtitle() {
		return atitle;
	}
	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRentAMonth() {
		return rentAMonth;
	}
	public void setRentAMonth(int rentAMonth) {
		this.rentAMonth = rentAMonth;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public TsyGuangGaoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TsyGuangGaoVO(String userName, String atitle, double price, int rentAMonth, double money, Date startTime,
			Date endTime) {
		super();
		this.userName = userName;
		this.atitle = atitle;
		this.price = price;
		this.rentAMonth = rentAMonth;
		this.money = money;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
}
