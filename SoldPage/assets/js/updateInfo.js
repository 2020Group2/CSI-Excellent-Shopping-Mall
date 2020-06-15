function updateInfo(){

    


    var userid=getusergo_id(window.location.href);
    

    function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }



        return usergo_id1;
    }
    
    var ccc = "http://129.204.216.249:8000/information/"+userid;

    
    var username=document.getElementById("updatename").value;
    var password=document.getElementById("updatepassword").value;
    var updateinfo = {"name":username,"password":password,"address":[]};
    
    for(var i = 0; i<3;i++){
        var province = document.getElementsByClassName("updateprovince")[i].value;
        var city = document.getElementsByClassName("updatecity")[i].value;
        var detail = document.getElementsByClassName("updatedetail")[i].value;
        var updatephone=document.getElementsByClassName("updatephone")[i].value;
        var add={"province":province,"city":city,"detail":detail,"phone":updatephone,"index":i+1};

        //goodsid111info = province.value;
        
        //cargoodsid.push(goodsid111info);
        updateinfo["address"].push(add);
        //console.log(goodsid111info);
        
    }
    //alert(JSON.stringify(updateinfo));
    //updateinfo["address"].push(null);
    $.ajax({
        type:"POST",
        dataType:"json",
        url:ccc,
        data:JSON.stringify(updateinfo),
        headers:{"Content-Type": "application/json"},

        success:function(){
            location.reload();  
        },error:function(){
            alert("fail");
        }
    });


    //alert("hello");
    //

}

function updateshow(){
    clearallmyinfo();
    var oUpdate = document.getElementById('myinfoUpdate');


    oUpdate.style.display = "flex";
}