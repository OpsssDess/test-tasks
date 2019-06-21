package com.presnyak.hierarchy;

import java.util.ArrayList;
import java.util.List;

public class ResourceDepartment {

    public List<Employee> employees = new ArrayList<>();

    public List<Employee> getPostAndSalary(Employee... mens) { //должность и зарплата
        for (Employee men : mens) {
            if (men.getExperienceJob() > 2) {
                if (men.getExperienceJob() >= 10) {
                    men.setPosition("Senior");
                    men.setSalary(1100);
                    employees.add(men);
                    continue;
                }
                if (men.getExperienceJob() >= 4 && men.getExperienceJob() < 10) {
                    men.setPosition("Midlle");
                    men.setSalary(600);
                    employees.add(men);
                    continue;
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
        return employees;
    }

    public List<Employee> getEmployesWithPosition(String position) {
        List<Employee> empl = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getPosition().equals(position)) {
                empl.add(e);
            }
        }
        return empl;
    }//создаёт массив работников в зависимости от должности 

    public void showListEmployeesWithPost(List<Employee> list, String position) {
        System.out.println("Работающие на должности " + position + ":");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }//Вывоит на экран список работников в зависимости от должности

    public int showSumSalary(List<Employee> list) {
        int sum = 0;
        for(Employee a: list){
        sum += a.getSalary();
        }
        return sum;
    }// показывает сумму зарплаты работников, которые находятся в коллекции, которую передаю в параметр list

    
}
