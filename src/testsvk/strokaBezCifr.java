package testsvk;

import java.util.Scanner;

public class strokaBezCifr {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любые символы:");
        String s = scan.nextLine();
        s = s.replaceAll("[0-9]", "");// ещё можно использовать replaceAll("\\d",""), будет тоже самое 
        System.out.println(s);

    }

}
