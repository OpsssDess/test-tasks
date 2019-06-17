package com.presnyak.hierarchy;

public class Employee extends Human {

    private int salary;
    private int experienceJob;
    private String position;

    Employee() {
    }

    Employee(String name, int experienceJob, int salary) {
        super(name);
        this.salary = salary;
        this.experienceJob = experienceJob;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperienceJob() {
        return experienceJob;
    }

    public void setExperienceJob(int experienceJob) {
        this.experienceJob = experienceJob;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Я ");
        sb.append(getName());
        sb.append(" моя должность ");
        sb.append(getPosition());
        sb.append(" моя зарплата ");
        sb.append(getSalary());
        return sb.toString();
    }
}
