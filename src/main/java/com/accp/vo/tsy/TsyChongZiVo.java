package com.accp.vo.tsy;

import java.util.Date;

/**
 * 
 * @author Tan
 * @ClassName:TsyChongZiVo.java
 * @date:2019年3月25日 @time:下午2:00:42
 * @description:充值Vo类
 */
public class TsyChongZiVo {

	private String userName;
	private int acquisitionMode;
	private Date recordDate;
	private Double recordInAndOut;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAcquisitionMode() {
		return acquisitionMode;
	}
	public void setAcquisitionMode(int acquisitionMode) {
		this.acquisitionMode = acquisitionMode;
	}
	public Date getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
	public Double getRecordInAndOut() {
		return recordInAndOut;
	}
	public void setRecordInAndOut(Double recordInAndOut) {
		this.recordInAndOut = recordInAndOut;
	}
	public TsyChongZiVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TsyChongZiVo(String userName, int acquisitionMode, Date recordDate, Double recordInAndOut) {
		super();
		this.userName = userName;
		this.acquisitionMode = acquisitionMode;
		this.recordDate = recordDate;
		this.recordInAndOut = recordInAndOut;
	}
	
	
	
}
