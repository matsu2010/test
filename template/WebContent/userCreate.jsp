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
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>

	<title>UserCreate画面</title>

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
		table{
			text-align:center;
			margin:0 auto;
		}

		#top{
			width:780px;
			margin:30px auto;
			border:1px solid #333;
		}
		#header{
			width:100%;
			height:80px;
			background-color:black;
		}
		#main{
			width:100%;
			height:500px;
			text-align:center;
		}
		#footer{
			width:100%;
			height:80px;
			background-color:black;
			clear:both;
		}
	</style>
</head>
<body>
	<s:include value="header.jsp"/>
	<div id="main">
		<div id="top">
			<p>UserCreate</p>
		</div>
		<div>
			<s:if test="errorMessage !=">
				<s:property value="errorMessage" escape="false"/>
			</s:if>
			<table>
			<s:form action="UserCreateConfirmAction">
				<tr>
					<td>
						<label>ログインID:</label>
					</td>
					<td>
						<input type="text" name="loginUserId" value=""/>
					</td>
				</tr>
				<tr>
					<td>
						<label>ログインPASS:</label>
					</td>
					<td>
						<input type="password" name="loginPassword" value=""/>
					</td>
				</tr>
				<tr>
					<td>
						<label>ユーザー名:</label>
					</td>
					<td>
						<input type="text" name="userName" value=""/>
					</td>
				</tr>
				<tr>
					<td>
						<label>生年月日:</label>
					</td>
					<td>
						<select id="year" name="year"></select> <span>年</span>
						<select id="month"name="month"></select><span>月</span>
						<select id="day"name="day"></select><span>日</span>
					</td>
				</tr>
				<tr>
					<td>
						<label>性別:</label>
					</td>
					<td>
						<input type="radio" name="userSex" value="男" checked="checked">男
						<input type="radio" name="userSex" value="女">女
					</td>
				</tr>
				<tr>
					<td>
						<label>住所</label>
					</td>
				<tr>
				<tr>
					<td>
						郵便番号:
					</td>
					<td>
						<input type="text" name="address1" size="10" maxlength="8" onKeyUp="AjaxZip3.zip2addr(this,'','address2','address3');">
					</td>
				<tr>
				<tr>
					<td>
						都道府県:
					</td>
					<td>
						<input type="text" name="address2">
					</td>
				</tr>
				<tr>
					<td>
						市町村:
					</td>
					<td>
						<input type="text" name="address3">
					</td>
				</tr>
				<tr>
					<td>
						以降の住所:
					</td>
					<td>
						<input type="text" name="address4">
					</td>
				</tr>
				<tr>
					<td>
						メールアドレス
					</td>
					<td>
						<input type="text" name="userMail">
					</td>
				</tr>
				<tr>
					<td>
						電話番号:
					</td>
					<td>
						<input type="text" name="userTell">
					</td>
				</tr>


				<s:submit value="登録"/>
			</s:form>
			</table>
			<div>
				<span>前画面に戻る場合は</span>
				<a href="<s:url action='HomeAction'/>">こちら</a>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
	<script type="text/javascript" src="js/jquery.js"></script>

	<script type="text/javascript" src="./script/script.js"></script>

</body>

</html>