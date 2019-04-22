package testsvk;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int s = s1.nextInt();
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= s; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}
