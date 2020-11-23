package com.epam.task1.entity;

import java.util.Arrays;
import java.util.Random;

public class CustomArray {

    private int[] array;
    private static final Random random = new Random();

    public CustomArray(int[] array) {
        this.array = array;
    }

    public CustomArray(int count, int min, int max){
        array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(max - min) + min;
        }
    }

    public CustomArray(int count){
        array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public CustomArray(){}

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray array1 = (CustomArray) o;
        return Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

}

