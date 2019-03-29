package com.accp.vo.yl;

import java.util.Date;

/**
 * 
 * @Description 托管信息类
 * @author yl
 * @date 2019年3月11日
 */
public class UserTruVo {
	
		private Integer truid;                        //编号
		private String username;                     //用户名(第三方注册成功后复制过来)
		private String shopname;                     //店铺名称
		private Boolean trusteeship;                 //托管状态
		private Date trusteeshipstarttime;           //托管开始时间
		private Date trusteeshipendtime;			//托管结束时间
		private Integer trusteeshipmonth;            //托管月数
		private Integer businessstate;               //营业状态(1营业2暂停3关闭)
		private Integer merchanttype;                //商家类别，0：不是商家，1：大陆商家用户，2：海外商家用户
	    private Integer userid;              		 //用户编号
	    private Date applicationtime;        		 //申请时间
	    private Date audittime;              		 //审核时间
	    private Integer auditstatus;        	  	//审核状态(1待审核2审核通过3拒绝)
	    
	    
		public Date getTrusteeshipendtime() {
			return trusteeshipendtime;
		}
		public void setTrusteeshipendtime(Date trusteeshipendtime) {
			this.trusteeshipendtime = trusteeshipendtime;
		}
		public Integer getTruid() {
			return truid;
		}
		public void setTruid(Integer truid) {
			this.truid = truid;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getShopname() {
			return shopname;
		}
		public void setShopname(String shopname) {
			this.shopname = shopname;
		}
		public Boolean getTrusteeship() {
			return trusteeship;
		}
		public void setTrusteeship(Boolean trusteeship) {
			this.trusteeship = trusteeship;
		}
		public Date getTrusteeshipstarttime() {
			return trusteeshipstarttime;
		}
		public void setTrusteeshipstarttime(Date trusteeshipstarttime) {
			this.trusteeshipstarttime = trusteeshipstarttime;
		}
		public Integer getTrusteeshipmonth() {
			return trusteeshipmonth;
		}
		public void setTrusteeshipmonth(Integer trusteeshipmonth) {
			this.trusteeshipmonth = trusteeshipmonth;
		}
		public Integer getBusinessstate() {
			return businessstate;
		}
		public void setBusinessstate(Integer businessstate) {
			this.businessstate = businessstate;
		}
		public Integer getMerchanttype() {
			return merchanttype;
		}
		public void setMerchanttype(Integer merchanttype) {
			this.merchanttype = merchanttype;
		}
		public Integer getUserid() {
			return userid;
		}
		public void setUserid(Integer userid) {
			this.userid = userid;
		}
		public Date getApplicationtime() {
			return applicationtime;
		}
		public void setApplicationtime(Date applicationtime) {
			this.applicationtime = applicationtime;
		}
		public Date getAudittime() {
			return audittime;
		}
		public void setAudittime(Date audittime) {
			this.audittime = audittime;
		}
		public Integer getAuditstatus() {
			return auditstatus;
		}
		public void setAuditstatus(Integer auditstatus) {
			this.auditstatus = auditstatus;
		}
}
