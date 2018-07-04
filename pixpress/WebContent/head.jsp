<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content=""/>

<link href="https://fonts.googleapis.com/earlyaccess/sawarabimincho.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/css?family=PT+Serif" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script type="text/javascript">
		function submitAction(url) {
			$('form').attr('action', url);
			$('form').submit();
		}

		$(function(){
			$(document).keydown(function(event){
				// クリックされたキーのコード
				var keyCode = event.keyCode;

				// Ctrlキーがクリックされたか (true or false)
				var ctrlClick = event.ctrlKey;

				// Altキーがクリックされたか (true or false)
				var altClick = event.altKey;

				// キーイベントが発生した対象のオブジェクト
				var obj = event.target;

				// ファンクションキーを制御する
				if(keyCode == 112 // F1キーの制御
					|| keyCode == 113 // F2キーの制御
					|| keyCode == 114 // F3キーの制御
					|| keyCode == 115 // F4キーの制御
					|| keyCode == 116 // F5キーの制御
					|| keyCode == 117 // F6キーの制御
					|| keyCode == 122 // F11キーの制御
/* 				 	|| keyCode == 123 // F12キーの制御
 */				)
				{
					return false;
				}

				/* // バックスペースキーを制御する
				if(keyCode == 8){
					return false;
				}

				// Alt + ←→ を制御する
				if(altClick && (keyCode == 37 || keyCode == 39)){
					return false;
				} */

				// Ctrl + R を制御する
				if(ctrlClick && keyCode == 82){
					return false;
				}

				// Ctrl + Shift + I を制御する
				if(ctrlClick && keyCode == 16 && keyCode == 73){
					return false;
				}
			});
		});

	</script>


