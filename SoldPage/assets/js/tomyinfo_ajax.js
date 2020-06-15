function indextomyinfo(){
    var bbb = getusergo_id(window.location.href);
    
    function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }

        return usergo_id1;
    }
    var ccc = "myinfo.html?usergo_id="+ bbb +"";
    window.open(ccc);
}

function shoptomyinfo(){
    var bbb = getusergo_id(window.location.href);
    
    function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
        return usergo_id1;
    }
    var ccc = "myinfo.html?usergo_id="+ bbb +"";
    window.open(ccc);
}

function producttomyinfo(){
    var bbb = getusergo_id(window.location.href);
    
    function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }


        return usergo_id1;
    }
    var ccc = "myinfo.html?usergo_id="+ bbb +"";
    window.open(ccc);
}

function saletomyinfo(){
    var bbb = getusergo_id(window.location.href);
    
    function getusergo_id(name) {
        var usergo_id1 = name.match(/usergo_id=(\S*)/)[1];
        if(usergo_id1.length==21){
            usergo_id1=usergo_id1.substr(0,20);
        }
        return usergo_id1;
    }
    var ccc = "myinfo.html?usergo_id="+ bbb +"";
    window.open(ccc);
}

