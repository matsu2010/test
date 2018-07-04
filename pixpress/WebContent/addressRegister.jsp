<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>
	<link rel="stylesheet" href= "./css/style.css" />
	<link rel="stylesheet" href= "./css/addressRegister.css" />

	<title>Address Registration</title>
	<jsp:include page = "head.jsp" />

</head>
<body>

<s:if test="#session.mCategoryDTOList == null " >
<%

response.sendRedirect("/pixpress/start.jsp");

%>
</s:if>
	<div class = "maincontainer">
		<jsp:include page = "includeHeader.jsp" />
			<div class = "main">

			<s:form action="AddressRegiConfirmAction">
				<h3>宛先登録</h3>

				<!-- 姓 名 -->
					<br>氏名を入力してください。<br>
					<label>姓:<s:textfield name="familyName" value="%{familyName}"/>
					名:<s:textfield name="firstName" value="%{firstName}"/></label>

					<div class="error-msg"><s:property value="errorFamilyName" /><br>
					<s:property value="errorFirstName"/></div>

				<!-- ふりがな -->
					ふりがなを入力してください。<br>
					<label>姓かな:<s:textfield name="familyNameKana" value="%{familyNameKana}"/>
					名かな:<s:textfield name="firstNameKana" value="%{firstNameKana}" /></label>

					<div class="error-msg"><s:property value="errorFamilyNameKana" /><br>
					<s:property value="errorFirstNameKana"/></div>

					性別を選択してください。<br>
					<label>性別:<input type ="radio" name="sex" value="1" checked>男性
					<input type ="radio" name="sex" value="2">女性
					</label><br><br>

				<!-- メールアドレス -->
					メールアドレス<br>
					<label><s:textfield name="email" value="%{email}"/></label>
					<div class="error-msg"><s:property value="errorEmail"/></div>

				<!-- 電話番号 -->
					<br>電話番号(ハイフンなし)<br>
					<label><s:textfield name="telNumber" value="%{telNumber}"/></label>
					<div class="error-msg"><s:property value="errorTelNumber"/></div>

				<!-- 郵便番号 -->
					<br>郵便番号(ハイフンなし)<br>
					<label><s:textfield name="address1" size="10" maxlength="8" onKeyUp="AjaxZip3.zip2addr(this,'','address2','address3');" value = "%{address1}" /></label>
					<div class="error-msg"><s:property value="errorAddress1"/></div>

				<!-- 都道府県 -->
					<br>都道府県<br>
					<label><s:textfield name="address2" value="%{address2}"/></label>
					<div class="error-msg"><s:property value="errorAddress2"/></div>

				<!-- 以降の住所 -->
					<br>以降の住所<br>
					<label><s:textfield name="address3" value="%{address3}"/></label>
					<div class="error-msg"><s:property value="errorAddress3"/></div><br>

				<s:submit value="送信" class="square_btn"/>
			</s:form>
			</div>

		<jsp:include page = "includeFooter.jsp" />
	</div>
</body>
</html>