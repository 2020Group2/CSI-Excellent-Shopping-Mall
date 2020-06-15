function getbought(){



    //var itemlike = document.getElementsById("product-list-itemlike1");
    //itemlike.style.display = "flex";

    clearallmyinfo();

    var userid=getusergo_id(window.location.href);
    

    function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,19);
        }
        //alert(usergo_id1);
        return usergo_id1;
    }

var aim_url = "http://129.204.216.249:8000/buylist/"+ userid + ""
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
        var showitem = document.getElementsByClassName("product-list-itemsell")[i];
       showitem.style.display = "flex";
    }
    /*for(var i = 0; i<t; i++){
        var itemlike = document.getElementsByClassName("product-list-itemlike")[i];
        itemlike.style.display = "flex";
    }*/

    //var itemlike = document.getElementsById("product-list-itemlike1");
    //itemlike.style.display = "flex";

    for(var i=8,j=16,k=0;i<8+t;i++,j++,k++){

    var name = document.getElementsByClassName("productname")[i];
    var goodname = data['data'][k]['entity']['name'];
    name.innerHTML = goodname;
    
    var price = document.getElementsByClassName("price-regular")[j];
    var goodsprice = data['data'][k]['entity']['price'];
    price.innerHTML = goodsprice;

    var description = document.getElementsByClassName("goodsdescription")[j];
    var gooddescription = data['data'][k]['entity']['desciption'];
    description.innerHTML = gooddescription;

        var pic = document.getElementsByClassName("product-thumb")[j];
        var goodspic = data['data'][k]['url'];
        if(data['data'][k]['url']){
            pic.getElementsByTagName("img")[0].src = goodspic;
            }
    }


}



}