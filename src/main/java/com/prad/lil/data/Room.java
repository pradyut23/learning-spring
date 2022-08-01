package com.prad.lil.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOM")     //table name in schema
public class Room {
    
    @Id     //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)     //configure the way of increment
    @Column(name="ROOM_ID")
    private long id;

    @Column(name="NAME")
    private String name;

    @Column(name="ROOM_NUMBER")
    private String roomNumber;

    @Column(name="BED_INFO")
    private String bedInfo;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }

    @Override
    public String toString() {
        return "Room [bedInfo=" + bedInfo + ", id=" + id + ", name=" + name + ", roomNumber=" + roomNumber + "]";
    }

    
}
