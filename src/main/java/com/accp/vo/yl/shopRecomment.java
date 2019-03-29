package com.accp.vo.yl;

import java.util.Date;

public class shopRecomment {
	private Integer userid;                     //用户编号
	private Integer serviceID;					//服务编号
	private String username;                    //用户名(第三方注册成功后复制过来)
	private String userrealname;                //用户真实姓名
	private Integer usersex;                    //用户性别，1：男，2：女
	private Integer merchanttype;               //商家类别，0：不是商家，1：大陆商家用户，2：海外商家用户
	private String shopname;                    //店铺名称
	private Integer guaranteemoney;             //店铺保证金
	private String merchantphone;               //商家联系电话
	private String serviceCoverImg;				//封面图
	private String qq;                          //QQ
	private String wechat;                      //微信
	private Integer auditstatus;                //审核状态(1待审核2已通过3拒绝)
	private Integer businessstate;              //营业状态(1营业2暂停3关闭)
	private String registerip;                  //注册IP地址
	private String lastentry;                   //最后登入IP地址
	private Date userregistrationtime;          //用户注册时间
	private Date recententry;                   //用户最后登入时间
	private String stname;                		//服务名称
	private Boolean recommendbool;               //服务推荐(true推荐)
	private Date releasetime;                    //发布时间
	private Integer applyid;         			//鉴定记录编号
    private Date submittime;               //提交时间
    private Date audittime;                //审核时间
	
	
	public Integer getServiceID() {
		return serviceID;
	}
	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
	}
	public String getServiceCoverImg() {
		return serviceCoverImg;
	}
	public void setServiceCoverImg(String serviceCoverImg) {
		this.serviceCoverImg = serviceCoverImg;
	}
	public Integer getBusinessstate() {
		return businessstate;
	}
	public void setBusinessstate(Integer businessstate) {
		this.businessstate = businessstate;
	}
	public Integer getApplyid() {
		return applyid;
	}
	public void setApplyid(Integer applyid) {
		this.applyid = applyid;
	}
	public Date getSubmittime() {
		return submittime;
	}
	public void setSubmittime(Date submittime) {
		this.submittime = submittime;
	}
	public Date getAudittime() {
		return audittime;
	}
	public void setAudittime(Date audittime) {
		this.audittime = audittime;
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
	public String getUserrealname() {
		return userrealname;
	}
	public void setUserrealname(String userrealname) {
		this.userrealname = userrealname;
	}
	public Integer getUsersex() {
		return usersex;
	}
	public void setUsersex(Integer usersex) {
		this.usersex = usersex;
	}
	public Integer getMerchanttype() {
		return merchanttype;
	}
	public void setMerchanttype(Integer merchanttype) {
		this.merchanttype = merchanttype;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public Integer getGuaranteemoney() {
		return guaranteemoney;
	}
	public void setGuaranteemoney(Integer guaranteemoney) {
		this.guaranteemoney = guaranteemoney;
	}
	public String getMerchantphone() {
		return merchantphone;
	}
	public void setMerchantphone(String merchantphone) {
		this.merchantphone = merchantphone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public Integer getAuditstatus() {
		return auditstatus;
	}
	public void setAuditstatus(Integer auditstatus) {
		this.auditstatus = auditstatus;
	}
	public String getRegisterip() {
		return registerip;
	}
	public void setRegisterip(String registerip) {
		this.registerip = registerip;
	}
	public String getLastentry() {
		return lastentry;
	}
	public void setLastentry(String lastentry) {
		this.lastentry = lastentry;
	}
	public Date getUserregistrationtime() {
		return userregistrationtime;
	}
	public void setUserregistrationtime(Date userregistrationtime) {
		this.userregistrationtime = userregistrationtime;
	}
	public Date getRecententry() {
		return recententry;
	}
	public void setRecententry(Date recententry) {
		this.recententry = recententry;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public Boolean getRecommendbool() {
		return recommendbool;
	}
	public void setRecommendbool(Boolean recommendbool) {
		this.recommendbool = recommendbool;
	}
	public Date getReleasetime() {
		return releasetime;
	}
	public void setReleasetime(Date releasetime) {
		this.releasetime = releasetime;
	}
	
}
