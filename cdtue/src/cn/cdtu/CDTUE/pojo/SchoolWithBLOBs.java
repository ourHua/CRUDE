package cn.cdtu.CDTUE.pojo;

public class SchoolWithBLOBs extends School {
    private String info;

    private String history;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history == null ? null : history.trim();
    }
}