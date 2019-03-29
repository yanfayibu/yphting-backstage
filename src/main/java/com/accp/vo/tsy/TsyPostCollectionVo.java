package com.accp.vo.tsy;

import java.util.Date;

/**
 * 
 * @author Tan
 * @ClassName:TsyPostCollectionVo.java
 * @date:2019年3月1日 @time:下午9:46:16
 * @description:帖子收藏（BBS收藏）Vo
 */
public class TsyPostCollectionVo {

	private int collectionID;		//帖子收藏编号
	private String userName;		//帖子收藏用户名
	private String title;			//被收藏的帖子标题
	private Date collectionTime;	//被收藏的帖子时间
	public int getCollectionID() {
		return collectionID;
	}
	public void setCollectionID(int collectionID) {
		this.collectionID = collectionID;
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
	public Date getCollectionTime() {
		return collectionTime;
	}
	public void setCollectionTime(Date collectionTime) {
		this.collectionTime = collectionTime;
	}
	public TsyPostCollectionVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TsyPostCollectionVo(int collectionID, String userName, String title, Date collectionTime) {
		super();
		this.collectionID = collectionID;
		this.userName = userName;
		this.title = title;
		this.collectionTime = collectionTime;
	}
	
	
	
	
}
