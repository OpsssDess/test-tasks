package displayeditedline;

import java.util.Scanner;

public class Line {

    private String[] words;
    private Scanner scanner = new Scanner(System.in);

    public String scan() {
        System.out.println("Введите любые символы:");
        return scanner.nextLine();
    }

    public String[] splitAndCleanLine(String line) {
        String line1 = line.replaceAll("[^!\\w\\s]", "");
        words = line1.split("\\s+");
        return words;
    }
    
    public void editLine(String[] words) {
        for (int i = 0; i<words.length; i++) {
            String first = words[i].substring(0, 1).toUpperCase();
            String all = words[i].substring(1);
            words[i] = first + all;
        }
    }//более правильный вариант 

//    public String editWords(String[] words1) {
//        String output = "";
//        for (String word : words1) {
//            String first = word.substring(0, 1).toUpperCase();
//            String all = word.substring(1);
//            output += first + all + " ";
//
//        }
//        return output;
//    } мой прежний вариант

    public void showWords(String [] a) {
        for (String b: a){
        System.out.print(" "+b);
        }
        
    }

}
