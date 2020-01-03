package myweb.main.controller;

import myweb.main.service.projectService.Project;
import myweb.main.service.projectService.ProjectDao;
import myweb.main.service.projectService.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ProjectService projectSvc;

    @RequestMapping(value="/lo",method = RequestMethod.GET)
    public String x(Model model){
        model.addAttribute("project","haaa");
        return "index";
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(Model model){
        List<Project> projectList = projectSvc.getAllProject();
        model.addAttribute("project",projectList);
        return "index";
    }
}
