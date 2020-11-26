package com.epam.task1.service;

public class SearchService {

    public int binarySearch(int[] array, int key, int low, int high) {
        int index = -1;
        int mid = (low + high) / 2;
        while ((low <= high) && (index != mid)) {
            mid = (low + high) / 2;
            if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
        return index;
    }

}
