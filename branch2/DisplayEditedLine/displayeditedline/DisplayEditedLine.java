package displayeditedline;

public class DisplayEditedLine {

    public static void main(String[] args) {

        Line line = new Line();

        String output = line.editLine(line.lineCleaning(line.scan()));
        line.sortLine(output);
    }

}
