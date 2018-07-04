<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>

<head>

	<s:include value="head.jsp" />
	<title>MasterChange</title>
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

			<s:form action="MasterChangeConfirmAction" method="post">

				<table class="addList">

					<tr>
						<th>商品名:</th>
						<td><input type="text" name="productName"
							value="<s:property value='#session.products.productName'/>"></td>
						<td class="errorMessage"><s:property value="productNameError" /></td>
					</tr>

					<tr>
						<th>商品名(かな):</th>
						<td><input type="text" name="productNameKana"
							value="<s:property value='#session.products.productNameKana'/>"></td>
						<td class="errorMessage"><s:property
								value="productNameKanaError" /></td>
					</tr>
　
					<tr>
						<th>カテゴリーID:</th>
						<td>
							<s:select name="categoryId" list="#session.masterCategoryDTOList" listValue="categoryName" listKey="categoryId" class="select" id="categoryId"/>
						</td>
					</tr>

					<tr>
						<th>公開年:</th>
						<td><input type="text" name="releaseYear"
							value="<s:property value='#session.products.releaseYear'/>"></td>
						<td class="errorMessage"><s:property value="releaseYearError" /></td>
					</tr>

					<tr>
						<th>価格:</th>
						<td><input type="text" name="price"
							value="<s:property value='#session.products.price'/>"></td>
						<td class="errorMessage"><s:property value="priceError" /></td>
					</tr>

					<tr>
						<th>監督:</th>
						<td><input type="text" name="director"
							value="<s:property value='#session.products.director'/>"></td>
						<td class="errorMessage"><s:property value="directorError" /></td>
					</tr>

					<tr>
						<th>キャスト:</th>
						<td><input type="text" name="castName1"
							value="<s:property value='#session.products.castName1'/>"></td>
						<td class="errorMessage"><s:property value="castError1" /></td>
					</tr>

					<tr>
						<th>キャスト:</th>
						<td><input type="text" name="castName2"
							value="<s:property value='#session.products.castName2'/>"></td>
						<td class="errorMessage"><s:property value="castError2" /></td>
					</tr>

					<tr>
						<th>キャスト:</th>
						<td><input type="text" name="castName3"
							value="<s:property value='#session.products.castName3'/>"></td>
						<td class="errorMessage"><s:property value="castError3" /></td>
					</tr>

					<tr>
						<th>あらすじ:</th>
						<td><textarea name="productDescription" rows="4" cols="50"><s:property
									value="#session.products.productDescription" /></textarea></td>
						<td class="errorMessage"><s:property
								value="productDescriptionError" /></td>
					</tr>

					<tr>
						<th>商品画像:</th>
						<td><input id="loadFile" type="file" name="image"></td>
						<td><img
							src='<s:property value="#session.products.imageFilePath"/>'
							style="width: 150px; height: 200px;"></td>
						<td class="errorMessage"><s:property
								value="imageFilePathError" /></td>
					</tr>

				</table>

				<input type="submit" value="変更する" class="square_btn"/>

			</s:form>

		</div>

		<s:include value="includeFooter.jsp" />
	</div>

</body>

</html>