package com.epam.arrays;

import com.epam.arrays.entity.CustomArray;
import com.epam.arrays.service.PrimeNumbersService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PrimeNumberServiceTest {
    private CustomArray array;
    private PrimeNumbersService service;

    @BeforeTest
    private void init(){
        int[] arr = {324, 772, 90, 243, 911, 3, 7, 18};
        array = new CustomArray(arr);
        service = new PrimeNumbersService();
    }

    @Test
    public void isPrimeTest(){
        boolean condition = service.isPrime(977);
        assertTrue(condition);
    }

    @Test
    public void findPrimeNumbersTest(){
        int[] actual = service.findPrimeNumbers(array).getArray();
        int[] expected = {911, 3, 7};
        assertEquals(actual, expected);
    }

}
