package com.presnyak.hierarchy;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    public static void main(String[] args) {
        //мидлы:
        Employee p = new Employee("Petya", 6);
        Employee l = new Employee("Lena", 6);
        Employee v = new Employee("Vika", 6);
        //сеньоры:
        Employee t = new Employee("Tim", 10);
        Employee b = new Employee("Bob", 20);
        //джуны:
        Employee a = new Employee("Abdula", 3);
        Employee q = new Employee("Qolya", 3);
        // стажёры:
        Employee g = new Employee("Genadii", 1);
        Employee k = new Employee("Ksenia", 1);

        ResourceDepartment r = new ResourceDepartment();
        List<Employee> vseRabotniki = r.getPostAndSalary(p, l, v, t, b, a, q, g, k);//коллекция всех работников  
        r.showSumSalaries((ArrayList<Employee>) vseRabotniki);

        // выборка по должности сеньор:
        System.out.println();
        List<Employee> seniors = r.getEmployesWithPosition("Senior");
        r.showListEmployeesWithPost(seniors, "Senior");
        r.showSumSalary(seniors, "Senior");

        //выборка по должности мидл:
        System.out.println();
        List<Employee> middles = r.getEmployesWithPosition("Midlle");
        r.showListEmployeesWithPost(middles, "Middle");
        r.showSumSalary(middles, "Middle");

        // выборка по должности джуниор:
        System.out.println();
        List<Employee> juns = r.getEmployesWithPosition("Junior");
        r.showListEmployeesWithPost(juns, "Junior");
        r.showSumSalary(juns, "Junior");

        // выборка по должности стажёр:
        System.out.println();
        List<Employee> trainees = r.getEmployesWithPosition("Trainee");
        r.showListEmployeesWithPost(trainees, "Trainee");
        r.showSumSalary(trainees, "Trainee");

    }

}
