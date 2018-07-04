<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="refresh" content="3;URL='StartAction'" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
	<link rel="stylesheet" href= "./css/style.css" />

<title>ErrorPage</title>
</head>

<body>
<%@page isErrorPage="true" %>
	<div class = "maincontainer">
	<div class="main">
			<h2>エラーが発生しました。</h2>
			<h2>トップページに戻ります。</h2>
			<p>ジャンプしない場合は、以下のリンクをクリックしてください。</p>
			<a href='/pixpress/StartAction.action'>ホーム画面へ</a>
	</div>
	</div>
</body>

</html>