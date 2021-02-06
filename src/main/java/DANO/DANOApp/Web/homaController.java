package DANO.DANOApp.Web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class homaController {


    @Autowired
    servicesHome servicesHomeVar;

	@RequestMapping("/home")
	public String home(@RequestParam("data") String itemid) {

        System.out.println("Prueba");
        System.out.println(this.toString());

        String html ="";
        
        if(itemid.equals("1")){
            html = servicesHomeVar.getYouTube("1");
        }else{
            html = "<html><body>    <div id=\"yappa-comments-frame\" data-disable-ads=\"false\" style=\"margin:0;width:500;heigh:400\"></div>    <script type=\"text/javascript\" src=\"https://comments.yappaapp.com/embed/yappa-comments.js\"></script><a href=\"pagina2.html\">Prueba2</a></body></html>";
        }

        return html;
	}

}