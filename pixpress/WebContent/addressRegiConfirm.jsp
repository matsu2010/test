<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href= "./css/style.css" />
	<link rel="stylesheet" href= "./css/addressRegister.css" />


	<title>Address Registration Confirm</title>
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
		<h3>宛先登録確認</h3>
		<h4>以下の内容でよろしいですか？</h4>
			<table>
				<tr>
					<th><s:label value="名前"/></th>
					<td><s:property value="familyName"/><span>　</span><s:property value="firstName"/></td>
				</tr>
				<tr>
				</tr>
				<tr>
					<th><s:label value="ふりがな"/></th>
					<td><s:property value="familyNameKana"/><span>　</span><s:property value="firstNameKana"/></td>
				</tr>
				<tr>
				</tr>
				<tr>
					<th><s:label value="性別"/></th>
					<td><s:if test="sex == 1" > 男性 </s:if><s:if test="sex == 2" > 女姓 </s:if></td>
				</tr>
				<tr>
				</tr>
				<tr>
					<th><s:label value="住所"/></th>
					<td><s:property value="session.userAddress"/></td>
				</tr>
				<tr>
				</tr>
				<tr>
					<th><s:label value="電話番号"/></th>
					<td><s:property value="telNumber"/></td>
				</tr>
				<tr>
				</tr>
				<tr>
					<th><s:label value="メールアドレス"/></th>
					<td><s:property value="email"/></td>
				</tr>
			</table>
			<form action="AddressRegiCompleteAction" method="post" >
				<s:submit value="登録する" class="square_btn"/>
				<s:token />
			</form>
			<br>

			<form action="AddressRegisterAction" method="post" >
				<s:submit value="戻って修正する" class="square_btn">
						<s:hidden name="familyName" value="%{familyName}" />
						<s:hidden name="firstName" value="%{firstName}" />
						<s:hidden name="familyNameKana" value="%{familyNameKana}" />
						<s:hidden name="firstNameKana" value="%{firstNameKana}" />
						<s:hidden name="telNumber" value="%{telNumber}" />
						<s:hidden name="email" value="%{email}" />
						<s:hidden name="address1" value="%{address1}" />
						<s:hidden name="address2" value="%{address2}" />
						<s:hidden name="address3" value="%{address3}" />
				</s:submit>

			</form>
		</div>S
		<jsp:include page = "includeFooter.jsp" />
	</div>

</body>
</html>