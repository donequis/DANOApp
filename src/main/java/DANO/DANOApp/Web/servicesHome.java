package DANO.DANOApp.Web;

import org.springframework.stereotype.Service;

@Service
public  class servicesHome {
    
    public String getHome(){
        String html = getHeader("Sitio de Home") +  getBottom();
        return html;
    }
    public String getVideo(String link){
        return armarYouTube(link);
    }

    public String armarYouTube(String id){
        String html =  getHeader("Sitio de video")+getYoutube(id,"800","415")+getYappa()+getBottom();
        return html;
    }

    private String getYoutube(String id,String width, String height){
        String codigoVideo = id;
        // width 800
        // height 415
        return "<iframe width=\" "+ width+" \" height=\" "+height+"\" src=\"https://www.youtube.com/embed/"+codigoVideo+"\" frameborder=\"0\"        allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\"        allowfullscreen></iframe></div>  ";
    }

    private String getHeader(String titulo){
            return "<head>  <title>"+titulo+"</title>  <meta charset=\"utf-8\">  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script></head><body><div class=\"container\" style=\"display:inline;text-align: center\"><div ><div>";
    }

    private String getBottom(){
        return armarInput()+"<script src=\"/js/jquery.js\"></script> <script src=\"/js/javascript.js\"></script> </body></html>";
    }

    private String getYappa(){
        return "<!-- Trigger the modal with a button -->  <input type=\"image\"  data-toggle=\"modal\" data-target=\"#myModal\" src=\"/images/yappa-logo.png\"  />  <!-- Modal -->  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">    <div class=\"modal-dialog modal-lg\">      <div class=\"modal-content\">"+
        "<div class=\"modal-header\">          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>          <h4 class=\"modal-title\">Send your Yap</h4>        </div>        <div class=\"modal-body\">     <div id=\"yappa-comments-frame\" data-disable-ads=\"false\" style=\"margin:0;width:100%;height:630\"></div>    <script type=\"text/javascript\" src=\"https://comments.yappaapp.com/embed/yappa-comments.js\"></script>        </div>        <div class=\"modal-footer\">          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>        </div>      </div>    </div>  </div></div></div>";
    }

    private String armarInput(){
        return "<div style=\"text-align: center\"><label for=\"name\">URL del video:</label> <input type=\"text\" id=\"url\" name=\"url\" required > <button id=\"btnEnviar\">Ver</button><button id=\"btnHome\">Home</button></div>";
    }

}
