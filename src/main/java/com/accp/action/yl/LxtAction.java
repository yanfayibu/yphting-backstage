package com.accp.action.yl;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yl.LxtBiz;
import com.accp.pojo.Appraisalapply;
import com.accp.pojo.Servicetype;
import com.accp.pojo.Services;
import com.accp.pojo.Sharea;
import com.accp.pojo.User;
import com.accp.vo.lxt.AppraisalVo;
import com.accp.vo.lxt.BusinessCollection;
import com.accp.vo.lxt.CommentVo;
import com.accp.vo.lxt.GoldVo;
import com.accp.vo.lxt.IntegralVo;
import com.accp.vo.lxt.PostcollectionVo;
import com.accp.vo.lxt.PutforwardVo;
import com.accp.vo.lxt.ServiceCollectionVo;
import com.accp.vo.lxt.ServiceVo;
import com.accp.vo.lxt.UserVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/lxt")
public class LxtAction {
	@Autowired
	private LxtBiz biz;
	 
	@GetMapping("queryAll/{pageNum}/{pageSize}")
	public PageInfo<User> queryAll(@PathVariable int pageNum,@PathVariable int pageSize) {
		PageInfo<User> list =biz.queryAll(pageNum,pageSize);
		return list;
	}
	
	@GetMapping("queryByName/{pageNum}/{pageSize}/{userName}")
	public PageInfo<User> querybyUserName(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String userName){
		PageInfo<User> list =biz.queryByUserName(pageNum, pageSize, userName);
		return list;
	}
	
	@GetMapping("queryByUserId/{userId}")
	public User queryByUserId(@PathVariable int userId) {
		User user =biz.queryByUserId(userId);
		return user;
	}
	
	@GetMapping("queryBusiness/{pageNum}/{pageSize}")
	public PageInfo<User> queryBusiness(@PathVariable int pageNum,@PathVariable int pageSize){
		return biz.queryBusiness(pageNum, pageSize);
	}
	
	@GetMapping("queryBusName/{pageNum}/{pageSize}/{userName}/{shopName}/{merchantType}")
	public PageInfo<User> queryBusName(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String userName,@PathVariable String shopName,@PathVariable int merchantType){
		return biz.queryByBusName(pageNum, pageSize, userName, shopName, merchantType);
	}
	
	@GetMapping("queryEnter/{pageNum}/{pageSize}/{userName}/{merchantType}/{auditState}")
	public PageInfo<User> queryByEnter(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String userName,@PathVariable int merchantType,@PathVariable int auditState){
		return biz.queryEnter(pageNum, pageSize, userName, merchantType, auditState);
	}
	
	@RequestMapping(value="updateUser",method=RequestMethod.PUT)
	public int updateUser(@RequestBody User user) {
		return biz.update(user);
	}
	
	@GetMapping("queryBusinessById/{userId}")
	public UserVo queryBusinessById(@PathVariable int userId) {
		return biz.queryBusinessById(userId);
	}
	
	@RequestMapping(value="updateGuaranteeMoney",method=RequestMethod.PUT)
	public int updateGuaranteeMoney(@RequestBody int userId) {
		return biz.updateGuaranteeMoney(userId);
	}
	
	@GetMapping("queryGoldRecord/{pageNum}/{pageSize}/{userName}")
	public PageInfo<GoldVo> queryGoldRecord(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String userName){
		return biz.queryGoldRecord(pageNum, pageSize, userName);
	}
	
	@GetMapping("queryIntegral/{pageNum}/{pageSize}/{userName}")
	public PageInfo<IntegralVo> queryIntegralVo(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String userName){
		return biz.queryIntegral(pageNum, pageSize, userName);
	}
	
	@GetMapping("queryAppraisal/{pageNum}/{pageSize}/{userName}/{auditStatus}")
	public PageInfo<AppraisalVo> queryAppraisal(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String userName,@PathVariable int auditStatus){
		return biz.queryAppraisal(pageNum, pageSize, userName,auditStatus);
	}
	
	@GetMapping("queryAppraisalById/{aid}")
	public AppraisalVo queryAppraisalById(@PathVariable int aid) {
		return biz.queryAppraisalById(aid);
	}
	
