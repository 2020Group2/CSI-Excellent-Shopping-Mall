function myinfotoindex(){
    var userid=getusergo_id(window.location.href);
    

    function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
        //alert(usergo_id1);
        return usergo_id1;
    }

    var usergo_url = "index.html?usergo_id="+userid;
                
    window.open(usergo_url);
}

function shoptoindex(){
    var userid=getusergo_id(window.location.href);
    

    function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
       
        return usergo_id1;
    }

    var usergo_url = "index.html?usergo_id="+userid;
                
    window.open(usergo_url);
}

function producttoindex(){
    var userid=getusergo_id(window.location.href);
    

    function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
       
        return usergo_id1;
    }

    var usergo_url = "index.html?usergo_id="+userid;
                
    window.open(usergo_url);
}