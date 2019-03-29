package com.accp.vo.yl;

import java.util.Date;

public class VipVo {
	private int userID;			//用户编号
	private String userName;	//用户姓名
	private String userPwd;		//用户密码
	private String userPhone;	//用户电话
	private String userEmail;	//用户邮箱
	private String contactmailbox;	//用户邮箱
	private String userRealName;//用户真实姓名
	private int userSex;		//性别
	private int country;		//国编
	private int provincialID;	//省编
	private int cityID;			//市编
	private int auditStatus;	//审核状态
	private int loginType;		//登入方式
	private int merchantType;	//会员组
	private String adDetail;	//地址详情
	private Date recentEntry;	//最后登入时间
	private Date userRegistrationTime;//用户注册时间
	private String registerIP;		//用户注册IP地址
	private String lastEntry;		//最后登录IP地址
	private int mailboxVerification;  //邮箱验证
	
	
	
	public String getContactmailbox() {
		return contactmailbox;
	}
	public void setContactmailbox(String contactmailbox) {
		this.contactmailbox = contactmailbox;
	}
	public Date getUserRegistrationTime() {
		return userRegistrationTime;
	}
	public void setUserRegistrationTime(Date userRegistrationTime) {
		this.userRegistrationTime = userRegistrationTime;
	}
	public String getRegisterIP() {
		return registerIP;
	}
	public void setRegisterIP(String registerIP) {
		this.registerIP = registerIP;
	}
	public String getLastEntry() {
		return lastEntry;
	}
	public void setLastEntry(String lastEntry) {
		this.lastEntry = lastEntry;
	}
	public int getMailboxVerification() {
		return mailboxVerification;
	}
	public void setMailboxVerification(Integer mailboxVerification) {
		this.mailboxVerification = mailboxVerification;
	}
	public Date getRecentEntry() {
		return recentEntry;
	}
	public void setRecentEntry(Date recentEntry) {
		this.recentEntry = recentEntry;
	}
	public String getAdDetail() {
		return adDetail;
	}
	public void setAdDetail(String adDetail) {
		this.adDetail = adDetail;
	}
	public int getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(int merchantType) {
		this.merchantType = merchantType;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public int getUserSex() {
		return userSex;
	}
	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}
	public int getCountry() {
		return country;
	}
	public void setCountry(int country) {
		this.country = country;
	}
	public int getProvincialID() {
		return provincialID;
	}
	public void setProvincialID(int provincialID) {
		this.provincialID = provincialID;
	}
	public int getCityID() {
		return cityID;
	}
	public void setCityID(int cityID) {
		this.cityID = cityID;
	}
	public int getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(int auditStatus) {
		this.auditStatus = auditStatus;
	}
	public int getLoginType() {
		return loginType;
	}
	public void setLoginType(int loginType) {
		this.loginType = loginType;
	}
}
