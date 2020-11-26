package com.epam.task1.reader;

import java.util.Random;

public class RandomGenerator {
    private static final int MAX_ELEMENT = 10000;
    private static final Random random = new Random();

    public int[] generateArray(int length, int min, int max){
        int[] result = new int[length];
        for(int i = 0; i < result.length; i++){
            result[i] = random.nextInt(max - min) + min;
        }
        return result;
    }

    public int[] generateArray(int length){
        int[] result = new int[length];
        for(int i = 0; i < result.length; i++){
            result[i] = random.nextInt(MAX_ELEMENT);
        }
        return result;
    }
}
