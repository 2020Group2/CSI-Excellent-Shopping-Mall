function searchbyname(){
    var usergo_id = getusergo_id(window.location.href);

    function getusergo_id(name){
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
        
        return usergo_id1;
    }

    var goodname = document.getElementById("searchbyname");
    var searchgood_url = "http://129.204.216.249:8000/search/name/" + goodname.value +"";

    $.ajax({
        type:"get",
        dataType:"json",
        url:searchgood_url,
        success:function (data) {
            if(data['data'].length!=0)
                getseachgoodid(data);
            else alert('未找到符合条件的商品')
        },error:function (){alert('未找到符合条件的商品')}
    });

    function getseachgoodid(data){
        var goodid = data['data'][0]['entity']['goodsid'];

        var good_detail_url = "product-details.html?goodsid="+ goodid + "&usergo_id="+ usergo_id +"";

        window.open(good_detail_url);
    }


    
}

function searchbyname2(){
    var usergo_id = getusergo_id(window.location.href);

    function getusergo_id(name){
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
        return usergo_id1;
    }

    var goodname = document.getElementById("searchbyname");
    var searchgood_url = "http://129.204.216.249:8000/search/name/" + goodname.value +"";

    $.ajax({
        type:"get",
        dataType:"json",
        url:searchgood_url,
        success:function (data) {
            if(data['data'].length!=0)
                getseachgoodid(data);
            else alert('未找到符合条件的商品')
        },error:function (){alert('未找到符合条件的商品')}
    });

    function getseachgoodid(data){
        var goodid = data['data'][0]['entity']['goodsid'];

        var good_detail_url = "product-details.html?goodsid="+ goodid + "&usergo_id="+ usergo_id +"";

        window.open(good_detail_url);
    }

}