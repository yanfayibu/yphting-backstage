package com.accp.vo.hzj;

import java.util.Date;

public class serviceComplaintVo {
    private Integer srid;             	//编号
    private String servicetitle;        //服务标题
    private String username;            //用户名
    private String ctname;				//投诉类型名称
    private Date timeofcomplaint;     	//举报时间
    private Integer auditstatus;      	//审核状态(1待审核2审批通过3审批未通过)
	public serviceComplaintVo() {
		super();
	}
	public serviceComplaintVo(Integer srid, String servicetitle, String username, String ctname, Date timeofcomplaint,
			Integer auditstatus) {
		super();
		this.srid = srid;
		this.servicetitle = servicetitle;
		this.username = username;
		this.ctname = ctname;
		this.timeofcomplaint = timeofcomplaint;
		this.auditstatus = auditstatus;
	}
	public Integer getSrid() {
		return srid;
	}
	public void setSrid(Integer srid) {
		this.srid = srid;
	}
	public String getServicetitle() {
		return servicetitle;
	}
	public void setServicetitle(String servicetitle) {
		this.servicetitle = servicetitle;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCtname() {
		return ctname;
	}
	public void setCtname(String ctname) {
		this.ctname = ctname;
	}
	public Date getTimeofcomplaint() {
		return timeofcomplaint;
	}
	public void setTimeofcomplaint(Date timeofcomplaint) {
		this.timeofcomplaint = timeofcomplaint;
	}
	public Integer getAuditstatus() {
		return auditstatus;
	}
	public void setAuditstatus(Integer auditstatus) {
		this.auditstatus = auditstatus;
	}
    
	
}
