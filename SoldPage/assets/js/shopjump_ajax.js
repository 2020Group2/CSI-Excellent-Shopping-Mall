function getgoodsid_num(i){
    var bbb = "http://129.204.216.249:8000/information/"
    var goodsdiv = document.getElementsByClassName("product-nameup")[i];
    var aim_url = bbb + goodsdiv.id;
    console.log(goodsdiv.id);
    var usergo_id = getusergo_id(window.location.href);
    function getusergo_id(name){
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }

        return usergo_id1;
    }

    jump_url = "product-details.html?goodsid="+goodsdiv.id+"&usergo_id="+usergo_id+"";
    window.open(jump_url);
}