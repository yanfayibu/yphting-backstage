package com.accp.action.yl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.biz.yl.BackstageBiz;
import com.accp.pojo.Administratorlog;
import com.accp.pojo.Advertisement;
import com.accp.pojo.Advertisementapply;
import com.accp.pojo.Advertisementtype;
import com.accp.pojo.Appraisalapply;
import com.accp.pojo.Banktype;
import com.accp.pojo.Bond;
import com.accp.pojo.Logistics;
import com.accp.pojo.Majortype;
import com.accp.pojo.Post;
import com.accp.pojo.Putforward;
import com.accp.pojo.Refund;
import com.accp.pojo.Servicecosttype;
import com.accp.pojo.Services;
import com.accp.pojo.Sharea;
import com.accp.pojo.User;
import com.accp.util.file.Upload;
import com.accp.vo.yl.AdvertisementVo;
import com.accp.vo.yl.ApplyforVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/jwl")
public class BackstageAction {
	@Autowired
	private BackstageBiz biz;
	
	@GetMapping("getoptioin")
	public String getoptioin(Model model) {
		model.addAttribute("fl", biz.queryAllAdv());
		return "/page/guanggao/ggwgl-add";
	}
	@GetMapping("zzsAdd")
	public String getoptioins(Model model) {
		model.addAttribute("fl", biz.queryAllAdv());
		return "/page/guanggao/zzs-add";
	}
	@GetMapping("getAdvVo/{atid}/{p}/{s}")
	@ResponseBody
	public PageInfo<AdvertisementVo> queryAllAdvVo(@PathVariable Integer atid, @PathVariable Integer p,@PathVariable Integer s, Model model) throws Exception {
		model.addAttribute("atid", atid);
		model.addAttribute("fl", biz.queryAllAdv());
		model.addAttribute("AdvVo", biz.queryAllAdvVo(atid, p, s));
		//System.out.println(biz.queryAllAdvVo(atid, p, s));
		return biz.queryAllAdvVo(atid, p, s);
	}

	@GetMapping("getApplyfor/{atid}/{p}/{s}/{aaid}")
	@ResponseBody
	public PageInfo<ApplyforVo> queryAllApplyfor(@PathVariable Integer aaid,@PathVariable Integer atid, @PathVariable Integer p,@PathVariable Integer s) throws Exception {
		return biz.queryAllApplyfor(atid, p, s,aaid);
	}
	@GetMapping("getAllAdvType")
	@ResponseBody
	public List<Advertisement> queryAllAdvertisementtype() throws Exception {
		return biz.queryAllAdv();
	}
	@GetMapping("getObjAdv")
	public String queryObjAdv(Integer aid, Model model) {
		model.addAttribute("list", biz.queryObjAdv(aid));
		model.addAttribute("fl", biz.queryAllAdv());
		return "/page/guanggao/ggwgl-update";
	}
	@GetMapping("/re")
	public String delete(String id) {
		String[] ids = id.split(",");
		biz.removeAdv(ids);
		return "redirect:/jwl/getAdvVo?atid=0&p=1&s=4";
	}
	
	@PostMapping("/addAdv")
	public String addAdv(@ModelAttribute Advertisement a,MultipartFile file) throws IllegalStateException, IOException {
		String path=Upload.uploadFile(file);
		a.setAimgpath(path);
		biz.addAdv(a);
		return "redirect:/jwl/getAdvVo?atid=0&p=1&s=4";
	}
	@PostMapping("/addzzs")
	public String addzzs(@ModelAttribute Advertisementapply a,MultipartFile file) throws IllegalStateException, IOException {
		String path=Upload.uploadFile(file);
		a.setAimgpath(path);
		 biz.addzzs(a);
		return "redirect:/page/guanggao/Applyfor.html";
	}
	
	@PostMapping("/moAdv")
	public String updateAdv(@ModelAttribute Advertisement a,MultipartFile file) throws IllegalStateException, IOException {
		String path=Upload.uploadFile(file);
		a.setAimgpath(path);
		biz.moAdv(a);
		return "redirect:/page/guanggao/advertising.html";
	}
	@PostMapping("/moAdv/{p}")
	@ResponseBody
	public Map<String, Object> updatePlate(@PathVariable Integer p){
		Map<String, Object> map=new HashMap<String,Object>();
		try {
			biz.updatePlate(p);
			map.put("code", "200");
			map.put("msg", "ok");
		} catch (Exception e) {
			map.put("code", "500");
			map.put("msg", "错误");
		}
		return map;
	}
	
	@PostMapping("/updateApplufor")
	@ResponseBody
	public Map<String, Object> updateApplufor(@RequestBody ApplyforVo alf){
		Map<String, Object> map=new HashMap<String,Object>();
		try {
			biz.updateApplufor(alf);
			map.put("code", "200");
			map.put("msg", "ok");
		} catch (Exception e) {
			map.put("code", "500");
			map.put("msg", "错误");
		}
		return map;
	}
}
