package com.accp.pojo;

import java.util.Date;
/**
 *用户表
 */
public class User {
	private Integer userid;                     //用户编号

	private String userimgpath;                 //用户头像地址(第三方注册成功后复制过来)

	private String username;                    //用户名(第三方注册成功后复制过来)

	private String userrealname;                //用户真实姓名

	private Integer usersex;                    //用户性别，1：男，2：女

	private String userphone;                   //联系电话

	private String contactmailbox;              //联系邮箱

	private Float usermoney;                    //用户金币

	private Integer userintegral;               //用户积分

	private Integer country;                    //国编

	private Integer provincialid;               //省级地址编号

	private Integer cityid;                     //市级地址编号

	private Integer countyid;                   //县/区级地址编号

	private String addetail;                    //地址详情

	private Integer merchanttype;               //商家类别，0：不是商家，1：大陆商家用户，2：海外商家用户

	private Date merchantregistrationtime;      //商家注册时间

	private Integer firstserviceid;             //第一个服务类别编号

	private Integer secondserviceid;            //第二个服务类别编号

	private Float firstservicemoney;            //第一个服务交易额

	private Float secondservicemoney;           //第二个服务交易额

	private String hospitalname;                //医院名称，申请服务类别有微整形时不能为空，否则可以

	private String shopname;                    //店铺名称

	private String signature;                   //店铺签名

	private Integer guaranteemoney;             //店铺保证金

	private String shopimg;                     //商家店铺图片路径

	private Integer identitytype;               //证件类型，海外用户为空，大陆商家用户：1：身份证号码，2：护照号码

	private String identitynumder;              //证件号码

	private String identityrealname;            //海外证件真实姓名，大陆商家用户为空

	private String identitypositiveimg;         //证件正面图片路径

	private String identitynegativeimg;         //证件反面图片路径

	private String identityhandimg;             //证件手持图片路径

	private String languagenametext;            //服务语言

	private String majornametext;               //擅长专业

	private Integer livecityid;                 //所在城市编号

	private String merchantemail;               //商家联系邮箱

	private String merchantphone;               //商家联系电话

	private Float merchantlevel;                //商家星级

	private Integer merchantexp;                //商家经验值，用来提升星级

	private String qq;                          //QQ

	private String wechat;                      //微信

	private String profession;                  //职业
 
	private Float height;                       //身高

	private String constellation;               //星座

	private Integer age;                        //年龄

	private Integer collectcount;               //商家被收藏数

	private Integer ordercount;                 //商家被订单数

	private Integer browsenumber;               //商家被浏览数

	private Boolean trusteeship;                //托管状态

	private Date trusteeshipstarttime;          //托管开始时间
 
	private Integer trusteeshipmonth;           //托管月数

	private Integer businessstate;              //营业状态(1营业2暂停3关闭)

	private Integer experience;                 //免费体验月数

	private Boolean experiencestatus;           //免费体验状态(true开启false关闭)

	private Integer auditstatus;                //审核状态(1待审核2已通过3拒绝)

	private Date audittime;                     //管理员理由

	private Boolean authentication;             //一号服务平台认证

	private Boolean authenticationer;           //二号服务平台认证

	private Integer creditscore;                //信誉积分(默认60/满分100 20为1颗星)

	private Boolean stateboolean;               //用户状态(可禁用用户true1正常false0禁用)

	private Boolean mailboxverification;        //邮箱验证/邮箱激活

	private String registerip;                  //注册IP地址

	private String lastentry;                   //最后登入IP地址

	private Date userregistrationtime;          //用户注册时间

	private Date recententry;                   //用户最后登入时间

	private String selfintroduction;            //自我介绍

	private String reason;

	public String getSelfintroduction() {
		return selfintroduction;
	}

