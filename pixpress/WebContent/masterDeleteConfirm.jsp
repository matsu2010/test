<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>

<head>

	<s:include value="head.jsp" />
	<title>MasterDeleteConfirm</title>
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

			<h2>以下の商品を削除してよろしいですか？</h2>

			<s:form action="MasterDeleteCompleteAction" method="post">

					<s:iterator value="productDeleteList">
						<br><s:property value="productName" />
						<br><img src='<s:property value="imageFilePath"/>' style="width:150px; height:200px;">

					</s:iterator>


					<br><p><s:submit class="square_btn" value="削除する"/></p>

			</s:form>

			<form action="MasterDeleteAction" method="post">

			<input type="hidden" name="pageNo" value="1">
			<s:submit class="square_btn" value="戻る"/>
			</form>
		</div>
		<s:include value="includeFooter.jsp" />
	</div>

</body>

</html>