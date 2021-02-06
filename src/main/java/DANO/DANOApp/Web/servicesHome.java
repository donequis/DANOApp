package DANO.DANOApp.Web;

import org.springframework.stereotype.Service;

@Service
public  class servicesHome {
    

    public String getYouTube(String id){

        String html =  getHeader()+getYoutube()+getYappa()+getBottom();

        return html;
    }


    private String getYoutube(){
        return "<iframe width=\"800\" height=\"415\" src=\"https://www.youtube.com/embed/OckMmA0JQIY\" frameborder=\"0\"        allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\"        allowfullscreen></iframe></div>  ";
    }

    private String getHeader(){
            return "<head>  <title>Prueba App 2</title>  <meta charset=\"utf-8\">  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script></head><body><div class=\"container\" style=\"display:inline;text-align: center\"><div ><div>";
    }
    private String getBottom(){
        return "</body></html>";
    }
    private String getYappa(){
        return "<!-- Trigger the modal with a button -->  <input type=\"image\"  data-toggle=\"modal\" data-target=\"#myModal\" src=\"/images/yappa-logo.png\"  />  <!-- Modal -->  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">    <div class=\"modal-dialog modal-lg\">      <div class=\"modal-content\">"+
        "<div class=\"modal-header\">          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>          <h4 class=\"modal-title\">Send your Yap</h4>        </div>        <div class=\"modal-body\">     <div id=\"yappa-comments-frame\" data-disable-ads=\"false\" style=\"margin:0;width:100%;height:630\"></div>    <script type=\"text/javascript\" src=\"https://comments.yappaapp.com/embed/yappa-comments.js\"></script>        </div>        <div class=\"modal-footer\">          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>        </div>      </div>    </div>  </div></div></div>";
    }

}
