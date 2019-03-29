package com.accp.vo.tsy;

import java.util.Date;

/**
 * 
 * @author Tan
 * @ClassName:TsyMerchantcollectionVo.java
 * @date:2019年3月1日 @time:下午8:49:02
 * @description:店铺收藏收藏vo类
 */
public class TsyMerchantcollectionVo {

	private int collectID;		//收藏店铺编号
	private String userName;	//收藏的用户名
	private String userNames;	//被收藏的用户名
	private String shopName;	//被收藏的店铺名
	private Date collectionTime;	//被收藏的店铺名
	public int getCollectID() {
		return collectID;
	}
	public void setCollectID(int collectID) {
		this.collectID = collectID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNames() {
		return userNames;
	}
	public void setUserNames(String userNames) {
		this.userNames = userNames;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Date getCollectionTime() {
		return collectionTime;
	}
	public void setCollectionTime(Date collectionTime) {
		this.collectionTime = collectionTime;
	}
	public TsyMerchantcollectionVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TsyMerchantcollectionVo(int collectID, String userName, String userNames, String shopName,
			Date collectionTime) {
		super();
		this.collectID = collectID;
		this.userName = userName;
		this.userNames = userNames;
		this.shopName = shopName;
		this.collectionTime = collectionTime;
	}
	
	
}
