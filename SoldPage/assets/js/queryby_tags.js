var wholedata;

function gettagsquery() {
    var arr=new Array(6);
    arr[0]=document.getElementById("customCheck1");
    arr[1]=document.getElementById("customCheck2");
    arr[2]=document.getElementById("customCheck3");
    arr[3]=document.getElementById("customCheck4");
    arr[4]=document.getElementById("customCheck5");
    arr[5]=document.getElementById("customCheck6");

    var tags="";
    var num=0;
    for(i=0;i<arr.length;i++){
        if(arr[i].checked){
        var a = arr[i].value;
        tags=tags+","+a;
        num++;
        }
    }
    var tags = tags.substr(1,tags.length);
    if(num!=3) {alert("请选择三个标签");}
    else{
        var json_data = {"tag":tags,

        }


        var aim_url = "http://129.204.216.249:8000/search/tag/" + tags + ""
        $.ajax({
            type:"get",
            url: aim_url,
            success: function (data) {
                //alert(data);
                wholedata = data;
                printgoodsname(data);
            },
            error: function () {
                alert('加载数据失败')
            }
        });

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

            for(var i = 0; i<data['data'].length && i<12 ;i++) {
                var goodspic = data['data'][i]['url'];
                if(goodspic) {
                    var goodsdiv = document.getElementsByClassName("product-thumb")[i];
                    var picdiv = goodsdiv.getElementsByTagName("img")[0];
                    picdiv.src = goodspic;
                }
            }

        }
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
    // var ccc = "http://129.204.216.249:8000/sort"
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
            for (var i = 0; i < 12 && i<data['data'].length-k; i++) {
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