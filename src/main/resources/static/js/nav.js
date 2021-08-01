var scrollTagEvent = (function() {

    $(function(){

      var arr = [];
      init();

      /**
       * 初始化
       * @return {[type]} [description]
       */
      function init() {

        $('div#ksLeftNav a.nav-title').each(function(){
          arr.push(parseInt($($(this).attr("href")).offset().top));
        });

        $(document).on('click','div#ksLeftNav a',function(e){

          e.preventDefault();
          unbindScroll();

          // 判断是否为子集
          $('div#ksLeftNav a.nav-title').removeClass('active');
          if ($(this).parent().hasClass('nav-detail')) {
            $(this).parent().siblings('a').addClass('active');
          } else {
            $(this).addClass('active');
          }
          
          $("html, body").animate({
            scrollTop: $($(this).attr("href")).offset().top + 'px'
          },500,function(){
            bindScroll();
          });
            
        });

        $('div#ksLeftNav a.nav-title').first().trigger('click');
      }
      
      /**
       * 滚动事件绑定
       * 滚动高度对应的内容响应左侧导航
       * @return {[type]} [description]
       */
      function bindScroll() {

        $(window).on('scroll.tag',function(e){

          var scrollT = $(this).scrollTop();

          for (var i = 0; i < arr.length; i++) { 
            if (scrollT >= arr[i]) {
              $('a.active').removeClass('active');
              $('div#ksLeftNav a.nav-title:eq(' + i + ')').addClass('active');
            }
          }
        });
      }
      
      // 取消滚动事件的绑定，防止影响左侧导航点击事件
      function unbindScroll() {
        $(window).off('scroll.tag');
      }

    });

  })();