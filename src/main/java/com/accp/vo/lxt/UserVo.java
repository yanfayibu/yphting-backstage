package com.accp.vo.lxt;

import java.util.Date;

public class UserVo {
	private String userName;//用户名(第三方注册成功后复制过来)
	private String userRealName;//用户真实姓名
	private Integer userSex;//用户性别，1：男，2：女
	private String userPhone;//联系电话
	private String contactMailbox;//联系邮箱
	private Integer country;//外键，国编
	private Integer provincialID;//外键，省级地址编号
	private Integer cityID;//外键，市级地址编号
	private Integer countyID;//外键，县/区级地址编号
	private String adDetail;//地址详情
	private Integer merchantType;//商家类别，0：不是商家，1：大陆商家用户，2：海外商家用户
	private Integer firstServiceID;//第一个服务类别编号，外键，引用服务类型表
	private Integer secondServiceID;
	private String serviceFirstName;
	private String serviceSecondName;
	private String shopName;//店铺名称
	private String signature;//店铺签名
	private Float guaranteeMoney;//店铺保证金
	private String shopImg;//商家店铺图片路径
	private String identityNumder;//证件号码
	private String identityRealName;//海外证件真实姓名，大陆商家用户为空
	private String identityPositiveImg;//证件正面图片路径
	private String identityNegativeImg;//证件反面图片路径
	private String identityHandImg;//证件手持图片路径
	private String languageNameText;//服务语言
	private String majorNameText;//擅长专业
	private String mergerName;
	private String merchantEmail;//商家联系邮箱
	private String merchantPhone;//商家联系电话
	private String qq;//QQ
	private String weChat;//微信
	private String profession;//职业
	private Float height;//身高
	private String constellation;//星座
	private Integer age;//年龄
	private String selfIntroduction;//自我介绍
	private Integer businessState;//营业状态(1营业2暂停3关闭)
	private Integer auditStatus;//审核状态(1待审核2已通过3拒绝)
	private String reason;//管理员理由
	private Boolean stateboolean;//用户状态(可禁用用户true1正常false0禁用)
	private Boolean mailboxVerification;//邮箱验证/邮箱激活
	private String registerIP;//注册IP地址
	private String lastEntry;//最后登入IP地址
	private Date userRegistrationTime;//用户注册时间
	private Date recentEntry;//用户最后登入时间
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public Integer getUserSex() {
		return userSex;
	}
	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getContactMailbox() {
		return contactMailbox;
	}
	public void setContactMailbox(String contactMailbox) {
		this.contactMailbox = contactMailbox;
	}
	public Integer getCountry() {
		return country;
	}
	public void setCountry(Integer country) {
		this.country = country;
	}
	public Integer getProvincialID() {
		return provincialID;
	}
	public void setProvincialID(Integer provincialID) {
		this.provincialID = provincialID;
	}
	public Integer getCityID() {
		return cityID;
	}
	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}
	public Integer getCountyID() {
		return countyID;
	}
	public void setCountyID(Integer countyID) {
		this.countyID = countyID;
	}
	public String getAdDetail() {
		return adDetail;
	}
	public void setAdDetail(String adDetail) {
		this.adDetail = adDetail;
	}
	public Integer getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(Integer merchantType) {
		this.merchantType = merchantType;
	}
	public Integer getFirstServiceID() {
		return firstServiceID;
	}
	public void setFirstServiceID(Integer firstServiceID) {
		this.firstServiceID = firstServiceID;
	}
	public Integer getSecondServiceID() {
		return secondServiceID;
	}
	public void setSecondServiceID(Integer secondServiceID) {
		this.secondServiceID = secondServiceID;
	}
	public String getServiceFirstName() {
		return serviceFirstName;
	}
	public void setServiceFirstName(String serviceFirstName) {
		this.serviceFirstName = serviceFirstName;
	}
	public String getServiceSecondName() {
		return serviceSecondName;
	}
	public void setServiceSecondName(String serviceSecondName) {
		this.serviceSecondName = serviceSecondName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public Float getGuaranteeMoney() {
		return guaranteeMoney;
	}
	public void setGuaranteeMoney(Float guaranteeMoney) {
		this.guaranteeMoney = guaranteeMoney;
	}
	public String getShopImg() {
		return shopImg;
	}
	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}
	public String getIdentityNumder() {
		return identityNumder;
	}
	public void setIdentityNumder(String identityNumder) {
		this.identityNumder = identityNumder;
	}
	public String getIdentityRealName() {
		return identityRealName;
	}
	public void setIdentityRealName(String identityRealName) {
		this.identityRealName = identityRealName;
	}
	public String getIdentityPositiveImg() {
		return identityPositiveImg;
	}
	public void setIdentityPositiveImg(String identityPositiveImg) {
		this.identityPositiveImg = identityPositiveImg;
	}
	public String getIdentityNegativeImg() {
		return identityNegativeImg;
	}
	public void setIdentityNegativeImg(String identityNegativeImg) {
		this.identityNegativeImg = identityNegativeImg;
	}
	public String getIdentityHandImg() {
		return identityHandImg;
	}
	public void setIdentityHandImg(String identityHandImg) {
		this.identityHandImg = identityHandImg;
	}
	public String getLanguageNameText() {
		return languageNameText;
	}
	public void setLanguageNameText(String languageNameText) {
		this.languageNameText = languageNameText;
	}
	public String getMajorNameText() {
		return majorNameText;
	}
	public void setMajorNameText(String majorNameText) {
		this.majorNameText = majorNameText;
	}
	public String getMergerName() {
		return mergerName;
	}
	public void setMergerName(String mergerName) {
		this.mergerName = mergerName;
	}
	public String getMerchantEmail() {
		return merchantEmail;
	}
	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}
	public String getMerchantPhone() {
		return merchantPhone;
	}
	public void setMerchantPhone(String merchantPhone) {
		this.merchantPhone = merchantPhone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWeChat() {
		return weChat;
	}
	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Float getHeight() {
		return height;
	}
	public void setHeight(Float height) {
		this.height = height;
	}
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSelfIntroduction() {
		return selfIntroduction;
	}
	public void setSelfIntroduction(String selfIntroduction) {
		this.selfIntroduction = selfIntroduction;
	}
	public Integer getBusinessState() {
		return businessState;
	}
	public void setBusinessState(Integer businessState) {
		this.businessState = businessState;
	}
	public Integer getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Boolean getStateboolean() {
		return stateboolean;
	}
	public void setStateboolean(Boolean stateboolean) {
		this.stateboolean = stateboolean;
	}
	public Boolean getMailboxVerification() {
		return mailboxVerification;
	}
	public void setMailboxVerification(Boolean mailboxVerification) {
		this.mailboxVerification = mailboxVerification;
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
	public Date getUserRegistrationTime() {
		return userRegistrationTime;
	}
	public void setUserRegistrationTime(Date userRegistrationTime) {
		this.userRegistrationTime = userRegistrationTime;
	}
	public Date getRecentEntry() {
		return recentEntry;
	}
	public void setRecentEntry(Date recentEntry) {
		this.recentEntry = recentEntry;
	}
	public UserVo() {
		super();
	}
	public UserVo(String userName, String userRealName, Integer userSex, String userPhone, String contactMailbox,
			Integer country, Integer provincialID, Integer cityID, Integer countyID, String adDetail,
			Integer merchantType, Integer firstServiceID, Integer secondServiceID, String serviceFirstName,
			String serviceSecondName, String shopName, String signature, Float guaranteeMoney, String shopImg,
			String identityNumder, String identityRealName, String identityPositiveImg, String identityNegativeImg,
			String identityHandImg, String languageNameText, String majorNameText, String mergerName,
			String merchantEmail, String merchantPhone, String qq, String weChat, String profession, Float height,
			String constellation, Integer age, String selfIntroduction, Integer businessState, Integer auditStatus,
			String reason, Boolean stateboolean, Boolean mailboxVerification, String registerIP, String lastEntry,
			Date userRegistrationTime, Date recentEntry) {
		super();
		this.userName = userName;
		this.userRealName = userRealName;
		this.userSex = userSex;
		this.userPhone = userPhone;
		this.contactMailbox = contactMailbox;
		this.country = country;
		this.provincialID = provincialID;
		this.cityID = cityID;
		this.countyID = countyID;
		this.adDetail = adDetail;
		this.merchantType = merchantType;
		this.firstServiceID = firstServiceID;
		this.secondServiceID = secondServiceID;
		this.serviceFirstName = serviceFirstName;
		this.serviceSecondName = serviceSecondName;
		this.shopName = shopName;
		this.signature = signature;
		this.guaranteeMoney = guaranteeMoney;
		this.shopImg = shopImg;
		this.identityNumder = identityNumder;
		this.identityRealName = identityRealName;
		this.identityPositiveImg = identityPositiveImg;
		this.identityNegativeImg = identityNegativeImg;
		this.identityHandImg = identityHandImg;
		this.languageNameText = languageNameText;
		this.majorNameText = majorNameText;
		this.mergerName = mergerName;
		this.merchantEmail = merchantEmail;
		this.merchantPhone = merchantPhone;
		this.qq = qq;
		this.weChat = weChat;
		this.profession = profession;
		this.height = height;
		this.constellation = constellation;
		this.age = age;
		this.selfIntroduction = selfIntroduction;
		this.businessState = businessState;
		this.auditStatus = auditStatus;
		this.reason = reason;
		this.stateboolean = stateboolean;
		this.mailboxVerification = mailboxVerification;
		this.registerIP = registerIP;
		this.lastEntry = lastEntry;
		this.userRegistrationTime = userRegistrationTime;
		this.recentEntry = recentEntry;
	}
	
}