package com.epam.arrays.entity;

import java.util.Arrays;

public class JaggedArray {
    private int[][] jaggedArray;

    public JaggedArray(){
    }

    public JaggedArray(int[][] jaggedArray) {
        this.jaggedArray = jaggedArray;
    }

    public int[][] getJaggedArray() {
        return Arrays.copyOf(jaggedArray, jaggedArray.length);
    }

    public void setJaggedArray(int[][] jaggedArray) {
        this.jaggedArray = jaggedArray;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JaggedArray{");
        sb.append("jaggedArray=").append(Arrays.toString(jaggedArray));
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JaggedArray that = (JaggedArray) o;
        return Arrays.equals(jaggedArray, that.jaggedArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(jaggedArray);
    }
}
