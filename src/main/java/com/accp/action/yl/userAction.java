package com.accp.action.yl;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.accp.biz.yl.userBiz;
import com.accp.pojo.User;
import com.accp.util.file.TestExcel;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/yl")
public class userAction {
	@Autowired
	private userBiz biz;
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
	@RequestMapping(value="getList/{userName}",method=RequestMethod.POST)
	@ResponseBody
	public PageInfo<User> getUserList(
			@RequestParam(required = false, defaultValue = "1") Integer p,
			@RequestParam(required = false, defaultValue = "10") Integer s,
			@PathVariable String userName
			 ) {
		if (userName.equals("0")) {
			userName = null;
		}
		PageInfo<User> pageInfo = biz.findUserListByPage(p, s, userName);
		return pageInfo;
	}
	/**
	 * 
	 * @Description 导出Excel
	 * @author Administrator
	 * @date 2019年2月21日
	 * @return  
	 * @throws
	 */
	@RequestMapping(value="/Excel",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> printReimburseYearCount() {
		String userName=null;
		List<User> list=biz.findUserList(userName);
		Map<String, Object> map=new HashMap<String,Object>();
		
		try {
			TestExcel.outPrintYear(list);
			map.put("code", 200);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return map;
	}
	
	@PostMapping("getShopList/{userName}/{shopName}/{merchantType}")
	@ResponseBody
	public PageInfo<User> getUserList(@RequestParam(required = false, defaultValue = "1") Integer p,
			@RequestParam(required = false, defaultValue = "10") Integer s,
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
}
