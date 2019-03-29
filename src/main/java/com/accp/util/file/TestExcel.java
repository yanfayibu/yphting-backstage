package com.accp.util.file;

import javax.servlet.http.HttpServlet;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.accp.pojo.Putforward;
import com.accp.pojo.User;
import com.accp.vo.tsy.TsyChongZiVo;
import com.accp.vo.tsy.TsyGuangGaoVO;
import com.accp.vo.tsy.TsyTuiKuanVo;

public class TestExcel extends HttpServlet {

	/**
	 * 
	 * @title: outPrintYear
	 * @date:2019年02月21日 @time:下午3:45:44
	 * @param list1
	 * @param emp
	 * @throws UnsupportedEncodingException
	 * @description:导出用户列表
	 */
	public static void outPrintYear(List<User> list1,HttpServletResponse response) throws UnsupportedEncodingException {

		if (list1.size() != 0) {
			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			Map<String, Object>[] map=new Map[list1.size()];
			for (int i = 0; i < list1.size(); i++) {

				map[i]=new HashMap<String, Object>();
				
					map[i].put("用户编号", list1.get(i).getUserid());
					map[i].put("用户昵称", list1.get(i).getUsername());
					if(list1.get(i).getMerchanttype()==0) {
						map[i].put("会员组","普通会员");	
					}
					
					map[i].put("邮箱", list1.get(i).getContactmailbox()+"");
					map[i].put("积分", list1.get(i).getUserintegral());
					map[i].put("电话", list1.get(i).getUserphone()+"");
					map[i].put("最后登入时间", list1.get(i).getRecententry()+"");
					
				list.add(map[i]);
			}

			// System.getProperty("user.dir") 获取当前项目的路径
			long filename = System.currentTimeMillis();
			String fileName = "D:\\" + filename + ".xls";// 定义到处路径
			
			
			System.out.println(fileName);
			String worksheetTitle="韩汀社区用户信息表";					// 主题名
			
			String sheetName = "数据1"; // sheet名
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet(sheetName);// 定义sheet名
			ExcelToolClass exportExcel = new ExcelToolClass(wb, sheet);// 调用Excel工具类
			fileName = new String(fileName.getBytes("GBK"), "GBK");// 修改编码格式
		
			
			// 定义第二行标题
			String id = null;					//序号
			String userName = null;				//用户昵称
			String merchantType = null;			//会员组
			String contactMailbox = null;		//邮箱	
			String userIntegral=null;			//积分
			String userPhone=null;				//电话
			String recentEntry=null;			//最后登入时间
			
			List<String> l = new ArrayList<String>();
				id="用户编号";
				userName="用户昵称";
				merchantType="会员组";
				contactMailbox="邮箱";
				userIntegral="积分";
				userPhone="电话";	
				recentEntry="最后登入时间";
				
			l.add(id);
			l.add(userName);
			l.add(merchantType);
			l.add(contactMailbox);
			l.add(userIntegral);
			l.add(userPhone);
			l.add(recentEntry);

			// 创建报表头部
			exportExcel.createNormalHead(worksheetTitle, 7);
			// 定义第一行
			exportExcel.createNormalTwoRow(l, 0);
			// 导入数据
			exportExcel.createColumHeader(list);
			// 输出文件流，把相应的Excel工作簿 输出到本地
			exportExcel.outputExcel(fileName);
			
		}

	}
	
	
	
	
	/**
	 * 
	 * @title: outPrintTiXianBook
	 * @date:2019年3月21日 @time:下午6:42:58
	 * @param list1
	 * @param response
	 * @throws UnsupportedEncodingException
	 * @description:导出提现报表
	 */
	public static void outPrintTiXianBook(List<Putforward> list1) throws UnsupportedEncodingException {

		if (list1.size() != 0) {
			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			Map<String, Object>[] map=new Map[list1.size()];
			for (int i = 0; i < list1.size(); i++) {

				map[i]=new HashMap<String, Object>();
				
					map[i].put("序号", (i+1));
					map[i].put("提现人姓名", list1.get(i).getPutname());
					map[i].put("卡号", list1.get(i).getBankaccount());
					map[i].put("银行户口", list1.get(i).getOpenbankname());
					map[i].put("提现时间", new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(list1.get(i).getSubmittime()));
					map[i].put("提现金额", list1.get(i).getMoney());
					
				list.add(map[i]);
			}

			// System.getProperty("user.dir") 获取当前项目的路径
			long filename = System.currentTimeMillis();
			String fileName = "D:\\" + filename + ".xls";// 定义到处路径
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String time=formatter.format(list1.get(0).getSubmittime());
			System.out.println("时间："+time);
			String year=time.substring(0, 4);
			String month=time.substring(5, 7);
			
			
			
			System.out.println(fileName+"年份"+year+"月份"+month);
			String worksheetTitle="韩汀社区"+year+"年"+month+"月份提现报表";					// 主题名
			
			String sheetName = "数据1"; // sheet名
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet(sheetName);// 定义sheet名
			ExcelToolClass exportExcel = new ExcelToolClass(wb, sheet);// 调用Excel工具类
			fileName = new String(fileName.getBytes("GBK"), "GBK");// 修改编码格式
		
			
			// 定义第二行标题
			String id = null;					//序号
			String putname = null;				//
			String bankaccount = null;			//会员组
			String openbankname = null;		//邮箱	
			String submittime=null;			//积分
			String money=null;				//电话
			
			List<String> l = new ArrayList<String>();
				id="序号";
				putname="提现人姓名";
				bankaccount="卡号";
				openbankname="银行户口";
				submittime="提现时间";
				money="提现金额";	
				
			l.add(id);
			l.add(putname);
			l.add(bankaccount);
			l.add(openbankname);
			l.add(submittime);
			l.add(money);

			// 创建报表头部
			exportExcel.createNormalHead(worksheetTitle, 5);
			// 定义第一行
			exportExcel.createNormalTwoRow(l, 0);
			// 导入数据
			exportExcel.createColumHeaderTiXianBook(list);
			// 输出文件流，把相应的Excel工作簿 输出到本地
			exportExcel.outputExcel(fileName);
			
		}

	}
	/**
	 * 
	 * @title: outPrintTiXianBook
	 * @date:2019年3月21日 @time:下午6:42:58
	 * @param list1
	 * @param response
	 * @throws UnsupportedEncodingException
	 * @description:导出充值报表
	 */
	public static void outPrintChongZhiBook(List<TsyChongZiVo> list1) throws UnsupportedEncodingException {
		
		if (list1.size() != 0) {
			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			Map<String, Object>[] map=new Map[list1.size()];
			for (int i = 0; i < list1.size(); i++) {
				
				map[i]=new HashMap<String, Object>();
				
				map[i].put("序号", (i+1));
				map[i].put("充值姓名", list1.get(i).getUserName());
				if(list1.get(i).getAcquisitionMode()==5) {
					map[i].put("充值类型","充值");
				}else if(list1.get(i).getAcquisitionMode()==6){
					map[i].put("充值类型","线下充值");
				}
				map[i].put("充值时间", new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(list1.get(i).getRecordDate()));
				map[i].put("充值金额", list1.get(i).getRecordInAndOut());
				
				list.add(map[i]);
			}
			
			// System.getProperty("user.dir") 获取当前项目的路径
			long filename = System.currentTimeMillis();
			String fileName = "D:\\" + filename + ".xls";// 定义到处路径
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String time=formatter.format(list1.get(0).getRecordDate());
			System.out.println("时间："+time);
			String year=time.substring(0, 4);
			String month=time.substring(5, 7);
			
			
			
			System.out.println(fileName+"年份"+year+"月份"+month);
			String worksheetTitle="韩汀社区"+year+"年"+month+"月份充值报表";					// 主题名
			
			String sheetName = "数据1"; // sheet名
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet(sheetName);// 定义sheet名
			ExcelToolClass exportExcel = new ExcelToolClass(wb, sheet);// 调用Excel工具类
			fileName = new String(fileName.getBytes("GBK"), "GBK");// 修改编码格式
			
			
			// 定义第二行标题
			String id = null;					//序号
			String putname = null;				//
			String bankaccount = null;			//会员组
			String submittime=null;			//积分
			String money=null;				//电话
			
			List<String> l = new ArrayList<String>();
			id="序号";
			putname="充值姓名";
			bankaccount="充值类型";
			submittime="充值时间";
			money="充值金额";	
			
			l.add(id);
			l.add(putname);
			l.add(bankaccount);
			l.add(submittime);
			l.add(money);
			
			// 创建报表头部
			exportExcel.createNormalHead(worksheetTitle, 4);
			// 定义第一行
			exportExcel.createNormalTwoRow(l, 0);
			// 导入数据
			exportExcel.createColumHeaderChongZhiBook(list);
			// 输出文件流，把相应的Excel工作簿 输出到本地
			exportExcel.outputExcel(fileName);
			
		}
		
	}
	
	
	/**
	 * 
	 * @title: outPrintTiXianBook
	 * @date:2019年3月21日 @time:下午6:42:58
	 * @param list1
	 * @param response
	 * @throws UnsupportedEncodingException
	 * @description:导出广告费用报表
	 */
	public static void outPrintGuanGaoBook(List<TsyGuangGaoVO> list1) throws UnsupportedEncodingException {
		
		if (list1.size() != 0) {
			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			Map<String, Object>[] map=new Map[list1.size()];
			for (int i = 0; i < list1.size(); i++) {
				
				map[i]=new HashMap<String, Object>();
				
				map[i].put("序号", (i+1));
				map[i].put("租用人姓名", list1.get(i).getUserName());
				map[i].put("广告位置", list1.get(i).getAtitle());
				map[i].put("广告单价", list1.get(i).getPrice());
				map[i].put("租用月数", list1.get(i).getRentAMonth());
				map[i].put("开始时间", new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(list1.get(i).getStartTime()));
				map[i].put("结束时间", new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(list1.get(i).getEndTime()));
				map[i].put("总金额", list1.get(i).getMoney());
				list.add(map[i]);
			}
			
			// System.getProperty("user.dir") 获取当前项目的路径
			long filename = System.currentTimeMillis();
			String fileName = "D:\\" + filename + ".xls";// 定义到处路径
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String time=formatter.format(list1.get(0).getStartTime());
			System.out.println("时间："+time);
			String year=time.substring(0, 4);
			String month=time.substring(5, 7);
			
			
			
			System.out.println(fileName+"年份"+year+"月份"+month);
			String worksheetTitle="韩汀社区"+year+"年"+month+"月份广告费用报表";					// 主题名
			
			String sheetName = "数据1"; // sheet名
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet(sheetName);// 定义sheet名
			ExcelToolClass exportExcel = new ExcelToolClass(wb, sheet);// 调用Excel工具类
			fileName = new String(fileName.getBytes("GBK"), "GBK");// 修改编码格式
			
			
			// 定义第二行标题
			String id = null;					//序号
			String putname = null;				//
			String bankaccount = null;			//会员组
			String submittime=null;			//积分
			String price=null;				//电话
			String money=null;				//电话
			String startTime=null;				//电话
			String endTime=null;				//电话
			
			List<String> l = new ArrayList<String>();
			id="序号";
			putname="租用人姓名";
			bankaccount="广告位置";
			submittime="租用月数";
			price="广告单价";
			money="总金额";	
			startTime="开始时间";
			endTime="结束时间";
			
			l.add(id);
			l.add(putname);
			l.add(bankaccount);
			l.add(price);
			l.add(submittime);
			l.add(startTime);
			l.add(endTime);
			l.add(money);
			
			// 创建报表头部
			exportExcel.createNormalHead(worksheetTitle, 7);
			// 定义第一行
			exportExcel.createNormalTwoRow(l, 0);
			// 导入数据
			exportExcel.createColumHeaderGuanGaoBook(list);
			// 输出文件流，把相应的Excel工作簿 输出到本地
			exportExcel.outputExcel(fileName);
			
		}
		
	}
	
	
	
