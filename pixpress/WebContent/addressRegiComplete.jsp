<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href= "./css/style.css" />
	<link rel="stylesheet" href= "./css/addressRegister.css" />
	<meta http-equiv="refresh" content="1;URL=BuyProductConfirmAction" />


	<title>Address Registration Complete</title>
	<jsp:include page = "head.jsp" />
</head>
<body>

<s:if test="#session.mCategoryDTOList == null " >
<%

response.sendRedirect("/pixpress/start.jsp");

%>
</s:if>
	<div class = "maincontainer">
		<jsp:include page = "includeHeader.jsp" />
			<div class = "main">
				<h1>宛先情報の登録が完了しました。</h1>
				<s:form action="BuyProductConfirmAction">
					<s:submit value="購入画面へ戻る" class = "square_btn"/>
				</s:form>
			</div>
		<jsp:include page = "includeFooter.jsp" />
	</div>
</body>
</html>