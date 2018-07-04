<!-- 西島 -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>

	<jsp:include page = "head.jsp" />

<!-- ここから -->

	<script type="text/javascript" src="./js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="./js/errorMsg.js"></script>

<!-- ここまで新 -->

	<link rel="stylesheet" href= "./css/changepassword.css" />

	<title>ChangePassword</title>
<style>
	.error-msg{
		color:red;
		font-weight:bold;
	}

</style>
</head>


<body>

	<div class = "maincontainer">


<!-- 	headerの始まり -->

	<s:include value="includeHeader.jsp" />

<!-- 	headerの終わり -->

	<div class="main">

		<div class="container" style="text-align :center;">

		<h2 class="title">パスワード更新画面</h2>

		<h3>パスワードの再設定</h3>

		<form action="ChangePasswordConfirmAction" method="post">





			<p>ログインID</p>

<!-- ここから -->
			<%-- <s:if test="#session.UserPasswordUpdateDTO.userId ! = null">
				<p><input type="text" name="userId" value="<s:property value='#session.UserPasswordUpdateDTO.userId' />" pattern="^[a-zA-Z0-9]{1,8}$" maxlength="8" /></p>
			</s:if>

			<s:elseif test="#session.LoginUserDTO != null">
				<p><input type="text" name="userId" value="<s:property value='#session.LoginUserDTO.userId' />" pattern="^[a-zA-Z0-9]{1,8}$" maxlength="8" /></p>
			</s:elseif> --%>
<!-- ここまでいらないかも -->
			<%-- <s:else> --%>
				<p><input type="text" name="userId" value="<s:property value='#session.saveId' />" maxlength="8" placeholder = "半角英数字1～8文字で入力"/></p>
			<%-- </s:else> --%>


				<p class="error-msg"><s:property value="userIdErrorMsg"/></p>  <!-- ログインIDを入力してください -->
				<%-- <p class="error-msg"><strong><s:property value="newPasswordErrorMsg"/></strong></p>  --%> <!-- 以前と同じパスワードは使用できません ログインIDが間違っています -->




			<p>現在のパスワード</p>
<!-- ここから -->
			<%-- <s:if test="#session.UserPasswordUpdateDTO.userPassword ! = null">
				<p><input type="text" name="userPassword" value="<s:property value='#session.UserPasswordUpdateDTO.userPassword' />" pattern="^[a-zA-Z0-9]{1,16}$" maxlength="16" /></p>
			</s:if>

			<s:elseif test="#session.LoginUserDTO != null">
				<p><input type="password" name="userPassword" value="<s:property value='#session.LoginUserDTO.userPassword' />" pattern="^[a-zA-Z0-9]{1,16}$" maxlength="16" /></p>
			</s:elseif> --%>
<!-- ここまでいらないかも -->
			<%-- <s:else> --%>
				<p><input type="password" name="userPassword" maxlength="16" placeholder = "半角英数字1～16文字で入力"/></p>
			<%-- </s:else> --%>

				<p class="error-msg"><strong><s:property value="userPasswordErrorMsg"/></strong></p>  <!-- 入力されたパスワードが異なります -->

				<p class="error-msg"><strong><s:property value="passwordErrorMsg"/></strong></p>








			<p>半角英数字1～16文字で入力してください。</p>
			<p>新しいパスワード</p>
			<p><input type="password" name="newPassword" maxlength="16" placeholder = "半角英数字1～16文字で入力"/></p>



			<p class="error-msg"><s:property value="matchPasswordErrorMsg"/></p>  <!--  新しいパスワードと確認用パスワードの値が一致していません -->
			<p class="error-msg"><strong><s:property value="newPasswordErrorMsg"/></strong></p>

			<p>新しいパスワード(確認)</p>
			<p><input type="password" name="newPasswordConfirm" maxlength="16"  placeholder = "半角英数字1～16文字で入力"/></p>




			<s:submit value="確認画面に行く" class="square_btn" style="margin:0 auto;"/>








		</form>


		</div>


		</div>







	<!-- footerの始まり -->

	<s:include value="includeFooter.jsp" />

	<!-- footerの終わり -->



 </div>

</body>
</html>
