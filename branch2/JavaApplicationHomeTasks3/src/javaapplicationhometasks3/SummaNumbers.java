package javaapplicationhometasks3;

public class SummaNumbers {

    public int Summa(int number) {
        int firstNumber = number % 10;
        int secondNumber = (number / 10) % 10;
        int thirdNumber = (number / 100) % 10;

        int summa = firstNumber + secondNumber + thirdNumber;
        return summa;
    }
}
