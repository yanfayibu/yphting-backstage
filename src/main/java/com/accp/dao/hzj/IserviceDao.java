package com.accp.dao.hzj;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
public interface IserviceDao {
	
	//查询退款
	public List<refundVo> queryRefund(@Param("userName")String userName,@Param("orderID")String orderID);
	
	
	//查看退款詳情
	public refunDetailedMessageVo queryRefunDetailedMessage(@Param("refundID")Integer refundID);
	
	
	//修改退款信息
	public int modifyRefund(@Param("refunDetailedMessageVo")refunDetailedMessageVo refunDetailedMessageVo);
	
	
	//查询商家Id
	public List<refunDetailedMessageVo> queryMerchantId(@Param("refundID")Integer refundID);
	
	
	//发送信息给用户
	public int setToUser(@Param("news")News news);
	
	
	//发送信息给商家
	public int setToMerchant(@Param("news")News news);
		
	
	//查询服务级别名称
	public List<Servicetype> queryLevelName();
	
	
	//查询服务级别
	public List<serviceLevelVo> queryLevel(@Param("stid")Integer stid);
	
	
	//查询服务级别详情
	public serviceLevelVo queryLevelMessage(@Param("serlevelid")Integer serlevelid);
	
	
	//修改服务级别信息
	public int updateLevel(@Param("servicelevel")Servicelevel servicelevel);

	
	//删除服务级别信息
	public int deleteLevel(@Param("serlevelid")Integer serlevelid);
	
	
	//新增服务级别信息
	public int insertLevel(@Param("servicelevel")Servicelevel servicelevel);
	
	
	//查询服务预约
	public List<serviceReservationVo> selectReservation(@Param("orderid")String orderid,@Param("stid")Integer stid,@Param("orderstatus")Integer orderstatus);
	
	
	//查询服务审核
	public List<serviceAuditVo> selectAudit(@Param("stid")Integer stid,@Param("auditstatus")Integer auditstatus,@Param("servicetitle")String servicetitle,@Param("businessstate")Integer businessstate,@Param("serviceid")Integer serviceid,@Param("recommendbool")Integer recommendbool);


	//修改服务审核信息
	public int updateAudit(@Param("serviceAuditVo")serviceAuditVo serviceAuditVo);
	
	
	//查询服务类别管理
	public List<Servicetype> selectType(@Param("stid")Integer stid,@Param("stpid")Integer stpid);
	//public List<Servicetype> selectTypeChilder(@Param("stid")Integer stid);
	
	
	//新增服务类别管理
	public int insertType(@Param("servicetype")Servicetype servicetype);
	
	
	//删除服务类别管理
	public int deleteType(@Param("stid")Integer stid);
	
	
	//修改服务类别管理
	public int updateType(@Param("servicetype")Servicetype servicetype);
	
	
	//修改服务审核管理
	public int updateAuditManagement(@Param("servicetype")Servicetype servicetype);
	
	
	//查询服务投诉
	public List<serviceComplaintVo> selectComplaint(@Param("servicetitle")String servicetitle);
	
		
	//修改服务投诉
	public int updateComplaint(@Param("serviceComplaintVo")serviceComplaintVo serviceComplaintVo);
}
