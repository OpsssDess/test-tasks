package javaapplicationhometasks3;

import java.util.Random;

public class RandomNumber {

    public int RandomNumer(int limit) {

        int threeDigitRandomNumber = new java.util.Random().nextInt(limit);
        return threeDigitRandomNumber;
    }
}
