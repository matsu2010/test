<!-- 担当：森本 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>

<head>
	<jsp:include page ="head.jsp" />
    <link rel="stylesheet" type="text/css" href="./css/purchaseHistoryDetails.css">
	<title>購入履歴詳細</title>
</head>

<body>
<div class="maincontainer">
	<jsp:include page="includeHeader.jsp" />

      <div class="main">
       <h2>購入履歴詳細</h2>
		<table>
			<s:iterator value="#session.detailsList">
			<tr>
			  <td>
				<a href="<s:url action='ProductDetailsAction'><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>">
				<img src="<s:property value='imageFilePath'/>" width="150" height="180" align="middle" alt=<s:property value="imageFileName" /> /></a>
              </td>

              <td>
					<br>商品名 : <s:property value="productName"/><br>
					値段:<s:property value="price" />円 <br>
					個数:<s:property value="productCount" />個 <br>

			   <div class="button">
				 <form action="CreateReviewAction">

				 	<input type="hidden" name="productId" value='<s:property value="productId"/>' />
				 	<input type="hidden" name="productName" value='<s:property value="productName"/>' />
				 	<input type="hidden" name="imageFilePath" value="<s:property value='imageFilePath'/>"/>

					<s:submit value="レビューを書く" class="square_btn"/>
				 </form>
			   </div>
			  </td>
			</tr>
            </s:iterator>
        </table>
      </div>



<jsp:include page="includeFooter.jsp" />
</div>
</body>
</html>

