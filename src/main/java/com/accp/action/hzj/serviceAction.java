package com.accp.action.hzj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.hzj.serviceBiz;
import com.accp.pojo.News;
import com.accp.pojo.Servicelevel;
import com.accp.pojo.Servicetype;
import com.accp.pojo.User;
import com.accp.vo.hzj.refunDetailedMessageVo;
import com.accp.vo.hzj.refundVo;
import com.accp.vo.hzj.serviceAuditVo;
import com.accp.vo.hzj.serviceComplaintVo;
import com.accp.vo.hzj.serviceLevelVo;
import com.accp.vo.hzj.serviceReservationVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/c/hzj")
public class serviceAction {
	@Autowired
	private serviceBiz biz;
	
	
	//查询退款
	@GetMapping("queryRefund/{userName}/{orderID}/{PageNum}/{PageSize}")
	public PageInfo<refundVo> queryRefund(@PathVariable("userName")String userName,@PathVariable("orderID")String orderID,@PathVariable("PageNum")Integer PageNum,@PathVariable("PageSize")Integer PageSize) {
		//System.out.println(userName+"--"+orderID+"--"+PageNum+"--"+PageSize);
		//System.out.println(biz.queryRefund(userName, orderID, PageNum, PageSize).getPageSize());
		PageInfo<refundVo> d=biz.queryRefund(userName, orderID, PageNum, PageSize);
		return biz.queryRefund(userName, orderID, PageNum, PageSize);
	}
	
	
	//查看退款詳情
	@GetMapping("queryRefunDetailedMessage/{refundID}")
	public refunDetailedMessageVo queryRefunDetailedMessage(@PathVariable("refundID")Integer refundID) {
		//System.out.println(refundID);
		return biz.queryRefunDetailedMessage(refundID);
	}
	
	
	//修改退款信息
	@PutMapping("modifyRefund")
	public Map<String, String> modifyRefund(@RequestBody refunDetailedMessageVo refunDetailedMessageVo) {
		// TODO Auto-generated method stub
		Map<String, String> message = new HashMap<String, String>();
		try {
			biz.modifyRefund(refunDetailedMessageVo);
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
			
		} 
		//System.out.println(refunDetailedMessageVo.getRefundstatus());
		return message;
	}
	
	
	//查询商家Id
	@GetMapping("queryMerchantId/{refundID}")
	public List<refunDetailedMessageVo> queryMerchantId(@PathVariable("refundID")Integer refundID) {
		//System.out.println(refundID);
		//System.out.println(JSON.toJSON(biz.queryMerchantId(refundID)));
		return biz.queryMerchantId(refundID);
	}
	
	
	//发送信息给用户
	@PutMapping("setToUser")
	public Map<String, String> setToUser(@RequestBody News news) {
		// TODO Auto-generated method stub
		Map<String, String> message = new HashMap<String, String>();
		try {
			biz.setToUser(news);
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
				
		} 
		return message;
	}
	
	
	//发送信息给用户
	@PutMapping("setToMerchant")
	public Map<String, String> setToMerchant(@RequestBody News news) {
		// TODO Auto-generated method stub
		Map<String, String> message = new HashMap<String, String>();
		try {
			biz.setToMerchant(news);
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
				
		} 
		return message;
	}
	
	
	//查询服务级别
	@GetMapping("queryLevelName")
		public List<Servicetype> queryLevelName() {
		//System.out.println(biz.queryLevelName());
		return biz.queryLevelName();
	}
	
	
	//查询服务级别
	@GetMapping("queryLevel/{stid}/{PageNum}/{PageSize}")
	public PageInfo<serviceLevelVo> queryLevel(@PathVariable("stid")Integer stid,@PathVariable("PageNum")Integer PageNum,@PathVariable("PageSize")Integer PageSize) {
		//System.out.println(stid+"--"+PageNum+"--"+PageSize);
		//System.out.println(biz.queryLevel(stid, PageNum, PageSize).getList());
		return biz.queryLevel(stid, PageNum, PageSize);
	}
	
	
	//查看服务级别詳情
	@GetMapping("queryLevelMessage/{serlevelid}")
	public serviceLevelVo queryLevelMessage(@PathVariable("serlevelid")Integer serlevelid) {
		//System.out.println(serlevelid);
		return biz.queryLevelMessage(serlevelid);
	}
	
	
	//修改服务级别信息
	@PutMapping("modifyLevel")
	public Map<String, String> modifyLevel(@RequestBody Servicelevel servicelevel) {
		// TODO Auto-generated method stub
		//System.out.println(biz.modifyLevel(servicelevel));
		Map<String, String> message = new HashMap<String, String>();
		try {
			biz.modifyLevel(servicelevel);
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
			
		} 
		return message;
	}
	
	
	//新增服务级别信息
	@PutMapping("addLevel")
	public Map<String, String> addLevel(@RequestBody Servicelevel servicelevel) {
		// TODO Auto-generated method stub
		Map<String, String> message = new HashMap<String, String>();
		System.out.println(servicelevel);
		try {
			biz.addLevel(servicelevel);
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
				
		} 
		return message;
	}
	
	
	//删除服务级别信息
	@DeleteMapping("removeLevel/{serlevelid}")
	public Map<String, String> removeLevel(@PathVariable("serlevelid")Integer serlevelid) {
		// TODO Auto-generated method stub
		Map<String, String> message = new HashMap<String, String>();
		try {
			biz.removeLevel(serlevelid);
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
			
		} 
		return message;
	}
	
	
	//查询服务预约
	@GetMapping("queryReservation/{orderid}/{stid}/{orderstatus}/{PageNum}/{PageSize}")
	public PageInfo<serviceReservationVo> queryReservation(@PathVariable("orderid")String orderid,@PathVariable("stid")Integer stid,@PathVariable("orderstatus")Integer orderstatus,@PathVariable("PageNum")Integer PageNum,@PathVariable("PageSize")Integer PageSize) {
		System.out.println(orderid+"=="+stid+"=="+orderstatus);
		//System.out.println(biz.queryReservation(orderid, stid, orderstatus, PageNum, PageSize).toString());
		PageInfo<serviceReservationVo> d=biz.queryReservation(orderid, stid, orderstatus, PageNum, PageSize);
		return biz.queryReservation(orderid, stid, orderstatus, PageNum, PageSize);
	}
	
	
	//查询服务审核
	@GetMapping("queryAudit/{stid}/{auditstatus}/{servicetitle}/{businessstate}/{serviceid}/{recommendbool}/{PageNum}/{PageSize}")
	public PageInfo<serviceAuditVo> queryAudit(@PathVariable("stid")Integer stid,@PathVariable("auditstatus")Integer auditstatus,@PathVariable("servicetitle")String servicetitle,@PathVariable("businessstate")Integer businessstate,@PathVariable("serviceid")Integer serviceid,@PathVariable("recommendbool")Integer recommendbool,@PathVariable("PageNum")Integer PageNum,@PathVariable("PageSize")Integer PageSize) {
		System.out.println("stid:"+stid+"auditstatus:"+auditstatus+"servicetitle:"+servicetitle+"businessstate:"+businessstate+"serviceid:"+serviceid+"PageNum:"+PageNum+"PageSize:"+PageSize+"recommendbool:"+recommendbool);
		//System.out.println(biz.queryReservation(orderid, stid, orderstatus, PageNum, PageSize).toString());
		PageInfo<serviceAuditVo> d=biz.queryAudit(stid, auditstatus, servicetitle, businessstate, serviceid,recommendbool, PageNum, PageSize);
		return biz.queryAudit(stid, auditstatus, servicetitle, businessstate, serviceid,recommendbool, PageNum, PageSize);
	}
	
	
	
