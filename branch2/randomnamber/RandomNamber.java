package randomnamber;

public class RandomNamber {

    public static void main(String[] args) {
        SummaNumbers summa = new SummaNumbers();
        int number = (summa.RandomNumer(899)) + 100;
        System.out.println("Трёхзначное рандомное число: " + number);
        int[] arrayNumbers = summa.getCountDigits(number);
        summa.showSummaNumbers(arrayNumbers);
    }

}
