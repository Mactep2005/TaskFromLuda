package com.aplana.java.task1;

import java.util.GregorianCalendar;

/**
 * Created by 1 on 20.02.2018.
 */
public class TestStaticMethod {
    private static int nextId = 0;
    private int id;
    private String fName;
    private String sName;
    boolean del;
    private GregorianCalendar calendar;

    {
        //блок инициализации
        id = nextId;
        nextId++;
    }

    public TestStaticMethod(int id, String fName, String sName) {
        this.fName = fName;
        this.sName = sName;
        del = false;
        calendar = new GregorianCalendar();
    }

    public TestStaticMethod(String fName, String sName) {
        this.fName = fName;
        this.sName = sName;
        del = false;
        calendar = new GregorianCalendar();
    }

    public static int getNextId() {
        nextId++;
        return nextId - 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {

    }
}
