package DANO.DANOApp.Web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class homaController {

	@RequestMapping("/home")
	public String index(@RequestParam("data") String itemid) {

        System.out.println(itemid);
        
        if(itemid.equals("1")){
		return "<html><body>    <iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/OckMmA0JQIY\" frameborder=\"0\"        allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\"        allowfullscreen></iframe>    <div id=\"yappa-comments-frame\" data-disable-ads=\"false\"></div>    <script type=\"text/javascript\" src=\"https://comments.yappaapp.com/embed/yappa-comments.js\"></script><a href=\"pagina2.html\">Prueba2</a></body></html>";
        }

        return "<html><body>    <div id=\"yappa-comments-frame\" data-disable-ads=\"false\"></div>    <script type=\"text/javascript\" src=\"https://comments.yappaapp.com/embed/yappa-comments.js\"></script><a href=\"pagina2.html\">Prueba2</a></body></html>";
	}

}