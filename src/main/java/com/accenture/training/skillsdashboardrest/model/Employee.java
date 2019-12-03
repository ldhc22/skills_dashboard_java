package com.accenture.training.skillsdashboardrest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employees")
public class Employee {

    @Id
    private int sysId;
    private String eId;
    private String name;
    private int level;
    private String location;
    private String birthday;

    public int getSysId() {
        return sysId;
    }

    public void setSysId(int sysId) {
        this.sysId = sysId;
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Employee(int sysId, String eId, String name, int level, String location, String birthday) {
        this.sysId = sysId;
        this.eId = eId;
        this.name = name;
        this.level = level;
        this.location = location;
        this.birthday = birthday;
    }

    public Employee() {
    }
}
