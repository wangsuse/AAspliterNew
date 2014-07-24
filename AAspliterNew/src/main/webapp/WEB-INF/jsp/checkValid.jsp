
<%
	System.out.println(session.getAttribute("login"));
	if(session.getAttribute("login")==null || !session.getAttribute("login").equals("yes")){
		response.sendRedirect("login");
	}

%>

