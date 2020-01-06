package myweb.main.service.projectservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectController {
    @Autowired
    private ProjectDao projectDao;

    public List<Project> getAllProject(){
        return projectDao.getData();
    }
}
