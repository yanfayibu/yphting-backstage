package com.accp.vo.lxt;

public class PutforwardVo {
	private int pfID;
	private String userName;
	private String userRealName;
	private String putName;
	private String bankAccount;
	private String bankName;
	private String submitTime;
	private String auditTime;
	private float money;
	private int auditStatus;
	private String adminOpinion;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPfID() {
		return pfID;
	}
	public void setPfID(int pfID) {
		this.pfID = pfID;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getPutName() {
		return putName;
	}
	public void setPutName(String putName) {
		this.putName = putName;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
	public String getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public int getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(int auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAdminOpinion() {
		return adminOpinion;
	}
	public void setAdminOpinion(String adminOpinion) {
		this.adminOpinion = adminOpinion;
	}
	public PutforwardVo() {
		super();
	}
	public PutforwardVo(int pfID, String userName, String userRealName, String putName, String bankAccount,
			String bankName, String submitTime, String auditTime, float money, int auditStatus, String adminOpinion) {
		super();
		this.pfID = pfID;
		this.userName = userName;
		this.userRealName = userRealName;
		this.putName = putName;
		this.bankAccount = bankAccount;
		this.bankName = bankName;
		this.submitTime = submitTime;
		this.auditTime = auditTime;
		this.money = money;
		this.auditStatus = auditStatus;
		this.adminOpinion = adminOpinion;
	}
}
