package com.accp.vo.lxt;

import java.util.Date;

public class GoldVo {
	private Integer recordID;	//	记录编号，主键，自增
	private String userName;	// 用户昵称
	private Integer acquisitionMode;//	(1预定服务2服务收益3取消物流订单4其他5充值6线下充值7退款8提现)
	private Date recordDate;	//记录日期
	private String recordDescribe;	//	记录描述
	private Float recordInAndOut;	//记录编号，主键，自增
	private Integer auditStatus;	//审核状态(1待审核2审核成功3未通过)
	private String acName;
	public Integer getRecordID() {
		return recordID;
	}
	public void setRecordID(Integer recordID) {
		this.recordID = recordID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAcquisitionMode() {
		return acquisitionMode;
	}
	public void setAcquisitionMode(Integer acquisitionMode) {
		this.acquisitionMode = acquisitionMode;
	}
	public Date getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
	public String getRecordDescribe() {
		return recordDescribe;
	}
	public void setRecordDescribe(String recordDescribe) {
		this.recordDescribe = recordDescribe;
	}
	public Float getRecordInAndOut() {
		return recordInAndOut;
	}
	public void setRecordInAndOut(Float recordInAndOut) {
		this.recordInAndOut = recordInAndOut;
	}
	public Integer getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	public GoldVo() {
		super();
	}
	public GoldVo(Integer recordID, String userName, Integer acquisitionMode, Date recordDate, String recordDescribe,
			Float recordInAndOut, Integer auditStatus, String acName) {
		super();
		this.recordID = recordID;
		this.userName = userName;
		this.acquisitionMode = acquisitionMode;
		this.recordDate = recordDate;
		this.recordDescribe = recordDescribe;
		this.recordInAndOut = recordInAndOut;
		this.auditStatus = auditStatus;
		this.acName = acName;
	}
	
	
}
