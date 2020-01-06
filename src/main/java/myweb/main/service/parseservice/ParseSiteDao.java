package myweb.main.service.parseservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ParseSiteDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateData(String name, String rank, String solve){
        final String query = "update parsesite set `rank`=?, `solve`=?, time=now() where name=?;";
        jdbcTemplate.update(query,rank,solve,name);
        System.out.println(name+" "+ rank + " " +    solve);
    }

    public List<SiteInfo> getInfo() {
        return jdbcTemplate.query("select *  from parsesite", new RowMapper<SiteInfo>() {
            @Override
            public SiteInfo mapRow(ResultSet resultSet, int i) throws SQLException {
                SiteInfo site = new SiteInfo();
                site.setName(resultSet.getString("name"));
                site.setNameLink(resultSet.getString("namelink"));
                site.setNick(resultSet.getString("nick"));
                site.setNickLink(resultSet.getString("nicklink"));
                site.setRank(resultSet.getString("rank"));
                site.setSolve(resultSet.getString("solve"));
                site.setTime(resultSet.getTime("time"));
                return site;
            }
        });
    }

}
