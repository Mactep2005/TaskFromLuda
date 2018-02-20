package com.aplana.java.task1;

/**
 * Created by 1 on 20.02.2018.
 */
public class SalaryPerson extends TestStaticMethod{
    private double salary=0;

    public double getSalary() {
        return salary;
    }
    public String getfName(){
        return "M_"+super.getfName();
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SalaryPerson(int id, String fName, String sName, double salary) {
        super(id, fName, sName);
        this.salary = salary;
    }

    public SalaryPerson(String fName, String sName) {
        super(fName, sName);

    }
}
