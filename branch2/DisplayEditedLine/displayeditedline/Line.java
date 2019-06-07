package displayeditedline;

import java.util.Scanner;

public class Line {

    public String[] words;
    public Scanner scanner = new Scanner(System.in);

    public String scan() {
        System.out.println("Введите любые символы:");
        return scanner.nextLine();
    }

    public String[] splitAndCleanLine(String line) {
        String line1 = line.replaceAll("[^!\\w\\s]", "");
        words = line1.split("\\s+");
        return words;
    }

    public String editWords(String[] words1) {
        String output = "";
        for (String word : words1) {
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1);
            output += first + all + " ";

        }
        return output;
    }

    public void showWords(String a) {
        System.out.println(a);
    }

}