	@RequestMapping(value="updateAppraisal",method=RequestMethod.PUT)
	public int updateAppraisal(@RequestBody AppraisalVo Appraisal) {
		System.out.println((Appraisal).toString());
		return biz.updateAppraisal(Appraisal);
	}
	
	@GetMapping("queryCommentList/{pageNum}/{pageSize}/{userName}/{title}")
	public PageInfo<CommentVo> queryCommentList(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String userName,@PathVariable String title){
		return biz.queryCommentList(pageNum, pageSize, userName, title);
	}
	
	@DeleteMapping("deleteComment/{id}")
	public int deleteComment(@PathVariable int id) {
		return biz.deleteComment(id);
	}
	
	@GetMapping("queryReCommend/{pageNum}/{pageSize}/{userName}/{shopName}/{merchantType}/{recommendBool}")
	public PageInfo<ServiceVo> queryReCommend(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String userName,@PathVariable String shopName,@PathVariable int merchantType,@PathVariable int recommendBool){
		return biz.queryRecommend(pageNum, pageSize, userName, shopName, merchantType, recommendBool);
	}
	
	@GetMapping("queryReCommendById/{sid}")
	public ServiceVo queryReCommendById(@PathVariable int sid) {
		return biz.queryReCommendById(sid);
	}
	
	@RequestMapping(value="updateSerices",method=RequestMethod.PUT)
	public int updateReCommend(@RequestBody Services services) {
		return biz.updateReCommend(services);
	}
	
	@GetMapping("queryRecharge/{pageNum}/{pageSize}/{userName}/{yearDate}/{monthDate}")
	public PageInfo<GoldVo> queryRecharge(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String userName,@PathVariable String yearDate,@PathVariable String monthDate){
		return biz.queryRecharge(pageNum, pageSize,userName,yearDate, monthDate);
	}
	
	@GetMapping("queryWithdrawal/{pageNum}/{pageSize}/{userName}/{yearDate}/{monthDate}")
	public PageInfo<PutforwardVo> queryWithdrawal(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String userName,@PathVariable String yearDate,@PathVariable String monthDate){
			return biz.queryWithdrawal(pageNum, pageSize, userName, yearDate, monthDate);
	}
	
	@GetMapping("queryWithById/{id}")
	public PutforwardVo queryWithById(@PathVariable int id) {
		return biz.queryWithById(id);
	}
	
	@RequestMapping(value="updatewithdrawal",method=RequestMethod.PUT)
	public int updatewithdrawal(@RequestBody PutforwardVo pt) {
		return biz.updatewithdrawal(pt);
	}
	
	@GetMapping("queryExpenditure/{yearDate}/{monthDate}")
	public int queryExpenditure(@PathVariable String yearDate,@PathVariable String monthDate) {
		return biz.queryExpenditure(yearDate, monthDate);
	}
	@GetMapping("queryIncome/{yearDate}/{monthDate}")
	public int queryIncome(@PathVariable String yearDate,@PathVariable String monthDate) {
		return biz.queryIncome(yearDate, monthDate);
	}
	
	@GetMapping("queryServiceCollection/{userName}/{title}/{stid}/{pageNum}/{pageSize}")
	public PageInfo<ServiceCollectionVo> querySeCollection(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String userName,@PathVariable String title,@PathVariable int stid){
		return biz.queryseCollection(pageNum, pageSize, userName, title, stid);
	}
	
	@GetMapping("queryTypeList")
	public List<Servicetype> queryTypeList(){
		return biz.queryTypelist();
	}
	
	@GetMapping("querypoCollection/{pageNum}/{pageSize}/{userName}/{title}")
	public PageInfo<PostcollectionVo> querypoCollection(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String userName,@PathVariable String title){
		return biz.querypoCollection(pageNum, pageSize, userName, title);
	}
	
	@GetMapping("queryBsCollection/{pageNum}/{pageSize}/{shopName}/{stid}/{merchanType}")
	public PageInfo<BusinessCollection> queryBsCollection(@PathVariable int pageNum,@PathVariable int pageSize,@PathVariable String shopName,@PathVariable int stid,@PathVariable int merchantType){
		return biz.queryBsCollection(pageNum, pageSize, shopName, stid, merchantType);
	}
}