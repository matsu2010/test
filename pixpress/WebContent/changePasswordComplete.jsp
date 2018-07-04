<!-- 西島 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>

<head>

<jsp:include page = "head.jsp" />

<link rel="stylesheet" href= "./css/changepassword.css" />

<meta http-equiv="refresh" content="3;URL=/pixpress/login.jsp" />
<script src="js/blowserBackPrevent.js" type="text/javascript"></script>

<title>ChangePasswordComplete</title>
</head>

<body>

<div class = "maincontainer">

	<!--  headerの始まり -->

 	 <jsp:include page="includeHeader.jsp" />

    <!--  headerの終わり -->

    	<!--  mainの始まり -->

    <div class="main">
    	<div class="container" style="text-align :center;">

    	<h3 class="title">パスワード更新完了画面</h3>


		<h2>パスワードの再設定が完了いたしました</h2>

    	<p>3秒後にログイン画面に移動します</p>

		<p><a href="/pixpress/login.jsp" >移動しない場合はこちら</a></p>




		</div>
    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="includeFooter.jsp" />

	<!-- footerの終わり -->

</div>
</body>
</html>