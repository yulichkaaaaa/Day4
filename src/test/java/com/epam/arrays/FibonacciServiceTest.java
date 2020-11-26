package com.epam.arrays;

import com.epam.arrays.entity.CustomArray;
import com.epam.arrays.entity.JaggedArray;
import com.epam.arrays.service.FibonacciService;
import com.epam.arrays.service.JaggedArrayService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FibonacciServiceTest {
    private CustomArray array;
    private FibonacciService service;

    @BeforeTest
    private void init(){
        int[] arr = {2, 43, 45, 13, 34, 63};
        array = new CustomArray(arr);
        service = new FibonacciService();
    }

    @Test
    public void fibonacciNumbersTest(){
        int[] actual = service.fibonacciNumbers(array).getArray();
        int[] expected = {2, 13, 34};
        assertEquals(actual, expected);
    }
}
