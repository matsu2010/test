<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<s:include value="head.jsp"/>
<link rel="stylesheet" type="text/css" href="./css/home.css"/>
<link rel="stylesheet" type="text/css" href="./css/slick.css"/>
<link rel="stylesheet" type="text/css" href="./css/slick-theme.css"/>
<title>Home</title>

<script type="text/javascript">

var $slideshow = $('.slider');
var $slide = $('.slide');

function randomize(selector){
  $slideshow.find(selector).sort(function(){
    return Math.round(Math.random()) - 0.5;
  }).detach().appendTo($slideshow);
}

$(function(){
	randomize('.slide');
	$('.slider').slick({
		centerMode: true,
		accessibility: true,
		autoplay: true,
		autoplaySpeed: 4000,
		pauseOnHover: false,
		pauseOnDotsHover: false,
		cssEase: 'ease',
		speed: 1000,
		dots: false,
		fade: true,
		infinite: true,
		lazyLoad: 'progressive',

	});


	});
</script>


</head>
<body>
<div class="main">
<img src="images/backgrounds/home.jpg" class="back">
<div class="header">
<s:include value="includeHeader.jsp"/>
</div>


<ul class="slider">
	<s:iterator value="#session.productList">
		<li class="slide"><a href='<s:url action="ProductDetailsAction"><s:param name="id" value="id"/><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'>
			<img class="slideImage" src="<s:property value='imageFilePath'/>"></a></li>
	</s:iterator>
</ul>






<div class="footer">
	<s:include value="includeFooter.jsp"/>
</div>

</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="./js/slick.min.js"></script>
</body>
</html>