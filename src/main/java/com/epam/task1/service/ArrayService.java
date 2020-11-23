package com.epam.task1.service;

public class ArrayService {

    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }

    public void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

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

    public int maxElement(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
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

    public int[] primeNumbers(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(isPrime(array[i])){
                count++;
            }
        }
        int[] primeArray = new int[count];
        int ind = 0;
        for(int i = 0; i < array.length; i++){
            if(isPrime(array[i])){
                primeArray[ind] = array[i];
                ind++;
            }
        }
        return primeArray;
    }

    private boolean isPrime(int num){
        boolean isPrime = true;
        int i = 2;
        while(i < num && isPrime){
            if(num % i != 0){
                isPrime = false;
            }
        }
        return isPrime;
    }

    private int fibonacciNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
        }
    }

    public int digitsInNumber(int number){
        int count = 0;
        while(number >= 1){
            number /= 10;
            count++;
        }
        return count;
    }
}
