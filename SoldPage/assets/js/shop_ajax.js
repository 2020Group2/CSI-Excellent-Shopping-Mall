 window.onload = function () {

    clearallshowgoods();


     var aaa = "http://129.204.216.249:8000/sort"
     $.ajax({
         type: "get",
         url: aaa,
         dataType: "json",
         success: function (data) {
             console.log(data);
             printgoodsname(data);
         },
         error: function () {
             alert('加载数据失败')
         }
     });

     clearbuycargoods();



     //function updateallgoods(data){



     //}


     function printgoodsname(data) {

        for(var i = 0; i<12; i++){
            var buycarclass = document.getElementsByClassName("product-item")[i];
            buycarclass.style.display = "block";
        }


            for (var i = 0; i <  12; i++) {
                var goodsname = document.getElementsByClassName("product-nameup")[i];
                var goodsnameinfo = data['data'][i]['entity']['name'];
                goodsname.innerHTML = goodsnameinfo;
            }

            for (var i = 0; i < 12; i++) {
                var goodsprice = document.getElementsByClassName("price-regular")[i];
                
                var goodspriceinfo = data['data'][i]['entity']['price'];
                goodsprice.innerHTML = goodspriceinfo;
            }

            for(var i = 0; i<12;i++) {
                var goodsid = data['data'][i]['entity']['goodsid'];
                var goodsdiv = document.getElementsByClassName("product-nameup")[i];
                goodsdiv.id = goodsid;
            }

            for(var i = 0; i<12;i++) {
                var goodspic = data['data'][i]['url'];
                if(goodspic) {
                    var goodsdiv = document.getElementsByClassName("product-thumb")[i];
                    var picdiv = goodsdiv.getElementsByTagName("img")[0];
                    picdiv.src = goodspic;
                }
            }

     }

     function clearbuycargoods(){
        for(var i = 0; i<5; i++){
            var buycarclass = document.getElementsByClassName("minicart-item")[i];
            buycarclass.style.display = "none";
        }
    }

    function clearallshowgoods(){
        for(var i = 0; i<12; i++){
            var buycarclass = document.getElementsByClassName("product-item")[i];
            buycarclass.style.display = "none";
        }
    }
     

}

//function showgoodsname(){
  //  for (var i = 0; i < 12; i++) {
 //       var goodsname = document.getElementsByClassName("product-nameup")[i];
 //       var goodsnameinfo = data['data'][i]['entity']['name'];
  //      goodsname.innerHTML = goodsnameinfo;
  //  }
//}

//function showgoodsprice(){
  //  for (var i = 0; i < 12; i++) {
  //      var goodsprice = document.getElementsByClassName("price-regular")[i];
     //   var goodspriceinfo = data['data'][i]['entity']['price'];
        //goodsprice.innerHTML = goodspriceinfo;
   // }
//}

function pageinfoup(){
    var pagenum = document.getElementById("showpagenum");
    var flag = 0;
    for(var i = 0; i<12; i++){
        var goodsprice = document.getElementsByClassName("price-regular")[i];
        if(goodsprice.innerHTML ==""){
            flag = 1;
        }
    }
    if(flag == 0){
        var up = parseInt(pagenum.innerHTML) + 1;
        pagenum.innerHTML = up;
        pagechange(1);
    }
    
}

function pageinfodown(){
    var pagenum = document.getElementById("showpagenum");
    if(parseInt(pagenum.innerHTML) == 1){
        pagenum.innerHTML = 1;
    }
    else{
        var down = parseInt(pagenum.innerHTML) - 1;
        pagenum.innerHTML = down;
        pagechange(0);
    }
    
}

function pagechange(flag){
    var ccc = "http://129.204.216.249:8000/sort"
     $.ajax({
         type: "get",
         url: ccc,
         dataType: "json",
         success: function (data) {
             console.log(data);
             pagechangeshow(data);
         },
         error: function () {
             alert('加载数据失败')
         }
     });

    function pagechangeshow(data){

        for(var i =0; i<data['data'].length && i<12; i++){
            var goodsname = document.getElementsByClassName("product-nameup")[i];
            var goodsnameinfo = "";
            goodsname.innerHTML = goodsnameinfo;
        }

        for(var i=0;i<data['data'].length && i<12; i++){
            var goodsprice = document.getElementsByClassName("price-regular")[i];
            var goodspriceinfo = "";
            goodsprice.innerHTML = goodspriceinfo;

        }

        for(var i=0; i<data['data'].length && i<12; i++){
            var showblock = document.getElementsByClassName("product-item")[i];
            showblock.style.display = "none";
        }

        if(flag == 1){
            
            uppage();
        }
        else{
            downpage();
        }

        

        function uppage(){
            var j = document.getElementById("showpagenum");
            var k = (parseInt(j.innerHTML)-1)*12;
            for (var i = 0;  i < 12 && i<data['data'].length-k; i++) {
            var showblock = document.getElementsByClassName("product-item")[i];
            showblock.style.display = "block";
            var goodsname = document.getElementsByClassName("product-nameup")[i];
            var goodsnameinfo = data['data'][k+i]['entity']['name'];
            goodsname.innerHTML = goodsnameinfo;

            var goodsprice = document.getElementsByClassName("price-regular")[i];
            var goodspriceinfo = data['data'][k+i]['entity']['price'];
            goodsprice.innerHTML = goodspriceinfo;

            var goodspic = data['data'][k+i]['url'];
            var goodsdiv = document.getElementsByClassName("product-thumb")[i];
            var picdiv = goodsdiv.getElementsByTagName("img")[0];
            picdiv.src = goodspic;

        }
    }
         function downpage(){
            var j = document.getElementById("showpagenum");
            var k = (parseInt(j.innerHTML)-1)*12;
            for (var i = 0; i < 12; i++) {
                var showblock = document.getElementsByClassName("product-item")[i];
                showblock.style.display = "block";
                var goodsname = document.getElementsByClassName("product-nameup")[i];
                var goodsnameinfo = data['data'][k+i]['entity']['name'];
                goodsname.innerHTML = goodsnameinfo;
    
                var goodsprice = document.getElementsByClassName("price-regular")[i];
                var goodspriceinfo = data['data'][k+i]['entity']['price'];
                goodsprice.innerHTML = goodspriceinfo;

                var goodspic = data['data'][k+i]['url'];
                var goodsdiv = document.getElementsByClassName("product-thumb")[i];
                var picdiv = goodsdiv.getElementsByTagName("img")[0];
                picdiv.src = goodspic;
         }
        
    }
      
}

}

