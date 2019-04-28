package testsvk;

import java.util.Scanner;

public class StrokaBezCifr {

    private static final Scanner scanner = new Scanner(System.in);

    private static String scan() {
        System.out.println("Введите любые символы:");
        return scanner.nextLine();
    }

    private static String deletion() {
        String s = scan();
        s = s.replaceAll("[0-9]", "");// ещё можно использовать replaceAll("\\d",""), будет тоже самое
        return s;
    }
    
    private static void outpoot() {
        String a = deletion();
        System.out.println(a);
    }

    public static void main(String[] args) {
        outpoot();
        

    }

}
