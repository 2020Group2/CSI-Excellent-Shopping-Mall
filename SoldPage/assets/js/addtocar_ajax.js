function addtocar(){
    var id = getUrlParam(window.location.href);
    var userid = getusergo_id(window.location.href);
    console.log(userid);

    function getUrlParam(name) {
        var good_id1 = name.match(/goodsid=(\S*)&/)[1];
        //alert(good_id1);
        return good_id1;

    }


    function getusergo_id(name){
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
        return usergo_id1;
    }

    var json_data = {"userid":userid,
                    "goodId":id
    }
    var addtobuycar_url = "http://129.204.216.249:8000/post/car/"+userid+"/"+id+""
    console.log(addtobuycar_url);
    $.ajax({

        dataType:"json",
        url:addtobuycar_url
    });


}