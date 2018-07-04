<!-- 担当：森本 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

<head>
<jsp:include page="head.jsp" />
<title>myPage.jsp</title>
<link rel="stylesheet" type="text/css" href="./css/myPage.css">
<script>
	$(document).ready(function() {

		var listContents = $(".box").length;

		$(".box:gt(1)").hide();
		if (listContents <= 3) {
			$("#more").hide();
		}
		var Num = 3;

		$("#more").click(function() {
			Num += 3;
			$(".box:lt(" + Num + ")").show();

			if (listContents <= Num) {
				$("#more").hide();
			}
		})

	});
</script>
</head>

<body>

	<div class="maincontainer">

		<jsp:include page="includeHeader.jsp" />

		<div class="main">
			<div class="container">
				<h2 class="title">マイページ</h2>


				<table>
					<tr>
						<td colspan="2"><hr></td>
					</tr>
					<s:iterator value="myPageList">

						<tr>
							<th class="line">姓名</th>
							<td class="line"><s:property value="familyName"
									escape="false" /> <s:property value="firstName" escape="false" /></td>
						</tr>
						<tr>
							<th class="line">ふりがな</th>
							<td class="line"><s:property value="familyNameKana"
									escape="false" /> <s:property value="firstNameKana"
									escape="false" /></td>
						</tr>
						<tr>
							<th class="line">性別</th>
							<td class="line"><s:if test="sex == 0">　男性</s:if> <s:if
									test="sex == 1">　女性</s:if></td>
						</tr>
						<tr>
							<th class="line">メールアドレス</th>
							<td class="line"><s:property value="email" escape="false" /></td>
						</tr>

					</s:iterator>
					<tr>
						<td colspan="2"><hr></td>
					</tr>
				</table>
			</div>

			<div class="button">
				<form action="PurchaseHistoryAction">
					<s:submit value="購入履歴" class="square_btn" />
				</form>
			</div>

		</div>
		<br>
		<div class="review-title">

			<s:if test="reviewMessage != null">
				<h2>
					<s:property value="reviewMessage" />
				</h2>
			</s:if>
			<s:else>
				<h2>投稿したレビュー</h2>
			</s:else>
		</div>
		<s:if test="#session.reviewMyList.size() != 0">
<!-- 			<div class="reviewList"> -->


					<s:form action="ReviewDeleteAction">
						<s:iterator value="#session.reviewMyList">
						<div class="box">

							<div class="reviewList">
								<p>
									商品名：
									<s:property value="productName" />
								</p>
								<p>
									タイトル：
									<s:property value="reviewTitle" />
								</p>
								<p>
									評価: <span class="star"> <s:if test="reviewScore == 1">
											<span class="star-yellow">★</span>
											<span class="star-gray">★★★★</span>
										</s:if> <s:if test="reviewScore == 2">
											<span class="star-yellow">★★</span>
											<span class="star-gray">★★★</span>
										</s:if> <s:if test="reviewScore == 3">
											<span class="star-yellow">★★★</span>
											<span class="star-gray">★★</span>
										</s:if> <s:if test="reviewScore == 4">
											<span class="star-yellow">★★★★</span>
											<span class="star-gray">★</span>
										</s:if> <s:if test="reviewScore == 5">
											<span class="star-yellow">★★★★★</span>
										</s:if>
									</span>
								</p>




								<p>＜内容＞</p>

								<div class=textarea>
									<s:property value="reviewBody" />

								</div>
								<input type="checkbox" name="deleteList"
									value="<s:property value='id'/>">
							</div>
</div>
						</s:iterator>


						<s:submit value="選択削除" class="square_btn" />
					</s:form>
					<br>
					<div class="delete_btn">
						<s:form action="ReviewDeleteAction">
							<input type="hidden" name="deleteFlg" value=true />
							<s:submit value="全件削除" class="square_btn" />
						</s:form>
					</div>



<!-- 			</div> -->
		</s:if>




		<div>

			<p id="more">もっと見る</p>
		</div>


		<jsp:include page="includeFooter.jsp" />
	</div>
</body>
</html>