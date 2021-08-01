package com.guard.pojo;

public class Pest {
    private Integer pestid;

    private Integer kind;

    private String name;

    private String place;

    private String time;

    private String content;

    private String infourl;

    private String info;

    private String basic;

    private String bio;

    private String agr;

    public Integer getPestid() {
        return pestid;
    }

    public void setPestid(Integer pestid) {
        this.pestid = pestid;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getInfourl() {
        return infourl;
    }

    public void setInfourl(String infourl) {
        this.infourl = infourl == null ? null : infourl.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic == null ? null : basic.trim();
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio == null ? null : bio.trim();
    }

    public String getAgr() {
        return agr;
    }

    public void setAgr(String agr) {
        this.agr = agr == null ? null : agr.trim();
    }
}