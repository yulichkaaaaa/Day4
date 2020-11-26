package com.epam.arrays.service;

import com.epam.arrays.entity.CustomArray;

public class DigitsService {

    public CustomArray noSameDigits(CustomArray customArray, int digitsCount){
        int[] array = customArray.getArray();
        int[] digits;
        int length = 0;
        int count = 0;
        for(int number : array){
             digits = numberToDigits(number);
            if((digitsInNumber(number) == digitsCount) && !hasSameDigits(digits)){
                length++;
            }
        }
        int[] result = new int[length];
        for(int number : array){
            digits = numberToDigits(number);
            if((digitsInNumber(number) == digitsCount) && !hasSameDigits(digits)){
                result[count] = number;
                count++;
            }
        }
        customArray.setArray(result);
        return customArray;
    }

    public int digitsInNumber(int number){
        int count = 0;
        while(number >= 1){
            number /= 10;
            count++;
        }
        return count;
    }

    public boolean hasSameDigits(int[] digits){
        boolean isSame = false;
        for(int i = 0; i < digits.length; i++){
            for(int j = i + 1; j < digits.length; j++){
                if(digits[i] == digits[j]){
                    isSame = true;
                }
            }
        }
        return isSame;
    }

    public int[] numberToDigits(int number){
        int[] digits = new int[digitsInNumber(number)];
        for(int i = 0; i < digits.length; i++){
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

}
