package com.epam.arrays.reader;

import com.epam.arrays.entity.CustomArray;
import com.epam.arrays.entity.JaggedArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;

public class CustomFileReader {

    private static final Logger logger = LogManager.getLogger();

    public CustomArray readCustomArray(String filename){
        int[] result = new int[0];
        int length = 0;
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            while (fileInputStream.read() != -1) {
                length++;
            }
            result = new int[length];
            fileInputStream.reset();
            for (int i = 0; i < length; i++) {
                result[i] = fileInputStream.read();
            }
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
        return new CustomArray(result);
    }

    /*public JaggedArray readJaggedArray(String filename){
        int[][] result = new int[0][];
        int length = 0;
        int temp;
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            while ((temp = fileInputStream.read()) != -1) {
                if(temp == '\n')
                    length++;
            }
            result = new int[length][];
            fileInputStream.reset();
            while ((temp = fileInputStream.read()) != -1) {
                while (temp != '\n'){

                }
            }
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
    }*/
}
