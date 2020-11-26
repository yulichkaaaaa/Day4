package com.epam.arrays.service;

import com.epam.arrays.entity.CustomArray;

public class PrimeNumbersService {

    public CustomArray findPrimeNumbers(CustomArray customArray){
        int[] array = customArray.getArray();
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
        return new CustomArray(primeArray);
    }

    public boolean isPrime(int num){
        boolean isPrime = true;
        int i = 2;
        while(i < num && isPrime){
            if(num % i == 0){
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }

}
