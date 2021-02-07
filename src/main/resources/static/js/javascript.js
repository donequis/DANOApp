
var urlLocal = "http://localhost:8080"

$( document ).ready(function() {

 console.log("cargado");

$("#btnEnviar").click(function() {
         window.location.href = urlLocal + "/video?data=" + $("#url").val();

   });

   $("#btnHome").click(function () {
      window.location.href = urlLocal + "/home";

   });
});