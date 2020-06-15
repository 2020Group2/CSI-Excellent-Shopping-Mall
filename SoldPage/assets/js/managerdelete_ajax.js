function delete_choose(){

    var deletegoodsid = {"data":[]};

    var bbb = "http://129.204.216.249:8000/delete";


    for(var i = 0; i<12; i++){
        var a = document.getElementsByClassName("Checkdel")[i];
        var b = document.getElementsByClassName("product-nameup")[i];
        if(a.checked == true){
            deletegoodsid["data"].push(""+b.id);
        }
    } 

    $.ajax({
        type:"POST",
        dataType:"json",
        url:bbb,
        data:JSON.stringify(deletegoodsid),
        headers:{"Content-Type": "application/json"},
        success:function(){
            //alert("success");
        },error:function(){
            //alert("fail");
        }
    });
}