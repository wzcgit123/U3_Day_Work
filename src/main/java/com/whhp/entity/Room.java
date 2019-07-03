package com.whhp.entity;

public class Room {
    Integer rid;
    String rname;


    public Room(Integer rid, String rname) {
        this.rid = rid;
        this.rname = rname;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }


    @Override
    public String toString() {
        return "Room{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                '}';
    }
}
