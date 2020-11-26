package com.epam.task1.entity;

import java.util.Arrays;
import java.util.Random;

public class CustomArray {

    private int[] array;

    public CustomArray(int[] array) {
        this.array = array;
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
        CustomArray customArray = (CustomArray) o;
        return Arrays.equals(array, customArray.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArray{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }
}

