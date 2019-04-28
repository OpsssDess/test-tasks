package testsvk;

import java.util.Scanner;

public class Polidrom {

    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        String a = sl.nextLine();
        System.out.println("Ваше слово " + a);

        StringBuilder sb1 = new StringBuilder(a);
        System.out.println("сб1 равен " + sb1);

        StringBuilder sb3 = new StringBuilder(sb1);
        System.out.println("сб3 при этом равен " + sb1);

        String sb2 = new String(sb1.reverse());
        System.out.println("сб2 равен " + sb2);
        System.out.println("сб1 при этом равен " + sb1);

        if (sb3.toString().equals(sb2)) {
            System.out.println("Ваше слово полидром!");
        } else {
            System.out.println("Ваше слово не полидром!");
        }
        

    }
}
