<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<title>ProductList</title>
<s:include value="head.jsp"/>
<link rel="stylesheet" type="text/css" href="./css/productList.css">
<script type="text/javascript">
// $(function(){

//     var listContents = $(".productList").length;

//     $(".productList").each(function(){
//         $(this).find("li:gt(8)").each(function(){$(this).hide();});
//         var Num =9;
//         $("#more").click(function(){
//             Num +=9;
//             $(this).parent().find("li:lt("+Num+")").show(200);
//                 if(listContents <= Num){
//                     $("p.end").show();
//                     $("#more").hide();
//                 }
//         })
//     });
// });
</script>
</head>
<body>
<%@page errorPage="./start.jsp" %>

<div class="maincontainer">

<s:include value="includeHeader.jsp"/>


<div class="main">
<ul class="productList">
<s:if test="productList.size() == 0">
検索結果がありませんでした
</s:if>

<s:else>

	<s:iterator value="#session.productList">
		<li><a href='<s:url action="ProductDetailsAction"><s:param name="id" value="id"/><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'>
			<img src="<s:property value='imageFilePath'/>" style="width:150px; height:180px;"><br>
		<div class="mask">
			<s:property value="productName"/><br>
			￥<s:property value="price"/><br>
		</div>

		</a></li>
	</s:iterator>
</s:else>
</ul>


<s:iterator begin="1" end="#session.totalPageSize" status="pageNo">
	<s:if test="#session.currentPageNo == #pageNo.count">
		<s:property value="%{#pageNo.count}"/>
	</s:if>
	<s:else>
		<a href="<s:url action='ProductSearchAction'><s:param name='pageNo' value='%{#pageNo.count}'/><s:param name='categoryId' value='%{categoryId}'/><s:param name='searchWord' value='%{searchWord}'/><s:param name='searchProducts' value='%{searchProducts}'/></s:url> ">	<s:property value="%{#pageNo.count}"/></a>
	</s:else>
</s:iterator>
</div>


<s:include value="includeFooter.jsp"/>

</div>
</body>
</html>