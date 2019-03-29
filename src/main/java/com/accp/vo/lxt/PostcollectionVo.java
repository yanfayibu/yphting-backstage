package com.accp.vo.lxt;

public class PostcollectionVo {
	private int pcID;
	private String userName;
	private String title;
	private String collectionTime;
	public int getPcID() {
		return pcID;
	}
	public void setPcID(int pcID) {
		this.pcID = pcID;
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
	public String getCollectionTime() {
		return collectionTime;
	}
	public void setCollectionTime(String collectionTime) {
		this.collectionTime = collectionTime;
	}
	public PostcollectionVo(int pcID, String userName, String title, String collectionTime) {
		super();
		this.pcID = pcID;
		this.userName = userName;
		this.title = title;
		this.collectionTime = collectionTime;
	}
	public PostcollectionVo() {
		super();
	}
	
}
