<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page = "head.jsp" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style>

  	.iconimg{
		width: 35px;
		margin-right: 10px;
		}

	.icon{
		display: inline;
		list-style-type: none;
		white-space: nowrap;
	}

	.icon .iconli{
		display: inline-block;
		float: left;
	}

	.footerp{
		display: inline;
	}

	.footerbody{
		background-color: #000000;
	}
	.icon_a{
		outline: none;
	}

</style>
<title>footer</title>
</head>
<body class = "footerbody">

<ul class = "icon">
	<li class = "iconli"><a class="icon_a" href="https://twitter.com/home?status=This%20site%20is%20wonderful!%0Ahttp%3A//kisu.me/BU3">
		<img src = "images/footericon/socialicon1.png" class = "iconimg" alt = "twitter" >
	</a></li>

	<li class = "iconli"><a class="icon_a" href="https://www.facebook.com/sharer/sharer.php?u=http%3A//www.internousdev.com/pixpress">
		<img src = "images/footericon/socialicon2.png" class = "iconimg" alt = "facebook" >
	</a></li>

	<li class = "iconli"><a class="icon_a" href="https://plus.google.com/share?url=http%3A//www.internousdev.com/pixpress">
		<img src = "images/footericon/socialicon3.png" class = "iconimg" alt = "google+" >
	</a></li>

	<li class = "iconli"><a class="icon_a" href="https://www.linkedin.com/shareArticle?mini=true&url=http%3A//www.internousdev.com/pixpress&title=pixpress&summary=You%20can%20buy%20cinema%20DVD!&source=">
		<img src = "images/footericon/socialicon4.png" class = "iconimg" alt = "linkedin" >
	</a></li>
</ul>

<p class = "footerp" style="color:white; font-weight:bold; font-style:italic; font-size:15px; float:right; padding-right:10px;"><a style="text-decoration:none; color:white; outline: none; " href="endRoll.jsp">&copy;pixpress</a></p>
</body>
</html>