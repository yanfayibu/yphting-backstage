package com.accp.action.yl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.biz.yl.ylUserBiz;
import com.accp.pojo.Appraisalapply;
import com.accp.pojo.Sharea;
import com.accp.pojo.User;
import com.accp.util.file.TestExcel;
import com.accp.vo.yl.UserShareaVo;
import com.accp.vo.yl.UserTruVo;
import com.accp.vo.yl.VipVo;
import com.accp.vo.yl.shopRecomment;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/yl")
public class ylUserAction {
	@Autowired
	private ylUserBiz biz;
	/**
	 * 
	 * @Description 登录，未使用
	 * @author Administrator
	 * @date 2019年2月21日
	 * @return  
	 * @throws
	 */
	@RequestMapping("/index")
	public String getIndex() {
		return "/index";
	}
	/**
	 * 
	 * @Description 查询所有会员
	 * @author Administrator
	 * @date 2019年2月21日
	 * @param p
	 * @param s
	 * @param userName
	 * @param model
	 * @return  
	 * @throws
	 */
	@RequestMapping(value="getList/{userName}/{p}/{s}",method=RequestMethod.POST)
	@ResponseBody
	public PageInfo<User> getUserList(
			@PathVariable String userName,
			@PathVariable Integer p,
			@PathVariable Integer s
			 ) {
		if (userName.equals("0")) {
			userName = null;
		}
		PageInfo<User> pageInfo = biz.findUserListByPage(p, s, userName);
		return pageInfo;
	}
	/**
	 * 
	 * @Description 查询单个会员
	 * @author Administrator
	 * @date 2019年2月26日
	 * @param userId
	 * @return  
	 * @throws
	 */
	@PostMapping("getVipById/{userId}")
	@ResponseBody
	public VipVo queryVip(@PathVariable int userId) {
		VipVo vip=biz.queryVipById(userId);
		return vip;
	}
	/**
	 * 
	 * @Description 修改会员信息
	 * @author Administrator
	 * @date 2019年2月26日
	 * @param vo
	 * @param model
	 * @return  
	 * @throws
	 */
	@PostMapping("updateVip")
	@ResponseBody
	public Map<String, String> updateVip(@RequestBody VipVo vo) {
		Map<String, String> map=new HashMap<String,String>();
		try {
			biz.updateVip(vo);
			map.put("code", "200");
		} catch (Exception e) {
			map.put("code", "500");
		} 
		return map;
	}
	/**
	 * 
	 * @Description 修改商家信息
	 * @author yl
	 * @date 2019年3月13日
	 * @param uVo
	 * @return  
	 * @throws
	 */
	@PostMapping("modifyShop")
	@ResponseBody
	public Map<String, String> updateShop(@RequestBody UserShareaVo uVo) {
		Map<String, String> map=new HashMap<String,String>();
		try {
			biz.updateShop(uVo);
			map.put("code", "200");
		} catch (Exception e) {
			map.put("code", "500");
		} 
		return map;
	}
	/**
	 * 
	 * @Description 导出会员Excel
	 * @author Administrator
	 * @date 2019年2月21日
	 * @return  
	 * @throws
	 */
	@RequestMapping(value="/Excel",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> printReimburseYearCount(HttpServletResponse response) {
		String userName=null;
		List<User> list=biz.findUserList(userName);
		Map<String, Object> map=new HashMap<String,Object>();
		
		try {
			
			TestExcel.outPrintYear(list,response);
			map.put("code", 200);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return map;
	}
	/**
	 * 
	 * @Description 查询所有商家
	 * @author Administrator
	 * @date 2019年2月21日
	 * @param p
	 * @param s
	 * @param userName
	 * @param shopName
	 * @param merchantType
	 * @return  
	 * @throws
	 */
	@PostMapping("getShopList/{userName}/{shopName}/{merchantType}/{p}/{s}")
	@ResponseBody
	public PageInfo<User> getUserList(@PathVariable Integer p,
			@PathVariable Integer s,
			@PathVariable String userName,@PathVariable String shopName,@PathVariable String merchantType) {
		if (userName.equals("0")||userName.equals("")) {
			userName = null;
		}
		if (shopName.equals("0")||shopName.equals("")) {
			shopName = null;
		}
		if (merchantType.equals("0")||merchantType.equals("")) {
			merchantType = null;
		}
		
		PageInfo<User> pageInfo = biz.queryShop(p, s, userName, shopName, merchantType);

		return pageInfo;
	}
	/**
	 * 
	 * @Description 查询商家入驻
	 * @author Administrator
	 * @date 2019年2月26日
	 * @param p
	 * @param s
	 * @param userName
	 * @param merchantType
	 * @param auditStatus
	 * @return  
	 * @throws
	 */
	@PostMapping("getEnterList/{userName}/{merchantType}/{auditStatus}/{p}/{s}")
	@ResponseBody
	public PageInfo<UserShareaVo> getEnterList(@PathVariable Integer p,
			@PathVariable Integer s,
			@PathVariable String userName,@PathVariable Integer merchantType,@PathVariable Integer auditStatus) {
		if (userName.equals("0")||userName.equals("")) {
			userName = null;
		}
		if (merchantType==0) {
			merchantType = null;
		}
		if (auditStatus==0) {
			auditStatus = null;
		}
		PageInfo<UserShareaVo> pageInfo = biz.queryEnter(p, s, userName, merchantType, auditStatus);

		return pageInfo;
	}
	/**
	 * 
	 * @Description 查询单个会员
	 * @author yl
	 * @date 2019年2月26日
	 * @param userId
	 * @return  
	 * @throws
	 */
	@PostMapping("getEnterById/{enterId}")
	@ResponseBody
	public UserShareaVo queryEnterById(@PathVariable int enterId) {
		UserShareaVo vip= biz.queryEnterById(enterId);
		return vip;
	}
	/**
	 * 
	 * @Description 查询国
	 * @author yl
	 * @date 2019年3月1日
	 * @return  
	 * @throws
	 */
	@GetMapping("getShareaCountry")
	@ResponseBody
	public List<Sharea> queryShareaCountry() {
		List<Sharea> list= biz.findShareaCountry();
		return list;
	}
	/**
	 * 
	 * @Description 查询省
	 * @author yl
	 * @date 2019年3月1日
	 * @param pid
	 * @return  
	 * @throws
	 */
	@GetMapping("getShareaProvincial/{pid}")
	@ResponseBody
	public List<Sharea> queryShareaProvincial(@PathVariable Integer pid) {
		if(pid==-1) {
			pid=null;
		}
		List<Sharea> list= biz.findShareaProvincial(pid);
		return list;
	}
	/**
	 * 
	 * @Description 查询市
	 * @author yl
	 * @date 2019年3月1日
	 * @param pid
	 * @return  
	 * @throws
	 */
	@GetMapping("getShareaCity/{pid}")
	@ResponseBody
	public List<Sharea> queryShareaCity(@PathVariable Integer pid) {
		if(pid==-1) {
			pid=null;
		}
		List<Sharea> list= biz.findShareaCity(pid);
		return list;
	}
	/**
	 * 
	 * @Description 查询鉴定审核
	 * @author yl
	 * @date 2019年3月4日
	 * @param p
	 * @param s
	 * @param userName
	 * @param auditStatus
	 * @return  
	 * @throws
	 */
	@GetMapping("getShopAuthen/{userName}/{auditStatus}/{p}/{s}")
	@ResponseBody
	public PageInfo<shopRecomment> getShopAuthen(@PathVariable Integer p,
			@PathVariable Integer s,
			@PathVariable String userName,@PathVariable Integer auditStatus) {
		if (userName.equals("0")||userName.equals("")) {
			userName = null;
		}
		if (auditStatus==0) {
			auditStatus = null;
		}
		PageInfo<shopRecomment> pageInfo = biz.queryShopAuthen(p, s, userName, auditStatus);
		return pageInfo;
	}
	/**
	 * 
	 * @Description 查询商家推荐
	 * @author yl
	 * @date 2019年3月4日
	 * @param p
	 * @param s
	 * @param userName
	 * @param shopName
	 * @param merchantType
	 * @param recommendbool
	 * @return  
	 * @throws
	 */
	@GetMapping("getShopRecommend/{userName}/{shopName}/{merchantType}/{recommendbool}/{p}/{s}")
	@ResponseBody
	public PageInfo<shopRecomment> getShopRecommend(@PathVariable Integer p,
			@PathVariable Integer s,
			@PathVariable String userName,@PathVariable String shopName,@PathVariable Integer merchantType,@PathVariable Integer recommendbool) {
		if (userName.equals("0")||userName.equals("")) {
			userName = null;
		}
		if (shopName.equals("0")||shopName.equals("")) {
			shopName = null;
		}
		if (recommendbool==-1) {
			recommendbool = null;
		}
		if (merchantType==0) {
			merchantType = null;
		}
		PageInfo<shopRecomment> pageInfo = biz.queryShopRecommend(p, s, userName, shopName, merchantType, recommendbool);
		return pageInfo;
	}
	/**
	 * 
	 * @Description 查询鉴定详情
	 * @author yl
	 * @date 2019年3月9日
	 * @param p
	 * @param s
	 * @param applyid
	 * @return  
	 * @throws
	 */
	@GetMapping("getAuthenDetails/{applyid}")
	@ResponseBody
	public Appraisalapply getAuthenDetails(@PathVariable Integer applyid) {
		Appraisalapply list = biz.queryfindAuthenDetails(applyid);
		return list;
	}
	/**
	 * 
	 * @Description 查询单个商家推荐
	 * @author yl
	 * @date 2019年3月9日
	 * @param serviceID
	 * @return  
	 * @throws
	 */
	@GetMapping("getRecommendById/{serviceID}")
	@ResponseBody
	public shopRecomment getRecommendById(@PathVariable Integer serviceID) {
		shopRecomment list = biz.queryRecommendById(serviceID);
		return list;
	}
	/**
	 * 
	 * @Description 查询所有托管
	 * @author yl
	 * @date 2019年3月11日
	 * @param p
	 * @param s
	 * @param userName
	 * @param shopName
	 * @param merchantType
	 * @param trusteeship
	 * @return  
	 * @throws
	 */
	@GetMapping("getTrusteeship/{userName}/{shopName}/{merchantType}/{trusteeship}/{p}/{s}")
	@ResponseBody
	public PageInfo<UserTruVo> getTrusteeship(@PathVariable Integer p,
			@PathVariable Integer s,
			@PathVariable String userName,@PathVariable String shopName,@PathVariable Integer merchantType,@PathVariable Integer trusteeship) {
		if (userName.equals("0")||userName.equals("")) {
			userName = null;
		}
		if (shopName.equals("0")||shopName.equals("")) {
			shopName = null;
		}
		if (trusteeship==-1) {
			trusteeship = null;
		}
		if (merchantType==0) {
			merchantType = null;
		}
		PageInfo<UserTruVo> pageInfo = biz.queryTrusteeship(p, s, userName, shopName, merchantType, trusteeship);
		return pageInfo;
	}
}
