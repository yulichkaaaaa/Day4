package com.epam.task1.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomFileReader {

    public int[] readArray(String filename){
        int[] result;
        int length = 0;
        int temp;
        FileReader reader;
        try {
            reader = new FileReader(filename);
            while((temp=reader.read()) != -1){
                length++;
            }
            result = new int[length];
            reader.reset();
            for(int i = 0; i < length; i++){
                result[i] = reader.read();
            }
            reader.close();
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
