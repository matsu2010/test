<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<s:include value="head.jsp"/>
<style>

	#header ul{
		position: relative;
		left:3%;
		bottom:45px;


	}

	#header ul li{
		float: left;
		margin-left: 10%;
		padding: 0;
		list-style-type: none;
		background:url(./images/backgrounds/sozai1.png) center no-repeat;
		background-size: 100%;
		display: inline-block;
		width:10%;
		height: 100px;
		text-align:center;
	}

#header li:hover{
	background:url(./images/backgrounds/sozai2.png) center no-repeat;
	background-size: 100%;
	display: inline-block;
	width:10%;
	height: 100px;
	text-align:center;
}
	#header li a{
		text-decoration:none;
		color:white;
		position: relative;
		top:50px;
		outline: none;
	}

	#header {
	position:fixed;
		top:0;
		left:0;
		width:100%;
		height:130px;
		font-style:italic;
		font-weight:bold;
		font-size:15px;
		color:white;
		background:url(./images/backgrounds/header.jpg) center top no-repeat;
		z-index:100;
		display:none;


	}

	#wrap {
		width:100%;
		height:200px;
	  padding:auto;


	}

	.redRope{
	  background:url(./images/backgrounds/redRope.png) center top no-repeat;
		width:5%;
		height:200px;
		position: absolute;
		right:1%;
		cursor: pointer;
	}

.headerLeft{
	float:left;
	width:45vw;
	display: inline-block;
	position: relative;
}

.search{
	float:right;
	display: inline-block;
	position: relative;
	width: 25vw;
	margin-right: 5vw;
	margin-top:20px;
}
.searchWord{
	border-radius:20px;
	width:10vw;
}
.searchButton{
	display:inline-block;
	border-radius:20px;
	font-size:0.8vw;
	text-align:center;
	cursor:pointer;
	padding:7px 5px;
	background:gray;
	color:white;
	line-height:1em;
	transition:.3s;
	box-shadow:6px 3xp 3px #777777;
	border: 1px onset black;
	outline: none;
}
.searchButton:hover{
	box-shadow:none;
	background:#666666;
}

.select {
	width:10vw;
}

.logo{
	float:left;
	width:100px;
	height: 90px;
	position: relative;
	left: 6%;
	bottom:20px;
	outline: none;
}
.logoImage{
	width:100%;
	height: 100%;
}
.logo:hover{
	 -webkit-animation: spin 0.01s linear infinite;
    -moz-animation: spin 0.01s linear infinite;
    -ms-animation: spin 0.01s linear infinite;
    -o-animation: spin 0.01s linear infinite;
    animation: spin 0.01s linear infinite;
}
@-webkit-keyframes spin {
	0%{-webkit-transform: rotate(0deg);}
	25%{-webkit-transform: rotate(15deg);}
	50%{-webkit-transform: rotate(0deg);}
	75%{-webkit-transform: rotate(-15deg);}
	100% {-webkit-transform: rotate(0deg);}
}
@-moz-keyframes spin {
	0%{-webkit-transform: rotate(0deg);}
	25%{-webkit-transform: rotate(15deg);}
	50%{-webkit-transform: rotate(0deg);}
	75%{-webkit-transform: rotate(-15deg);}
	100% {-webkit-transform: rotate(0deg);}
}
@-ms-keyframes spin {
	0%{-webkit-transform: rotate(0deg);}
	25%{-webkit-transform: rotate(15deg);}
	50%{-webkit-transform: rotate(0deg);}
	75%{-webkit-transform: rotate(-15deg);}
	100% {-webkit-transform: rotate(0deg);}
}
@-o-keyframes spin {
	0%{-webkit-transform: rotate(0deg);}
	25%{-webkit-transform: rotate(15deg);}
	50%{-webkit-transform: rotate(0deg);}
	75%{-webkit-transform: rotate(-15deg);}
	100% {-webkit-transform: rotate(0deg);}
}
@keyframes spin {
	0%{-webkit-transform: rotate(0deg);}
	25%{-webkit-transform: rotate(15deg);}
	50%{-webkit-transform: rotate(0deg);}
	75%{-webkit-transform: rotate(-15deg);}
	100% {-webkit-transform: rotate(0deg);}
}

</style>

	<script>

$(function() {

	   $("#wrap").hover(function() {
				      $('#header').slideDown('normal');
				    },
				    function() {
				      $('#header').slideUp('normal');
				    }
	  );}
	);



</script>

<title>header</title>
</head>
<header>

	<div id="wrap">
<!-- <div class="redRope"></div> -->

	<div id="header">


	<p class="guest">
			<s:if test="#session.userId != null">
					ようこそ！！<span class="user"><s:property value="#session.userName" /></span>さん
			</s:if>
			<s:else>
					ようこそ！<span class="user">ゲスト</span>さん
			</s:else>
		</p>



		<s:if test="#session.masterFlg ==true ">

		<a class="logo" href = '<s:url action = "GoMasterAction" />'><img  class="logoImage" src="./images/backgrounds/logo.png"></a>

		<ul class="headerLeft">

			<li><a href = '<s:url action = "MasterListAction"><s:param name="pageNo" value="1"/></s:url>'>MOVIE</a></li>
			<li><a href = '<s:url action = "MasterAddAction" />'>NEW</a></li>
			<li><a href = '<s:url action = "MasterDeleteAction" ><s:param name="pageNo" value="1"/></s:url>'>DELETE</a></li>
			<li><a href='<s:url action="LogoutAction"/>'>LOGOUT</a></li>
		</ul>
		</s:if>


		<s:else>

		<a class="logo" href = '<s:url action = "GoHomeAction" />'><img  class="logoImage" src="./images/backgrounds/logo.png"></a>

		<ul class="headerLeft">

			<li><a href = '<s:url action = "ProductListAction"><s:param name="pageNo" value="1"/></s:url>'>MOVIE</a></li>
			<li><a href = '<s:url action = "CartAction" />'>CART</a></li>
	 		<s:if test="#session.userId != null">
					<li><a href='<s:url action="MyPageAction"/>'>MY_PAGE</a></li>
			</s:if>


			<s:if test="#session.userId != null">
				<li><a href='<s:url action="LogoutAction"/>'>LOGOUT</a></li>
			</s:if>
			<s:else>
				<li><a href='<s:url action="GoLoginAction"/>'>LOGIN</a></li>
			</s:else>
		</ul>
			<span class="search">

				<s:form action="ProductSearchAction">

						<s:if test='#session.containsKey("mCategoryDTOList")'>
						<s:select name="categoryId" list="#session.mCategoryDTOList" listValue="categoryName" listKey="categoryId" class="select rounded" id="categoryId"/>
						</s:if>

					<input type="text" name="searchWord" value="<s:property value='searchWord'/>" class="searchWord"/>

					<input type="hidden" name="searchProducts" value="1">
					<input type="hidden" name="pageNo" value="1">
					<button type="submit" class="searchButton">検索</button>
				</s:form>

			</span>
		</s:else>

	</div>

	</div>


</header>
</html>