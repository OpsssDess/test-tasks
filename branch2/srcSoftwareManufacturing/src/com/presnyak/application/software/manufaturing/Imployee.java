package com.presnyak.application.software.manufaturing;

public class Imployee extends Human {

    public int salary;

    Imployee() {
    }

    Imployee(String name, int experirnseJob, int salary) {
        super(name, experirnseJob);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
