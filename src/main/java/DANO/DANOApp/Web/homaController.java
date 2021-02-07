package DANO.DANOApp.Web;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class homaController {

    @Autowired
    ILinksServices linksServices;

    @Autowired
    servicesHome servicesHomeVar;

    @Autowired
    public void setLinksServices(ILinksServices linksServices) {
        this.linksServices = linksServices;
    }

	@RequestMapping("/video")
	public String video(@RequestParam("data") String itemid) {

        String html = servicesHomeVar.getVideo(itemid);
        linksServices.insertLink(itemid, new Date(System.currentTimeMillis()));

        return html;
	}

    @RequestMapping("/home")
    public String home() {

        String html = servicesHomeVar.getHome();

        return html;
    }

    @RequestMapping("/prueba")
    public String prueba(){
        List<Links> links = (List<Links>) linksServices.getAllFromLink();
        return links.toString();
    }

}