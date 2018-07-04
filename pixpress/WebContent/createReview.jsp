<!-- @author yazaki -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page = "head.jsp" />
<link rel="stylesheet" href="./css/createReview.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script type="text/javascript" src="js/createReview.js" ></script>

<title>CreateReview</title>
</head>
<body>

<%-- <s:if test="#session.LoginDTO == null || #session.CreateReviewProductDTO == null" >
</s:if> --%>
	<div class="main-container">
		<jsp:include page = "includeHeader.jsp" />

    	<div class="container">

    		<div class="main">
				<h2 class="title">レビューの投稿</h2>


				<div class="review-product-box">

					<img src='<s:property value="imageFilePath"/>'width="150" height="180" align="middle"/><br>
					<h2><s:property value="productName" /></h2>

				<s:form action="CreateReviewConfirmAction" name = "form">


						<p>タイトル：
							<input class="reviewTitle-form" type="text" name="reviewTitle" value="<s:property value='reviewTitle' />" />
							<span class="caution-msg">※あと<span class="max-reviewTitle">15</span>文字まで</span>
						</p>

						<p class="error">
							<s:if test="errorTitle != null">
								<s:property value="errorTitle" />
							</s:if>
						</p>


						<p>評価：

						<div class="rating-star">
							<input id="star1" type="radio" name="reviewScore" value="5" /><label for="star1">★</label>
							<input id="star2" type="radio" name="reviewScore" value="4" /><label for="star2">★</label>
							<input id="star3" type="radio" name="reviewScore" value="3" /><label for="star3">★</label>
							<input id="star4" type="radio" name="reviewScore" value="2" /><label for="star4">★</label>
							<input id="star5" type="radio" name="reviewScore" value="1" /><label for="star5">★</label>
						</div>

						<p class="error">
							<s:if test="errorScore != null">
								<s:property value="errorScore" />
							</s:if>
						</p>


						<p>内容：
							<span class="caution-msg">※あと<span class="max-reviewBody">250</span>文字まで</span>
						</p>
						<p class="error-msg"><s:property value="errorMsg.reviewBody" />
						</p>
						<textarea class="reviewBody-form" rows="5" name="reviewBody" ><s:property value='reviewBody' /></textarea>

						<p class="error">
							<s:if test="errorBody != null">
								<s:property value="errorBody" />
							</s:if>
						</p>


						<input type="hidden" name="productId" value='<s:property value="productId"/>' />
						<input type="hidden" name="imageFilePath" value='<s:property value="imageFilePath"/>' />
						<input type="hidden" name="productName" value='<s:property value="productName"/>' />

						<s:submit class="square_btn" value="確認へ" />


				</s:form>
			</div>
			</div><!-- main-container -->



			<jsp:include page = "includeFooter.jsp" />



		</div><!-- container -->


    </div><!-- main -->
</body>
</html>