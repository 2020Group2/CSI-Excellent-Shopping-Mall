function getInfo(){

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

    var aim_url = "http://129.204.216.249:8000/findinformation/" + userid + ""
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
}

function printinfo(data){

    var oDetail = document.getElementById('myinfoDetail');
    oDetail.style.display = "flex"; 
    
    
        var name = document.getElementById("username");
        var username = data['data']['name'];
        name.innerHTML = username;

        var userid = document.getElementById("userid");
        var phone = data['data']['phone'];
        userid.innerHTML = phone;

        var Password = document.getElementById("password");
        var password = data['data']['password'];
        Password.innerHTML = password;
    
        for(var i=7,j=0;i<30;i=i+8,j++){
            var pro=document.getElementsByClassName("hengxiang")[i];
            var p=data['data']['adress'][j]['province'];
            pro.innerHTML=p;
            var city=document.getElementsByClassName("hengxiang")[i+2];
            var c=data['data']['adress'][j]['city'];
            city.innerHTML=c;
            var det=document.getElementsByClassName("hengxiang")[i+4];
            var d=data['data']['adress'][j]['detail'];
            det.innerHTML=d;
            var pho=document.getElementsByClassName("hengxiang")[i+6];
            var ph=data['data']['adress'][j]['phone'];
            pho.innerHTML=ph;

        }
        

}


