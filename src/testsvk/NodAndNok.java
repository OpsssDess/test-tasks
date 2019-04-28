package testsvk;

import java.util.Scanner;

public class NodAndNok {

    private static final Scanner scanner = new Scanner(System.in);

    private static int scan() {
        return scanner.nextInt();
    }

    public static int firstOutput() {
        System.out.println("Введите первое число:");
        int a = scan();
        return a;
    }

    public static int secondOutput() {
        System.out.println("Введите второе число:");
        int b = scan();
        return b;
    }
    static int firstNumber = firstOutput();
    static int secondNumber = secondOutput();

    private static int NOD(int c, int d) {
        if (d == 0) {
            return c;
        } else {
            return NOD(d, c % d);
        }
    }

    private static int NOK(int c, int d) {
        int nok = (c * d) / NOD(c, d);
        return nok;
    }

    public static void main(String[] args) {
        System.out.println("Первое число равно: " + firstNumber);
        System.out.println("Второе число равно: " + secondNumber);
        System.out.println("NOD: " + NOD(firstNumber, secondNumber));
        System.out.println("NOK: " + NOK(firstNumber, secondNumber));
    }

}
