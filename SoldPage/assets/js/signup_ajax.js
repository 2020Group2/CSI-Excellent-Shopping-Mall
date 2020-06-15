function signup_go(){
    var nameinfo = document.getElementById("signup_name");
    var accountinfo  = document.getElementById("signup_userid");
    var passwordinfo = document.getElementById("signup_password");
    var password2info = document.getElementById("signup_password2");
    console.log(nameinfo.value);
    console.log(accountinfo.value);
    console.log(passwordinfo.value);

    if(passwordinfo.value != password2info.value){
        alert("密码不相同！");
        window.location.href = "signup.html";
    }

    var json_data = {"phone":accountinfo.value,
                    "name":nameinfo.value,
                    "password":passwordinfo.value
    }

    var aim_url = "http://129.204.216.249:8000/user/register/"+accountinfo.value+"/"+nameinfo.value+"/"+passwordinfo.value+""
    $.ajax({
        dataType:"text",
        url:aim_url
});
alert("注册成功");
window.location.href = "signin.html";
}