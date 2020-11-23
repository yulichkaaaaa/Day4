package com.epam.task1;

import com.epam.task1.entity.CustomArray;
import com.epam.task1.service.ArrayService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ArrayServiceTest {

    private CustomArray array, sortedArray;
    private ArrayService service;

    @BeforeTest
    private void init(){
        int[] arr = {324, 772, 90, 243, 901, 3, 7, 18};
        int[] sortedArr = {3, 7, 18, 90, 243, 324, 772, 901};
        array = new CustomArray(arr);
        sortedArray = new CustomArray(sortedArr)
        service = new ArrayService();
    }

    @Test
    public void digitsInNumberTest(){
        int actual = service.digitsInNumber(999);
        int expected = 3;
        assertEquals(actual, expected);
    }
}
