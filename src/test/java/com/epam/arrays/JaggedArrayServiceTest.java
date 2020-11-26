package com.epam.arrays;

import com.epam.arrays.entity.JaggedArray;
import com.epam.arrays.service.JaggedArrayService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JaggedArrayServiceTest {
    private JaggedArray jaggedArray;
    private JaggedArrayService service;
    @BeforeTest
    private void init(){
        int[][] arr = {{21, 13, 903, 2},
                       {782, 12, 34},
                       {122, 12, 12, 24, 54},
                       {32, 1}};
        jaggedArray = new JaggedArray(arr);
        service = new JaggedArrayService();
    }

    @Test
    public void stringSumTest(){
        int[] array = jaggedArray.getJaggedArray()[3];
        int actual = service.stringSum(array);
        int expected = 33;
       assertEquals(actual, expected);
    }

}
