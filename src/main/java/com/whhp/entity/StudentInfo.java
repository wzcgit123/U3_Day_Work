package com.whhp.entity;

import com.whhp.entity.Room;

public class StudentInfo {
    Integer sid;
    String  sname;
    String  Sgender;
    Integer sage;
    String saddress;
    String semail;

    private Room room;




    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSgender() {
        return Sgender;
    }

    public void setSgender(String sgender) {
        Sgender = sgender;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


    @Override
    public String toString() {
        return "StudentInfo{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", Sgender='" + Sgender + '\'' +
                ", sage=" + sage +
                ", saddress='" + saddress + '\'' +
                ", semail='" + semail + '\'' +

                ", room=" + room +
                '}';
    }
}
