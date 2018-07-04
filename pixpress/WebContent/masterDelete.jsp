<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>

<head>
	<s:include value="head.jsp" />
	<title>MasterDelete</title>
	<link rel="stylesheet" type="text/css" href="./css/productList.css">
</head>

<body>

	<%@page errorPage="./start.jsp"%>
	<s:if test="#session.masterFlg != true ">
		<%response.sendRedirect("/pixpress/start.jsp");%>
	</s:if>

	<div class="maincontainer">
		<s:include value="includeHeader.jsp" />

		<div class="main">

			<s:if test ="errorMessage != null">
				<h1><s:property value="errorMessage" /></h1>

			</s:if>

			<p>削除する商品を選択してください。</p>

			<s:form action="MasterDeleteConfirmAction">

				<ul class="productList">
					<s:iterator value="#session.productList">
						<li><img style="width: 200px; height: 300px;"
							src="<s:property value='imageFilePath'/>"><br> <s:property
								value="price" /><span>円</span><br> <input type="checkbox"
							name="deleteName" value="<s:property value='productName'/>"></li>
					</s:iterator>
				</ul>

				<tr>
					<td><s:submit value="削除する" class="square_btn"/></td>
				</tr><br>

			</s:form>

			<s:iterator begin="1" end="#session.totalPageSize" status="pageNo">
				<s:if test="#session.currentPageNo == #pageNo.count">
					<s:property value="%{#pageNo.count}" />
				</s:if>
				<s:else>
					<a href="<s:url action='MasterPaginationAction'><s:param name='pageNo' value='%{#pageNo.count}'/><s:param name='categoryId' value='%{categoryId}'/><s:param name='searchWord' value='%{searchWord}'/><s:param name='searchProducts' value='%{searchProducts}'/><s:param name='type' value='2'/></s:url> "><s:property value="%{#pageNo.count}" /></a>
				</s:else>
			</s:iterator>

		</div>
		<s:include value="includeFooter.jsp" />
	</div>

</body>

</html>