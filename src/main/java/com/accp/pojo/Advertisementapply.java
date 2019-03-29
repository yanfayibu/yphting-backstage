package com.accp.pojo;

import java.util.Date;
/**
 *广告位申请表
 */
public class Advertisementapply {
    private Integer aaid;       //广告位申请编号

    private String sponsorNmae;     //赞助商名称

    private Integer aid;        //广告编号

    private String aimgpath;    //图片

    private String apcurl;      //PC端链接路径

    private String aappurl;     //手机端链接路径

    private Float price;        //付款金额

    private Integer rentamonth; //租的月数

    private Date starttime;     //开始时间

    private Date endtime;       //结束时间

    private Date applytime;     //申请时间

    private String sponsorPhone;//赞助商电话
    
    private Integer auditstatus;//是否启用
    
    
    public Integer getAuditstatus() {
		return auditstatus;
	}
	public void setAuditstatus(Integer auditstatus) {
		this.auditstatus = auditstatus;
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
        return aaid;
    }

    public void setAaid(Integer aaid) {
        this.aaid = aaid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAimgpath() {
        return aimgpath;
    }

    public void setAimgpath(String aimgpath) {
        this.aimgpath = aimgpath == null ? null : aimgpath.trim();
    }

    public String getApcurl() {
        return apcurl;
    }

    public void setApcurl(String apcurl) {
        this.apcurl = apcurl == null ? null : apcurl.trim();
    }

    public String getAappurl() {
        return aappurl;
    }

    public void setAappurl(String aappurl) {
        this.aappurl = aappurl == null ? null : aappurl.trim();
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

	public Advertisementapply(Integer aaid, String sponsorNmae, Integer aid, String aimgpath, String apcurl,
			String aappurl, Float price, Integer rentamonth, Date starttime, Date endtime, Date applytime,
			String sponsorPhone) {
		super();
		this.aaid = aaid;
		this.sponsorNmae = sponsorNmae;
		this.aid = aid;
		this.aimgpath = aimgpath;
		this.apcurl = apcurl;
		this.aappurl = aappurl;
		this.price = price;
		this.rentamonth = rentamonth;
		this.starttime = starttime;
		this.endtime = endtime;
		this.applytime = applytime;
		this.sponsorPhone = sponsorPhone;
	}

	public Advertisementapply() {
		super();
	}
	
}