function sale_in(){
    window.location.href = "sale.html";
}

function startbuycar(){
    var usergo_id = getusergo_id(window.location.href);

    var bbb = "http://129.204.216.249:8000/get/car/" + usergo_id +""
    console.log(bbb);

    $.ajax({
        type:"get",
        url:bbb,
        dataType:"json",
        success:function(data){
            console.log(data);
            getbuycardata(data);
            getbuycarallprice(data);
        }
    });

    function getusergo_id(name){
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
        return usergo_id1;
    }

    function getbuycardata(data){

        testnum = data['data'].length;
        
        //console.log(data['data'].length);
        for(var i = 0; i<data['data'].length; i++){
            var buycarnameinfo = document.getElementsByClassName("buycarname")[i];
            var buycarpriceinfo = document.getElementsByClassName("cart-price")[i];
            var buycarclass = document.getElementsByClassName("minicart-item")[i];
            var buycargoodidinfo = document.getElementsByClassName("minicart-remove")[i];
            var buycarpic = document.getElementsByClassName("minicart-thumb")[i].getElementsByTagName("img")[0];
            var buycarhref = document.getElementsByClassName("minicart-item")[i].getElementsByTagName("a");
            if(data['data'][i]['url']){
            buycarpic.src = data['data'][i]['url'];}
            buycarhref[0].href = "product-details.html?goodsid="+data['data'][i]['entity']['goodsid']+"&usergo_id="+usergo_id;
            buycarhref[1].href = "product-details.html?goodsid="+data['data'][i]['entity']['goodsid']+"&usergo_id="+usergo_id;
            buycarclass.style.display = "flex";
            buycarnameinfo.innerHTML = data['data'][i]['entity']['name'];
            buycarpriceinfo.innerHTML = data['data'][i]['entity']['price'];
            buycargoodidinfo.id = data['data'][i]['entity']['goodsid'];
        }
    }

    function getbuycarallprice(data){
        var allprice = 0;
        for(var i = 0; i<data['data'].length; i++){
            allprice = parseFloat(data['data'][i]['entity']['price']) + allprice;
        }
        var allpriceinfo = document.getElementById("allprice");
            allpriceinfo.innerHTML = allprice;
    }
}

function removebuycargood(num){
    var buycardeletegood = document.getElementsByClassName("minicart-remove")[num];
    buycardeletegoodinfo = buycardeletegood.id;

    deletebuycar_url = "http://129.204.216.249:8000/remove/car/"+buycardeletegoodinfo+""

    $.ajax({
        type:"get",
        dataType:"json",
        url:deletebuycar_url,
        success:function(data){
            setstyledelete(data);
            console.log(data);
        }
    });
    
    function setstyledelete(data){
        var deletebuycargoodstyle = document.getElementsByClassName("minicart-item")[num];
        deletebuycargoodstyle.style.display = "none";
    }

}

function buybuycarall(){

    
    var usergo_id = getusergo_id(window.location.href);

    var bbb = "http://129.204.216.249:8000/buy/car/" + usergo_id;

    var cargoodsid = {"data":[]};

    for(var i = 0; i<testnum;i++){
        var goodsid111 = document.getElementsByClassName("minicart-remove")[i];
        goodsid111info = goodsid111.id;
        //cargoodsid.push(goodsid111info);
        cargoodsid["data"].push(""+goodsid111info);
        //console.log(goodsid111info);
    }
    $.ajax({
        type:"POST",
        dataType:"json",
        url:bbb,
        data:JSON.stringify(cargoodsid),
        headers:{"Content-Type": "application/json"},
        success:function(){
            //alert("success");
        },error:function(){
            //alert("fail");
        }
    });

    setgoodshide();
    //alert("hello");

    function getusergo_id(name){
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
        return usergo_id1;
    }

    function setgoodshide(){
        for(var i = 0; i<testnum; i++){
            var buycarclass = document.getElementsByClassName("minicart-item")[i];
            buycarclass.style.display = "none";
        }
    }
}

function shoptosale(){

    var usergo_id = getusergo_id(window.location.href);
    var usergo_url = "sale.html?usergo_id="+usergo_id+"";
    window.open(usergo_url);
    function getusergo_id(name){
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }


        return usergo_id1;
    }

}

