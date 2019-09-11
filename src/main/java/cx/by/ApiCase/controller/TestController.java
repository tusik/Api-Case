package cx.by.ApiCase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Controller
@RequestMapping("/test")
public class TestController {
    //@Autowired
    private ResourceHandlerRegistry registry;
    @RequestMapping("/t1*")
    @ResponseBody
    public String test(){
        return "hello";
    }
}
