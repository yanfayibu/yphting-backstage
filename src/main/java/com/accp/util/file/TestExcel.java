package com.accp.util.file;

import javax.servlet.http.HttpServlet;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
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

import com.accp.pojo.User;

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
	public static void outPrintYear(List<User> list1) throws UnsupportedEncodingException {

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
