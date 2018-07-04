<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<title>header</title>

	<style type="text/css">
		body{
			margin:0;
			padding:0;
			line-height:1.6;
			letter-spacing:1px;
			font-family:Verdana,Helvetica,sans-serif;
			font-size:12px;
			color:#333;
			background:#fff;
		}
		#header{
			width:100%;
			height:80px;
			background-color:black;
		}
		#header ul{
			line-height: 80px;
		}
		#header ul li{
			float: left;
			list-style: none;
		    color: white;
   			padding-right: 60px;
    		font-size: 18px;
    		margin-left: 20px;
		}

	</style>
</head>
<body>
	<div id="header">
		<ul>
			<li><s:if test="#session.id != null"><a href="<s:url action='LogoutAction'/>">ログアウト</a></s:if></li>
			<li><a href="<s:url action='HomeAction'/>">ログイン</a></li>
			<li><a href="<s:url action='GoHomeAction'/>">ホーム</a></li>
			<li><a href="<s:url action='MyPageAction'/>">マイページ</a></li>
			<li><a href="<s:url action='HomeAction'/>">商品一覧</a></li>
		</ul>
		<div id="pr">
		</div>
	</div>
</body>
</html>
