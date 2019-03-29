package com.accp.vo.tsy;

import java.util.Date;

public class TsyPostManagementVo {

	private String fmName; // 帖子属于哪种类型
	private String title; // 帖子标题
	private Date releaseTime; // 帖子发布时间
	private int auditStatus; // 帖子状态是否审核通过
	private int postId; // 帖子编号 、
	public String getFmName() {
		return fmName;
	}
	public void setFmName(String fmName) {
		this.fmName = fmName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public int getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(int auditStatus) {
		this.auditStatus = auditStatus;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public TsyPostManagementVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TsyPostManagementVo(String fmName, String title, Date releaseTime, int auditStatus, int postId) {
		super();
		this.fmName = fmName;
		this.title = title;
		this.releaseTime = releaseTime;
		this.auditStatus = auditStatus;
		this.postId = postId;
	}
	
	
}
