package com.presnyak.application.software.manufaturing;

public class Imployees {

    public static void main(String[] args) {
        Imployee ivan = new Imployee("Ivan", 3, 0);
        Imployee fedya = new Imployee("Fedor", 10, 0);
        Imployee gena = new Imployee("Genadii", 4, 0);
        Imployee anya = new Imployee("Anna", 5, 0);
        Imployee misha = new Imployee("MIhail", 1, 0);

        HumanResourcesDepartment hrd = new HumanResourcesDepartment();
        hrd.getPostAndSalary(fedya);
        hrd.getPostAndSalary(ivan);
        hrd.getPostAndSalary(gena);
        hrd.getPostAndSalary(anya);
        hrd.getPostAndSalary(misha);
    }

}
