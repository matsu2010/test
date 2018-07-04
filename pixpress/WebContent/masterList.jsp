<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>

<html>

<head>

	<s:include value="head.jsp" />
	<link rel="stylesheet" type="text/css" href="./css/productList.css">
	<script type="text/javascript">
		// $(function(){

		//     var listContents = $(".productList").length;

		//     $(".productList").each(function(){
		//         $(this).find("li:gt(8)").each(function(){$(this).hide();});
		//         var Num = 10;
		//         $("#more").click(function(){
		//             Num +=9;
		//             $(this).parent().find("li:lt("+Num+")").show(400);
		//                 if(listContents <= Num){
		//                     $("p.end").show();
		//                     $("#more").hide();
		//                 }
		//         })
		//     });
		// });
	</script>

	<title>MasterList</title>

</head>

<body>

	<%@page errorPage="./start.jsp"%>
	<s:if test="#session.masterFlg != true ">
		<%response.sendRedirect("/pixpress/start.jsp");%>
	</s:if>


	<div class="maincontainer">

		<s:include value="includeHeader.jsp" />

		<div class="main">

			<ul class="productList">
				<s:iterator value="#session.productList">
					<li><a href='<s:url action="MasterChangeAction"><s:param name="id" value="id"/><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'>

							<img src="<s:property value='imageFilePath'/>"style="width: 150px; height: 180px;"><br>

							<div class="mask">
								<s:property value="productName" />
								<br> ￥
								<s:property value="price" />
								<br>
							</div>

					</a></li>
				</s:iterator>
			</ul>

			<s:iterator begin="1" end="#session.totalPageSize" status="pageNo">
				<s:if test="#session.currentPageNo == #pageNo.count">
					<s:property value="%{#pageNo.count}" />
				</s:if>

				<s:else>
					<a href="<s:url action='MasterPaginationAction'><s:param name='pageNo' value='%{#pageNo.count}'/><s:param name='categoryId' value='%{categoryId}'/><s:param name='searchWord' value='%{searchWord}'/><s:param name='searchProducts' value='%{searchProducts}'/><s:param name='type' value='1'/></s:url> ">
						<s:property value="%{#pageNo.count}" />
					</a>
				</s:else>
			</s:iterator>

		</div>

		<s:include value="includeFooter.jsp" />
	</div>

</body>

</html>