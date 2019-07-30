package com.example.manager;

import java.io.Serializable;

public class Employee implements Serializable {
    private int iD;
    private String Name;
    private  String Position;
    private String Department;
    private  String Describe;

    public Employee() {
    }

    public Employee(int iD, String name, String position, String department, String describe) {
        this.iD = iD;
        Name = name;
        Position = position;
        Department = department;
        Describe = describe;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }
}
