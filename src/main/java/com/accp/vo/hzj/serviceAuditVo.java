package com.accp.vo.hzj;

import java.util.Date;

public class serviceAuditVo {
	private Integer serviceid;                  //服务编号
	private Integer stid;                       //服务类别编号
	private String stname;                		//服务名称
	private String servicetitle;                //服务标题
	private Integer serviceprice;               //金币价格
	private Integer userid;                     //用户编号
	private String username;                    //用户名(第三方注册成功后复制过来)
	private Integer auditstatus;                //审核状态(1待审核2审核成功3未通过)
	private Integer businessstate;              //营业状态(1营业2暂停3关闭)
	private Date releasetime;                   //发布时间
	private String servicecoverimg;             //封面图
	private Integer recommendbool;              //服务推荐(true推荐)
	private String shopname;                    //店铺名称
	private String servicecosttypeid;           //费用说明
	private String serviceintro;                //服务介绍
	private String adminopinion;                //管理员意见
	private String servicecostinclude;          //服务费用包含
	public serviceAuditVo() {
		super();
	}
	public serviceAuditVo(Integer serviceid, Integer stid, String stname, String servicetitle, Integer serviceprice,
			Integer userid, String username, Integer auditstatus, Integer businessstate, Date releasetime,
			String servicecoverimg, Integer recommendbool, String shopname, String servicecosttypeid,
			String serviceintro, String adminopinion, String servicecostinclude) {
		super();
		this.serviceid = serviceid;
		this.stid = stid;
		this.stname = stname;
		this.servicetitle = servicetitle;
		this.serviceprice = serviceprice;
		this.userid = userid;
		this.username = username;
		this.auditstatus = auditstatus;
		this.businessstate = businessstate;
		this.releasetime = releasetime;
		this.servicecoverimg = servicecoverimg;
		this.recommendbool = recommendbool;
		this.shopname = shopname;
		this.servicecosttypeid = servicecosttypeid;
		this.serviceintro = serviceintro;
		this.adminopinion = adminopinion;
		this.servicecostinclude = servicecostinclude;
	}
	public Integer getServiceid() {
		return serviceid;
	}
	public void setServiceid(Integer serviceid) {
		this.serviceid = serviceid;
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
	public Integer getServiceprice() {
		return serviceprice;
	}
	public void setServiceprice(Integer serviceprice) {
		this.serviceprice = serviceprice;
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
	public Integer getAuditstatus() {
		return auditstatus;
	}
	public void setAuditstatus(Integer auditstatus) {
		this.auditstatus = auditstatus;
	}
	public Integer getBusinessstate() {
		return businessstate;
	}
	public void setBusinessstate(Integer businessstate) {
		this.businessstate = businessstate;
	}
	public Date getReleasetime() {
		return releasetime;
	}
	public void setReleasetime(Date releasetime) {
		this.releasetime = releasetime;
	}
	public String getServicecoverimg() {
		return servicecoverimg;
	}
	public void setServicecoverimg(String servicecoverimg) {
		this.servicecoverimg = servicecoverimg;
	}
	public Integer getRecommendbool() {
		return recommendbool;
	}
	public void setRecommendbool(Integer recommendbool) {
		this.recommendbool = recommendbool;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getServicecosttypeid() {
		return servicecosttypeid;
	}
	public void setServicecosttypeid(String servicecosttypeid) {
		this.servicecosttypeid = servicecosttypeid;
	}
	public String getServiceintro() {
		return serviceintro;
	}
	public void setServiceintro(String serviceintro) {
		this.serviceintro = serviceintro;
	}
	public String getAdminopinion() {
		return adminopinion;
	}
	public void setAdminopinion(String adminopinion) {
		this.adminopinion = adminopinion;
	}
	public String getServicecostinclude() {
		return servicecostinclude;
	}
	public void setServicecostinclude(String servicecostinclude) {
		this.servicecostinclude = servicecostinclude;
	}
	
}
