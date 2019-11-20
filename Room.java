package com.sdut.community.Dao;

public class Room {
    private int id;
    private String buildno;
    private String roomno;
    private int masterID;

    public Room() {
    }

    public Room(int id, String buildno, String roomno, int masterID) {
        this.id = id;
        this.buildno = buildno;
        this.roomno = roomno;
        this.masterID = masterID;
    }

    public Room(String buildno, String roomno, int masterID) {
        this.buildno = buildno;
        this.roomno = roomno;
        this.masterID = masterID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuildno() {
        return buildno;
    }

    public void setBuildno(String buildno) {
        this.buildno = buildno;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public int getMasterID() {
        return masterID;
    }

    public void setMasterID(int masterID) {
        this.masterID = masterID;
    }
}