	/**
	 * 
	 * @title: outPrintTiXianBook
	 * @date:2019年3月21日 @time:下午6:42:58
	 * @param list1
	 * @param response
	 * @throws UnsupportedEncodingException
	 * @description:导出退款手续费用报表
	 */
	public static void outPrintTuiKuanBook(List<TsyTuiKuanVo> list1) throws UnsupportedEncodingException {
		
		if (list1.size() != 0) {
			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			Map<String, Object>[] map=new Map[list1.size()];
			for (int i = 0; i < list1.size(); i++) {
				
				map[i]=new HashMap<String, Object>();
				
				map[i].put("序号", (i+1));
				map[i].put("退款人姓名", list1.get(i).getUserName());
				map[i].put("单号", list1.get(i).getOrderID());
				map[i].put("退款原因", list1.get(i).getRefundExplain());
				map[i].put("退款时间", new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(list1.get(i).getApplicationTime()));
				map[i].put("申请退款金额", list1.get(i).getApplyRefundMoney());
				map[i].put("实际退款金额", list1.get(i).getActualRefundMoney());
				map[i].put("手续费金额", list1.get(i).getMoney());
				list.add(map[i]);
			}
			
			// System.getProperty("user.dir") 获取当前项目的路径
			long filename = System.currentTimeMillis();
			String fileName = "D:\\" + filename + ".xls";// 定义到处路径
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String time=formatter.format(list1.get(0).getApplicationTime());
			System.out.println("时间："+time);
			String year=time.substring(0, 4);
			String month=time.substring(5, 7);
			
			
			
			System.out.println(fileName+"年份"+year+"月份"+month);
			String worksheetTitle="韩汀社区"+year+"年"+month+"月份退款手续费报表";					// 主题名
			
			String sheetName = "数据1"; // sheet名
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet(sheetName);// 定义sheet名
			ExcelToolClass exportExcel = new ExcelToolClass(wb, sheet);// 调用Excel工具类
			fileName = new String(fileName.getBytes("GBK"), "GBK");// 修改编码格式
			
			
			// 定义第二行标题
			String id = null;					//序号
			String putname = null;				//
			String bankaccount = null;			//会员组
			String submittime=null;			//积分
			String price=null;				//电话
			String money=null;				//电话
			String startTime=null;				//电话
			String endTime=null;				//电话
			
			List<String> l = new ArrayList<String>();
			id="序号";
			putname="退款人姓名";
			bankaccount="单号";
			submittime="退款原因";
			price="退款时间";
			money="申请退款金额";	
			startTime="实际退款金额";
			endTime="手续费金额";
			
			l.add(id);
			l.add(putname);
			l.add(bankaccount);
			l.add(submittime);
			l.add(price);
			l.add(money);
			l.add(startTime);
			l.add(endTime);
			
			// 创建报表头部
			exportExcel.createNormalHead(worksheetTitle, 7);
			// 定义第一行
			exportExcel.createNormalTwoRow(l, 0);
			// 导入数据
			exportExcel.createColumHeaderTuiKuanBook(list);
			// 输出文件流，把相应的Excel工作簿 输出到本地
			exportExcel.outputExcel(fileName);
			
		}
		
	}
	
	
	