	public void setSelfintroduction(String selfintroduction) {
		this.selfintroduction = selfintroduction == null ? null : selfintroduction.trim();
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason == null ? null : reason.trim();
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUserimgpath() {
		return userimgpath;
	}

	public void setUserimgpath(String userimgpath) {
		this.userimgpath = userimgpath == null ? null : userimgpath.trim();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getUserrealname() {
		return userrealname;
	}

	public void setUserrealname(String userrealname) {
		this.userrealname = userrealname == null ? null : userrealname.trim();
	}

	public Integer getUsersex() {
		return usersex;
	}

	public void setUsersex(Integer usersex) {
		this.usersex = usersex;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone == null ? null : userphone.trim();
	}

	public String getContactmailbox() {
		return contactmailbox;
	}

	public void setContactmailbox(String contactmailbox) {
		this.contactmailbox = contactmailbox == null ? null : contactmailbox.trim();
	}

	public Float getUsermoney() {
		return usermoney;
	}

	public void setUsermoney(Float usermoney) {
		this.usermoney = usermoney;
	}

	public Integer getUserintegral() {
		return userintegral;
	}

	public void setUserintegral(Integer userintegral) {
		this.userintegral = userintegral;
	}

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public Integer getProvincialid() {
		return provincialid;
	}

	public void setProvincialid(Integer provincialid) {
		this.provincialid = provincialid;
	}

	public Integer getCityid() {
		return cityid;
	}

	public void setCityid(Integer cityid) {
		this.cityid = cityid;
	}

	public Integer getCountyid() {
		return countyid;
	}

	public void setCountyid(Integer countyid) {
		this.countyid = countyid;
	}

	public String getAddetail() {
		return addetail;
	}

	public void setAddetail(String addetail) {
		this.addetail = addetail == null ? null : addetail.trim();
	}

	public Integer getMerchanttype() {
		return merchanttype;
	}

	public void setMerchanttype(Integer merchanttype) {
		this.merchanttype = merchanttype;
	}

	public Date getMerchantregistrationtime() {
		return merchantregistrationtime;
	}

	public void setMerchantregistrationtime(Date merchantregistrationtime) {
		this.merchantregistrationtime = merchantregistrationtime;
	}

	public Integer getFirstserviceid() {
		return firstserviceid;
	}

	public void setFirstserviceid(Integer firstserviceid) {
		this.firstserviceid = firstserviceid;
	}

	public Integer getSecondserviceid() {
		return secondserviceid;
	}

	public void setSecondserviceid(Integer secondserviceid) {
		this.secondserviceid = secondserviceid;
	}

	public Float getFirstservicemoney() {
		return firstservicemoney;
	}

	public void setFirstservicemoney(Float firstservicemoney) {
		this.firstservicemoney = firstservicemoney;
	}

	public Float getSecondservicemoney() {
		return secondservicemoney;
	}

	public void setSecondservicemoney(Float secondservicemoney) {
		this.secondservicemoney = secondservicemoney;
	}

	public String getHospitalname() {
		return hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname == null ? null : hospitalname.trim();
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname == null ? null : shopname.trim();
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature == null ? null : signature.trim();
	}

	public Integer getGuaranteemoney() {
		return guaranteemoney;
	}

	public void setGuaranteemoney(Integer guaranteemoney) {
		this.guaranteemoney = guaranteemoney;
	}

	public String getShopimg() {
		return shopimg;
	}

	public void setShopimg(String shopimg) {
		this.shopimg = shopimg == null ? null : shopimg.trim();
	}

	public Integer getIdentitytype() {
		return identitytype;
	}

	public void setIdentitytype(Integer identitytype) {
		this.identitytype = identitytype;
	}

	public String getIdentitynumder() {
		return identitynumder;
	}

	public void setIdentitynumder(String identitynumder) {
		this.identitynumder = identitynumder == null ? null : identitynumder.trim();
	}

	public String getIdentityrealname() {
		return identityrealname;
	}

	public void setIdentityrealname(String identityrealname) {
		this.identityrealname = identityrealname == null ? null : identityrealname.trim();
	}

	public String getIdentitypositiveimg() {
		return identitypositiveimg;
	}

	public void setIdentitypositiveimg(String identitypositiveimg) {
		this.identitypositiveimg = identitypositiveimg == null ? null : identitypositiveimg.trim();
	}

	public String getIdentitynegativeimg() {
		return identitynegativeimg;
	}

	public void setIdentitynegativeimg(String identitynegativeimg) {
		this.identitynegativeimg = identitynegativeimg == null ? null : identitynegativeimg.trim();
	}

	public String getIdentityhandimg() {
		return identityhandimg;
	}

	public void setIdentityhandimg(String identityhandimg) {
		this.identityhandimg = identityhandimg == null ? null : identityhandimg.trim();
	}

	public String getLanguagenametext() {
		return languagenametext;
	}

	public void setLanguagenametext(String languagenametext) {
		this.languagenametext = languagenametext == null ? null : languagenametext.trim();
	}

	public String getMajornametext() {
		return majornametext;
	}

	public void setMajornametext(String majornametext) {
		this.majornametext = majornametext == null ? null : majornametext.trim();
	}

	public Integer getLivecityid() {
		return livecityid;
	}

	public void setLivecityid(Integer livecityid) {
		this.livecityid = livecityid;
	}

	public String getMerchantemail() {
		return merchantemail;
	}

	public void setMerchantemail(String merchantemail) {
		this.merchantemail = merchantemail == null ? null : merchantemail.trim();
	}

	public String getMerchantphone() {
		return merchantphone;
	}

	public void setMerchantphone(String merchantphone) {
		this.merchantphone = merchantphone == null ? null : merchantphone.trim();
	}

	public Float getMerchantlevel() {
		return merchantlevel;
	}

	public void setMerchantlevel(Float merchantlevel) {
		this.merchantlevel = merchantlevel;
	}

	public Integer getMerchantexp() {
		return merchantexp;
	}

	public void setMerchantexp(Integer merchantexp) {
		this.merchantexp = merchantexp;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq == null ? null : qq.trim();
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat == null ? null : wechat.trim();
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession == null ? null : profession.trim();
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation == null ? null : constellation.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getCollectcount() {
		return collectcount;
	}

	public void setCollectcount(Integer collectcount) {
		this.collectcount = collectcount;
	}

	public Integer getOrdercount() {
		return ordercount;
	}

	public void setOrdercount(Integer ordercount) {
		this.ordercount = ordercount;
	}

	public Integer getBrowsenumber() {
		return browsenumber;
	}

	public void setBrowsenumber(Integer browsenumber) {
		this.browsenumber = browsenumber;
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

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Boolean getExperiencestatus() {
		return experiencestatus;
	}

	public void setExperiencestatus(Boolean experiencestatus) {
		this.experiencestatus = experiencestatus;
	}

	public Integer getAuditstatus() {
		return auditstatus;
	}

	public void setAuditstatus(Integer auditstatus) {
		this.auditstatus = auditstatus;
	}

	public Date getAudittime() {
		return audittime;
	}

	public void setAudittime(Date audittime) {
		this.audittime = audittime;
	}

	public Boolean getAuthentication() {
		return authentication;
	}

	public void setAuthentication(Boolean authentication) {
		this.authentication = authentication;
	}

	public Boolean getAuthenticationer() {
		return authenticationer;
	}

	public void setAuthenticationer(Boolean authenticationer) {
		this.authenticationer = authenticationer;
	}

	public Integer getCreditscore() {
		return creditscore;
	}

	public void setCreditscore(Integer creditscore) {
		this.creditscore = creditscore;
	}

	public Boolean getStateboolean() {
		return stateboolean;
	}

	public void setStateboolean(Boolean stateboolean) {
		this.stateboolean = stateboolean;
	}

	public Boolean getMailboxverification() {
		return mailboxverification;
	}

	public void setMailboxverification(Boolean mailboxverification) {
		this.mailboxverification = mailboxverification;
	}

	public String getRegisterip() {
		return registerip;
	}

	public void setRegisterip(String registerip) {
		this.registerip = registerip == null ? null : registerip.trim();
	}

	public String getLastentry() {
		return lastentry;
	}

	public void setLastentry(String lastentry) {
		this.lastentry = lastentry == null ? null : lastentry.trim();
	}

	public Date getUserregistrationtime() {
		return userregistrationtime;
	}

	public void setUserregistrationtime(Date userregistrationtime) {
		this.userregistrationtime = userregistrationtime;
	}

	public Date getRecententry() {
		return recententry;
	}

	public void setRecententry(Date recententry) {
		this.recententry = recententry;
	}

	public User(Integer userid, String userimgpath, String username, String userrealname, Integer usersex,
			String userphone, String contactmailbox, Float usermoney, Integer userintegral, Integer country,
			Integer provincialid, Integer cityid, Integer countyid, String addetail, Integer merchanttype,
			Date merchantregistrationtime, Integer firstserviceid, Integer secondserviceid, Float firstservicemoney,
			Float secondservicemoney, String hospitalname, String shopname, String signature, Integer guaranteemoney,
			String shopimg, Integer identitytype, String identitynumder, String identityrealname,
			String identitypositiveimg, String identitynegativeimg, String identityhandimg, String languagenametext,
			String majornametext, Integer livecityid, String merchantemail, String merchantphone, Float merchantlevel,
			Integer merchantexp, String qq, String wechat, String profession, Float height, String constellation,
			Integer age, Integer collectcount, Integer ordercount, Integer browsenumber, Boolean trusteeship,
			Date trusteeshipstarttime, Integer trusteeshipmonth, Integer businessstate, Integer experience,
			Boolean experiencestatus, Integer auditstatus, Date audittime, Boolean authentication,
			Boolean authenticationer, Integer creditscore, Boolean stateboolean, Boolean mailboxverification,
			String registerip, String lastentry, Date userregistrationtime, Date recententry, String selfintroduction,
			String reason) {
		super();
		this.userid = userid;
		this.userimgpath = userimgpath;
		this.username = username;
		this.userrealname = userrealname;
		this.usersex = usersex;
		this.userphone = userphone;
		this.contactmailbox = contactmailbox;
		this.usermoney = usermoney;
		this.userintegral = userintegral;
		this.country = country;
		this.provincialid = provincialid;
		this.cityid = cityid;
		this.countyid = countyid;
		this.addetail = addetail;
		this.merchanttype = merchanttype;
		this.merchantregistrationtime = merchantregistrationtime;
		this.firstserviceid = firstserviceid;
		this.secondserviceid = secondserviceid;
		this.firstservicemoney = firstservicemoney;
		this.secondservicemoney = secondservicemoney;
		this.hospitalname = hospitalname;
		this.shopname = shopname;
		this.signature = signature;
		this.guaranteemoney = guaranteemoney;
		this.shopimg = shopimg;
		this.identitytype = identitytype;
		this.identitynumder = identitynumder;
		this.identityrealname = identityrealname;
		this.identitypositiveimg = identitypositiveimg;
		this.identitynegativeimg = identitynegativeimg;
		this.identityhandimg = identityhandimg;
		this.languagenametext = languagenametext;
		this.majornametext = majornametext;
		this.livecityid = livecityid;
		this.merchantemail = merchantemail;
		this.merchantphone = merchantphone;
		this.merchantlevel = merchantlevel;
		this.merchantexp = merchantexp;
		this.qq = qq;
		this.wechat = wechat;
		this.profession = profession;
		this.height = height;
		this.constellation = constellation;
		this.age = age;
		this.collectcount = collectcount;
		this.ordercount = ordercount;
		this.browsenumber = browsenumber;
		this.trusteeship = trusteeship;
		this.trusteeshipstarttime = trusteeshipstarttime;
		this.trusteeshipmonth = trusteeshipmonth;
		this.businessstate = businessstate;
		this.experience = experience;
		this.experiencestatus = experiencestatus;
		this.auditstatus = auditstatus;
		this.audittime = audittime;
		this.authentication = authentication;
		this.authenticationer = authenticationer;
		this.creditscore = creditscore;
		this.stateboolean = stateboolean;
		this.mailboxverification = mailboxverification;
		this.registerip = registerip;
		this.lastentry = lastentry;
		this.userregistrationtime = userregistrationtime;
		this.recententry = recententry;
		this.selfintroduction = selfintroduction;
		this.reason = reason;
	}

	public User() {
		super();
	}
	
}