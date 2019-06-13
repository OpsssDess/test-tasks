package com.presnyak.application.software.manufaturing;

public class Human {

    private String name;
    private int experienceJob;
    private String position;

    public Human() {
    }

    public Human(String name, int experienceJob) {
        this.name = name;
        this.experienceJob = experienceJob;

    }

    //<editor-fold defaultstate="collapsed" desc="гетеры и сетеры">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

//</editor-fold>
}
