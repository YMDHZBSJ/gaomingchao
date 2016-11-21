<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>跳转页面</title>
</head>
<body>
<% response.setHeader("refresh","3;url='Login.jsp'"); %>
恭喜你，数据更新成功，请重新登录。<br/> 
3s后自动跳转到登录页面，若未跳转<a href="Login.jsp">请点击此处</a>
</body>
</html>