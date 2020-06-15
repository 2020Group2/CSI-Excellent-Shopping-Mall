var wholedata;

function getmobilephone() {
    var Type = '二手手机';
    nowType = Type;
    var json_data = {
        "type": Type,
    }

    var aim_url = "http://129.204.216.249:8000/search/type/" + Type + ""
    $.ajax({
        type:"get",
        url: aim_url,
        success: function (data) {
            console.log(data);
            wholedata = data;
            printgoodsname(data);
        },
    });

}

function getbook() {
    var Type = '二手图书';
    nowType = Type;
    var json_data = {
        "type": Type,
    }

    var aim_url = "http://129.204.216.249:8000/search/type/" + Type + ""
    $.ajax({
        type:"get",
        url: aim_url,
        success: function (data) {
            console.log(data);
            wholedata = data;
            printgoodsname(data);
        },
    });

}


function getdigital() {
    var Type = '数码';
    nowType = Type;
    var json_data = {
        "type": Type,
    }

    var aim_url = "http://129.204.216.249:8000/search/type/" + Type + ""
    $.ajax({
        type:"get",
        url: aim_url,
        success: function (data) {
            console.log(data);
            wholedata = data;
            printgoodsname(data);
        },
    });

}

function getclothes() {
    var Type = '服饰鞋包';
    nowType = Type;
    var json_data = {
        "type": Type,
    }

    var aim_url = "http://129.204.216.249:8000/search/type/" + Type + ""
    $.ajax({
        type:"get",
        url: aim_url,
        success: function (data) {
            console.log(data);
            wholedata = data;
            printgoodsname(data);
        },
    });

}

function getcosmetics() {
    var Type = '美妆闲置';
    nowType = Type;
    var json_data = {
        "type": Type,
    }

    var aim_url = "http://129.204.216.249:8000/search/type/" + Type + ""
    $.ajax({
        type:"get",
        url: aim_url,
        success: function (data) {
            console.log(data);
            wholedata = data;
            printgoodsname(data);
        },
    });

}

function getfurniture() {
    var Type = '家居家电';
    nowType = Type;
    var json_data = {
        "type": Type,
    }

    var aim_url = "http://129.204.216.249:8000/search/type/" + Type + ""
    $.ajax({
        type:"get",
        url: aim_url,
        success: function (data) {
            console.log(data);
            wholedata = data;
            printgoodsname(data);
        },
    });

}




function printgoodsname(data) {

    for(var i = 0; i<12; i++){
        var buycarclass = document.getElementsByClassName("product-item")[i];
        buycarclass.style.display = "none";
    }

    for(var i = 0; i<data['data'].length && i<12; i++){
        var buycarclass = document.getElementsByClassName("product-item")[i];
        buycarclass.style.display = "block";
    }

    for (var i = 0; i < data['data'].length && i<12; i++) {
        var goodsname = document.getElementsByClassName("product-nameup")[i];
        var goodsnameinfo = data['data'][i]['entity']['name'];
        goodsname.innerHTML = goodsnameinfo;
    }

    for (var i = 0; i < data['data'].length && i<12; i++) {
        var goodsprice = document.getElementsByClassName("price-regular")[i];
        var goodspriceinfo = data['data'][i]['entity']['price'];
        goodsprice.innerHTML = goodspriceinfo;
    }

    for(var i = 0; i<data['data'].length && i<12;i++) {
        var goodsid = data['data'][i]['entity']['goodsid'];
        var goodsdiv = document.getElementsByClassName("product-nameup")[i];
        goodsdiv.id = goodsid;
    }

    for(var i = 0; i<data['data'].length && i<12;i++) {
        var goodspic = data['data'][i]['url'];
        if(goodspic) {
            var goodsdiv = document.getElementsByClassName("product-thumb")[i];
            var picdiv = goodsdiv.getElementsByTagName("img")[0];
            picdiv.src = goodspic;
        }
    }

 }

function showgoodsname(){
    for (var i = 0; i < 12; i++) {
        var goodsname = document.getElementsByClassName("product-nameup")[i];
        var goodsnameinfo = data['data'][i]['entity']['name'];
        goodsname.innerHTML = goodsnameinfo;
    }
}

function showgoodsprice(){
    for (var i = 0; i < 12; i++) {
        var goodsprice = document.getElementsByClassName("price-regular")[i];
        var goodspriceinfo = data['data'][i]['entity']['price'];
        goodsprice.innerHTML = goodspriceinfo;
    }
}

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
    // console.log(nowType);
    // var ccc = "http://129.204.216.249:8000/search/type/" + nowType + ""
    //  $.ajax({
    //      type: "get",
    //      url: ccc,
    //      dataType: "json",
    //      success: function (data) {
    //          console.log(data);
    //          pagechangeshow(data);
    //      },
    //      error: function () {
    //          alert('加载数据失败')
    //      }
    //  });

    pagechangeshow(wholedata);
    function pagechangeshow(data){

        for(var i =0; i<12; i++){
            var goodsname = document.getElementsByClassName("product-nameup")[i];
            var goodsnameinfo = "";
            goodsname.innerHTML = goodsnameinfo;
        }

        for(var i=0; i<12; i++){
            var goodsprice = document.getElementsByClassName("price-regular")[i];
            var goodspriceinfo = "";
            goodsprice.innerHTML = goodspriceinfo;

        }

        for(var i=0; i<12; i++){
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

            var goodsid = document.getElementsByClassName("product-nameup")[i];
            var goodsidinfo = data['data'][k+i]['entity']['goodsid'];
            goodsid.id = goodsidinfo;

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

                var goodsid = document.getElementsByClassName("product-nameup")[i];
            var goodsidinfo = data['data'][k+i]['entity']['goodsid'];
            goodsid.id = goodsidinfo;

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