package javaapplicationhometasks3;

public class JavaApplicationHomeTasks3 {
    
    public static void main(String[] args) {
        
        RandomNumber number = new RandomNumber();
        int rNumber = (number.RandomNumer(899) + 100);
        System.out.println("Трёхзначное рандомное число: " + rNumber);
        
        SummaNumbers summa = new SummaNumbers();
        System.out.println("Трёхзначное рандомное число: " + summa.Summa(rNumber));
        
    }
    
}
