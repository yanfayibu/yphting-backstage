package com.accp.vo.lxt;

import java.util.Date;

public class ServiceVo {
	private int serviceID;
	private String userName;
	private String shopName;
	private String stName;
	private int merchantType;
	private String merchantPhone;
	private int businessState;
	private int recommendBool;
	private float guaranteeMoney;
	private String qq;
	private String weChat;
	private String registerIP;//注册IP地址
	private String lastEntry;//最后登入IP地址
	private Date userRegistrationTime;//用户注册时间
	private Date recentEntry;//用户最后登入时间
	private String serviceCoverImg;
	public int getServiceID() {
		return serviceID;
	}
	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(int merchantType) {
		this.merchantType = merchantType;
	}
	public String getMerchantPhone() {
		return merchantPhone;
	}
	public void setMerchantPhone(String merchantPhone) {
		this.merchantPhone = merchantPhone;
	}
	public int getBusinessState() {
		return businessState;
	}
	public void setBusinessState(int businessState) {
		this.businessState = businessState;
	}
	public int getRecommendBool() {
		return recommendBool;
	}
	public void setRecommendBool(int recommendBool) {
		this.recommendBool = recommendBool;
	}
	public float getGuaranteeMoney() {
		return guaranteeMoney;
	}
	public void setGuaranteeMoney(float guaranteeMoney) {
		this.guaranteeMoney = guaranteeMoney;
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
	public String getServiceCoverImg() {
		return serviceCoverImg;
	}
	public void setServiceCoverImg(String serviceCoverImg) {
		this.serviceCoverImg = serviceCoverImg;
	}
	public ServiceVo() {
		super();
	}
	public ServiceVo(int serviceID, String userName, String shopName, String stName, int merchantType,
			String merchantPhone, int businessState, int recommendBool, float guaranteeMoney, String qq, String weChat,
			String registerIP, String lastEntry, Date userRegistrationTime, Date recentEntry, String serviceCoverImg) {
		super();
		this.serviceID = serviceID;
		this.userName = userName;
		this.shopName = shopName;
		this.stName = stName;
		this.merchantType = merchantType;
		this.merchantPhone = merchantPhone;
		this.businessState = businessState;
		this.recommendBool = recommendBool;
		this.guaranteeMoney = guaranteeMoney;
		this.qq = qq;
		this.weChat = weChat;
		this.registerIP = registerIP;
		this.lastEntry = lastEntry;
		this.userRegistrationTime = userRegistrationTime;
		this.recentEntry = recentEntry;
		this.serviceCoverImg = serviceCoverImg;
	}
	
	
	
}
