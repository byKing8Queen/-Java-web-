<%@ page language="java" import="java.util.*" pageEncoding="UTf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>This is Combox page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery-easyui-1.5.3/jquery.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.5.3/jquery.easyui.min.js"></script>
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.5.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.5.3/themes/icon.css">

  </head>
  
  <body style="background-color: green;">
    <div class="easyui-layout" data-options="fit:true" style="margin-left: 600px; margin-top: 200px;">
                省市<input class="easyui-combobox" id="province" style="width:200px;height:40px;">
    </div>
    <script type="text/javascript" src="js/present.js"></script>
  </body>
</html>