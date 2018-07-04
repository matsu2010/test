<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>

	<s:include value="head.jsp" />
	<meta http-equiv="refresh" content="3;URL=GoMasterAction" />
	<link rel="stylesheet" href="./css/master.css">
	<title>MasterAddComplete</title>
</head>

<body>

	<%@page errorPage="./start.jsp"%>
	<s:if test="#session.masterFlg != true ">
		<%response.sendRedirect("/pixpress/start.jsp");%>
	</s:if>


	<div class="maincontainer">
		<s:include value="includeHeader.jsp" />

		<div class="main">
			<h2>商品を追加しました。</h2>
			<h2>ホームに戻ります</h2>



		</div>

		<s:include value="includeFooter.jsp" />
	</div>

</body>

</html>