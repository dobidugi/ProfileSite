package myweb.main.service.parseservice;

import java.util.Date;

public class SiteInfo {

    private String nick;
    private String nickLink;
    private String name;
    private String nameLink;
    private String rank;
    private String solve;
    private Date time;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNickLink() {
        return nickLink;
    }

    public void setNickLink(String nickLink) {
        this.nickLink = nickLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLink() {
        return nameLink;
    }

    public void setNameLink(String nameLink) {
        this.nameLink = nameLink;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSolve() {
        return solve;
    }

    public void setSolve(String solve) {
        this.solve = solve;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
