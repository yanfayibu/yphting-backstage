package com.accp.action.tsy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.tsy.TsyHomeBiz;

/**
 * 
 * @author Tan
 * @ClassName:TsyHomeAction.java
 * @date:2019年3月16日 @time:上午10:39:27
 * @description:后台工作台所有数据查询
 */
@RestController
@RequestMapping("tsyHomeApi")
public class TsyHomeAction {

	@Autowired
	private TsyHomeBiz biz;
	
	/**
	 * 
	 * @title: selectCountPutforward
	 * @date:2019年3月15日 @time:下午6:47:44
	 * @return
	 * @description:查询提现待审核
	 */
	@GetMapping("selectCountPutforward")
	public int selectCountPutforward() {
		return biz.selectCountPutforward();
	}

	/**
	 * 
	 * @title: selectCountAppraisalapply
	 * @date:2019年3月15日 @time:下午7:18:52
	 * @return
	 * @description:查询申请鉴定待审核数量
	 */
	@GetMapping("selectCountAppraisalapply")
	public int selectCountAppraisalapply() {
		return biz.selectCountAppraisalapply();
	}

	/**
	 * 
	 * @title: selectCountUser
	 * @date:2019年3月15日 @time:下午7:19:30
	 * @return
	 * @description:查询商家入驻待审核数量
	 */
	@GetMapping("selectCountUser")
	public int selectCountUser() {
		return biz.selectCountUser();
	}

	/**
	 * 
	 * @title: selectCountServices
	 * @date:2019年3月15日 @time:下午7:20:00
	 * @return
	 * @description:查询服务待审核数量
	 */
	@GetMapping("selectCountServices")
	public int selectCountServices() {
		return biz.selectCountServices();
	}

	/**
	 * 
	 * @title: selectCountOrders
	 * @date:2019年3月15日 @time:下午7:20:29
	 * @return
	 * @description:查询管理员介入申请数量
	 */
	@GetMapping("selectCountOrders")
	public int selectCountOrders() {
		return  biz.selectCountOrders();
	}

	/**
	 * 
	 * @title: selectCountPost
	 * @date:2019年3月15日 @time:下午7:20:52
	 * @return
	 * @description:帖子待审核数量
	 */
	@GetMapping("selectCountPost")
	public int selectCountPost() {
		return biz.selectCountPost();
	}
	
	
	
	/**
	 * 
	 * @title: queryPhoneInfo
	 * @date:2019年3月19日 @time:下午4:31:17
	 * @param phone
	 * @return
	 * @throws Exception
	 * @description:新闻接口
	 */
	@GetMapping(value = "news", produces = "text/html;charset=UTF-8") // 非常重要
	public String queryPhoneInfo() throws Exception {
		BufferedReader br = null;
		StringBuffer data = new StringBuffer();
		try {
			String key = "ba361e3f55f4686c16ae676dc08bb4bb";
			// 1.定义标识符
			URL url = new URL("http://v.juhe.cn/toutiao/index?type=top&key="+key);
			// 2.获得连接资源
			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
			// 3.设置连接信息
			httpConn.setRequestMethod("GET");
			httpConn.setReadTimeout(50 * 1000);
			httpConn.setConnectTimeout(4 * 1000);
			// 4.开始连接
			httpConn.connect();
			// 5.接收响应信息
			int rsCode = httpConn.getResponseCode();
			switch (rsCode) {
			case HttpURLConnection.HTTP_OK:
				// 6.利用流处理数据
				// 高级字符流
				br = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
				for (String rs; (rs = br.readLine()) != null;) {
					data.append(rs);
				}
				break;
			case HttpURLConnection.HTTP_NOT_FOUND:
				break;
			case HttpURLConnection.HTTP_INTERNAL_ERROR:
				break;
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return data.toString();
	}
	
}
