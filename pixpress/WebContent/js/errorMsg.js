$(function(){

  var $body = $("body");

  // 各 `.my-tooltip` 要素に対して処理をしていきます
  $(".error-msg").each(function(){
    var $this = $(this); //何度か使うため、変数にしまっておきます
    var title = $this.attr("title"); //要素の`title`属性を取得

    // ツールチップ本体を生成します
    var $tooltip = $([
      "<span class='tooltip'>",
        "<span class='tooltip__body'>",
          title,
        "</span>",
      "</span>"
    ].join(""));

    // イベントの設定
    $this
      // マウスが乗ったら...
      .on("mouseenter", function(){

        // <body>へツールチップを追加します
        $body.append($tooltip);

        // 要素の表示位置
        var offset = $this.offset();

        // 要素のサイズ
        var size = {
          width: $this.outerWidth(),
          height: $this.outerHeight()
        };

        // ツールチップのサイズ
        var ttSize = {
          width: $tooltip.outerWidth(),
          height: $tooltip.outerHeight()
        };

        // 要素の上に横中央で配置
        $tooltip.css({
          top: offset.top - ttSize.height,
          left: offset.left + size.width / 2 - ttSize.width / 2
        });
      })
      // マウスが離れたら...
      .on("mouseleave", function(){

        // <body>から、ツールチップを削除します
        $tooltip.remove();
      });
  });
});