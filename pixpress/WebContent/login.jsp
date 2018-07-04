<!-- 舎川 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="./css/loginuser.css">
<title>Login</title>
<jsp:include page="head.jsp" />

<script>
	function goUserCreateAction() {
		document.getElementById("form").action = "UserCreateAction";
	}
</script>


</head>
<body>
	<div class="maincontainer">

		<s:if test="#session.LoginDTO != null || #session.loginFlg == true || #session.masterFlg == true ">
			<%
				response.sendRedirect("/pixpress/start.jsp");
			%>
		</s:if>
		<!-- /* セッションが切れたらstart.jspへとばす */ -->


		<!--  headerの始まり -->

		<jsp:include page="includeHeader.jsp" /><!-- ←ヘッダー.jsp 入力”” -->

		<!--  headerの終わり -->



		<div class="main">


			<h3 class="title">ログイン・新規登録ページ</h3>



			<div class="left">
				<h3>ログインIDとパスワードを入力してください。</h3>




				<s:form method="post" action= "LoginAction">


					<label>ログインID</label><br>

					<s:textfield class="form-parts login-id" name="userId"
						value="%{#session.saveId}" />
					<br> パスワード<br>
					<input type="password" name="password"><br> ログインID保存
					<s:if test="#session.saveId != null">
						<input type="checkbox" name="saveLogin" value="true"
							checked="checked">
					</s:if>
					<s:else>
						<br>
						<input type="checkbox" name="saveLogin" value="true">
					</s:else>
					<br>


					<s:submit value="ログイン" class="square_btn" />

				</s:form>



				<form action="ChangePasswordAction">
					<s:submit value="パスワードの再設定" class="square_btn" />
				</form>

			</div>

			<div class="right">
				<h3>新規のお客様のご登録はこちら。</h3>
				<br>
				<form action="UserCreateAction">
					<s:submit value="新規登録" class="square_btn" />
				</form>
				<br>



				<div class="error">

					<s:property value="userIdErrorMsg" />
					<br>
					<s:property value="passwordErrorMsg" />
					<br>
					<s:property value="errorMsg" />
					<br>
					 <s:property value="loginpasswordErrorMessage"/>
				</div>


			</div>
		</div>







		<!-- footerの始まり -->
		<div class="footer">
			<jsp:include page="includeFooter.jsp" />
		</div>
		<!-- footerの終わり -->



	</div>
</body>
</html>