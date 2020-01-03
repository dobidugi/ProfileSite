package myweb.main.service.projectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProjectDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Project> getData(){
       return jdbcTemplate.query("select *  from project", new RowMapper<Project>() {
           @Override
           public Project mapRow(ResultSet resultSet, int i) throws SQLException {
               Project project = new Project();
               project.setName(resultSet.getString("name"));
               project.setComment(resultSet.getString("comment"));
               project.setDetail(resultSet.getString("detail"));
               project.setGit(resultSet.getString("git"));
               return project;
           }
       });
    }

}
