package com.presnyak.application.software.manufaturing;

import java.util.ArrayList;
import java.util.Iterator;

public class HumanResourcesDepartment {

    ArrayList<Imployee> seniors = new ArrayList<>();
    ArrayList<Imployee> midlles = new ArrayList<>();
    ArrayList<Imployee> juniors = new ArrayList<>();
    ArrayList<Imployee> trainees = new ArrayList<>();

    public void getPostAndSalary(Imployee men) { //должность и зарплата

        if (men.getExperienceJob() > 2) {
            if (men.getExperienceJob() >= 10) {
                men.setPosition("Senior");
                men.setSalary(1000);
                seniors.add(men);
                System.out.println("Я " + men.getName() + " моя должность " + men.getPosition() + " моя зарплата " + men.getSalary());
            }
            if (men.getExperienceJob() >= 4 && men.getExperienceJob() <= 6) {
                men.setPosition("Midlle");
                men.setSalary(500);
                midlles.add(men);
                System.out.println("Я " + men.getName() + " моя должность " + men.getPosition() + " моя зарплата " + men.getSalary());
            }
            if (men.getExperienceJob() <= 3) {
                men.setPosition("Junior");
                men.setSalary(350);
                juniors.add(men);
                System.out.println("Я " + men.getName() + " моя должность " + men.getPosition() + " моя зарплата " + men.getSalary());
            }
        } else {
            men.setPosition("Trainee");
            men.setSalary(0);
            trainees.add(men);
            System.out.println("Я " + men.getName() + " моя должность " + men.getPosition() + " моя зарплата " + men.getSalary());
        }
    }

}
