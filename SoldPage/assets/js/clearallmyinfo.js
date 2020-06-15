function clearallmyinfo(){

    var oDetail = document.getElementById('myinfoDetail');
    oDetail.style.display = "none";

    for(var i = 0; i<8; i++){
        var hideitem = document.getElementsByClassName("product-list-item")[i];
        hideitem.style.display = "none";
    }

    for(var i = 0; i<8; i++){
        var hideitem = document.getElementsByClassName("product-list-itemsold")[i];
        hideitem.style.display = "none";
    }

    for(var i = 0; i<8; i++){
        var hideitem = document.getElementsByClassName("product-list-itemsell")[i];
        hideitem.style.display = "none";
    }

    for(var i = 0; i<8; i++){
        var hideitem = document.getElementsByClassName("product-list-itemlike")[i];
        hideitem.style.display = "none";
    }

    var oUpdate = document.getElementById('myinfoUpdate');

    var oPage = document.getElementById('pagination-box');
    oUpdate.style.display = "none";

    oPage.style.display = "none";
}