package cn.cdtu.CDTUE.pojo;

public class School {
    private String id;

    private String schoolname;

    private String city;

    private String isgo;

    private String isneed;

    private String createtime;

    private String other;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getIsgo() {
        return isgo;
    }

    public void setIsgo(String isgo) {
        this.isgo = isgo == null ? null : isgo.trim();
    }

    public String getIsneed() {
        return isneed;
    }

    public void setIsneed(String isneed) {
        this.isneed = isneed == null ? null : isneed.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}