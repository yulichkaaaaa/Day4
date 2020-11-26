package com.epam.arrays.creator;

import com.epam.arrays.entity.CustomArray;

import java.util.Random;

public class RandomGenerator {
    private static final int MAX_RANGE = 10000;
    private static final Random random = new Random();

    public CustomArray generateArray(int length, int min, int max){
        int[] result = new int[length];
        for(int i = 0; i < result.length; i++){
            result[i] = random.nextInt(max - min) + min;
        }
        return new CustomArray(result);
    }

    public CustomArray generateArray(int length){
        int[] result = new int[length];
        for(int i = 0; i < result.length; i++){
            result[i] = random.nextInt(MAX_RANGE);
        }
        return new CustomArray(result);
    }
}
