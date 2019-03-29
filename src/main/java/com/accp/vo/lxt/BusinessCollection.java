package com.accp.vo.lxt;

public class BusinessCollection {
	private int collectionID;	//收藏编号
	private String userName;	//用户名
	private String businessName;	//被收藏的用户名
	private String shopName;		//被收藏的店铺名
	private String collectionTime;	//收藏时间
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
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCollectionTime() {
		return collectionTime;
	}
	public void setCollectionTime(String collectionTime) {
		this.collectionTime = collectionTime;
	}
	public BusinessCollection() {
		super();
	}
	public BusinessCollection(int collectionID, String userName, String businessName, String shopName,
			String collectionTime) {
		super();
		this.collectionID = collectionID;
		this.userName = userName;
		this.businessName = businessName;
		this.shopName = shopName;
		this.collectionTime = collectionTime;
	}
	
}
