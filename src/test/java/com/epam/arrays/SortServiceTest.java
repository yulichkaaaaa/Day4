package com.epam.arrays;

import com.epam.arrays.entity.CustomArray;
import com.epam.arrays.service.SortService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortServiceTest {

    private CustomArray array;
    private SortService service;
    private final int[] expected = {3, 7, 18, 90, 243, 324, 772, 901};

    @BeforeTest
    private void init(){
        int[] arr = {324, 772, 90, 243, 901, 3, 7, 18};
        array = new CustomArray(arr);
        service = new SortService();
    }

    @Test
    public void insertionSortTest(){
        int[] actual = service.insertionSort(array).getArray();
        assertEquals(actual, expected);
    }

    @Test
    public void selectionSortTest(){
        int[] actual = service.selectionSort(array).getArray();
        assertEquals(actual, expected);
    }

    @Test
    public void bubbleSortTest(){
        int[] actual = service.bubbleSort(array).getArray();
        assertEquals(actual, expected);
    }

}
