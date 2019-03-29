layui
		.config({
			base : "js/"
		})
		.use(
				[ 'form', 'element', 'layer', 'jquery' ],
				function() {
					var form = layui.form(), layer = parent.layer === undefined ? layui.layer
							: parent.layer, element = layui.element(), $ = layui.jquery;

					$(".panel a").on("click", function() {
						window.parent.addTab($(this));
					})

					
					// 填充数据方法
					function fillParameter(data) {
						// 判断字段数据是否存在
						function nullData(data) {
							if (data == '' || data == "undefined") {
								return "未定义";
							} else {
								return data;
							}
						}
						$(".version").text(nullData(data.version)); // 当前版本
						$(".author").text(nullData(data.author)); // 开发作者
						$(".homePage").text(nullData(data.homePage)); // 网站首页
						$(".server").text(nullData(data.server)); // 服务器环境
						$(".dataBase").text(nullData(data.dataBase)); // 数据库版本
						$(".maxUpload").text(nullData(data.maxUpload)); // 最大上传限制
						$(".userRights").text(nullData(data.userRights));//当前用户权限
				 	}
					
					
					
					
					
					/*//初始化信息
					function  initsinfo(){
						// 动态获取文章总数和待审核文章数量,最新文章
						$.get("/tsyHomeApi/selectCountPost/", function(data) {

							$(".allNews span").text(data); // 帖子审核

						});

						$.get("/tsyHomeApi/selectCountOrders/", function(data) {

							$(".waitNews span").text(data); // 管理员申请介入

						});

						$.get("/tsyHomeApi/selectCountPutforward/", function(data) {

							$(".imgAll span").text(data); // 提现申请

						});

						$.get("/tsyHomeApi/selectCountServices/", function(data) {

							$(".newMessage span").text(data); // 服务审核

						});

						$.get("/tsyHomeApi/selectCountAppraisalapply/", function(data) {

							$(".userAll span").text(data); // 申请鉴定

						});

						$.get("/tsyHomeApi/selectCountUser/", function(data) {

							$(".usershop span").text(data); // 商家入驻

						});
					}*/
					
					
								
							
					
								

				})
				
				
				
				
			
				
				
