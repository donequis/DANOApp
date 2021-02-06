package DANO.DANOApp.Web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class homaController {

	@RequestMapping("/home")
	public String index(@RequestParam("data") String itemid) {

        System.out.println("Prueba");
        System.out.println(this.toString());

        String html ="";

        
        if(itemid.equals("1")){
            html = "<head>  <title>Prueba App</title>  <meta charset=\"utf-8\">  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script></head><body><div class=\"container\" style=\"display:inline\"><div ><div>    <iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/OckMmA0JQIY\" frameborder=\"0\"        allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\"        allowfullscreen></iframe></div>  <!-- Trigger the modal with a button -->  <input type=\"image\"  data-toggle=\"modal\" data-target=\"#myModal\" src=\"/images/yappa-logo-small.png\"  />  <!-- Modal -->  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">    <div class=\"modal-dialog modal-lg\">      <div class=\"modal-content\">"+
            "<div class=\"modal-header\">          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>          <h4 class=\"modal-title\">Modal Header</h4>        </div>        <div class=\"modal-body\">     <div id=\"yappa-comments-frame\" data-disable-ads=\"false\" style=\"margin:0;width:700;height:400\"></div>    <script type=\"text/javascript\" src=\"https://comments.yappaapp.com/embed/yappa-comments.js\"></script>        </div>        <div class=\"modal-footer\">          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>        </div>      </div>    </div>  </div></div></div></body></html>";
        }else{
            html = "<html><body>    <div id=\"yappa-comments-frame\" data-disable-ads=\"false\" style=\"margin:0;width:500;heigh:400\"></div>    <script type=\"text/javascript\" src=\"https://comments.yappaapp.com/embed/yappa-comments.js\"></script><a href=\"pagina2.html\">Prueba2</a></body></html>";
        }




        return html;
	}

}