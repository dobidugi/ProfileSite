package myweb.main.service.projectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectService {
    @Autowired
    private ProjectDao projectDao;

    public void getAllProject(){
        projectDao.getData();
    }
}
