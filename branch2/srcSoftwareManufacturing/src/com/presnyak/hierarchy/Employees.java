package com.presnyak.hierarchy;

import static com.presnyak.hierarchy.ResourceDepartment.employees;

public class Employees {

    public static void main(String[] args) {
        Employee e = new Employee("Petya", 6, 7);
        System.out.println(e.getName());//проверка имени 
        ResourceDepartment r = new ResourceDepartment();
        r.getPostAndSalary(e);//проверка зарплаты 
        System.out.println(e.getSalary());
        r.getEmployesWithPosition("Midlle", employees);//проверка метода, пока не работает :(

    }

}
