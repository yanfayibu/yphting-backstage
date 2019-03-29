layui.config({
	base: "js/"
}).use(['form', 'layer'], function() {
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		$ = layui.jquery;
	//video背景
	$(window).resize(function() {
		if($(".video-player").width() > $(window).width()) {
			$(".video-player").css({
				"height": $(window).height(),
				"width": "auto",
				"left": -($(".video-player").width() - $(window).width()) / 2
			});
		} else {
			$(".video-player").css({
				"width": $(window).width(),
				"height": "auto",
				"left": -($(".video-player").width() - $(window).width()) / 2
			});
		}
	}).resize();

	//登录按钮事件
	form.on("submit(login)", function(data) {
		var code = $("[name=code]").val(); //输入时验证码
		var password = $("[name=password]").val(); //登录密码
		var username = $("[name=username]").val(); //账户
		var Ma = show_num.join(""); //验证码				//随时生成验证码

		//alert(code+"--"+password+"--"+username+"--"+Ma);

		if(code.toLocaleLowerCase() == Ma) {

			$.ajax("http://127.0.0.1:1011/tsyUserApi/UserLogin" + "/" + username + "/" + password, {
				type: "GET",
				dataType: "json",
				timeout: 6000,
				xhrFields: {
					withCredentials: true
				},
				crossDomain: true, //访问session取值时必加，取值那边也要加
				success: function(json) { //成功readyState==4&&status==200
					if(json.code == 200) {
						//alert(json.id);
						window.location.href = "../../index.html";
					} else {
						alert("账号或账户错误！");
						return;
					}
				}

			});

		} else {
			alert("验证码不正确！");
			return;
		}

		return false;
	})
})



