<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<s:include value="head.jsp" />
<title>ProductDetails</title>
<link rel="stylesheet" type="text/css" href="./css/productList.css">
<script>
	$(document).ready(function() {

		var listContents = $(".reviewList").length;

		$(".reviewList:gt(2)").hide();
		if (listContents <= 3) {
			$("#more").hide();
		}
		var Num = 3;

		$("#more").click(function() {
			Num += 3;
			$(".reviewList:lt(" + Num + ")").show();

			if (listContents <= Num) {
				$("#more").hide();
			}
		})

	});
</script>

</head>
<body>
	<%@page errorPage="./start.jsp"%>
	<div class="maincontainer">
		<s:include value="includeHeader.jsp" />


		<div class="main">
			<s:form action="CartInsertAction">
				<div class="left">
					<table>
						<tr>
							<td><img
								src='<s:property value="#session.products.imageFilePath"/>'
								style="width: 300px; height: 400px;"></td>
						</tr>
						<tr>
							<td><label>購入個数:</label> <select name="productCount">
									<option value="1" selected="selected">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
							</select></td>
						</tr>
						<tr>
							<td><span>￥</span> <s:property
									value="#session.products.price" /></td>
						</tr>
					</table>
				</div>
				<div class="right">
					<table class="details" border="1">
						<tr>
							<th>商品名</th>
						</tr>
						<tr>
							<td><s:property value="#session.products.productName" /></td>
						</tr>
						<tr>
							<th>公開年</th>
						</tr>
						<tr>
							<td><s:property value="#session.products.releaseYear" /></td>
						</tr>
						<tr>
							<th>監督名</th>
						</tr>
						<tr>
							<td><s:property value="#session.products.director" /></td>
						</tr>
						<tr>
							<th>出演者</th>
						</tr>
						<tr>
							<td><s:property value="#session.products.castName1" />,<s:property
									value="#session.products.castName2" />,<s:property
									value="#session.products.castName3" /></td>
						</tr>
						<tr>
							<th>あらすじ</th>
						</tr>
						<tr>
							<td><s:property value="#session.products.productDescription" />
							</td>
						</tr>


					</table>
				</div>
				<%-- <s:property value = "#session.products.productId" />
<s:hidden name = "productId" value = "#session.products.productId" />

<button type="submit" name="productId" value="#session.products.productId">カートに入れる</button> --%>
				<div class="center">
					<s:submit class="square_btn" value="カートに入れる" />
				</div>
				<s:token />
			</s:form>


			<h3 id="suggestProduct">この製品を見ている人はこんな製品も見ています</h3>



			<ul class="productList">
				<s:iterator value="#session.SuggestList">


					<li class="pro"><a
						href='<s:url action="ProductDetailsAction"><s:param name="id" value="%{id}"/><s:param name="productId" value="%{productId}" /><s:param name="categoryId" value="%{categoryId}" /></s:url>'>
							<img src="<s:property value='imageFilePath'/>"
							style="width: 150px; height: 180px;"><br> <s:property
								value="productName" /><br>
					</a></li>


				</s:iterator>
			</ul>

			<s:if test="#session.reviewDTOList.isEmpty">
			</s:if>
		</div>


			<h2>商品レビュー</h2>




					<s:iterator value="#session.reviewDTOList">
					<div class="box">


									<div  class="reviewList">UserID:<s:property value="userId" />

								<p>評価：<s:if test="reviewScore==1">
											<span class="star-yellow">★</span>
											<span class="star-gray">★★★★</span>
										</s:if> <s:if test="reviewScore==2">
											<span class="star-yellow">★★</span>
											<span class="star-gray">★★★</span>
										</s:if> <s:if test="reviewScore==3">
											<span class="star-yellow">★★★</span>
											<span class="star-gray">★★</span>
										</s:if> <s:if test="reviewScore==4">
											<span class="star-yellow">★★★★</span>
											<span class="star-gray">★</span>
										</s:if> <s:if test="reviewScore == 5">
											<span class="star-yellow">★★★★★</span>
										</s:if></p>



									<h4>タイトル</h4><s:property value="reviewTitle" />


									<h4>コメント</h4><s:property value="reviewBody" /></div>



</div>
					</s:iterator>


<div>

			<p id="more">もっと見る</p>
</div>

		<s:include value="includeFooter.jsp" />
	</div>
</body>
</html>