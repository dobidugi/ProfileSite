package myweb.main.service.parseservice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class ParseCodeup implements ParseSite {

    private ParseSiteDao parseSiteDao;
    final String URL = "https://codeup.kr/userinfo.php?user=chocojoahhae2";
    private Document doc = null;
    private String rank = null;
    private String solve = null;

    ParseCodeup(ParseSiteDao parseSiteDao){
        this.parseSiteDao = parseSiteDao;
    }

    @Override
    public void onStart() throws IOException {
        request();
        parseData();
        writeDb();
    }

    private void request() throws IOException {
        doc = Jsoup.connect(URL).get();
    }

    private void parseData() {
        parseSolve();
        parseRank();
    }

    private void parseSolve() {
        Element element = doc.select("td").select("a").select("[href]").first();
        solve = element.text();
    }

    private void parseRank() {
        Element element = doc.getElementsByClass("text-center").first();
        rank = element.text();
        rank = rank.substring(0,rank.length()-1);
    }

    private void writeDb() {
        parseSiteDao.updateData("Codeup",rank,solve);
    }
}
