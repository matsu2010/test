<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page = "head.jsp" />
<link rel="stylesheet" href="./css/createReviewConfirm.css">
<title>CreateReviewConfirm</title>
</head>
<body>


   <div class="main-container">
   <jsp:include page = "includeHeader.jsp" />

    	<div class="container">

    		<div class="main">


    			<h2 class="title">レビュー投稿確認画面</h2>

    			<div class="review-product-box">

					<img src='<s:property value="imageFilePath"/>'width="150" height="180" align="middle"/><br>
					<h2><s:property value="productName" /></h2>

				</div>

				<div>
						<p>タイトル</p>
						<p><s:property value="reviewTitle" /></p>

						<s:if test="reviewScore==1">
						<span class="star-yellow">★</span>
						<span class="star-gray">★★★★</span>
						</s:if>
						<s:elseif test="reviewScore==2">
						<span class="star-yellow">★★</span>
						<span class="star-gray">★★★</span>
						</s:elseif>
						<s:elseif test="reviewScore==3">
						<span class="star-yellow">★★★</span>
						<span class="star-gray">★★</span>
						</s:elseif>
						<s:elseif test="reviewScore==4">
						<span class="star-yellow">★★★★</span>
						<span class="star-gray">★</span>
						</s:elseif>
						<s:elseif test="reviewScore==5" >
						<span class="star-yellow">★★★★★</span>
						</s:elseif>
						<div class="container">

						<p>レビュー</p>
						<p><s:property value="reviewBody" /></p>
						</div>



						<form action="CreateReviewCompleteAction" method="post">
						<input type="submit" value="投稿する" class = "square_btn"/>
						<s:token />
						</form>
						<form action="CreateReviewAction" method="post">

					 	<input type="hidden" name="productId" value='<s:property value="productId"/>' />
					 	<input type="hidden" name="productName" value='<s:property value="productName"/>' />
					 	<input type="hidden" name="imageFilePath" value="<s:property value='imageFilePath'/>"/>
					 	<input type="hidden" name="reviewTitle" value="<s:property value='reviewTitle'/>"/>
					 	<input type="hidden" name="reviewScore" value="<s:property value='reviewScore'/>"/>
					 	<input type="hidden" name="reviewBody" value="<s:property value='reviewBody'/>"/>


						<br>

						<input type="submit" value="戻って修正する" class = "square_btn"/>


						</form>

				</div>



				</div>

				<jsp:include page = "includeFooter.jsp" />

    		</div>



    	</div>




</body>
</html>