<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'save.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="sa.action" method="post">
    	<p>考试号<input type="text" name="ks.sid"/></p>
    	<p>姓名<input type="text" name="ks.sname"/></p>
    	<p>时间<input type="text" name="ks.stime"/></p>
    	<p>地址<input type="text" name="ks.saddress"/></p>
    	<p>分数<input type="text" name="ks.fenshu"/></p>
    	<p>科目<input type="text" name="ks.kemu.kid"/></p>
    	<p><input type="submit" value="提交"></p>
    </form>
  </body>
</html>
