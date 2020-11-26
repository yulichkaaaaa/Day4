package com.epam.task1.service;

public class PrimeNumbersService {

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

}
