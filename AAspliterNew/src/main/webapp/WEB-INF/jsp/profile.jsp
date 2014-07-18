<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	  $(document).ready(function(){
			$("#update").click(function(){
				var userName = $("#userName").val();
				var age =$("#age").val();
				var email =$("#email").val();
				var phone =$("#phone").val();
				var user = {userName:userName,age:age,email:email,phone:phone};
				
				$.ajax({
					url:"/AAspliterNew/updateUser",
					type:"post",
					dataType:'json',
					data:user,
					success:function(a){
						alert("success");
						
					},
					error:function(xhr, status, err){
						alert(err.message);
					}
				});			
			});
		});   
</script>
<title>Insert title here</title>


</head>
<body>
	

<div>
	<h>返回信息:${success}</h>
	<h>用户信息</h>
	<form name="userForm" action="">
		姓名：<input type="text" id="userName" name="userName">
		年龄：<input type="text" id="age" name="age">
		email： <input type="text" id="email" name="email">
		phone： <input type="text" id="phone" name="phone">
		<input id="update" type="button" value="添加" >	
	</form>
	
</body>
</html>