function getselling(){



    //var itemlike = document.getElementsById("product-list-itemlike1");
    //itemlike.style.display = "flex";


    clearallmyinfo();

    var userid=getusergo_id(window.location.href);
    

    function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
            
        }
        //alert(usergo_id1);
        return usergo_id1;
    }

var aim_url = "http://129.204.216.249:8000/Noselllist/"+ userid + ""
$.ajax({
    type:"get",
    url: aim_url,
    success: function (data) {
        //alert(data);
        printinfo(data);
    },
    error: function () {
        alert('加载数据失败')
    }
});


function printinfo(data){

    var t=data['data'].length;

    for(var i = 0;i<t; i++){
        var showitem = document.getElementsByClassName("product-list-item")[i];
       showitem.style.display = "flex";
    }

    for(var i=0;i<t;i++){

    var name = document.getElementsByClassName("goodsname")[i];
    var goodname = data['data'][i]['entity']['name'];
    name.innerHTML = goodname;
    
    var price = document.getElementsByClassName("price-regular")[i];
    var goodsprice = data['data'][i]['entity']['price'];
    price.innerHTML = goodsprice;

    var description = document.getElementsByClassName("goodsdescription")[i];
    var gooddescription = data['data'][i]['entity']['desciption'];
    description.innerHTML = gooddescription;

    var pic = document.getElementsByClassName("product-thumb")[i];
    var goodspic = data['data'][i]['url'];
    if(data['data'][i]['url']){
    pic.getElementsByTagName("img")[0].src = goodspic;
    }
    }
    var id1 = document.getElementById("sellinggoodsid1");
    var goodsid1 = data['data'][0]['entity']['goodsid'];
    id1.innerHTML = goodsid1;

    var id2 = document.getElementById("sellinggoodsid2");
    var goodsid2 = data['data'][1]['entity']['goodsid'];
    id2.innerHTML = goodsid2;

    var id3 = document.getElementById("sellinggoodsid3");
    var goodsid3 = data['data'][2]['entity']['goodsid'];
    id3.innerHTML = goodsid3;

    var id4 = document.getElementById("sellinggoodsid4");
    var goodsid4 = data['data'][3]['entity']['goodsid'];
    id4.innerHTML = goodsid4;

    var id5 = document.getElementById("sellinggoodsid5");
    var goodsid5 = data['data'][4]['entity']['goodsid'];
    id5.innerHTML = goodsid5;

    var id6 = document.getElementById("sellinggoodsid6");
    var goodsid6 = data['data'][5]['entity']['goodsid'];
    id6.innerHTML = goodsid6;

    var id7 = document.getElementById("sellinggoodsid7");
    var goodsid7 = data['data'][6]['entity']['goodsid'];
    id7.innerHTML = goodsid7;

    var id8 = document.getElementById("sellinggoodsid8");
    var goodsid8 = data['data'][7]['entity']['goodsid'];
    id8.innerHTML = goodsid8;

}



}

