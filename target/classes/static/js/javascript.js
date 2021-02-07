
//var urlLocal = "http://localhost:8080";

var urlLocal = "https://danoapp.herokuapp.com";


$( document ).ready(function() {
     

$("#btnEnviar").click(function() {

   var link  = $("#url").val();
   var temporal = link.split("v=");
   var id2 = temporal[1].split("&")[0];
   
   window.location.href = urlLocal + "/video?data=" + id2;
   
   });

   $("#btnHome").click(function () {
      window.location.href = urlLocal + "/home";

   });
});