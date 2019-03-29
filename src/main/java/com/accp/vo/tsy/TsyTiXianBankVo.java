package com.accp.vo.tsy;
/**
 * 
 * @author Tan
 * @ClassName:TsyTiXianBankVo.java
 * @date:2019年3月21日 @time:下午4:11:30
 * @description:提现银行分类Vo、充值类别区别
 */
public class TsyTiXianBankVo {

	 private String openBankName;
	 private double money;
	public String getOpenBankName() {
		return openBankName;
	}
	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public TsyTiXianBankVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TsyTiXianBankVo(String openBankName, double money) {
		super();
		this.openBankName = openBankName;
		this.money = money;
	}
	
	 
}
