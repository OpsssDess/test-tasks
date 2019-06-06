package displayeditedline;

import java.util.Arrays;
import java.util.Scanner;

public class Line {

    public String[] words;
    private static final Scanner scanner = new Scanner(System.in);

    public static String scan() {
        System.out.println("Введите любые символы:");
        return scanner.nextLine();
    }

    public String[] lineCleaning(String line) {
        String line1 = line.replaceAll("[^!\\w\\s]", "");
        words = line1.split("\\s+");
        return words;
    }

    public String editLine(String[] words1) {
        String output = "";
        for (String word : words1) {
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1);
            output += first + all + " ";
        }
        return output;
    }

    public void sortLine(String output) {
        String[] editedWords = output.split(" ");
        Arrays.sort(editedWords);
        for (String a : editedWords) {
            System.out.print(a + " ");
        }

    }
}
