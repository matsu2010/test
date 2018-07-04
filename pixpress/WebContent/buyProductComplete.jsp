<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/buyProductComplete.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="refresh" content="3;URL=<s:url action="GoHomeAction"/>">
<jsp:include page = "head.jsp"/>

<title>BuyProductComplete</title>
</head>
<body>
<div class = "maincontainer">

<jsp:include page="includeHeader.jsp" />

<div class ="main">

		<h2>決済が完了しました</h2>

		決済...それすなわち財を支払い人生の幸福を得るための所作に過ぎない
		その行為は容易であるがゆえに誰しもがその本質を見失うものである

		<h3>3秒後に<a href='<s:url action="GoHomeAction"/>'>Home</a>に戻ります。</h3>

</div>
<jsp:include page="includeFooter.jsp" />
</div>
</body>
</html>