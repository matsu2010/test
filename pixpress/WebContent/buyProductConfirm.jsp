<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="java.util.*, java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/buyProductConfirm.css">
<jsp:include page = "head.jsp"/>

<title>BuyProductConfirm</title>
</head>
<body>
<div class = "maincontainer">

<jsp:include page="includeHeader.jsp" />



<div id ="titleBox">
<h1>決済確認画面</h1>
</div>


<!-- 購入商品 -->
     <div id="buyProductBox">
     <h2>購入商品</h2>

       <s:iterator value="#session.cartList">

         <div class="buyProduct">
             <img class ="image" style="" src="<s:property value='imageFilePath'/>">

             <div class ="text">

             <br>商品名：
             <s:property value="productName"/><br>

             値段：
             <s:property value="price"/><span>円</span><br>

             購入個数：
             <s:property value="productCount"/><span>個</span><br>
             <br>

             </div>
          </div>


        </s:iterator>

        <br>

        <div class="totalPrice">
        <strong>合計金額：
        <s:property value="#session.totalPrice"/><span>円</span>
        </strong>
        </div>

       </div>


<!-- 宛先情報選択 -->

<div id ="addressBox">


<h3>＜宛先一覧＞  宛先情報を選択してください</h3>
 <h3><a href=<s:url action="AddressRegisterAction"/>>新しい宛先を登録する</a></h3>
     <s:form  action="BuyProductCompleteAction" >


		<s:if test="#session.addressDTOList == null">
         宛先がありません。<a href=<s:url action="AddressRegisterAction"/>>宛先を作成してください</a>
         </s:if>
         <s:else>


	           <s:iterator value="#session.addressDTOList" status="st">
	           <div class="address">

		           <table>
		               <tr>
					       <td>
					        <s:if test="#st.index == 0">
							<input type="radio" name="id" checked="checked" value="<s:property value='id'/>"/>
							</s:if>
							<s:else>
							<input type="radio" name="id" value="<s:property value='id'/>"/>
							</s:else>
				          </td>
		               </tr>

		              <tr>
		                <th>名前:</th>
		                <td><s:property value="familyName"/><span>　</span><s:property value="firstName"/></td>
		              </tr>

		              <tr>
		                <th>ふりがな:</th>
		                <td><s:property value="familyNameKana"/><span>　</span><s:property value="firstNameKana"/></td>
		              </tr>

		              <tr>
		                <th>住所:</th>
		                <td><s:property value="userAddress"/></td>
		              </tr>

		              <tr>
		                <th>電話番号:</th>
		                <td><s:property value="telNumber"/></td>
		              </tr>

		              <tr>
		                <th>メールアドレス:</th>
		                <td><s:property value="email"/></td>
		              </tr>
		              <tr>
		              	<th><a href  ='<s:url action = "AddressDeleteAction"><s:param name = "id" value = "id">
							</s:param></s:url>' >この宛先を削除する</a></th>
		              </tr>
		           </table>
	             </div>

	            </s:iterator>

         </s:else>


         <s:if test="!(#session.addressDTOList.isEmpty())">


		<h3>配送日時を選択してください</h3>
		<strong><input type="date" class="calendar" name="deliveryDate" min="2018-06-27" max="2018-08-31"  required></strong>
		<p><input type="time" class="calendar" name="deliveryTime" min="09:00" max="21:00" step="3600" required></p>

              <br><s:submit value="決済" class="square_btn"/>
         </s:if>

				<s:token />
</s:form>

</div>

<jsp:include page = "includeFooter.jsp" />

</div>
</body>
</html>