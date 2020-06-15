window.onload=function() {
    var oDetail = document.getElementById('myinfoDetail');
    
    var oitem1 = document.getElementById('product-list-item1');
    var oitem2 = document.getElementById('product-list-item2');
    var oitem3 = document.getElementById('product-list-item3');
    var oitem4 = document.getElementById('product-list-item4');
    var oitem5 = document.getElementById('product-list-item5');
    var oitem6 = document.getElementById('product-list-item6');
    var oitem7 = document.getElementById('product-list-item7');
    var oitem8 = document.getElementById('product-list-item8');

    var osold1 = document.getElementById('product-list-itemsold1');
    var osold2 = document.getElementById('product-list-itemsold2');
    var osold3 = document.getElementById('product-list-itemsold3');
    var osold4 = document.getElementById('product-list-itemsold4');
    var osold5 = document.getElementById('product-list-itemsold5');
    var osold6 = document.getElementById('product-list-itemsold6');
    var osold7 = document.getElementById('product-list-itemsold7');
    var osold8 = document.getElementById('product-list-itemsold8');

    var osell1 = document.getElementById('product-list-itemsell1');
    var osell2 = document.getElementById('product-list-itemsell2');
    var osell3 = document.getElementById('product-list-itemsell3');
    var osell4 = document.getElementById('product-list-itemsell4');
    var osell5 = document.getElementById('product-list-itemsell5');
    var osell6 = document.getElementById('product-list-itemsell6');
    var osell7 = document.getElementById('product-list-itemsell7');
    var osell8 = document.getElementById('product-list-itemsell8');

    var olike1 = document.getElementById('product-list-itemlike1');
    var olike2 = document.getElementById('product-list-itemlike2');
    var olike3 = document.getElementById('product-list-itemlike3');
    var olike4 = document.getElementById('product-list-itemlike4');
    var olike5 = document.getElementById('product-list-itemlike5');
    var olike6 = document.getElementById('product-list-itemlike6');
    var olike7 = document.getElementById('product-list-itemlike7');
    var olike8 = document.getElementById('product-list-itemlike8');

    var oUpdate = document.getElementById('myinfoUpdate');

    var oPage = document.getElementById('pagination-box');

    var oLi1 = document.getElementById('li1');
    var oLi2 = document.getElementById('li2');
    var oLi3 = document.getElementById('li3');
    var oLi4 = document.getElementById('li4');
    var oLi5 = document.getElementById('li5');
    var oLi6 = document.getElementById('li6');

    oLi1.onclick=function (){
        oLi1.style.color = "red";
        oLi2.style.color = "black";
        oLi3.style.color = "black";
        oLi4.style.color = "black";
        oLi5.style.color = "black";
        oLi6.style.color = "black";

        oDetail.style.display = "flex";

        oitem1.style.display = "none";
        oitem2.style.display = "none";
        oitem3.style.display = "none";
        oitem4.style.display = "none";
        oitem5.style.display = "none";
        oitem6.style.display = "none";
        oitem7.style.display = "none";
        oitem8.style.display = "none";

        osold1.style.display = "none";
        osold2.style.display = "none";
        osold3.style.display = "none";
        osold4.style.display = "none";
        osold5.style.display = "none";
        osold6.style.display = "none";
        osold7.style.display = "none";
        osold8.style.display = "none";

        osell1.style.display = "none";
        osell2.style.display = "none";
        osell3.style.display = "none";
        osell4.style.display = "none";
        osell5.style.display = "none";
        osell6.style.display = "none";
        osell7.style.display = "none";
        osell8.style.display = "none";

        olike1.style.display = "none";
        olike2.style.display = "none";
        olike3.style.display = "none";
        olike4.style.display = "none";
        olike5.style.display = "none";
        olike6.style.display = "none";
        olike7.style.display = "none";
        olike8.style.display = "none";

        oUpdate.style.display = "none";

        oPage.style.display = "none";


    }

    oLi2.onclick=function (){
        oLi2.style.color = "red";
        oLi1.style.color = "black";
        oLi3.style.color = "black";
        oLi4.style.color = "black";
        oLi5.style.color = "black";
        oLi6.style.color = "black";

        oDetail.style.display = "none";

        oitem1.style.display = "flex";
        oitem2.style.display = "flex";
        oitem3.style.display = "flex";
        oitem4.style.display = "flex";
        oitem5.style.display = "flex";
        oitem6.style.display = "flex";
        oitem7.style.display = "flex";
        oitem8.style.display = "flex";

        osold1.style.display = "none";
        osold2.style.display = "none";
        osold3.style.display = "none";
        osold4.style.display = "none";
        osold5.style.display = "none";
        osold6.style.display = "none";
        osold7.style.display = "none";
        osold8.style.display = "none";

        osell1.style.display = "none";
        osell2.style.display = "none";
        osell3.style.display = "none";
        osell4.style.display = "none";
        osell5.style.display = "none";
        osell6.style.display = "none";
        osell7.style.display = "none";
        osell8.style.display = "none";

        olike1.style.display = "none";
        olike2.style.display = "none";
        olike3.style.display = "none";
        olike4.style.display = "none";
        olike5.style.display = "none";
        olike6.style.display = "none";
        olike7.style.display = "none";
        olike8.style.display = "none";

        oUpdate.style.display = "none";

        oPage.style.display = "inline-block";
    }

    oLi3.onclick=function (){
        oLi3.style.color = "red";
        oLi1.style.color = "black";
        oLi2.style.color = "black";
        oLi4.style.color = "black";
        oLi5.style.color = "black";
        oLi6.style.color = "black";

        oDetail.style.display = "none";

        oitem1.style.display = "none";
        oitem2.style.display = "none";
        oitem3.style.display = "none";
        oitem4.style.display = "none";
        oitem5.style.display = "none";
        oitem6.style.display = "none";
        oitem7.style.display = "none";
        oitem8.style.display = "none";

        osold1.style.display = "flex";
        osold2.style.display = "flex";
        osold3.style.display = "flex";
        osold4.style.display = "flex";
        osold5.style.display = "flex";
        osold6.style.display = "flex";
        osold7.style.display = "flex";
        osold8.style.display = "flex";

        osell1.style.display = "none";
        osell2.style.display = "none";
        osell3.style.display = "none";
        osell4.style.display = "none";
        osell5.style.display = "none";
        osell6.style.display = "none";
        osell7.style.display = "none";
        osell8.style.display = "none";

        olike1.style.display = "none";
        olike2.style.display = "none";
        olike3.style.display = "none";
        olike4.style.display = "none";
        olike5.style.display = "none";
        olike6.style.display = "none";
        olike7.style.display = "none";
        olike8.style.display = "none";

        oUpdate.style.display = "none";

        oPage.style.display = "flex";
    }

    oLi4.onclick=function (){
        oLi4.style.color = "red";
        oLi1.style.color = "black";
        oLi2.style.color = "black";
        oLi3.style.color = "black";
        oLi5.style.color = "black";
        oLi6.style.color = "black";

        oDetail.style.display = "none";

        oitem1.style.display = "none";
        oitem2.style.display = "none";
        oitem3.style.display = "none";
        oitem4.style.display = "none";
        oitem5.style.display = "none";
        oitem6.style.display = "none";
        oitem7.style.display = "none";
        oitem8.style.display = "none";

        osold1.style.display = "none";
        osold2.style.display = "none";
        osold3.style.display = "none";
        osold4.style.display = "none";
        osold5.style.display = "none";
        osold6.style.display = "none";
        osold7.style.display = "none";
        osold8.style.display = "none";

        osell1.style.display = "flex";
        osell2.style.display = "flex";
        osell3.style.display = "flex";
        osell4.style.display = "flex";
        osell5.style.display = "flex";
        osell6.style.display = "flex";
        osell7.style.display = "flex";
        osell8.style.display = "flex";

        olike1.style.display = "none";
        olike2.style.display = "none";
        olike3.style.display = "none";
        olike4.style.display = "none";
        olike5.style.display = "none";
        olike6.style.display = "none";
        olike7.style.display = "none";
        olike8.style.display = "none";

        oUpdate.style.display = "none";

        oPage.style.display = "flex";
    }

    oLi5.onclick=function (){
        oLi5.style.color = "red";
        oLi1.style.color = "black";
        oLi2.style.color = "black";
        oLi3.style.color = "black";
        oLi4.style.color = "black";
        oLi6.style.color = "black";

        oDetail.style.display = "none";

        oitem1.style.display = "none";
        oitem2.style.display = "none";
        oitem3.style.display = "none";
        oitem4.style.display = "none";
        oitem5.style.display = "none";
        oitem6.style.display = "none";
        oitem7.style.display = "none";
        oitem8.style.display = "none";

        osold1.style.display = "none";
        osold2.style.display = "none";
        osold3.style.display = "none";
        osold4.style.display = "none";
        osold5.style.display = "none";
        osold6.style.display = "none";
        osold7.style.display = "none";
        osold8.style.display = "none";

        osell1.style.display = "none";
        osell2.style.display = "none";
        osell3.style.display = "none";
        osell4.style.display = "none";
        osell5.style.display = "none";
        osell6.style.display = "none";
        osell7.style.display = "none";
        osell8.style.display = "none";

        olike1.style.display = "none";
        olike2.style.display = "none";
        olike3.style.display = "none";
        olike4.style.display = "none";
        olike5.style.display = "none";
        olike6.style.display = "none";
        olike7.style.display = "none";
        olike8.style.display = "none";

        oUpdate.style.display = "flex";

        oPage.style.display = "none";
    }

    oLi6.onclick=function (){
        oLi5.style.color = "black";
        oLi1.style.color = "black";
        oLi2.style.color = "black";
        oLi3.style.color = "black";
        oLi4.style.color = "black";
        oLi6.style.color = "red";

        oDetail.style.display = "none";

        oitem1.style.display = "none";
        oitem2.style.display = "none";
        oitem3.style.display = "none";
        oitem4.style.display = "none";
        oitem5.style.display = "none";
        oitem6.style.display = "none";
        oitem7.style.display = "none";
        oitem8.style.display = "none";

        osold1.style.display = "none";
        osold2.style.display = "none";
        osold3.style.display = "none";
        osold4.style.display = "none";
        osold5.style.display = "none";
        osold6.style.display = "none";
        osold7.style.display = "none";
        osold8.style.display = "none";

        osell1.style.display = "none";
        osell2.style.display = "none";
        osell3.style.display = "none";
        osell4.style.display = "none";
        osell5.style.display = "none";
        osell6.style.display = "none";
        osell7.style.display = "none";
        osell8.style.display = "none";

        olike1.style.display = "flex";
        olike2.style.display = "flex";
        olike3.style.display = "flex";
        olike4.style.display = "flex";
        olike5.style.display = "flex";
        olike6.style.display = "flex";
        olike7.style.display = "flex";
        olike8.style.display = "flex";

        oUpdate.style.display = "none";

        oPage.style.display = "none";
    }

}