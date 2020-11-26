package com.epam.arrays.service;

import com.epam.arrays.entity.CustomArray;

public class FibonacciService {
    private static final int FIBONACCI_COUNT = 20;

    public CustomArray fibonacciNumbers(CustomArray customArray) {
        int[] array = customArray.getArray();
        int[] fibonacci = fibonacciArray(FIBONACCI_COUNT);
        int length = 0;
        int[] result;
        boolean isFibonacci;
        for (int i = 1; i < fibonacci.length; i++){
            int j = 0;
            isFibonacci = false;
            while (j < array.length && !isFibonacci){
                if(fibonacci[i] == array[j]){
                    isFibonacci = true;
                    length++;
                }
                j++;
            }
        }
        result = new int[length];
        int count = 0;
        for (int i = 1; i < fibonacci.length; i++){
            int j = 0;
            isFibonacci = false;
            while (j < array.length && !isFibonacci){
                if(fibonacci[i] == array[j]){
                    isFibonacci = true;
                    result[count] = array[j];
                    count++;
                }
                j++;
            }
        }
        customArray.setArray(result);
        return customArray;
    }

    public int[] fibonacciArray(int count){
        int[] fibonacci = new int[count];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

}
