package com.accp.vo.yl;

import java.util.Date;

public class ApplyforVo {
	private Integer aaID;       //广告位申请编号

    private String sponsorNmae;     //赞助商名称

    private Integer aid;        //广告编号
    
    private String atitle;     //标题

    private String aimgpath;    //图片

    private String apcurl;      //PC端链接路径

    private String aappurl;     //手机端链接路径

    private Float price;        //付款金额

    private Integer rentamonth; //租的月数

    private Date starttime;     //开始时间

    private Date endtime;       //结束时间

    private Date applytime;     //申请时间

    private String sponsorPhone;//赞助商电话
    
    private Integer auditstatus;//赞助商电话
    
    
	public Integer getAuditstatus() {
		return auditstatus;
	}

	public void setAuditstatus(Integer auditstatus) {
		this.auditstatus = auditstatus;
	}

	public Integer getAaID() {
		return aaID;
	}

	public void setAaID(Integer aaID) {
		this.aaID = aaID;
	}

	public String getSponsorNmae() {
		return sponsorNmae;
	}

	public void setSponsorNmae(String sponsorNmae) {
		this.sponsorNmae = sponsorNmae;
	}

	public String getSponsorPhone() {
		return sponsorPhone;
	}

	public void setSponsorPhone(String sponsorPhone) {
		this.sponsorPhone = sponsorPhone;
	}

	public Integer getAaid() {
		return aaID;
	}

	public void setAaid(Integer aaid) {
		this.aaID = aaid;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAtitle() {
		return atitle;
	}

	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}

	public String getAimgpath() {
		return aimgpath;
	}

	public void setAimgpath(String aimgpath) {
		this.aimgpath = aimgpath;
	}

	public String getApcurl() {
		return apcurl;
	}

	public void setApcurl(String apcurl) {
		this.apcurl = apcurl;
	}

	public String getAappurl() {
		return aappurl;
	}

	public void setAappurl(String aappurl) {
		this.aappurl = aappurl;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getRentamonth() {
		return rentamonth;
	}

	public void setRentamonth(Integer rentamonth) {
		this.rentamonth = rentamonth;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Date getApplytime() {
		return applytime;
	}

	public void setApplytime(Date applytime) {
		this.applytime = applytime;
	}

}
