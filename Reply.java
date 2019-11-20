package com.sdut.community.Dao;

public class Reply {
    private int id;
    private int repairID;
    private String name;
    private String content;
    private String time;

    public Reply() {
    }

    public Reply(int id, int repairID, String name, String content, String time) {
        this.id = id;
        this.repairID = repairID;
        this.name = name;
        this.content = content;
        this.time = time;
    }

    public Reply(int repairID, String name, String content) {
        this.repairID = repairID;
        this.name = name;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRepairID() {
        return repairID;
    }

    public void setRepairID(int repairID) {
        this.repairID = repairID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
