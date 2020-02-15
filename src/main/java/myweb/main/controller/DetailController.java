package myweb.main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/detail")
public class DetailController {

    @RequestMapping(value="/{name}", method= RequestMethod.GET)
    public String showDetail(Model model){
        return "index";
    }
}
