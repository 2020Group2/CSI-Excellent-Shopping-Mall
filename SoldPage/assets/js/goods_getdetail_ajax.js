 window.onload = function () {
     var id = getUrlParam(window.location.href);
     console.log(id);

     var aaa = "http://129.204.216.249:8000/information/" + id

     $.ajax({
         type: "get",
         url: aaa,
         dataType: "json",
         success: function (data) {
             //console.log(data);
             printgoodsname(data);
             printgoodsprice(data);
             printgoodstag(data);
             printgoodstype(data);
             printgoodsdescription(data);
             printpic(data);
             dopush(data);
         },
         error: function () {
             alert('加载数据失败')
         }
     });

     clearbuycargoods();

     addtocarshow();




     function addtocarshow() {
         var addtocarshow1 = getusergo_idwindow(window.location.href);

         var checkcar_url = "http://129.204.216.249:8000/get/car/" + addtocarshow1 + "";

         $.ajax({
             type: "get",
             url: checkcar_url,
             dataType: "json",
             success: function (data) {
                 judgeaddtocarshow(data)

             },
             error: function () {
                 alert('加载数据失败')
             }
         });

         function judgeaddtocarshow(data) {
             var flaggy = 0;
             for (var i = 0; i < data['data'].length; i++) {
                 if (id == data['data'][i]['entity']['goodsid']) {
                     flaggy = 1;
                 }
             }
             if(flaggy == 1){
                 var b = document.getElementById("judgecarshow");
                 b.style.display = "none";
             }
         }


     }



     function getusergo_idwindow(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
        
         return usergo_id1;
     }


     function getUrlParam(name) {
        var good_id1 = name.match(/goodsid=(\S*)&/)[1];
        //alert(good_id1);
        return good_id1;

    }

     function printgoodsname(data) {
         var goodsname = document.getElementsByClassName("product-name")[0];
         var info = data['data'][0]['entity']['name'];
         goodsname.innerHTML = info;
     }

     function printgoodsprice(data) {
         var goodsprice = document.getElementsByClassName("price-regular")[0];
         var info = data['data'][0]['entity']['price'];
         goodsprice.innerHTML = info;
     }

     function printgoodstag(data) {
         var goodsprice = document.getElementsByClassName("setTag")[0];
         var info = data['data'][0]['entity']['tag'];
         var ans = info.split(",");
         var inner = "<p>标签：</p>";
         for (var i = 0; i < ans.length; i++) {
             inner += "<div class=\"TagClass\">" + ans[i] + "</div>";
         }
         goodsprice.innerHTML = inner;
     }

     function printgoodstype(data) {
         var goodsprice = document.getElementsByClassName("classify")[0];
         var info = data['data'][0]['entity']['type'];
         goodsprice.innerHTML = info;
     }

     function printgoodsdescription(data) {
         var goodsprice = document.getElementsByClassName("tab-one")[0];
         var info = data['data'][0]['entity']['desciption'];
         var inner = "<p style='font-size: large'>" + info + "</p>";
         goodsprice.innerHTML = inner;
     }

     function printpic(data) {
         var goodspic = data['data'][0]['url'];
         if(goodspic) {
             var goodsdiv = document.getElementsByClassName("slick-slide")[0];
             var picdiv = goodsdiv.getElementsByTagName("img")[0];
             picdiv.src = goodspic;
             var picdiv2 = goodsdiv.getElementsByTagName("img")[1];
             picdiv2.src = goodspic;
         }
     }

     function dopush(data) {

         var sameusergo_id = getusergo_id(window.location.href);

         function getusergo_id(name) {
            var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
            if(usergo_id1.length==21){
                usergo_id1=usergo_id1.substr(0,20);
            }    
             return usergo_id1;
         }

         var type = data['data'][0]['entity']['type'];
         var get_url = "http://129.204.216.249:8000/search/type/" + type;
         $.ajax({
             type: "get",
             url: get_url,
             dataType: "json",
             success: function (data) {
                 var haveproducts = 0;
                 for (var i = 0; i < 4 && i < data['data'].length; i++) {
                     var goodspush = document.getElementsByClassName("product-item")[i];

                     var name = data['data'][i]['entity']['name'];
                     var price = data['data'][i]['entity']['price'];
                     var id = data['data'][i]['entity']['goodsid'];
                     url = "product-details.html?goodsid=" + id + "&usergo_id=" + sameusergo_id;

                     if(data['data'][i]['url']){
                         goodspush.getElementsByTagName("img")[0].src = data['data'][i]['url'];
                     }
                     var goodsjump = goodspush.getElementsByTagName("a");
                     goodsjump[0].setAttribute("href", url);
                     goodsjump[goodsjump.length - 1].setAttribute("href", url);
                     goodsjump[goodsjump.length - 1].innerHTML = name;
                     goodsjump = goodspush.getElementsByTagName("span");
                     goodsjump[goodsjump.length - 1].innerHTML = "￥" + price;

                     haveproducts += 1;
                 }

                 if (haveproducts < 4) {
                     var parent = document.getElementsByClassName("slick-track")[1];
                     for (var i = haveproducts; i < 4; i++) {
                         parent.removeChild(parent.children[haveproducts]);
                     }
                 }

             },
             error: function () {
                 alert('加载数据失败')
             }
         });
     }

     function clearbuycargoods() {
         for (var i = 0; i < 5; i++) {
             var buycarclass = document.getElementsByClassName("minicart-item")[i];
             buycarclass.style.display = "none";
         }
     }

 }

 function startbuycar() {
     var usergo_id = getusergo_id(window.location.href);

     var bbb = "http://129.204.216.249:8000/get/car/" + usergo_id + ""
     console.log(bbb);

     $.ajax({
         type: "get",
         url: bbb,
         dataType: "json",
         success: function (data) {
             console.log(data);
             getbuycardata(data);
             getbuycarallprice(data);
         }
     });

     function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }

         console.log(usergo_id1);
         return usergo_id1;
     }

     function getbuycardata(data) {

         testnum = data['data'].length;

         //console.log(data['data'].length);
         for (var i = 0; i < data['data'].length; i++) {
             var buycarnameinfo = document.getElementsByClassName("buycarname")[i];
             var buycarpriceinfo = document.getElementsByClassName("cart-price")[i];
             var buycarclass = document.getElementsByClassName("minicart-item")[i];
             var buycargoodidinfo = document.getElementsByClassName("minicart-remove")[i];

             var buycarpic = document.getElementsByClassName("minicart-thumb")[i].getElementsByTagName("img")[0];
             if(data['data'][i]['url']){
                 buycarpic.src = data['data'][i]['url'];}
             var buycarhref = document.getElementsByClassName("minicart-item")[i].getElementsByTagName("a");

             buycarhref[0].href = "product-details.html?goodsid="+data['data'][i]['entity']['goodsid']+"&usergo_id="+usergo_id;
             buycarhref[1].href = "product-details.html?goodsid="+data['data'][i]['entity']['goodsid']+"&usergo_id="+usergo_id;
             buycarclass.style.display = "flex";
             buycarnameinfo.innerHTML = data['data'][i]['entity']['name'];
             buycarpriceinfo.innerHTML = data['data'][i]['entity']['price'];
             buycargoodidinfo.id = data['data'][i]['entity']['goodsid'];
         }
     }

     function getbuycarallprice(data) {
         var allprice = 0;
         for (var i = 0; i < data['data'].length; i++) {
             allprice = parseFloat(data['data'][i]['entity']['price']) + allprice;
         }
         var allpriceinfo = document.getElementById("allprice");
         allpriceinfo.innerHTML = allprice;
     }
 }

 function removebuycargood(num) {
     var buycardeletegood = document.getElementsByClassName("minicart-remove")[num];
     buycardeletegoodinfo = buycardeletegood.id;

     deletebuycar_url = "http://129.204.216.249:8000/remove/car/" + buycardeletegoodinfo + ""

     $.ajax({
         type: "get",
         dataType: "json",
         url: deletebuycar_url,
         success: function (data) {
             setstyledelete(data);
             console.log(data);
         }
     });

     function setstyledelete(data) {
         var deletebuycargoodstyle = document.getElementsByClassName("minicart-item")[num];
         deletebuycargoodstyle.style.display = "none";
     }

 }

 function buybuycarall() {


     var usergo_id = getusergo_id(window.location.href);

     var bbb = "http://129.204.216.249:8000/buy/car/" + usergo_id;

     var cargoodsid = {
         "data": []
     };

     for (var i = 0; i < testnum; i++) {
         var goodsid111 = document.getElementsByClassName("minicart-remove")[i];
         goodsid111info = goodsid111.id;
         //cargoodsid.push(goodsid111info);
         cargoodsid["data"].push("" + goodsid111info);
         //console.log(goodsid111info);
     }
     $.ajax({
         type: "POST",
         dataType: "json",
         url: bbb,
         data: JSON.stringify(cargoodsid),
         headers: {
             "Content-Type": "application/json"
         },
         success: function () {
             //alert("success");
         },
         error: function () {
             //alert("fail");
         }
     });

     setgoodshide();
     //alert("hello");

     function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
         return usergo_id1;
     }

     function setgoodshide() {
         for (var i = 0; i < testnum; i++) {
             var buycarclass = document.getElementsByClassName("minicart-item")[i];
             buycarclass.style.display = "none";
         }
     }
 }

 function indextoshop() {

     var usergo_id = getusergo_id(window.location.href);
     var usergo_url = "shop.html?usergo_id=" + usergo_id + "";
     window.open(usergo_url);

     function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }

         console.log(usergo_id1);
         return usergo_id1;
     }

 }