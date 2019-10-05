package cx.by.ApiCase.controller;

import cx.by.ApiCase.model.Link;
import cx.by.ApiCase.repo.LinkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/link")
public class LinkController {
    @Autowired
    private LinkRepo linkRepo;
    @ResponseBody
    @RequestMapping("add/{uri}")
    public Link add(@PathVariable("uri") String uri){
        Link link =new Link();
        link.setUri(uri);
        link.setRid(1);
        linkRepo.save(link);
        return link;
    }
}
