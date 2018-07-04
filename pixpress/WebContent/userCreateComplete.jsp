<!-- 担当:小松 -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>

<html>

	<head>

		<link rel="stylesheet" href="./css/userCreateComplete.css">
		<jsp:include page = "head.jsp" />
		<title>UserCreateComplete</title>

	</head>

	<body>

		<div class = "maincontainer">

			<!--  headerの始まり -->
			<jsp:include page = "includeHeader.jsp" />
		    <!--  headerの終わり -->

			<div class="main">

				<div class="container" style="text-align : center;">

					<br><br><br>
					<h3 class="title">ユーザー登録完了</h3>

					<div class="btn">
						<form action="MyPageAction" method="post" >
							<s:submit value="マイページ" class="square_btn">
							</s:submit>
						</form>

						<br>

						<form action="CartAction" method="post" >
							<s:submit value="カート画面" class="square_btn">
							</s:submit>
						</form>

						<br>

						<form action="ProductListAction" method="post" >
							<input type="hidden" name="pageNo" value="1">
								<s:submit value="商品を見る" class="square_btn">
								</s:submit>
						</form>

						<br>

						<form action="GoHomeAction" method="post" >
							<s:submit value="ホーム画面" class="square_btn">
							</s:submit>
						</form>
					</div>

				</div>

			</div>

			<!-- footerの始まり -->
			<jsp:include page = "includeFooter.jsp" />
			<!-- footerの終わり -->

		</div>

	</body>

</html>