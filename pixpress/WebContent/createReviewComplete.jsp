<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page = "head.jsp" />
<link rel="stylesheet" href="./css/createReviewComplete.css">
<meta http-equiv="refresh" content="3;URL=<s:url action="GoHomeAction"/>">
<title>ReviewComplete</title>
</head>
<body>
   <div class="main-container">
   <jsp:include page = "includeHeader.jsp" />

    	<div class="container">

    		<div class="main">

				<h2 class="title">レビュー投稿完了</h2>

				<p>レビューの投稿が完了いたしました</p>

		    	<p>3秒後にトップページに戻ります</p>

				<p><a href="<s:url action='GoHomeAction' />" >戻らない場合はこちら</a></p>
			</div>

			<jsp:include page = "includeFooter.jsp" />

    	</div>



    </div>

</body>
</html>