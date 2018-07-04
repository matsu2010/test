<!-- 担当:小松 -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

	<head>

		<link rel="stylesheet" href="./css/userCreate.css">
		<jsp:include page="head.jsp" />
		<title>UserCreate</title>

	</head>

	<body>

		<div class="maincontainer">

			<!--  headerの始まり -->
			<jsp:include page="includeHeader.jsp"/>
			<!--  headerの終わり -->

			<s:if test="#session.LoginUserDTO != null ">
				<%response.sendRedirect("/pixpress/home.jsp");%>
			</s:if>

			<div class="main">

				<div class="container">

					<h3 class="title">新規ユーザー登録ページ</h3>

					<form action="UserCreateConfirmAction">

						<table class="user">

							<!-- 氏名入力欄 -->
							<tr>
								<th>氏名:</th>
									<td>
										<s:textfield class="text" name="familyName" value="%{session.CreateUserDTO.familyName}"  placeholder="姓"/>
										<div class="errorMsg"><s:property value='errorMsg.familyName' />　</div>
										<s:textfield class="text" name="firstName" value="%{session.CreateUserDTO.firstName}"  placeholder="名"/>
										<div class="errorMsg"><s:property value='errorMsg.firstName' />　</div>
									</td>
							</tr>

							<!-- かな氏名入力欄 -->
							<tr>
								<th>氏名(かな):</th>
									<td>
										<s:textfield class="text" name="familyNameKana" value="%{session.CreateUserDTO.familyNameKana}"  placeholder="姓かな"/>
										<div class="errorMsg"><s:property value='errorMsg.familyNameKana' />　<br></div>
										<s:textfield class="text" name="firstNameKana" value="%{session.CreateUserDTO.firstNameKana}"  placeholder="名かな"/>
										<div class="errorMsg"><s:property value='errorMsg.firstNameKana' />　</div>
									</td>
							</tr>

					 		<!-- 性別 -->
							<tr>
								<th>性別:</th>
									<td><input type="radio" name="sex" value='0' checked />男性
										<s:if test="sex == 1">
											<input type="radio" name="sex" value='1' checked />女性
										</s:if>
										<s:else>
											<input type="radio" name="sex" value='1' />女性
										</s:else>
										<br>
										<div class="errorMsg"><s:property value='errorMsg.sex' />　</div>
									</td>
							</tr>

							<!-- メールアドレス入力欄 -->
							<tr>
								<th>メールアドレス:</th>
									<td>
										<s:textfield class="text" name="email" value="%{session.CreateUserDTO.email}" placeholder="半角英数字14～32文字"/>
										<br>
										<div class="errorMsg"><s:property value='errorMsg.email' />　</div>

									</td>
							</tr>

							<!-- ログインID入力欄 -->
							<tr>
								<th>ログインID:</th>
									<td>
										<s:textfield class="text" name="userId" value="%{session.CreateUserDTO.userId}"  placeholder="半角英数字1～8文字"/>
										<br>
										<div class="errorMsg"><s:property value='errorMsg.userId' /><s:property value="userIdErrorMsg" />　</div>
									</td>
							</tr>


							<!-- パスワード入力欄 -->
							<tr>
								<th>パスワード:</th>
									<td>
										<input type="password" class="text" name="password" placeholder="半角英数字1～16文字">
										<br>
										<div class="errorMsg"><s:property value='errorMsg.password' />　</div>
									</td>
							</tr>

						</table>



						<!-- 送信ボタン -->
						<div class="btn"><input type="submit" value="入力内容を確認" class="square_btn" /></div>

					</form>

				</div>

			</div>

			<!-- footerの始まり -->
			<jsp:include page="includeFooter.jsp" />
			<!-- footerの終わり -->

		</div>

	</body>

</html>