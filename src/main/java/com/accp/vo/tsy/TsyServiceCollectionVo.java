package com.accp.vo.tsy;

import java.util.Date;

/**
 * 
 * @author Tan
 * @ClassName:TsyPostCollectionVo.java
 * @date:2019年3月1日 @time:下午9:46:16
 * @description:服务收藏
 */
public class TsyServiceCollectionVo {

	
	private int serColleID;			//服务编号
	private String userName;		//服务用户名
	private String serviceTitle;		//服务收藏标题
	private Date collectionTime;		//服务收藏时间
	public int getSerColleID() {
		return serColleID;
	}
	public void setSerColleID(int serColleID) {
		this.serColleID = serColleID;
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
	public Date getCollectionTime() {
		return collectionTime;
	}
	public void setCollectionTime(Date collectionTime) {
		this.collectionTime = collectionTime;
	}
	public TsyServiceCollectionVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TsyServiceCollectionVo(int serColleID, String userName, String serviceTitle, Date collectionTime) {
		super();
		this.serColleID = serColleID;
		this.userName = userName;
		this.serviceTitle = serviceTitle;
		this.collectionTime = collectionTime;
	}
	
	
}
