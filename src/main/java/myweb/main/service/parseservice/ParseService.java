package myweb.main.service.parseservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParseService {

    @Autowired
    ParseSiteDao parseSiteDao;
    private List<ParseSite> targetList = new ArrayList<ParseSite>();

    public void onStart() throws IOException {
        setTarget();
        parseStart();
    }

    private void setTarget(){
        targetList.add(new ParseBaekjoon(parseSiteDao));
        targetList.add(new ParseCodeup(parseSiteDao));
    }

    private void parseStart() throws IOException {
        for(ParseSite target : targetList) {
            target.onStart();
        }
    }

    public List<SiteInfo> getSiteList() {
        return parseSiteDao.getInfo();
    }
}

