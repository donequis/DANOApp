
//var urlLocal = "http://localhost:8080";

var urlLocal = "https://danoapp.herokuapp.com";


$( document ).ready(function() {

 console.log("cargado");

$("#btnEnviar").click(function() {

   var link  = $("#url").val();
   var temporal = link.split("v=");
   var id2 = temporal[1].split("&")[0];
   //alert(id2);
   window.location.href = urlLocal + "/video?data=" + id2;
   //window.location.href = urlLocal + "/video?data=" + $("#url").val();

   });

   $("#btnHome").click(function () {
      window.location.href = urlLocal + "/home";

   });
});