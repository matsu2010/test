<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>

<head>

	<s:include value="head.jsp" />
	<title>MasterAdd</title>
	<link rel="stylesheet" href="./css/master.css">

	<script>
		showImage(false);

		$("#loadFile").onchange = function(evt) {
			showImage(false);
			var files = evt.target.files;
			if (files.length == 0)
				return;
			var file = files[0];
			if (!file.type.match(/image/)) {
				alert('画像ファイルを選んでください');
				return;
			}
			var reader = new FileReader();
			reader.onload = function(evt) {
				$("#thumb").src = reader.result;
				showImage(true);
			}
			reader.readAsDataURL(file);
		}

		function showImage(b) {
			var val = b ? "block" : "none";
			$("#up_btn").style.display = val;
			$("#thumb").style.display = val;
		}

		function $(id) {
			return document.querySelector(id);
		}
</script>

</head>

<body>

	<%@page errorPage="./start.jsp"%>
	<s:if test="#session.masterFlg != true ">
		<%response.sendRedirect("/pixpress/start.jsp");%>
	</s:if>

	<div class="maincontainer">
		<s:include value="includeHeader.jsp" />

		<div class="main">
			<s:form method="post" action="MasterAddConfirmAction">

				<table class="addList">

					<tr>
						<th>商品ID:</th>
						<td><s:textfield name="productId" value="%{productId}"/></td>
							<td class="errorMessage"><s:property value="productIdError"/><s:property value="productIdCheckError"/></td>
					</tr>

					<tr>
						<th>商品名:</th>
						<td>
							<s:textfield name="productName" value="%{productName}"/></td>
							<td class="errorMessage"><s:property value="productNameError" />
						</td>
					</tr>

					<tr>
						<th>商品名(かな):</th>
						<td><s:textfield name="productNameKana" value="%{productNameKana}"/></td>
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
						<td><s:textfield name="releaseYear" value="%{releaseYear}"/></td>
						<td class="errorMessage"><s:property value="releaseYearError" /></td>
					</tr>

					<tr>
						<th>価格:</th>
						<td><s:textfield name="price" value="%{price}"/></td>
						<td class="errorMessage"><s:property value="priceError" /></td>
					</tr>

					<tr>
						<th>監督:</th>
						<td><s:textfield name="director" value="%{director}"/></td>
						<td class="errorMessage"><s:property value="directorError" /></td>
					</tr>

					<tr>
						<th>キャスト:</th>
						<td><s:textfield name="castName1" value="%{castName1}"/></td>
						<td class="errorMessage"><s:property value="castError1" /></td>
					</tr>

					<tr>
						<th>キャスト:</th>
						<td><s:textfield name="castName2" value="%{castName2}"/></td>
						<td class="errorMessage"><s:property value="castError2" /></td>
					</tr>

					<tr>
						<th>キャスト:</th>
						<td><s:textfield name="castName3" value="%{castName3}"/></td>
						<td class="errorMessage"><s:property value="castError3" /></td>
					</tr>

					<tr>
						<th>商品画像:</th>
						<td><input id="loadFile" type="file" name="image" ></td>
						<td class="errorMessage"><s:property
								value="imageFilePathError" /></td>
					</tr>

					<tr>
						<th>あらすじ:</th>
						<td><s:textarea name="productDescription" value="%{productDescription}" rows="4" cols="50"/></td>
					</tr>
					<tr><td class="errorMessage"><s:property
								value="productDescriptionError" /></td>
					</tr>

				</table>

				<br><s:submit class="square_btn" value="商品を追加" style="text-align:center;" id="up_btn" />

			</s:form>

		</div>

		<s:include value="includeFooter.jsp" />
	</div>

</body>

</html>