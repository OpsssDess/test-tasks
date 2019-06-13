package displayeditedline;

import java.util.Arrays;

public class DisplayEditedLine {
    
    public static void main(String[] args) {
        
        Line line = new Line();//создаю обьект 
        String input = line.scan();//передаю написаную строку в переменую 
        String[] words = line.splitAndCleanLine(input);//делаю из строки массив и чищу его
        Arrays.sort(words);// сортирую по алфавиту
        line.editLine(words);
        line.showWords(words);
    }
}
