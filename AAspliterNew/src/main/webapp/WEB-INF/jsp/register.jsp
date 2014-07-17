<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	function register(){
		var form = document.forms[0];
		form.action="registerUser";
		form.method="post";
		form.submit();
	}
	/*  $(document).ready(function(){
			$("#register").click(function(){
				var userName = $("#userName").val();
				var age =$("#age").val();
				var password =$("#password").val();
				var user = {userName:userName,age:age,password:password};
				
				$.ajax({
					url:"/AAspliterNew/registerUser",
					type:"post",
					dataType:'json',
					data:user,
					success:function(a){
						alert("userName--->" + a.userName + "age--->" + a.age );
						
					}
				});			
			});
		});   */
</script>
<title>Insert title here</title>


</head>
<body>
	

<div>
	<h>添加用户</h>
	<form name="userForm" action="">
		姓名：<input type="text" id="userName" name="userName">
		年龄：<input type="text" id="age" name="age">
		Password: <input type="password" id= "password" name="password">
		<input type="button" value="添加" onclick="register()">
		
		
	
	</form>
	
</body>
</html>