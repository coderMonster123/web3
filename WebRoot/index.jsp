<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
	<s:form action="addFavorite" method="post">
		<s:textfield name="favorite.label" label="名称"></s:textfield>
		<s:textfield name="favorite.url" label="链接"></s:textfield>
		<s:textfield name="favorite.tags" label="Tag"></s:textfield>
		<s:textfield name="favorite.des" label="描述"></s:textfield>
		<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>