	//修改服务审核信息
	@PutMapping("modifyAudit")
	public Map<String, String> modifyAudit(@RequestBody serviceAuditVo serviceAuditVo) {
		// TODO Auto-generated method stub
		System.out.println("***"+biz.modifyAudit(serviceAuditVo));
		Map<String, String> message = new HashMap<String, String>();
		try {
			biz.modifyAudit(serviceAuditVo);
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
		} 
		return message;
	}
	
	
	//查询服务类别管理
	@GetMapping("queryType/{stid}/{stpid}/{PageNum}/{PageSize}")
	public PageInfo<Servicetype> queryType(@PathVariable("stid")Integer stid,@PathVariable("stpid")Integer stpid,@PathVariable("PageNum")Integer PageNum,@PathVariable("PageSize")Integer PageSize) {
		PageInfo<Servicetype> d=biz.queryType(stid, stpid,PageNum, PageSize);
		return biz.queryType(stid,stpid, PageNum, PageSize);
	}
	/*@GetMapping("queryTypeChilder/{stid}/{PageNum}/{PageSize}")
	public PageInfo<Servicetype> queryTypeChilder(@PathVariable("stid")Integer stid,@PathVariable("PageNum")Integer PageNum,@PathVariable("PageSize")Integer PageSize) {
		PageInfo<Servicetype> d=biz.queryTypeChilder(stid, PageNum, PageSize);
		return biz.queryTypeChilder(stid, PageNum, PageSize);
	}*/
	
