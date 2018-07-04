<!-- 担当：森本 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

<head>
<jsp:include page="head.jsp" />
<link rel="stylesheet" type="text/css" href="./css/purchaseHistory.css">
<title>purchaseHistory.jsp</title>
</head>

<body>
	<div class="maincontainer">
		<jsp:include page="includeHeader.jsp" />

		<div class="main">

			<h2 class="title">購入履歴</h2>


			<s:if test="message == null">
				<s:iterator value="purchaseListDTOList">
					<div class="container">
						購入日時：
						<s:property value="registDate" />

						<br> 合計金額:
						<s:property value="totalPrice" />
						円 <br> 配送日:
						<s:property value="deliveryDate" />
						<br> 配送時間:
						<s:property value="deliveryTime" />
						<br> 宛先:
						<s:property value="userAddress" />

                        <div class="detail_btn">
						<s:form action="PurchaseHistoryDetailsAction">
							<s:hidden name="allPurchaseListNumber" />
							<s:submit value="詳細" class="square_btn"/>
						</s:form>
						</div>
					</div>
				</s:iterator>

               <div class="delete_btn">
				<s:form action="PurchaseHistoryAction">
					<input type="hidden" name="deleteFlg" value=true />
					<s:submit value="削除" class="square_btn"/>
				</s:form>
			   </div>

			</s:if>
			<s:else>
				<CENTER>
					<s:property value="message" />
				</CENTER>
			</s:else>


		</div>
		<jsp:include page="includeFooter.jsp" />

	</div>
</body>
</html>