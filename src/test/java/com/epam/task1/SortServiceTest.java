package com.epam.task1;

import com.epam.task1.entity.CustomArray;
import com.epam.task1.service.SortService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortServiceTest {

    private CustomArray array, expected;
    private SortService service;

    @BeforeTest
    private void init(){
        int[] arr = {324, 772, 90, 243, 901, 3, 7, 18};
        int[] sortedArr = {3, 7, 18, 90, 243, 324, 772, 902};
        array = new CustomArray(arr);
        expected = new CustomArray(sortedArr);
        service = new SortService();
    }

    @Test
    public void insertionSortTest(){
        CustomArray actual = service.insertionSort(array);
        assertSame(actual, expected);
    }

    @Test
    public void hasSameDigitsTest(){
        CustomArray actual = service.selectionSort(array);
        assertSame(actual, expected);
    }

    @Test
    public void numberToDigitsTest(){
        CustomArray actual = service.bubbleSort(array);
        assertSame(actual, expected);
    }

}
