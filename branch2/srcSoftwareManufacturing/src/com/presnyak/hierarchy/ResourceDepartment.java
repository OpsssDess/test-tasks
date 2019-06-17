package com.presnyak.hierarchy;

import java.util.ArrayList;

public class ResourceDepartment {

    static ArrayList<Employee> employees = new ArrayList<>();

    public void getPostAndSalary(Employee men) { //должность и зарплата

        if (men.getExperienceJob() > 2) {
            if (men.getExperienceJob() >= 10) {
                men.setPosition("Senior");
                men.setSalary(1000);
                employees.add(men);
//                return;
            }
            if (men.getExperienceJob() >= 4 && men.getExperienceJob() < 10) {
                men.setPosition("Midlle");
                men.setSalary(500);
                employees.add(men);
//                return;
            }
            if (men.getExperienceJob() < 4) {
                men.setPosition("Junior");
                men.setSalary(350);
                employees.add(men);

            }
        } else {
            men.setPosition("Trainee");
            men.setSalary(0);
            employees.add(men);
        }
    }

    public void getEmployesWithPosition(String position, ArrayList<Employee> employees) {
        for (Employee e : employees) {
            if (e.getPosition().equals(position)) {
                e.toString();
            }
        }
    }
}
