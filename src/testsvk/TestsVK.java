package testsvk;

import java.util.Scanner;

public class TestsVK {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int s = s1.nextInt();
        System.out.println(" Простые числа будут найдены до числа "+ s);
        int a;
        int schetDeleniya;
        for (a = 1; a < s; a++) {
            schetDeleniya = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    schetDeleniya++;
                }
            }
            if (schetDeleniya <= 2) {
                System.out.println(a);
            }
        }
    }

}
