/*发布商品*/
function uploadgood(){
    var nameinfo = document.getElementById("good_name");
    var kindinfo = document.getElementById("good_kind");
    var taginfo1 = document.getElementById("tag1");
    var taginfo2 = document.getElementById("tag2");
    var taginfo3 = document.getElementById("tag3");
    var quantityinfo = document.getElementById("good_quantity");
    var desinfo = document.getElementById("good_des");
    var userid = getusergo_id(window.location.href);
    function getusergo_id(name){
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
        return usergo_id1;
    }
    //alert(userid);

    var tag = taginfo1.value+","+taginfo2.value+","+taginfo3.value;

    
    //url:"http://129.204.216.249:8000/swagger-ui.html#!?name="+str(nameinfo.Value); //+"&id="+id+"&sid="+sid

    var aim_url = "http://129.204.216.249:8000/post/"+nameinfo.value+"/"+tag+"/"+kindinfo.value+"/"+quantityinfo.value+"/"+desinfo.value+"/"+userid+""
    //alert(aim_url);
    $.ajax({
        dataType:"json",
        url:aim_url,
        success: function (goodsid) {
            console.log(document.getElementsByClassName("upload-ul")[0].getElementsByTagName('img')[0]);
            if(document.getElementsByClassName("upload-ul")[0].getElementsByTagName('img')[0]){
                console.log(goodsid);
                uppic(goodsid["goodId"]);
            }
        }
    });


    function uppic(id) {
        var picul = document.getElementsByClassName("upload-ul")[0];
        var image = picul.getElementsByTagName('img')[0];
        let data = new FormData();
        data.append('file', dataURLtoFile(image.src,""+id+".png"));
        console.log(id);
        $.ajax({
            url: "http://129.204.216.249:8000/upload/"+id,
            type: 'post',
            data: data,
            processData: false,
            contentType: false,
            success: function (msg) {
                if(msg){
                    finish();
                }
            }
        })
    }

    function dataURLtoFile(dataurl, filename) {//将base64转换为文件
        var arr = dataurl.split(','), mime = arr[0].match(/:(.*?);/)[1],
            bstr = atob(arr[1]), n = bstr.length, u8arr = new Uint8Array(n);
        while(n--){
            u8arr[n] = bstr.charCodeAt(n);
        }
        return new File([u8arr], filename, {type:mime});
    }

    function finish(){
        window.location.href = "shop.html?usergo_id="+userid+"";
    }

    
}


    function judgepicnum(){
        var num = document.getElementsByClassName("viewThumb").length;
        var judge = document.getElementById("goodsupload");
        if(num>0){
            judge.style.display = "none";
        }
    }
