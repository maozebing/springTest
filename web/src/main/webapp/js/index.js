/**
 * 
 */

var Index=function(){
	
	var getData=function(){
		$.ajax({
			url : "http://localhost:8080/web/api/v1.0/users",// 类型:String; 说明:发送请求的地址.
			type : 'get',// 类型:String; 说明:请求方式，默认为GET.
			success : function(data) {
				console.log(data);
			}
		});
	};

	var postData=function () {
		var roleEntity={
		};
		roleEntity.id=1;
		roleEntity.name="11";

		var org={
			"id":1,
			"name":"lanzhouzhan"
		}
		roleEntity.org=org;

		$.ajax({
			url : "http://localhost:8080/web/api/v1.0/users",// 类型:String; 说明:发送请求的地址.
			type : 'post',// 类型:String; 说明:请求方式，默认为GET.
			data: $.toJSON(roleEntity),
			contentType: "Application/Json; charset=utf-8", // 发送信息至服务器时内容编码类型
			success : function(data) {
				console.log(data);
			}
		});
	};
	
	return{
		init:function(){
			getData();
			postData();
		}
	}
}();