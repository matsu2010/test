<!-- 西島 -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>

<head>

<jsp:include page = "head.jsp" />

<link rel="stylesheet" href= "./css/changepassword.css" />


<title>ChangePasswordConfirm</title>
</head>

<body>
<%-- <s:if test="#session.UserPasswordUpdateDTO == null"> --%>
<%-- <% --%>

<!-- // response.sendRedirect("/pixpress/home.jsp"); -->

<%-- %> --%>
<%-- </s:if> --%>

<div class = "maincontainer">

	<!--  headerの始まり -->

   <jsp:include page="includeHeader.jsp" />

    <!--  headerの終わり -->

    	<!--  mainの始まり -->

    <div class="main">
    	<div class="container" style="text-align :center;">

    	<h2 class="title">パスワード更新確認画面</h2>

		<h3>パスワードを変更してよろしいですか？</h3>


				<table class="login">
					<tr>
						<td>ログインID</td><td>：</td><td><s:property value='#session.UserPasswordUpdateDTO.userId' /></td>
					</tr>

					<tr>
						<td>新しいパスワード</td><td>：</td><td><s:property value='#session.hidePassword' /></td>
					</tr>
				</table>



					<p>(※セキュリティのため字数に関わらず16文字分出力しています。)</p>


		<br>


		<form action="ChangePasswordCompleteAction" method="post" >
			<s:submit value="パスワードを変更をする" class="square_btn"/>
		</form>
		<form action="/pixpress/changePassword.jsp" method="post" >
			<s:submit value="戻って修正する" class="square_btn"/>
		</form>

		</div>
    </div>

    <!--  mainの終わり -->



	<!-- footerの始まり -->

	<jsp:include page="includeFooter.jsp" />

	<!-- footerの終わり -->





</div>

</body>
</html>