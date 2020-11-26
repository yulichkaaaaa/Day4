package com.epam.arrays.reader;

import com.epam.arrays.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CustomFileReader {

    private static final Logger logger = LogManager.getLogger();

    public CustomArray readCustomArray(String filename){
        int[] result = new int[0];
        int length = 0;
        Scanner scanner = new Scanner(System.in);
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            scanner = new Scanner(fileInputStream);
            while (scanner.hasNext()) {
                scanner.nextInt();
                length++;
            }
            result = new int[length];
            fileInputStream.reset();
            for (int i = 0; i < length; i++) {
                if(scanner.hasNext()) {
                    result[i] = scanner.nextInt();
                }
            }
        } catch (IOException e) {
            logger.info(e.getMessage());
        } finally {
            scanner.close();
        }
        return new CustomArray(result);
    }
}