	/**
	 * 
	 * @title: outPrintMonth
	 * @date:2018年12月6日 @time:下午6:45:24
	 * @param list1
	 * @param emp
	 * @throws UnsupportedEncodingException
	 * @description:导入月份表
	 */
	/*public static void outPrintMonth(List<User> list1, User emp) throws UnsupportedEncodingException {

		if (list1.size() != 0) {
			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			Map<String, Object>[] map=new Map[list1.size()];
			int type=0;
			for (int i = 0; i < list1.size(); i++) {

				map[i]=new HashMap<String, Object>();
				if (emp.getPositionId() == 0 || emp.getPositionId() == 3) {
					map[i].put("编号", (i+1));
					map[i].put("报销金额", "￥"+list1.get(i).getMoney());
					map[i].put("年份", list1.get(i).getYear() + "年");
					map[i].put("月份", list1.get(i).getMonth() + "月");
					map[i].put("部门", list1.get(i).getDepartmentName());
					type=1;

				} else if (emp.getPositionId() == 1) {
					map[i].put("编号", (i+1));
					map[i].put("报销人",list1.get(i).getEmployeeName());
					map[i].put("报销金额", "￥"+list1.get(i).getMoney());
					map[i].put("年份", list1.get(i).getYear() + "年");
					map[i].put("月份", list1.get(i).getMonth() + "月");
					map[i].put("部门", list1.get(i).getDepartmentName());
					type=2;
				}
				
				System.out.println("**"+list1.get(i).getEmployeeId()+"--"+
						list1.get(i).getEmployeeName()+"@@"+
						list1.get(i).getMoney()+"^^"+
						list1.get(i).getYear()
						);

				list.add(map[i]);
			}

			// System.getProperty("user.dir") 获取当前项目的路径
			long filename = System.currentTimeMillis();
			String fileName = "D:\\" + filename + ".xls";// 定义到处路径

			System.out.println(fileName);
			String worksheetTitle=null;					// 主题名
			if(type==1) {
				worksheetTitle= list1.get(0).getYear()+"年"+list1.get(0).getMonth()+"月份各部门报销表";
			}else if(type==2) {
				worksheetTitle=	list1.get(0).getYear()+"年"+list1.get(0).getMonth()+"月份"+list1.get(0).getDepartmentName()+"报销表";
			}
			
			String sheetName = "数据1"; // sheet名
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet(sheetName);// 定义sheet名
			ExcelToolClass exportExcel = new ExcelToolClass(wb, sheet);// 调用Excel工具类
			fileName = new String(fileName.getBytes("GBK"), "GBK");// 修改编码格式
			
			List<String> l = new ArrayList<String>();
			if(type==1) {
				
				// 定义第二行标题
				String id = "编号";
				String name = "报销总金额";
				String age = "年份";
				String address = "月份";
				String bu = "部门";
				
				l.add(id);
				l.add(name);
				l.add(age);
				l.add(address);
				l.add(bu);
				// 创建报表头部
				exportExcel.createNormalHead(worksheetTitle, 5);
			}else if(type==2) {
				// 定义第二行标题
				String id = "编号";
				String month = "报销人";
				String name = "报销总金额";
				String age = "年份";
				String address = "月份";
				String bu = "部门";
				
				l.add(id);
				l.add(month);
				l.add(name);
				l.add(age);
				l.add(address);
				l.add(bu);
				// 创建报表头部
				exportExcel.createNormalHead(worksheetTitle, 6);
			}
			
			
			// 定义第一行
			exportExcel.createNormalTwoRow(l, 0);
			// 导入数据
			exportExcel.createColumHeader2(list,type);
			// 输出文件流，把相应的Excel工作簿 输出到本地
			exportExcel.outputExcel(fileName);
		}

	}*/
	
	
	
	
}
