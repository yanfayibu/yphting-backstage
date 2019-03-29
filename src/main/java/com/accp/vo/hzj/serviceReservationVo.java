package com.accp.vo.hzj;

import java.util.Date;

public class serviceReservationVo {
	private String orderid;            	//订单编号，主键，算法生成
	private Integer userid;            	//用户编号
	private String username;           	//用户名(第三方注册成功后复制过来)
	private String shopname;           	//店铺名称
	private Integer stid;               //编号
	private String stname;             	//服务名称
	private String servicetitle;       	//服务标题
	private Integer integral;          	//订单积分
	private Date ordertime;            	//下单时间
	private Integer orderstatus;       	//订单状态(1待付款2待接单3待提供服务4已提供服务6服务完成6服务取消7未接单8已退款)
	private Date paymenttime;          	//付款时间
	private Date receipttime;          	//接单时间
	private Date provideservicestime;  	//提供服务时间
	private Date completetime;         	//完成时间
	private String remarks;				//备注
	private Float totalprice;         	//订单总价
	private String servicecoverimg;   	//封面图
	public serviceReservationVo() {
		super();
	}
	public serviceReservationVo(String orderid, Integer userid, String username, String shopname, Integer stid,
			String stname, String servicetitle, Integer integral, Date ordertime, Integer orderstatus, Date paymenttime,
			Date receipttime, Date provideservicestime, Date completetime, String remarks, Float totalprice,
			String servicecoverimg) {
		super();
		this.orderid = orderid;
		this.userid = userid;
		this.username = username;
		this.shopname = shopname;
		this.stid = stid;
		this.stname = stname;
		this.servicetitle = servicetitle;
		this.integral = integral;
		this.ordertime = ordertime;
		this.orderstatus = orderstatus;
		this.paymenttime = paymenttime;
		this.receipttime = receipttime;
		this.provideservicestime = provideservicestime;
		this.completetime = completetime;
		this.remarks = remarks;
		this.totalprice = totalprice;
		this.servicecoverimg = servicecoverimg;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getServicetitle() {
		return servicetitle;
	}
	public void setServicetitle(String servicetitle) {
		this.servicetitle = servicetitle;
	}
	public Integer getIntegral() {
		return integral;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public Integer getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(Integer orderstatus) {
		this.orderstatus = orderstatus;
	}
	public Date getPaymenttime() {
		return paymenttime;
	}
	public void setPaymenttime(Date paymenttime) {
		this.paymenttime = paymenttime;
	}
	public Date getReceipttime() {
		return receipttime;
	}
	public void setReceipttime(Date receipttime) {
		this.receipttime = receipttime;
	}
	public Date getProvideservicestime() {
		return provideservicestime;
	}
	public void setProvideservicestime(Date provideservicestime) {
		this.provideservicestime = provideservicestime;
	}
	public Date getCompletetime() {
		return completetime;
	}
	public void setCompletetime(Date completetime) {
		this.completetime = completetime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Float getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Float totalprice) {
		this.totalprice = totalprice;
	}
	public String getServicecoverimg() {
		return servicecoverimg;
	}
	public void setServicecoverimg(String servicecoverimg) {
		this.servicecoverimg = servicecoverimg;
	}
	
	
	
}
