<!-- 担当:小松 -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>

<html>

	<head>

		<link rel="stylesheet" href="./css/userCreateConfirm.css">
		<jsp:include page = "head.jsp" />
		<title>UserCreateConfirm</title>

	</head>

	<body>

		<div class = "maincontainer">

			<!--  headerの始まり -->
				<jsp:include page = "includeHeader.jsp" />
		    <!--  headerの終わり -->

			<s:if test="#session.CreateUserDTO == null " >
				<%response.sendRedirect("/pixpress/home.jsp");%>
			</s:if>

			<div class="main">

				<div class="container">

					<h4 class="title">新規ユーザー登録入力情報確認ページ</h4>

					<h4>入力した内容に間違いがなければ"登録する"をクリックしてください。</h4>
					<br>

					<s:form action="UserCreateCompleteAction" method="post">
						<table class="userinform">

							<tr>
								<th>姓：</th>
									<td><s:property value="familyName"/></td>
							</tr>

							<tr>
								<th>名：</th>
									<td><s:property value="firstName"/></td>
							</tr>

							<tr>
								<th>姓かな：</th>
									<td><s:property value="familyNameKana"/></td>
							</tr>

							<tr>
								<th>名かな：</th>
									<td><s:property value="firstNameKana"/></td>
							</tr>

							<tr>
								<th>性別：</th>
									<td><s:if test="sex == 0" > 男 </s:if><s:if test="sex == 1" > 女 </s:if> </td>
							</tr>

							<tr>
								<th>メールアドレス：</th>
									<td><s:property value="email"/></td>
							</tr>

							<tr>
								<th>ログインID：</th>
									<td><s:property value="userId"/></td>
							</tr>

							<tr>
								<th>パスワード：</th>
									<td><s:property value="password"/></td>
							</tr>

						</table>

						<s:submit  value="登録する" class="square_btn" id="regist"/>

					</s:form>

					<form action="UserCreateAction" method="post" >
						<s:submit value="修正する" class="square_btn" id="return">
						</s:submit>
					</form>

				</div>

			</div>

			<!-- footerの始まり -->
			<jsp:include page = "includeFooter.jsp" />
			<!-- footerの終わり -->

		</div>

	</body>

</html>