package com.accp.vo.tsy;

/**
 * 
 * @author Tan
 * @ClassName:TsyTiXianDataCountVo.java
 * @date:2019年3月21日 @time:上午10:58:57
 * @description:提现数据统计、金币充值、服务费
 */
public class TsyTiXianDataCountVo {

	private String years;			//年份
	private String months;			//月份
	private double money;			//金额（每月提现的总金额）
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String getMonths() {
		return months;
	}
	public void setMonths(String months) {
		this.months = months;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public TsyTiXianDataCountVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TsyTiXianDataCountVo(String years, String months, double money) {
		super();
		this.years = years;
		this.months = months;
		this.money = money;
	}
	
	
	
}
