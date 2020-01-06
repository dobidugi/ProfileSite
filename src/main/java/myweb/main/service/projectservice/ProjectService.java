package myweb.main.service.projectservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectService {
    @Autowired
    private ProjectDao projectDao;

    public List<Project> getAllProject(){
        return projectDao.getData();
    }
}
