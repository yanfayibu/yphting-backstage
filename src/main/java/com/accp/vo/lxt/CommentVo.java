package com.accp.vo.lxt;

import java.util.Date;

public class CommentVo {
	private int serviceAppraiseID;
	private String userName;
	private String serviceTitle;
	private String serviceAppraiseContent;
	private Date serviceAppraiseDate;
	public int getServiceAppraiseID() {
		return serviceAppraiseID;
	}
	public void setServiceAppraiseID(int serviceAppraiseID) {
		this.serviceAppraiseID = serviceAppraiseID;
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
	public String getServiceAppraiseContent() {
		return serviceAppraiseContent;
	}
	public void setServiceAppraiseContent(String serviceAppraiseContent) {
		this.serviceAppraiseContent = serviceAppraiseContent;
	}
	public Date getServiceAppraiseDate() {
		return serviceAppraiseDate;
	}
	public void setServiceAppraiseDate(Date serviceAppraiseDate) {
		this.serviceAppraiseDate = serviceAppraiseDate;
	}
	public CommentVo() {
		super();
	}
	public CommentVo(int serviceAppraiseID, String userName, String serviceTitle, String serviceAppraiseContent,
			Date serviceAppraiseDate) {
		super();
		this.serviceAppraiseID = serviceAppraiseID;
		this.userName = userName;
		this.serviceTitle = serviceTitle;
		this.serviceAppraiseContent = serviceAppraiseContent;
		this.serviceAppraiseDate = serviceAppraiseDate;
	}
	
	
}
