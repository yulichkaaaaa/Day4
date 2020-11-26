package com.epam.arrays.reader;

import com.epam.arrays.entity.CustomArray;

import java.util.Scanner;

public class ConsoleReader {

    public CustomArray readArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input count of array elements: ");
        int length = input.nextInt();
        int[] result = new int[length];
        System.out.println("Insert array elements:");
        for (int i = 0; i < length; i++) {
            result[i] = input.nextInt();
        }
        return new CustomArray(result);
    }
}
