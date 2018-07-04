<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>

<head>

<s:include value="head.jsp" />
<title>MasterAddConfirm</title>
<link rel="stylesheet" href="./css/master.css">

</head>

<body>

	<%@page errorPage="./start.jsp"%>
	<s:if test="#session.masterFlg != true ">
		<%response.sendRedirect("/pixpress/start.jsp");%>
	</s:if>
	<div class="maincontainer">
		<s:include value="includeHeader.jsp" />

		<div class="main">
			<p>以下の内容でお間違いないですか？</p>

			<s:form action="MasterAddCompleteAction">

				<table class="addListConfirm">
					<tr><th>商品ID</th><td><s:property value='#session.productId' /></td></tr>
					<tr><th>商品名</th><td><s:property value='#session.productName' /></td></tr>
					<tr><th>商品名かな</th><td><s:property value='#session.productNameKana' /></td></tr>
					<tr><th>カテゴリー</th><td><s:property value='#session.categoryName' /></td></tr>
					<tr><th>監督</th><td><s:property value='#session.director' /></td></tr>
					<tr><th>キャスト1</th><td><s:property value='#session.castName1' /></td></tr>
					<tr><th>キャスト2</th><td><s:property value='#session.castName2' /></td></tr>
					<tr><th>キャスト3</th><td><s:property value='#session.castName3' /></td></tr>
					<tr><th>価格</th><td><s:property value='#session.price' /></td></tr>
					<tr><th>公開年</th><td><s:property value='#session.releaseYear' /></td></tr>
					<tr><th>画像</th><td><img src='<s:property value="#session.imageFilePath"/>' style="width:150px; height:200px;"></tr>
					<tr><th>商品の説明</th><td><s:property value="#session.productDescription"/></td></tr>
				</table><br><br>

				<s:submit value="OK" class="square_btn"/>

			</s:form>

			<br><s:form action="MasterAddAction">
				<s:submit value="戻って修正する" class="square_btn">
						<s:hidden name="productId" value="%{productId}"/>
						<s:hidden name="productName" value="%{productName}" />
						<s:hidden name="productNameKana" value="%{productNameKana}" />
						<s:hidden name="categoryId" value="%{categoryId}" />
						<s:hidden name="director" value="%{director}" />
						<s:hidden name="castName1" value="%{castName1}" />
						<s:hidden name="castName2" value="%{castName2}" />
						<s:hidden name="castName3" value="%{castName3}" />
						<s:hidden name="price" value="%{price}" />
						<s:hidden name="releaseYear" value="%{releaseYear}" />
						<s:hidden name="productDescription" value="%{productDescription}" />
				</s:submit>

			</s:form>
		</div>

		<s:include value="includeFooter.jsp" />
	</div>

</body>

</html>