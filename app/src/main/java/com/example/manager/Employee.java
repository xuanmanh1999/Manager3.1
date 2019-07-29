package com.example.manager;

public class Employee {
    private int iD;
    private String Name;
    private  String Hole;
    private String Department;
    private  String Describe;

    public Employee() {
    }

    public Employee(int iD, String name, String hole, String department, String describe) {
        this.iD = iD;
        Name = name;
        Hole = hole;
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

    public String getHole() {
        return Hole;
    }

    public void setHole(String hole) {
        Hole = hole;
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
