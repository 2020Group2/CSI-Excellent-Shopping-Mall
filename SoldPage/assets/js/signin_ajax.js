function signin_go(){
    var accountinfo = document.getElementById("signin_accountid");
    var passwordinfo = document.getElementById("signin_password");
    if((accountinfo.value) == "manager"){
        window.location.replace("manage.html");
    }

    var json_data = {"phone":accountinfo.value,
                    "password":passwordinfo.value,
    }

    var aim_url = "http://129.204.216.249:8000/user/login/"+accountinfo.value+"/"+passwordinfo.value+""
    $.ajax({
        type: "get",
        dataType:"json",
        url:aim_url,
        success: function(data) {
            console.log(data);
            judgesignin(data);
        }
    });

    function judgesignin(data){
        var a = "";
        if(data["user_id"] == a){
            alert("账户或密码错误！");
        }
        else{
                var usergo = data["user_id"];
                var usergo_url = "index.html?usergo_id="+usergo+"";
                
                window.open(usergo_url);
            }
        }
    }
