package myweb.main.service.parseservice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class ParseBaekjoon implements ParseSite {

    private ParseSiteDao parseSiteDao;
    final String URL = "https://www.acmicpc.net/user/dobidugi";
    private Document doc = null;
    private String rank = null;
    private String solve = null;

    ParseBaekjoon(ParseSiteDao parseSiteDao){
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
        Element element = doc.getElementById("statics").select("td").first();
        rank = element.text();
    }

    private void writeDb() {
        parseSiteDao.updateData("Baekjoon", rank, solve);
    }
}
