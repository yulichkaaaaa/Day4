package com.epam.arrays;

import com.epam.arrays.entity.CustomArray;
import com.epam.arrays.service.DigitsService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DigitServiceTest {

    private CustomArray array;
    private DigitsService service;

    @BeforeTest
    private void init(){
        int[] arr = {324, 772, 90, 243, 901, 3, 7, 18};
        array = new CustomArray(arr);
        service = new DigitsService();
    }

    @Test
    public void digitsInNumberTest(){
        int actual = service.digitsInNumber(999);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void hasSameDigitsTest(){
        int[] digits = {1, 2, 3, 5, 2};
        boolean condition = service.hasSameDigits(digits);
        assertTrue(condition);
    }

    @Test
    public void numberToDigitsTest(){
        int[] actual = service.numberToDigits(914321);
        int[] expected = {1, 2, 3, 4, 1, 9};
        assertEquals(actual, expected);
    }

    @Test
    public void noSameDigits(){
        int[] noSameDigitsArr = {324, 243, 901};
        CustomArray actual = service.noSameDigits(array, 3);
        CustomArray expected = new CustomArray(noSameDigitsArr);
        assertEquals(actual, expected);
    }
}
