package com.epam.arrays.service;

import com.epam.arrays.entity.CustomArray;

public class SearchService {

    public int binarySearch(CustomArray sortedArray, int key) {
        int[] array = sortedArray.getArray();
        int low = 0;
        int high = array.length - 1;
        int index = -1;
        int mid = (low + high) / 2;
        while ((low <= high) && (index != mid)) {
            mid = (low + high) / 2;
            if (array[mid] < key) {
                low = mid + 1;
            }
            if (array[mid] > key) {
                high = mid - 1;
            }
            if(array[mid] == key){
                index = mid;
            }
        }
        return index;
    }

    public int maxElement(CustomArray customArray){
        int[] array = customArray.getArray();
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int minElement(CustomArray customArray){
        int[] array = customArray.getArray();
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
