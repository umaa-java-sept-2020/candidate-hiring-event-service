package com.uuv.candidatehiringeventservice.model;

public class Departments {
    private int id;
    private String uid;
    private String name;
    private String displayName;


    public Departments(int id, String uid, String name, String displayName) {
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.displayName = displayName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getId() {
        return id;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Departments() {
    }
}
