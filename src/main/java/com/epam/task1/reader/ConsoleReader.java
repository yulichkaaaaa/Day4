package com.epam.task1.reader;

import java.util.Scanner;

public class ConsoleReader {

    public int[] readArray(){
        Scanner input = new Scanner(System.in);
        int[] result;
        System.out.print("Input count of array elements: ");
        int length = input.nextInt();
        result = new int[length];
        System.out.println("Insert array elements:");
        for (int i = 0; i < length; i++) {
            result[i] = input.nextInt();
        }
        return result;
    }
}
