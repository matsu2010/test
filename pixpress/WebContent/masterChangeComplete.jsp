<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>

<head>

	<s:include value="head.jsp" />
	<meta http-equiv="refresh" content="3;URL=GoMasterAction" />
	<title>MasterChangeComplete</title>
	<link rel="stylesheet" href="./css/master.css">

</head>

<body>

	<%@page errorPage="./start.jsp"%>
	<s:if test="#session.masterFlg != true ">
		<%response.sendRedirect("/pixpress/start.jsp");%>
	</s:if>

	<div class="maincontainer">
		<s:include value="includeHeader.jsp" />

		<div class="main">
			<h2>変更が完了しました</h2>
			<h2>ホームに戻ります</h2>
			<img src="./images/ojigi052.jpg">
		</div>

		<s:include value="includeFooter.jsp" />
	</div>

</body>

</html>