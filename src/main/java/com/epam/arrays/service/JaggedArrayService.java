package com.epam.arrays.service;

import com.epam.arrays.entity.JaggedArray;

public class JaggedArrayService {

    public JaggedArray sortStringsSums(JaggedArray jaggedArray){
        int[][] array = jaggedArray.getJaggedArray();
        for (int i = 0; i < array.length - 1; i++){
            for(int j = array.length - 1; j > i; j--){
                if(stringSum(array[j - 1]) > stringSum(array[j])){
                    swap(array, j - 1, j);
                }
            }
        }
        return new JaggedArray(array);
    }

    public JaggedArray maxElementSort(JaggedArray jaggedArray){
        int[][] array = jaggedArray.getJaggedArray();
        for (int i = 0; i < array.length - 1; i++){
            for(int j = array.length - 1; j > i; j--){
                if(maxElement(array[j - 1]) > maxElement(array[j])){
                    swap(array, j - 1, j);
                }
            }
        }
        return new JaggedArray(array);
    }

    public JaggedArray minElementSort(JaggedArray jaggedArray){
        int[][] array = jaggedArray.getJaggedArray();
        for (int i = 0; i < array.length - 1; i++){
            for(int j = array.length - 1; j > i; j--){
                if(minElement(array[j - 1]) > minElement(array[j])){
                    swap(array, j - 1, j);
                }
            }
        }
        return new JaggedArray(array);
    }

    public void swap(int[][] array, int index1, int index2){
        int[] temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public int stringSum(int[] array){
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        return sum;
    }

    public int minElement(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public int maxElement(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
