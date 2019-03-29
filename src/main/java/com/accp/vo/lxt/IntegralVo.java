package com.accp.vo.lxt;

import java.util.Date;

public class IntegralVo {
	private Date iRDate;//记录日期
	private String iRDescribe;//记录描述
	private String inName;
	private String userName;
	private Integer recordInAndOut;//记录积分(-|+)
	private Integer integralID;//外键，积分规格表
	private Integer auditStatus;//审核状态(1待审核2审核成功3未通过) 
	public Date getiRDate() {
		return iRDate;
	}
	public void setiRDate(Date iRDate) {
		this.iRDate = iRDate;
	}
	public String getiRDescribe() {
		return iRDescribe;
	}
	public void setiRDescribe(String iRDescribe) {
		this.iRDescribe = iRDescribe;
	}
	public String getInName() {
		return inName;
	}
	public void setInName(String inName) {
		this.inName = inName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getRecordInAndOut() {
		return recordInAndOut;
	}
	public void setRecordInAndOut(Integer recordInAndOut) {
		this.recordInAndOut = recordInAndOut;
	}
	public Integer getIntegralID() {
		return integralID;
	}
	public void setIntegralID(Integer integralID) {
		this.integralID = integralID;
	}
	public Integer getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	public IntegralVo() {
		super();
	}
	public IntegralVo(Date iRDate, String iRDescribe, String inName, String userName, Integer recordInAndOut,
			Integer integralID, Integer auditStatus) {
		super();
		this.iRDate = iRDate;
		this.iRDescribe = iRDescribe;
		this.inName = inName;
		this.userName = userName;
		this.recordInAndOut = recordInAndOut;
		this.integralID = integralID;
		this.auditStatus = auditStatus;
	}

	
}
