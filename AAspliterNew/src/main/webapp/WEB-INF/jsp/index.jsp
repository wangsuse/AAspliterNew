<%@ include file="checkValid.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script>
$(document).ready(function(){
	$("#load_content").click(function(){
		$.ajax({
			url:"/AAspliterNew/loadContent",
			type:"get",
			dataType:'json',
			success:function(a){
				alert("userName--->" + a.username );
				
			}
		});			
	});
});  
</script>
</head>

<body>



<h2>HI, <%= session.getAttribute("username") %>, you are into our system</h2>
<button id="load_content"  >load</button>
<div id="container"></div>
</body>


</html>