	//新增服务类别管理
	@PutMapping("addType")
	public Map<String, String> addType(@RequestBody Servicetype servicetype) {
		// TODO Auto-generated method stub
		Map<String, String> message = new HashMap<String, String>();
		System.out.println(servicetype);
		try {
			biz.addType(servicetype);
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
				
		} 
		return message;
	}
	
	
	//删除服务级别信息
	@DeleteMapping("removeType/{stid}")
	public Map<String, String> removeType(@PathVariable("stid")Integer stid) {
		// TODO Auto-generated method stub
		Map<String, String> message = new HashMap<String, String>();
		try {
			biz.removeType(stid);
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
			
		} 
		return message;
	}
	
	
	//修改服务类别管理
	@PutMapping("modifyType")
	public Map<String, String> modifyType(@RequestBody Servicetype servicetype) {
		// TODO Auto-generated method stub
		Map<String, String> message = new HashMap<String, String>();
		try {
			biz.modifyType(servicetype);
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
		} 
		return message;
	}
	
	
	//修改服务审核管理
	@PutMapping("modifyAuditManagement")
	public Map<String, String> modifyAuditManagement(@RequestBody Servicetype servicetype) {
		// TODO Auto-generated method stub
		Map<String, String> message = new HashMap<String, String>();
		try {
			biz.modifyAuditManagement(servicetype);
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
		} 
		return message;
	}	
	
	
	//查询服务投诉
	@GetMapping("queryComplaint/{servicetitle}/{PageNum}/{PageSize}")
	public PageInfo<serviceComplaintVo> queryComplaint(@PathVariable("servicetitle")String servicetitle,@PathVariable("PageNum")Integer PageNum,@PathVariable("PageSize")Integer PageSize) {
		PageInfo<serviceComplaintVo> d=biz.queryComplaint(servicetitle,PageNum, PageSize);
		//System.out.println(biz.queryComplaint(servicetitle, PageNum, PageSize));
		return biz.queryComplaint(servicetitle, PageNum, PageSize);
	}
	
	
	
	//修改服务投诉
	@PutMapping("modifyComplaint")
	public Map<String, String> modifyComplaint(@RequestBody serviceComplaintVo serviceComplaintVo) {
		// TODO Auto-generated method stub
		Map<String, String> message = new HashMap<String, String>();
		try {
			biz.modifyComplaint(serviceComplaintVo);
			message.put("code", "200");
		} catch (Exception e) {
			message.put("code", "500");
		} 
		return message;
	}	
}
