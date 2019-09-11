package cx.by.ApiCase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/YOU_WILL_NOT_FOUND_THIS/PROCESSER")
public class BaseController {
    @RequestMapping
    @ResponseBody
    public String forward(){
        return "asd";
    }
}
