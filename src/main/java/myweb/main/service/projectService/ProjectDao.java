package myweb.main.service.projectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void getData(){
       int cnt = jdbcTemplate.queryForObject("select count(name) from project",int.class);
       System.out.print(cnt);
    }

}
