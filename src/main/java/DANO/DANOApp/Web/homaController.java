package DANO.DANOApp.Web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class homaController {


    @Autowired
    servicesHome servicesHomeVar;

	@RequestMapping("/video")
	public String home(@RequestParam("data") String itemid) {

         String html = servicesHomeVar.getVideo(itemid);

        return html;
	}

}