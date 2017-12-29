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
 
  <body>
	   <s:iterator value="tagList">
	     <a href="findFavoriteByTag?tagname=<s:property value='name'/>"><s:property value="name"/> </a><br>
	   </s:iterator>
	 
	   <s:iterator value="favoriteList">
	      <s:property value="label" /><br>
	      <s:property value="url" /><br>
	      <s:property value="des" /><br>
	      <hr>
	   </s:iterator>
	   
	  <s:iterator value="tagList">
	       <s:if test="count<=1">
	       <span style="font-size:20 ">   <s:property value="name"/></span>
	        </s:if>
	         <s:elseif test="count<=2">
	       <span style="font-size:40 ">   <s:property value="name"/></span>
	        </s:elseif>
	         <s:elseif test="count<=3">
	       <span style="font-size:60 ">   <s:property value="name"/></span>
	        </s:elseif>
	   </s:iterator>
</body>
</html>
