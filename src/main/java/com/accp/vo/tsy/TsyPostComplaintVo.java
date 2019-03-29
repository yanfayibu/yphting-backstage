package com.accp.vo.tsy;

import java.util.Date;

/**
 * 
 * @author Tan
 * @ClassName:TsyPostComplaintVo.java
 * @date:2019年3月14日 @time:下午8:55:39
 * @description:帖子投诉Vo
 */
public class TsyPostComplaintVo {
	private int cid; // 帖子投诉编号
	private String userName; // 发帖人名字
	private String title; // 发帖标题
	private String userNames; // 举报人名字
	private String ctName; // 举报原因
	private Date timeOfComplaint; // 举报时间
	private int operatingState; // 帖子状态 1.未删除 2.已删除
	private int postID; // 帖子编号
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserNames() {
		return userNames;
	}
	public void setUserNames(String userNames) {
		this.userNames = userNames;
	}
	public String getCtName() {
		return ctName;
	}
	public void setCtName(String ctName) {
		this.ctName = ctName;
	}
	public Date getTimeOfComplaint() {
		return timeOfComplaint;
	}
	public void setTimeOfComplaint(Date timeOfComplaint) {
		this.timeOfComplaint = timeOfComplaint;
	}
	public int getOperatingState() {
		return operatingState;
	}
	public void setOperatingState(int operatingState) {
		this.operatingState = operatingState;
	}
	public int getPostID() {
		return postID;
	}
	public void setPostID(int postID) {
		this.postID = postID;
	}
	public TsyPostComplaintVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TsyPostComplaintVo(int cid, String userName, String title, String userNames, String ctName,
			Date timeOfComplaint, int operatingState, int postID) {
		super();
		this.cid = cid;
		this.userName = userName;
		this.title = title;
		this.userNames = userNames;
		this.ctName = ctName;
		this.timeOfComplaint = timeOfComplaint;
		this.operatingState = operatingState;
		this.postID = postID;
	}
	
	

}
