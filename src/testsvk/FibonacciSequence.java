package testsvk;

import java.util.Scanner;

public class FibonacciSequence {

    private static final Scanner scanner = new Scanner(System.in);

    private static int scan() {

        System.out.println("Введите число:");
        if (scanner.hasNextInt()) {
            int s2 = scanner.nextInt();
            return s2;
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод");
            return scan();
        }

    }

    private static void implementation() {

        int amountOfNumbers = scan();
        if(amountOfNumbers==0){
            System.out.println("Выводимое число символов не может быть нулём!");
            return;
        } 
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= amountOfNumbers; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        implementation();

    }
}
