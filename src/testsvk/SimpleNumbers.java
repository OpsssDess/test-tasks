package testsvk;

import java.util.Scanner;

public class SimpleNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    private static int scan() {
        System.out.println("Введите любые символы:");
        return scanner.nextInt();
    }

    private static void implementation() {
        int finiteNumber = scan();
        System.out.println(" Простые числа будут найдены до числа " + finiteNumber);
        int a;
        int counter;
        for (a = 1; a < finiteNumber; a++) {
            counter = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    counter++;
                }
            }
            if (counter <= 2) {
                System.out.print(" "+a);
            }
        }
    }

    public static void main(String[] args) {
        implementation();
    }

}
