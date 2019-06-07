package randomnamber;

public class SummaNumbers {

    public int RandomNumer(int limit) {
        return new java.util.Random().nextInt(limit);
    }

    public int[] getCountDigits(int number) {
        int length = String.valueOf(number).length();//делаю строковое представление числа
        int[] result = new int[length];
        while (number != 0) {
            result[--length] = number % 10;
            number /= 10;
        }
        return result;
    }

    public void showSummaNumbers(int[] number) {
        int sum = 0;
        for (int element : number) {
            sum += element;
        }
        System.out.println("Сумма цифр из числа равна:" + sum);

    }

}
