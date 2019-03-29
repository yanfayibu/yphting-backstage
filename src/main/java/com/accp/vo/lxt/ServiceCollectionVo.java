package com.accp.vo.lxt;

public class ServiceCollectionVo {
	private int serColleID;
	private String stName;
	private String userName;
	private String serviceTitle;
	private String collectionTime;
	public int getSerColleID() {
		return serColleID;
	}

	public void setSerColleID(int serColleID) {
		this.serColleID = serColleID;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getServiceTitle() {
		return serviceTitle;
	}

	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}

	public String getCollectionTime() {
		return collectionTime;
	}

	public void setCollectionTime(String collectionTime) {
		this.collectionTime = collectionTime;
	}

	public ServiceCollectionVo() {
		super();
	}
	public ServiceCollectionVo(int serColleID, String stName, String userName, String serviceTitle,
			String collectionTime) {
		super();
		this.serColleID = serColleID;
		this.stName = stName;
		this.userName = userName;
		this.serviceTitle = serviceTitle;
		this.collectionTime = collectionTime;
	}
}
