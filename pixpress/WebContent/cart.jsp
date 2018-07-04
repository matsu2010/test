<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page = "head.jsp" />
<link rel="stylesheet" href="./css/cart.css">
<title>Cart</title>
</head>
<body>
<div class = "maincontainer">
<jsp:include page="includeHeader.jsp"/>

	<div class="main">

		<div class = "top">

				<h1 class = "title">カート</h1>

		</div>

		<div id="left">
			<s:if test="errorMessage != null">
				<p class="error"><s:property value="errorMessage"/></p>
			</s:if>

			<s:if test="cartList.isEmpty()">
				<p>カートの中は空です</p>
			</s:if>
			<s:else>
				<p class="message"><s:property value="cartList.size()"/>件の商品があります</p>

<!-- カートの中身 -->
			<div class = "details">

			<table>
			<s:iterator value = "cartList">
			<tr>
				<td>
					<a href="<s:url action='ProductDetailsAction'>
						<s:param name="productId" value="productId" />
						<s:param name="categoryId" value="categoryId" /></s:url>">
						<img src="<s:property value='imageFilePath'/>" alt="Photo" width="150" height="180">
					</a>
				</td>
				<td>
					<a href = "<s:url action = 'ProductDetailsAction'>
						<s:param name="productId" value="productId" />
						<s:param name = "categoryId" value = "categoryId" /></s:url>">
						<s:property value = "productName" />
					</a>

					<div class = "price">
						<s:property value = "price" />円
					</div>

					<div class = "productCount">
						<s:property value = "productCount" />個
					</div>

					<div class = "director">
						監督:<s:property value = "director" />
					</div>

					<div class = "btn">
						<s:form action = "CartDeleteAction">
							<a href  ='<s:url action = "CartDeleteAction"><s:param name = "productId" value = "productId">
							</s:param></s:url>' >削除</a>
						</s:form>
					</div>
				</td>
			</tr>

			</s:iterator>

			</table>
			</div>

			<br>

			<div class = "totalPrice">
				<span>合計金額</span>
				<!-- jstl使用 -->
				<fmt:formatNumber value="${totalPrice}" />円
			</div>

			<s:if test = "! cartList.isEmpty()" >
				<div class = "btn">
					<a href = '<s:url action = "BuyProductConfirmAction" />'>決済</a>
				</div>
			</s:if>

			</s:else>
		</div>
	</div>

		<jsp:include page="includeFooter.jsp"/>


</div>

</body>
</html>
