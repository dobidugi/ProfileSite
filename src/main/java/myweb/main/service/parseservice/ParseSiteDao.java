package myweb.main.service.parseservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ParseSiteDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateData(String name, String rank, String solve){
        final String query = "update parsesite set `rank`=?, `solve`=?, time=now() where name=?;";
        jdbcTemplate.update(query,rank,solve,name);
        System.out.println(name+" "+ rank + " " + solve);
    }

}
