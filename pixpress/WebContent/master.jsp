<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>

	<title>Master</title>
	<s:include value="head.jsp" />
	<link rel="stylesheet" href="./css/master.css">
	<meta http-equiv="Content-Style-Type" content="text/css"/>

		<style type="text/css">

			.btn{
				margin-top:200px;

			}

			.square_btn{
				font-size:30px;
				color:white;
				font-weight:bold;
				width:270px;
				height:65px;
				position:relative;
				bottom:60px;
				margin-top:80px;
				}


		</style>

</head>

<body>

	<%@page errorPage="./start.jsp"%>
	<s:if test="#session.masterFlg != true ">
		<%response.sendRedirect("/pixpress/start.jsp");%>
	</s:if>

	<div class="maincontainer">
		<s:include value="includeHeader.jsp" />

		<div class="main">
			<h1>管理者画面</h1>

			<div class="btn">

				<form action="MasterListAction" method="post" >
					<input type="hidden" name="pageNo" value="1">
					<s:submit value="商品詳細編集" class="square_btn">
					</s:submit>
				</form>
				<br><br>
				<form action="MasterAddAction" method="post" >
					<s:submit value="商品追加" class="square_btn">
					</s:submit>
				</form>
				<br><br>
				<form action="MasterDeleteAction" method="post" >
					<input type="hidden" name="pageNo" value="1">
					<s:submit value="商品削除" class="square_btn">
					</s:submit>
				</form>

			</div>


		</div>



		<s:include value="includeFooter.jsp" />
	</div>

</body>

</html>