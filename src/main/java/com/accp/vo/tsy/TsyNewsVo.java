package com.accp.vo.tsy;

import java.util.Date;

public class TsyNewsVo {

	private int newsID; // 消息编号
	private String theSenderName; // 发件人编号
	private String addResseeName; // 收件人编号
	private String content; // 消息内容
	private Date sendingTime; // 消息发送时间
	public int getNewsID() {
		return newsID;
	}
	public void setNewsID(int newsID) {
		this.newsID = newsID;
	}
	public String getTheSenderName() {
		return theSenderName;
	}
	public void setTheSenderName(String theSenderName) {
		this.theSenderName = theSenderName;
	}
	public String getAddResseeName() {
		return addResseeName;
	}
	public void setAddResseeName(String addResseeName) {
		this.addResseeName = addResseeName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getSendingTime() {
		return sendingTime;
	}
	public void setSendingTime(Date sendingTime) {
		this.sendingTime = sendingTime;
	}
	public TsyNewsVo(int newsID, String theSenderName, String addResseeName, String content, Date sendingTime) {
		super();
		this.newsID = newsID;
		this.theSenderName = theSenderName;
		this.addResseeName = addResseeName;
		this.content = content;
		this.sendingTime = sendingTime;
	}
	public TsyNewsVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
