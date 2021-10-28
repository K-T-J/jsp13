<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 pro</title>
</head>
<body>
	<h2> login pro page </h2>

	<h3>result : <%=request.getAttribute("result") %></h3>
	
	<%int result = (Integer)request.getAttribute("result"); 
		if(result ==1){%>
		<script>
			alert("로그인 성공 !!!");
		</script>
		<%}%>
		
		<h3>memId : <%=session.getAttribute("memId") %></h3>
	

	






</body>
</html>