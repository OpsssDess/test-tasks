package displayeditedline;

public class DisplayEditedLine {

    public static void main(String[] args) {
        String input = "“bmv reno, audi mazda; nissan";
        String input1 = input.replaceAll("\\“|\\,|\\;", "");
        System.out.println(input);
        String output = "";
        String[] words = input1.split(" ");
        for (String word : words) {
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1);
            output += first + all + " ";
        }

        String[] editedWords = output.split(" ");
        System.out.print("");
        for (String a : editedWords) {
            System.out.print(a + " ");
        }
    }

}
