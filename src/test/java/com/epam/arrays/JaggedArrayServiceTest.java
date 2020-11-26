package com.epam.arrays;

import com.epam.arrays.entity.JaggedArray;
import com.epam.arrays.service.JaggedArrayService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class JaggedArrayServiceTest {
    private JaggedArray jaggedArray;
    private JaggedArrayService service;
    @BeforeTest
    private void init(){
        int[][] arr = {{21, 13, 1, 2},
                       {7, 12, 4},
                       {32, 2}};
        jaggedArray = new JaggedArray(arr);
        service = new JaggedArrayService();
    }

    @Test
    public void stringSumTest(){
        int[] array = jaggedArray.getJaggedArray()[2];
        int actual = service.stringSum(array);
        int expected = 34;
       assertEquals(actual, expected);
    }

    @Test
    public void sortStringsSumTest(){
        int[][] expected = {{7, 12, 4},
                            {32, 2},
                            {21, 13, 1, 2}};
        int[][] actual = service.sortStringsSums(jaggedArray).getJaggedArray();
        assertEquals(actual, expected);
    }

    @Test
    public void maxElementSortTest(){
        int[][] expected = {{7, 12, 4},
                            {21, 13, 1, 2},
                            {32, 2}};
        int[][] actual = service.maxElementSort(jaggedArray).getJaggedArray();
        assertEquals(actual, expected);
    }

    @Test
    public void minElementSortTest(){
        int[][] expected = {{21, 13, 1, 2},
                            {32, 2},
                            {7, 12, 4}};
        int[][] actual = service.minElementSort(jaggedArray).getJaggedArray();
        assertEquals(actual, expected);
    }

}
