package com.example.bijan.customadapter;

/**
 * Created by Bijan on 12/8/2016.
 */

public class Employee {
    private String Eno, Ename, Esal;

    public Employee(String eno, String ename, String esal) {
        Eno = eno;
        Ename = ename;
        Esal = esal;
    }

    public String getEno() {
        return Eno;
    }

    public void setEno(String eno) {
        Eno = eno;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getEsal() {
        return Esal;
    }

    public void setEsal(String esal) {
        Esal = esal;
    }
}
