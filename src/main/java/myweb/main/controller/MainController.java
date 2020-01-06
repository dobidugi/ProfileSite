package myweb.main.controller;

import myweb.main.service.parseservice.ParseController;
import myweb.main.service.parseservice.SiteInfo;
import myweb.main.service.projectservice.Project;
import myweb.main.service.projectservice.ProjectController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@CrossOrigin(origins = {"*"})
@Controller
public class MainController {

    @Autowired
    private ProjectController projectController;
    @Autowired
    private ParseController parseController;

    @RequestMapping(value="/lo",method = RequestMethod.GET)
    public String x(Model model){
        model.addAttribute("project","haaa");
        return "index";
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(Model model){
        List<Project> projectList = projectController.getAllProject();
        List<SiteInfo> siteList = parseController.getSiteList();
        model.addAttribute("project",projectList);
        model.addAttribute("site",siteList);
        model.addAttribute("updateTime",siteList.get(0).getTime());
        return "index";
    }
}
