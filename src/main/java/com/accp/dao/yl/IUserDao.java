package com.accp.dao.yl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Appraisalapply;
import com.accp.pojo.Sharea;
import com.accp.pojo.User;
import com.accp.vo.yl.UserShareaVo;
import com.accp.vo.yl.UserTruVo;
import com.accp.vo.yl.VipVo;
import com.accp.vo.yl.shopRecomment;

public interface IUserDao {
		/**
		 * 
		 * @Description 查询所有用户
		 * @author yl
		 * @date 2019年2月20日  
		 * @throws
		 */
		public List<User> selectUserList(@Param("userName") String userName);
		/**
		 * 
		 * @Description 查询所有商家
		 * @author yl
		 * @date 2019年2月21日
		 * @param userName
		 * @param shopName
		 * @param merchantType
		 * @return  
		 * @throws
		 */
		public List<User> selectShop(@Param("userName")String userName,@Param("shopName")String shopName,@Param("merchantType")String merchantType);
		/**
		 * 
		 * @Description 查询单个用户
		 * @author yl
		 * @date 2019年2月21日
		 * @param userID
		 * @return  
		 * @throws
		 */
		public VipVo qeuryByUserId(@Param("userid")int userID);
		/**
		 * 
		 * @Description 修改商家详情信息
		 * @author yl
		 * @date 2019年3月13日
		 * @param uVo  
		 * @throws
		 */
		public boolean updateShop(@Param("u") UserShareaVo uVo);
		/**
		 * 
		 * @Description 查询国地址
		 * @author yl
		 * @date 2019年3月1日
		 * @return  
		 * @throws
		 */
		public List<Sharea> queryShareaCountry();
		/**
		 * 
		 * @Description 查询省地址
		 * @author yl
		 * @date 2019年3月1日
		 * @param pid
		 * @return  
		 * @throws
		 */
		public List<Sharea> queryShareaProvincial(@Param("pid") Integer pid);
		/**
		 * 
		 * @Description 查询市地址
		 * @author yl
		 * @date 2019年3月1日
		 * @param pid
		 * @return  
		 * @throws
		 */
		public List<Sharea> queryShareaCity(@Param("pid") Integer pid);
		/**
		 * 
		 * @Description 修改会员信息，同时插入消息表
		 * @author yl
		 * @date 2019年2月26日
		 * @param vo
		 * @return  
		 * @throws
		 */
		public boolean updateVip(@Param("vo") VipVo vo);
		/**
		 * 
		 * @Description 查看所有商家入驻
		 * @author Administrator
		 * @date 2019年2月26日
		 * @param userName
		 * @param merchantType
		 * @param auditStatus
		 * @return  
		 * @throws
		 */
		public List<UserShareaVo> queryEnterAll(@Param("userName")String userName,@Param("merchantType")Integer merchantType,@Param("auditStatus")Integer auditStatus);
		/**
		 * 
		 * @Description 查看单个商家入驻详情
		 * @author yl
		 * @date 2019年2月26日
		 * @param userID
		 * @return  
		 * @throws
		 */
		public UserShareaVo queryEnterById(@Param("userid")int userID);
		/**
		 * 
		 * @Description 查看审核鉴定
		 * @author yl
		 * @date 2019年3月4日
		 * @param userName
		 * @param auditStatus
		 * @return  
		 * @throws
		 */
		public List<shopRecomment> queryShopAuthen(@Param("userName")String userName,@Param("auditStatus")Integer auditStatus);
		/**
		 * 
		 * @Description 查看商家推荐
		 * @author yl
		 * @date 2019年3月4日
		 * @param userName
		 * @param shopName
		 * @param merchantType
		 * @param recommendbool
		 * @return  
		 * @throws
		 */
		public List<shopRecomment> queryShopRecommend(@Param("userName")String userName,@Param("shopName")String shopName,@Param("merchantType")Integer merchantType,@Param("recommendbool")Integer recommendbool);
		/**
		 * 
		 * @Description 查看鉴定详情
		 * @author yl
		 * @date 2019年3月6日
		 * @param applyid
		 * @return  
		 * @throws
		 */
		public Appraisalapply queryAuthenDetails(@Param("applyid") Integer applyid);
		/**
		 * 
		 * @Description 查看单个商家推荐信息
		 * @author yl
		 * @date 2019年3月9日
		 * @param serviceID
		 * @return  
		 * @throws
		 */
		public shopRecomment queryRecommendById(@Param("serviceID") Integer serviceID);
		/**
		 * 
		 * @Description 查询所有托管
		 * @author yl
		 * @date 2019年3月11日
		 * @param userName
		 * @param shopName
		 * @param merchantType
		 * @param trusteeship
		 * @return  
		 * @throws
		 */
		public List<UserTruVo> queryTrusteeship(@Param("userName")String userName,@Param("shopName")String shopName,@Param("merchantType")Integer merchantType,@Param("trusteeship")Integer trusteeship);
}
